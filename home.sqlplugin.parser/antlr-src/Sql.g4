grammar Sql;

options {
    language = Java;
}

@header {package home.sqlplugin.parser.antlr;}

// We process here only two cases: 
//      SELECT t.col_1, ..., t.col_n FROM schema.table t;
//      SELECT t.col_1, ..., t.col_n FROM (select_expresseion) t;

sql
    : query SEMI_COLON EOF
    ;
    
query
    : select_stmt
    ;
    
select_stmt
    : SELECT col (COMMA col)* FROM from_item 
    ;
    
col
    : (alias DOT)? STRING
    ;

from_item
    : (table_name | (LEFT_PAREN select_stmt RIGHT_PAREN)) alias?
    ;
    
alias
    : STRING
    ;
    
table_name
    : (STRING DOT)? STRING
    ;
    
SELECT : [sS] [eE] [lL] [eE] [cC] [tT] ;
FROM : [fF] [rR] [oO] [mM];

SEMI_COLON : ';' ;
COMMA : ',' ;
DOT : '.' ;
LEFT_PAREN : '(' ;
RIGHT_PAREN : ')' ;

STRING
    : [0-9]*[a-zA-Z_$][a-zA-Z_$0-9]*
    ;

SPACE:          [ \t\r\n]+    -> channel(HIDDEN);
COMMENT_INPUT:  '/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT:   ('-- ' | '#')
                ~[\r\n]*
                ('\r'? '\n' | EOF)
                              -> channel(HIDDEN);
