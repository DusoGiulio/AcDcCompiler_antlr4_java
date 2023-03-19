package ANTLR4;
// Generated from ACDC.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ACDCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYFLOAT=1, TYINT=2, PRINT=3, ID=4, INT=5, FLOAT=6, ASSIGN=7, PLUS=8, MINUS=9, 
		TIMES=10, DIV=11, SEMI=12, WS=13;
	public static final String[] tokenNames = {
		"<INVALID>", "TYFLOAT", "TYINT", "PRINT", "ID", "INT", "FLOAT", "ASSIGN", 
		"PLUS", "MINUS", "TIMES", "DIV", "SEMI", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_dss = 1, RULE_stm = 2, RULE_dcl = 3, RULE_dclp = 4, 
		RULE_exp = 5, RULE_expp = 6, RULE_tr = 7, RULE_trp = 8, RULE_ty = 9, RULE_val = 10;
	public static final String[] ruleNames = {
		"prog", "dss", "stm", "dcl", "dclp", "exp", "expp", "tr", "trp", "ty", 
		"val"
	};

	@Override
	public String getGrammarFileName() { return "ACDC.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ACDCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public DssContext dss() {
			return getRuleContext(DssContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACDCListener ) ((ACDCListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACDCListener ) ((ACDCListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); dss();
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

	public static class DssContext extends ParserRuleContext {
		public DssContext dss() {
			return getRuleContext(DssContext.class,0);
		}
		public StmContext stm() {
			return getRuleContext(StmContext.class,0);
		}
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public DssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACDCListener ) ((ACDCListener)listener).enterDss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACDCListener ) ((ACDCListener)listener).exitDss(this);
		}
	}

	public final DssContext dss() throws RecognitionException {
		DssContext _localctx = new DssContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dss);
		try {
			setState(31);
			switch (_input.LA(1)) {
			case TYFLOAT:
			case TYINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(24); dcl();
				setState(25); dss();
				}
				break;
			case PRINT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(27); stm();
				setState(28); dss();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StmContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(ACDCParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ACDCParser.ASSIGN, 0); }
		public TerminalNode PRINT() { return getToken(ACDCParser.PRINT, 0); }
		public TerminalNode SEMI() { return getToken(ACDCParser.SEMI, 0); }
		public StmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACDCListener ) ((ACDCListener)listener).enterStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACDCListener ) ((ACDCListener)listener).exitStm(this);
		}
	}

	public final StmContext stm() throws RecognitionException {
		StmContext _localctx = new StmContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stm);
		try {
			setState(41);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(33); match(ID);
				setState(34); match(ASSIGN);
				setState(35); exp();
				setState(36); match(SEMI);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(38); match(PRINT);
				setState(39); match(ID);
				setState(40); match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ACDCParser.ID, 0); }
		public DclpContext dclp() {
			return getRuleContext(DclpContext.class,0);
		}
		public TyContext ty() {
			return getRuleContext(TyContext.class,0);
		}
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACDCListener ) ((ACDCListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACDCListener ) ((ACDCListener)listener).exitDcl(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); ty();
			setState(44); match(ID);
			setState(45); dclp();
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

	public static class DclpContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ACDCParser.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(ACDCParser.SEMI, 0); }
		public DclpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dclp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACDCListener ) ((ACDCListener)listener).enterDclp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACDCListener ) ((ACDCListener)listener).exitDclp(this);
		}
	}

	public final DclpContext dclp() throws RecognitionException {
		DclpContext _localctx = new DclpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dclp);
		try {
			setState(52);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(47); match(ASSIGN);
				setState(48); exp();
				setState(49); match(SEMI);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(51); match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExpContext extends ParserRuleContext {
		public ExppContext expp() {
			return getRuleContext(ExppContext.class,0);
		}
		public TrContext tr() {
			return getRuleContext(TrContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACDCListener ) ((ACDCListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACDCListener ) ((ACDCListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); tr();
			setState(55); expp();
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

	public static class ExppContext extends ParserRuleContext {
		public ExppContext expp() {
			return getRuleContext(ExppContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(ACDCParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(ACDCParser.PLUS, 0); }
		public TrContext tr() {
			return getRuleContext(TrContext.class,0);
		}
		public ExppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACDCListener ) ((ACDCListener)listener).enterExpp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACDCListener ) ((ACDCListener)listener).exitExpp(this);
		}
	}

	public final ExppContext expp() throws RecognitionException {
		ExppContext _localctx = new ExppContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expp);
		try {
			setState(66);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(57); match(MINUS);
				setState(58); tr();
				setState(59); expp();
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(61); match(PLUS);
				setState(62); tr();
				setState(63); expp();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TrContext extends ParserRuleContext {
		public TrpContext trp() {
			return getRuleContext(TrpContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACDCListener ) ((ACDCListener)listener).enterTr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACDCListener ) ((ACDCListener)listener).exitTr(this);
		}
	}

	public final TrContext tr() throws RecognitionException {
		TrContext _localctx = new TrContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); val();
			setState(69); trp();
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

	public static class TrpContext extends ParserRuleContext {
		public TerminalNode TIMES() { return getToken(ACDCParser.TIMES, 0); }
		public TrpContext trp() {
			return getRuleContext(TrpContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode DIV() { return getToken(ACDCParser.DIV, 0); }
		public TrpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACDCListener ) ((ACDCListener)listener).enterTrp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACDCListener ) ((ACDCListener)listener).exitTrp(this);
		}
	}

	public final TrpContext trp() throws RecognitionException {
		TrpContext _localctx = new TrpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_trp);
		try {
			setState(80);
			switch (_input.LA(1)) {
			case DIV:
				enterOuterAlt(_localctx, 1);
				{
				setState(71); match(DIV);
				setState(72); val();
				setState(73); trp();
				}
				break;
			case TIMES:
				enterOuterAlt(_localctx, 2);
				{
				setState(75); match(TIMES);
				setState(76); val();
				setState(77); trp();
				}
				break;
			case PLUS:
			case MINUS:
			case SEMI:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TyContext extends ParserRuleContext {
		public TerminalNode TYFLOAT() { return getToken(ACDCParser.TYFLOAT, 0); }
		public TerminalNode TYINT() { return getToken(ACDCParser.TYINT, 0); }
		public TyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACDCListener ) ((ACDCListener)listener).enterTy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACDCListener ) ((ACDCListener)listener).exitTy(this);
		}
	}

	public final TyContext ty() throws RecognitionException {
		TyContext _localctx = new TyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !(_la==TYFLOAT || _la==TYINT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ValContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ACDCParser.ID, 0); }
		public TerminalNode INT() { return getToken(ACDCParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ACDCParser.FLOAT, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACDCListener ) ((ACDCListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACDCListener ) ((ACDCListener)listener).exitVal(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17Y\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\"\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4,\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6\67\n\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bE\n\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nS\n\n\3\13\3\13\3\f\3\f\3\f\2"+
		"\2\r\2\4\6\b\n\f\16\20\22\24\26\2\4\3\2\3\4\3\2\6\bU\2\30\3\2\2\2\4!\3"+
		"\2\2\2\6+\3\2\2\2\b-\3\2\2\2\n\66\3\2\2\2\f8\3\2\2\2\16D\3\2\2\2\20F\3"+
		"\2\2\2\22R\3\2\2\2\24T\3\2\2\2\26V\3\2\2\2\30\31\5\4\3\2\31\3\3\2\2\2"+
		"\32\33\5\b\5\2\33\34\5\4\3\2\34\"\3\2\2\2\35\36\5\6\4\2\36\37\5\4\3\2"+
		"\37\"\3\2\2\2 \"\3\2\2\2!\32\3\2\2\2!\35\3\2\2\2! \3\2\2\2\"\5\3\2\2\2"+
		"#$\7\6\2\2$%\7\t\2\2%&\5\f\7\2&\'\7\16\2\2\',\3\2\2\2()\7\5\2\2)*\7\6"+
		"\2\2*,\7\16\2\2+#\3\2\2\2+(\3\2\2\2,\7\3\2\2\2-.\5\24\13\2./\7\6\2\2/"+
		"\60\5\n\6\2\60\t\3\2\2\2\61\62\7\t\2\2\62\63\5\f\7\2\63\64\7\16\2\2\64"+
		"\67\3\2\2\2\65\67\7\16\2\2\66\61\3\2\2\2\66\65\3\2\2\2\67\13\3\2\2\28"+
		"9\5\20\t\29:\5\16\b\2:\r\3\2\2\2;<\7\13\2\2<=\5\20\t\2=>\5\16\b\2>E\3"+
		"\2\2\2?@\7\n\2\2@A\5\20\t\2AB\5\16\b\2BE\3\2\2\2CE\3\2\2\2D;\3\2\2\2D"+
		"?\3\2\2\2DC\3\2\2\2E\17\3\2\2\2FG\5\26\f\2GH\5\22\n\2H\21\3\2\2\2IJ\7"+
		"\r\2\2JK\5\26\f\2KL\5\22\n\2LS\3\2\2\2MN\7\f\2\2NO\5\26\f\2OP\5\22\n\2"+
		"PS\3\2\2\2QS\3\2\2\2RI\3\2\2\2RM\3\2\2\2RQ\3\2\2\2S\23\3\2\2\2TU\t\2\2"+
		"\2U\25\3\2\2\2VW\t\3\2\2W\27\3\2\2\2\7!+\66DR";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}