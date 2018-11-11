// Generated from C:/Users/damia/Desktop/jfkTest/Grammar\JfkGrammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JfkGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Odd_Numer_Okt=1, Even_Number_Okt=2, Odd_Number_Dec=3, Even_Number_Dec=4, 
		Odd_Numer_Hex=5, Even_Numer_Hex=6, MUL=7, DIV=8, ADD=9, SUB=10, LB=11, 
		RB=12, POW=13, WhiteSpace=14, NewLine=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SINGLE_SPACE", "TABULATION", "LINE_FEED", "CARRAIGE_RETURN", "Odd_Numer_Okt", 
		"Even_Number_Okt", "Odd_Number_Dec", "Even_Number_Dec", "Odd_Numer_Hex", 
		"Even_Numer_Hex", "MUL", "DIV", "ADD", "SUB", "LB", "RB", "POW", "WhiteSpace", 
		"NewLine"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'*'", "'/'", "'+'", "'-'", 
		"'('", "')'", "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Odd_Numer_Okt", "Even_Number_Okt", "Odd_Number_Dec", "Even_Number_Dec", 
		"Odd_Numer_Hex", "Even_Numer_Hex", "MUL", "DIV", "ADD", "SUB", "LB", "RB", 
		"POW", "WhiteSpace", "NewLine"
	};
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


	public JfkGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JfkGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u0099\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\7\6"+
		"\64\n\6\f\6\16\6\67\13\6\3\6\3\6\3\7\3\7\7\7=\n\7\f\7\16\7@\13\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\6\bH\n\b\r\b\16\bI\3\b\7\bM\n\b\f\b\16\bP\13\b\3\b"+
		"\5\bS\n\b\3\t\3\t\6\tW\n\t\r\t\16\tX\3\t\7\t\\\n\t\f\t\16\t_\13\t\3\t"+
		"\5\tb\n\t\3\t\3\t\3\n\3\n\3\n\7\ni\n\n\f\n\16\nl\13\n\3\n\3\n\3\13\3\13"+
		"\3\13\7\13s\n\13\f\13\16\13v\13\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\6\23\u008c"+
		"\n\23\r\23\16\23\u008d\3\23\3\23\3\24\3\24\6\24\u0094\n\24\r\24\16\24"+
		"\u0095\3\24\3\24\2\2\25\3\2\5\2\7\2\t\2\13\3\r\4\17\5\21\6\23\7\25\b\27"+
		"\t\31\n\33\13\35\f\37\r!\16#\17%\20\'\21\3\2\16\3\2\62\62\3\2\629\6\2"+
		"\63\63\65\65\67\6799\6\2\62\62\64\64\66\6688\7\2\63\63\65\65\67\6799;"+
		";\3\2\63;\3\2\62;\6\2\64\64\66\6688::\7\2\62\62\64\64\66\6688::\4\2\62"+
		";CH\n\2\63\63\65\65\67\6799;;DDFFHH\n\2\62\62\64\64\66\6688::CCEEGG\2"+
		"\u00a2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3"+
		"\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13\61\3\2\2\2\r:\3\2\2\2\17R\3\2\2\2\21a"+
		"\3\2\2\2\23e\3\2\2\2\25o\3\2\2\2\27{\3\2\2\2\31}\3\2\2\2\33\177\3\2\2"+
		"\2\35\u0081\3\2\2\2\37\u0083\3\2\2\2!\u0085\3\2\2\2#\u0087\3\2\2\2%\u008b"+
		"\3\2\2\2\'\u0093\3\2\2\2)*\7\"\2\2*\4\3\2\2\2+,\7\13\2\2,\6\3\2\2\2-."+
		"\7\f\2\2.\b\3\2\2\2/\60\7\17\2\2\60\n\3\2\2\2\61\65\t\2\2\2\62\64\t\3"+
		"\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2"+
		"\2\67\65\3\2\2\289\t\4\2\29\f\3\2\2\2:>\t\2\2\2;=\t\3\2\2<;\3\2\2\2=@"+
		"\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\t\5\2\2BC\3\2\2\2C"+
		"D\b\7\2\2D\16\3\2\2\2ES\t\6\2\2FH\t\7\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2"+
		"\2IJ\3\2\2\2JN\3\2\2\2KM\t\b\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2"+
		"\2OQ\3\2\2\2PN\3\2\2\2QS\t\6\2\2RE\3\2\2\2RG\3\2\2\2S\20\3\2\2\2Tb\t\t"+
		"\2\2UW\t\7\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y]\3\2\2\2Z\\\t"+
		"\b\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`b"+
		"\t\n\2\2aT\3\2\2\2aV\3\2\2\2bc\3\2\2\2cd\b\t\2\2d\22\3\2\2\2ef\t\2\2\2"+
		"fj\7z\2\2gi\t\13\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2"+
		"lj\3\2\2\2mn\t\f\2\2n\24\3\2\2\2op\t\2\2\2pt\7z\2\2qs\t\13\2\2rq\3\2\2"+
		"\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\t\r\2\2xy\3\2\2"+
		"\2yz\b\13\2\2z\26\3\2\2\2{|\7,\2\2|\30\3\2\2\2}~\7\61\2\2~\32\3\2\2\2"+
		"\177\u0080\7-\2\2\u0080\34\3\2\2\2\u0081\u0082\7/\2\2\u0082\36\3\2\2\2"+
		"\u0083\u0084\7*\2\2\u0084 \3\2\2\2\u0085\u0086\7+\2\2\u0086\"\3\2\2\2"+
		"\u0087\u0088\7`\2\2\u0088$\3\2\2\2\u0089\u008c\5\3\2\2\u008a\u008c\5\5"+
		"\3\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\b\23"+
		"\2\2\u0090&\3\2\2\2\u0091\u0094\5\t\5\2\u0092\u0094\5\7\4\2\u0093\u0091"+
		"\3\2\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\b\24\2\2\u0098(\3\2\2\2"+
		"\21\2\65>INRX]ajt\u008b\u008d\u0093\u0095\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}