// Generated from C:/Users/damia/Desktop/jfkTest/Grammar\JfkGrammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JfkGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Odd_Numer_Okt=1, Even_Number_Okt=2, Odd_Number_Dec=3, Even_Number_Dec=4, 
		Odd_Numer_Hex=5, Even_Numer_Hex=6, MUL=7, DIV=8, ADD=9, SUB=10, LB=11, 
		RB=12, POW=13, WhiteSpace=14, NewLine=15;
	public static final int
		RULE_first_operation = 0, RULE_second_operation = 1, RULE_third_operation = 2, 
		RULE_number = 3, RULE_expression = 4, RULE_result = 5;
	public static final String[] ruleNames = {
		"first_operation", "second_operation", "third_operation", "number", "expression", 
		"result"
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

	@Override
	public String getGrammarFileName() { return "JfkGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JfkGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class First_operationContext extends ParserRuleContext {
		public TerminalNode POW() { return getToken(JfkGrammarParser.POW, 0); }
		public First_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JfkGrammarListener ) ((JfkGrammarListener)listener).enterFirst_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JfkGrammarListener ) ((JfkGrammarListener)listener).exitFirst_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JfkGrammarVisitor ) return ((JfkGrammarVisitor<? extends T>)visitor).visitFirst_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final First_operationContext first_operation() throws RecognitionException {
		First_operationContext _localctx = new First_operationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_first_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(POW);
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

	public static class Second_operationContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(JfkGrammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(JfkGrammarParser.DIV, 0); }
		public Second_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_second_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JfkGrammarListener ) ((JfkGrammarListener)listener).enterSecond_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JfkGrammarListener ) ((JfkGrammarListener)listener).exitSecond_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JfkGrammarVisitor ) return ((JfkGrammarVisitor<? extends T>)visitor).visitSecond_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Second_operationContext second_operation() throws RecognitionException {
		Second_operationContext _localctx = new Second_operationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_second_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			_la = _input.LA(1);
			if ( !(_la==MUL || _la==DIV) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Third_operationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(JfkGrammarParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(JfkGrammarParser.SUB, 0); }
		public Third_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_third_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JfkGrammarListener ) ((JfkGrammarListener)listener).enterThird_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JfkGrammarListener ) ((JfkGrammarListener)listener).exitThird_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JfkGrammarVisitor ) return ((JfkGrammarVisitor<? extends T>)visitor).visitThird_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Third_operationContext third_operation() throws RecognitionException {
		Third_operationContext _localctx = new Third_operationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_third_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class NumberContext extends ParserRuleContext {
		public List<TerminalNode> Odd_Numer_Okt() { return getTokens(JfkGrammarParser.Odd_Numer_Okt); }
		public TerminalNode Odd_Numer_Okt(int i) {
			return getToken(JfkGrammarParser.Odd_Numer_Okt, i);
		}
		public List<TerminalNode> Even_Number_Okt() { return getTokens(JfkGrammarParser.Even_Number_Okt); }
		public TerminalNode Even_Number_Okt(int i) {
			return getToken(JfkGrammarParser.Even_Number_Okt, i);
		}
		public List<TerminalNode> Odd_Number_Dec() { return getTokens(JfkGrammarParser.Odd_Number_Dec); }
		public TerminalNode Odd_Number_Dec(int i) {
			return getToken(JfkGrammarParser.Odd_Number_Dec, i);
		}
		public List<TerminalNode> Even_Number_Dec() { return getTokens(JfkGrammarParser.Even_Number_Dec); }
		public TerminalNode Even_Number_Dec(int i) {
			return getToken(JfkGrammarParser.Even_Number_Dec, i);
		}
		public List<TerminalNode> Odd_Numer_Hex() { return getTokens(JfkGrammarParser.Odd_Numer_Hex); }
		public TerminalNode Odd_Numer_Hex(int i) {
			return getToken(JfkGrammarParser.Odd_Numer_Hex, i);
		}
		public List<TerminalNode> Even_Numer_Hex() { return getTokens(JfkGrammarParser.Even_Numer_Hex); }
		public TerminalNode Even_Numer_Hex(int i) {
			return getToken(JfkGrammarParser.Even_Numer_Hex, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JfkGrammarListener ) ((JfkGrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JfkGrammarListener ) ((JfkGrammarListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JfkGrammarVisitor ) return ((JfkGrammarVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_number);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(18);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Odd_Numer_Okt) | (1L << Even_Number_Okt) | (1L << Odd_Number_Dec) | (1L << Even_Number_Dec) | (1L << Odd_Numer_Hex) | (1L << Even_Numer_Hex))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(23);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(JfkGrammarParser.LB, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RB() { return getToken(JfkGrammarParser.RB, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public First_operationContext first_operation() {
			return getRuleContext(First_operationContext.class,0);
		}
		public Second_operationContext second_operation() {
			return getRuleContext(Second_operationContext.class,0);
		}
		public Third_operationContext third_operation() {
			return getRuleContext(Third_operationContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JfkGrammarListener ) ((JfkGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JfkGrammarListener ) ((JfkGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JfkGrammarVisitor ) return ((JfkGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(25);
				match(LB);
				setState(26);
				expression(0);
				setState(27);
				match(RB);
				}
				break;
			case 2:
				{
				setState(29);
				number();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(44);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(32);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(33);
						first_operation();
						setState(34);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(36);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(37);
						second_operation();
						setState(38);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(40);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(41);
						third_operation();
						setState(42);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ResultContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JfkGrammarListener ) ((JfkGrammarListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JfkGrammarListener ) ((JfkGrammarListener)listener).exitResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JfkGrammarVisitor ) return ((JfkGrammarVisitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			expression(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21\66\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\4\3\4\3\5\7\5\26"+
		"\n\5\f\5\16\5\31\13\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6!\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6/\n\6\f\6\16\6\62\13\6\3\7\3\7\3\7"+
		"\2\3\n\b\2\4\6\b\n\f\2\5\3\2\t\n\3\2\13\f\3\2\3\b\2\64\2\16\3\2\2\2\4"+
		"\20\3\2\2\2\6\22\3\2\2\2\b\27\3\2\2\2\n \3\2\2\2\f\63\3\2\2\2\16\17\7"+
		"\17\2\2\17\3\3\2\2\2\20\21\t\2\2\2\21\5\3\2\2\2\22\23\t\3\2\2\23\7\3\2"+
		"\2\2\24\26\t\4\2\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2"+
		"\2\2\30\t\3\2\2\2\31\27\3\2\2\2\32\33\b\6\1\2\33\34\7\r\2\2\34\35\5\n"+
		"\6\2\35\36\7\16\2\2\36!\3\2\2\2\37!\5\b\5\2 \32\3\2\2\2 \37\3\2\2\2!\60"+
		"\3\2\2\2\"#\f\6\2\2#$\5\2\2\2$%\5\n\6\7%/\3\2\2\2&\'\f\5\2\2\'(\5\4\3"+
		"\2()\5\n\6\6)/\3\2\2\2*+\f\4\2\2+,\5\6\4\2,-\5\n\6\5-/\3\2\2\2.\"\3\2"+
		"\2\2.&\3\2\2\2.*\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\13\3"+
		"\2\2\2\62\60\3\2\2\2\63\64\5\n\6\2\64\r\3\2\2\2\6\27 .\60";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}