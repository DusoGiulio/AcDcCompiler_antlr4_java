package ANTLR4;
// Generated from ACDC.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ACDCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYFLOAT=1, TYINT=2, PRINT=3, ID=4, INT=5, FLOAT=6, ASSIGN=7, PLUS=8, MINUS=9, 
		TIMES=10, DIV=11, SEMI=12, WS=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'"
	};
	public static final String[] ruleNames = {
		"TYFLOAT", "TYINT", "PRINT", "ID", "INT", "FLOAT", "ASSIGN", "PLUS", "MINUS", 
		"TIMES", "DIV", "SEMI", "WS"
	};


	public ACDCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ACDC.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17`\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\6\5/\n\5\r\5\16\5\60\3\5\7\5\64\n\5\f\5\16"+
		"\5\67\13\5\3\6\6\6:\n\6\r\6\16\6;\3\7\6\7?\n\7\r\7\16\7@\3\7\6\7D\n\7"+
		"\r\7\16\7E\3\7\7\7I\n\7\f\7\16\7L\13\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\6\16[\n\16\r\16\16\16\\\3\16\3\16\2\2\17\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\6\5\2"+
		"C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"f\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\3\35\3\2\2\2\5#\3\2\2\2\7\'\3\2\2\2\t.\3\2\2\2\139\3\2\2\2\r>\3\2"+
		"\2\2\17M\3\2\2\2\21O\3\2\2\2\23Q\3\2\2\2\25S\3\2\2\2\27U\3\2\2\2\31W\3"+
		"\2\2\2\33Z\3\2\2\2\35\36\7h\2\2\36\37\7n\2\2\37 \7q\2\2 !\7c\2\2!\"\7"+
		"v\2\2\"\4\3\2\2\2#$\7k\2\2$%\7p\2\2%&\7v\2\2&\6\3\2\2\2\'(\7r\2\2()\7"+
		"t\2\2)*\7k\2\2*+\7p\2\2+,\7v\2\2,\b\3\2\2\2-/\t\2\2\2.-\3\2\2\2/\60\3"+
		"\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\65\3\2\2\2\62\64\t\3\2\2\63\62\3\2"+
		"\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\n\3\2\2\2\67\65\3\2"+
		"\2\28:\t\4\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\f\3\2\2\2=?\t"+
		"\4\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2BD\7\60\2\2CB"+
		"\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FJ\3\2\2\2GI\t\4\2\2HG\3\2\2\2I"+
		"L\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\16\3\2\2\2LJ\3\2\2\2MN\7?\2\2N\20\3\2\2"+
		"\2OP\7-\2\2P\22\3\2\2\2QR\7/\2\2R\24\3\2\2\2ST\7,\2\2T\26\3\2\2\2UV\7"+
		"\61\2\2V\30\3\2\2\2WX\7=\2\2X\32\3\2\2\2Y[\t\5\2\2ZY\3\2\2\2[\\\3\2\2"+
		"\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\b\16\2\2_\34\3\2\2\2\n\2\60\65;@"+
		"EJ\\\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}