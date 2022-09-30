// Generated from java-escape by ANTLR 4.11.1
package home.sqlplugin.parser.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, SEMI_COLON=3, COMMA=4, DOT=5, LEFT_PAREN=6, RIGHT_PAREN=7, 
		STRING=8, SPACE=9, COMMENT_INPUT=10, LINE_COMMENT=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SELECT", "FROM", "SEMI_COLON", "COMMA", "DOT", "LEFT_PAREN", "RIGHT_PAREN", 
			"STRING", "SPACE", "COMMENT_INPUT", "LINE_COMMENT"
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


	public SqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000bd\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0005\u0007/\b\u0007"+
		"\n\u0007\f\u00072\t\u0007\u0001\u0007\u0001\u0007\u0005\u00076\b\u0007"+
		"\n\u0007\f\u00079\t\u0007\u0001\b\u0004\b<\b\b\u000b\b\f\b=\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tF\b\t\n\t\f\tI\t\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nT\b"+
		"\n\u0001\n\u0005\nW\b\n\n\n\f\nZ\t\n\u0001\n\u0003\n]\b\n\u0001\n\u0001"+
		"\n\u0003\na\b\n\u0001\n\u0001\n\u0001G\u0000\u000b\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0001\u0000\u000e\u0002\u0000SSss\u0002\u0000EEee\u0002"+
		"\u0000LLll\u0002\u0000CCcc\u0002\u0000TTtt\u0002\u0000FFff\u0002\u0000"+
		"RRrr\u0002\u0000OOoo\u0002\u0000MMmm\u0001\u000009\u0004\u0000$$AZ__a"+
		"z\u0005\u0000$$09AZ__az\u0003\u0000\t\n\r\r  \u0002\u0000\n\n\r\rk\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0001\u0017\u0001\u0000\u0000\u0000\u0003\u001e"+
		"\u0001\u0000\u0000\u0000\u0005#\u0001\u0000\u0000\u0000\u0007%\u0001\u0000"+
		"\u0000\u0000\t\'\u0001\u0000\u0000\u0000\u000b)\u0001\u0000\u0000\u0000"+
		"\r+\u0001\u0000\u0000\u0000\u000f0\u0001\u0000\u0000\u0000\u0011;\u0001"+
		"\u0000\u0000\u0000\u0013A\u0001\u0000\u0000\u0000\u0015S\u0001\u0000\u0000"+
		"\u0000\u0017\u0018\u0007\u0000\u0000\u0000\u0018\u0019\u0007\u0001\u0000"+
		"\u0000\u0019\u001a\u0007\u0002\u0000\u0000\u001a\u001b\u0007\u0001\u0000"+
		"\u0000\u001b\u001c\u0007\u0003\u0000\u0000\u001c\u001d\u0007\u0004\u0000"+
		"\u0000\u001d\u0002\u0001\u0000\u0000\u0000\u001e\u001f\u0007\u0005\u0000"+
		"\u0000\u001f \u0007\u0006\u0000\u0000 !\u0007\u0007\u0000\u0000!\"\u0007"+
		"\b\u0000\u0000\"\u0004\u0001\u0000\u0000\u0000#$\u0005;\u0000\u0000$\u0006"+
		"\u0001\u0000\u0000\u0000%&\u0005,\u0000\u0000&\b\u0001\u0000\u0000\u0000"+
		"\'(\u0005.\u0000\u0000(\n\u0001\u0000\u0000\u0000)*\u0005(\u0000\u0000"+
		"*\f\u0001\u0000\u0000\u0000+,\u0005)\u0000\u0000,\u000e\u0001\u0000\u0000"+
		"\u0000-/\u0007\t\u0000\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000"+
		"\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000013\u0001\u0000"+
		"\u0000\u000020\u0001\u0000\u0000\u000037\u0007\n\u0000\u000046\u0007\u000b"+
		"\u0000\u000054\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001"+
		"\u0000\u0000\u000078\u0001\u0000\u0000\u00008\u0010\u0001\u0000\u0000"+
		"\u000097\u0001\u0000\u0000\u0000:<\u0007\f\u0000\u0000;:\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0006\b\u0000\u0000@\u0012\u0001"+
		"\u0000\u0000\u0000AB\u0005/\u0000\u0000BC\u0005*\u0000\u0000CG\u0001\u0000"+
		"\u0000\u0000DF\t\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000FI\u0001\u0000"+
		"\u0000\u0000GH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HJ\u0001"+
		"\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JK\u0005*\u0000\u0000KL\u0005"+
		"/\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0006\t\u0000\u0000N\u0014\u0001"+
		"\u0000\u0000\u0000OP\u0005-\u0000\u0000PQ\u0005-\u0000\u0000QT\u0005 "+
		"\u0000\u0000RT\u0005#\u0000\u0000SO\u0001\u0000\u0000\u0000SR\u0001\u0000"+
		"\u0000\u0000TX\u0001\u0000\u0000\u0000UW\b\r\u0000\u0000VU\u0001\u0000"+
		"\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000Y`\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000"+
		"[]\u0005\r\u0000\u0000\\[\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000"+
		"\u0000]^\u0001\u0000\u0000\u0000^a\u0005\n\u0000\u0000_a\u0005\u0000\u0000"+
		"\u0001`\\\u0001\u0000\u0000\u0000`_\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000bc\u0006\n\u0000\u0000c\u0016\u0001\u0000\u0000\u0000\t\u0000"+
		"07=GSX\\`\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}