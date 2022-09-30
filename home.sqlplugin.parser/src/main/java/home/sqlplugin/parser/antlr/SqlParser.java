// Generated from java-escape by ANTLR 4.11.1
package home.sqlplugin.parser.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, SEMI_COLON=3, COMMA=4, DOT=5, LEFT_PAREN=6, RIGHT_PAREN=7, 
		STRING=8, SPACE=9, COMMENT_INPUT=10, LINE_COMMENT=11;
	public static final int
		RULE_sql = 0, RULE_query = 1, RULE_select_stmt = 2, RULE_col = 3, RULE_from_item = 4, 
		RULE_alias = 5, RULE_table_name = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"sql", "query", "select_stmt", "col", "from_item", "alias", "table_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "';'", "','", "'.'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "SEMI_COLON", "COMMA", "DOT", "LEFT_PAREN", "RIGHT_PAREN", 
			"STRING", "SPACE", "COMMENT_INPUT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SqlContext extends ParserRuleContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(SqlParser.SEMI_COLON, 0); }
		public TerminalNode EOF() { return getToken(SqlParser.EOF, 0); }
		public SqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSql(this);
		}
	}

	public final SqlContext sql() throws RecognitionException {
		SqlContext _localctx = new SqlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sql);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			query();
			setState(15);
			match(SEMI_COLON);
			setState(16);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			select_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Select_stmtContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SqlParser.SELECT, 0); }
		public List<ColContext> col() {
			return getRuleContexts(ColContext.class);
		}
		public ColContext col(int i) {
			return getRuleContext(ColContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SqlParser.FROM, 0); }
		public From_itemContext from_item() {
			return getRuleContext(From_itemContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitSelect_stmt(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(SELECT);
			setState(21);
			col();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(22);
				match(COMMA);
				setState(23);
				col();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			match(FROM);
			setState(30);
			from_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SqlParser.STRING, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public ColContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterCol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitCol(this);
		}
	}

	public final ColContext col() throws RecognitionException {
		ColContext _localctx = new ColContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_col);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(32);
				alias();
				setState(33);
				match(DOT);
				}
				break;
			}
			setState(37);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class From_itemContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlParser.LEFT_PAREN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlParser.RIGHT_PAREN, 0); }
		public From_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterFrom_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitFrom_item(this);
		}
	}

	public final From_itemContext from_item() throws RecognitionException {
		From_itemContext _localctx = new From_itemContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_from_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(39);
				table_name();
				}
				break;
			case LEFT_PAREN:
				{
				{
				setState(40);
				match(LEFT_PAREN);
				setState(41);
				select_stmt();
				setState(42);
				match(RIGHT_PAREN);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(46);
				alias();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AliasContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SqlParser.STRING, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitAlias(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Table_nameContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(SqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlParser.STRING, i);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlListener ) ((SqlListener)listener).exitTable_name(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(51);
				match(STRING);
				setState(52);
				match(DOT);
				}
				break;
			}
			setState(55);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000b:\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002\u0019\b\u0002\n\u0002\f\u0002\u001c\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003$\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004-\b\u0004\u0001\u0004"+
		"\u0003\u00040\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0003\u00066\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0000\u0000"+
		"\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u00007\u0000\u000e\u0001\u0000"+
		"\u0000\u0000\u0002\u0012\u0001\u0000\u0000\u0000\u0004\u0014\u0001\u0000"+
		"\u0000\u0000\u0006#\u0001\u0000\u0000\u0000\b,\u0001\u0000\u0000\u0000"+
		"\n1\u0001\u0000\u0000\u0000\f5\u0001\u0000\u0000\u0000\u000e\u000f\u0003"+
		"\u0002\u0001\u0000\u000f\u0010\u0005\u0003\u0000\u0000\u0010\u0011\u0005"+
		"\u0000\u0000\u0001\u0011\u0001\u0001\u0000\u0000\u0000\u0012\u0013\u0003"+
		"\u0004\u0002\u0000\u0013\u0003\u0001\u0000\u0000\u0000\u0014\u0015\u0005"+
		"\u0001\u0000\u0000\u0015\u001a\u0003\u0006\u0003\u0000\u0016\u0017\u0005"+
		"\u0004\u0000\u0000\u0017\u0019\u0003\u0006\u0003\u0000\u0018\u0016\u0001"+
		"\u0000\u0000\u0000\u0019\u001c\u0001\u0000\u0000\u0000\u001a\u0018\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001d\u0001"+
		"\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001d\u001e\u0005"+
		"\u0002\u0000\u0000\u001e\u001f\u0003\b\u0004\u0000\u001f\u0005\u0001\u0000"+
		"\u0000\u0000 !\u0003\n\u0005\u0000!\"\u0005\u0005\u0000\u0000\"$\u0001"+
		"\u0000\u0000\u0000# \u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000"+
		"$%\u0001\u0000\u0000\u0000%&\u0005\b\u0000\u0000&\u0007\u0001\u0000\u0000"+
		"\u0000\'-\u0003\f\u0006\u0000()\u0005\u0006\u0000\u0000)*\u0003\u0004"+
		"\u0002\u0000*+\u0005\u0007\u0000\u0000+-\u0001\u0000\u0000\u0000,\'\u0001"+
		"\u0000\u0000\u0000,(\u0001\u0000\u0000\u0000-/\u0001\u0000\u0000\u0000"+
		".0\u0003\n\u0005\u0000/.\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"0\t\u0001\u0000\u0000\u000012\u0005\b\u0000\u00002\u000b\u0001\u0000\u0000"+
		"\u000034\u0005\b\u0000\u000046\u0005\u0005\u0000\u000053\u0001\u0000\u0000"+
		"\u000056\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0005\b\u0000"+
		"\u00008\r\u0001\u0000\u0000\u0000\u0005\u001a#,/5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}