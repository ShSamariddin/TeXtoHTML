// Generated from /home/samar/ITMO-2018-19/MT/MT3/src/Tex.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, CHOOSE=2, CURLY_OPEN=3, CURLY_CLOSE=4, SQUARE_OPEN=5, SQUARE_CLOSE=6, 
		ROUND_OPEN=7, ROUND_CLOSE=8, UP=9, DOWN=10, PLUS=11, MINUS=12, WORD=13, 
		NUMBER=14, WHITESPACE=15, PLUS_MINUS=16, SIGMA=17, MUL=18, SQRT=19, DIV=20, 
		BEGIN_DOC=21, END_DOC=22, DOLLARS=23, FRAC=24;
	public static final int
		RULE_tex = 0, RULE_eq = 1, RULE_expression = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"tex", "eq", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'\\choose'", "'{'", "'}'", "'['", "']'", "'('", "')'", 
			"'^'", "'_'", "'+'", "'-'", null, null, null, "'\\pm'", "'\\sum'", null, 
			"'\\sqrt'", null, "'\\begin{document}'", "'\\end{document}'", "'$'", 
			"'\\frac'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "CHOOSE", "CURLY_OPEN", "CURLY_CLOSE", "SQUARE_OPEN", "SQUARE_CLOSE", 
			"ROUND_OPEN", "ROUND_CLOSE", "UP", "DOWN", "PLUS", "MINUS", "WORD", "NUMBER", 
			"WHITESPACE", "PLUS_MINUS", "SIGMA", "MUL", "SQRT", "DIV", "BEGIN_DOC", 
			"END_DOC", "DOLLARS", "FRAC"
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
	public String getGrammarFileName() { return "Tex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TexContext extends ParserRuleContext {
		public TexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tex; }
	 
		public TexContext() { }
		public void copyFrom(TexContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TexTContext extends TexContext {
		public List<TerminalNode> DOLLARS() { return getTokens(TexParser.DOLLARS); }
		public TerminalNode DOLLARS(int i) {
			return getToken(TexParser.DOLLARS, i);
		}
		public EqContext eq() {
			return getRuleContext(EqContext.class,0);
		}
		public TexTContext(TexContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterTexT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitTexT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexVisitor ) return ((TexVisitor<? extends T>)visitor).visitTexT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TexContext tex() throws RecognitionException {
		TexContext _localctx = new TexContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tex);
		try {
			_localctx = new TexTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			match(DOLLARS);
			setState(7);
			eq();
			setState(8);
			match(DOLLARS);
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

	public static class EqContext extends ParserRuleContext {
		public EqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq; }
	 
		public EqContext() { }
		public void copyFrom(EqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqTContext extends EqContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EqContext eq() {
			return getRuleContext(EqContext.class,0);
		}
		public EqTContext(EqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterEqT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitEqT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexVisitor ) return ((TexVisitor<? extends T>)visitor).visitEqT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EndeqTContext extends EqContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EndeqTContext(EqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterEndeqT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitEndeqT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexVisitor ) return ((TexVisitor<? extends T>)visitor).visitEndeqT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqContext eq() throws RecognitionException {
		EqContext _localctx = new EqContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_eq);
		try {
			setState(15);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new EqTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				expression(0);
				setState(11);
				match(T__0);
				setState(12);
				eq();
				}
				break;
			case 2:
				_localctx = new EndeqTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(14);
				expression(0);
				}
				break;
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SupsubTContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode UP() { return getToken(TexParser.UP, 0); }
		public List<TerminalNode> CURLY_OPEN() { return getTokens(TexParser.CURLY_OPEN); }
		public TerminalNode CURLY_OPEN(int i) {
			return getToken(TexParser.CURLY_OPEN, i);
		}
		public List<TerminalNode> CURLY_CLOSE() { return getTokens(TexParser.CURLY_CLOSE); }
		public TerminalNode CURLY_CLOSE(int i) {
			return getToken(TexParser.CURLY_CLOSE, i);
		}
		public TerminalNode DOWN() { return getToken(TexParser.DOWN, 0); }
		public SupsubTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterSupsubT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitSupsubT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexVisitor ) return ((TexVisitor<? extends T>)visitor).visitSupsubT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FracTContext extends ExpressionContext {
		public TerminalNode FRAC() { return getToken(TexParser.FRAC, 0); }
		public List<TerminalNode> CURLY_OPEN() { return getTokens(TexParser.CURLY_OPEN); }
		public TerminalNode CURLY_OPEN(int i) {
			return getToken(TexParser.CURLY_OPEN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> CURLY_CLOSE() { return getTokens(TexParser.CURLY_CLOSE); }
		public TerminalNode CURLY_CLOSE(int i) {
			return getToken(TexParser.CURLY_CLOSE, i);
		}
		public FracTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterFracT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitFracT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexVisitor ) return ((TexVisitor<? extends T>)visitor).visitFracT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BrTContext extends ExpressionContext {
		public TerminalNode ROUND_OPEN() { return getToken(TexParser.ROUND_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ROUND_CLOSE() { return getToken(TexParser.ROUND_CLOSE, 0); }
		public BrTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterBrT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitBrT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexVisitor ) return ((TexVisitor<? extends T>)visitor).visitBrT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryTContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(TexParser.MINUS, 0); }
		public TerminalNode PLUS_MINUS() { return getToken(TexParser.PLUS_MINUS, 0); }
		public UnaryTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterUnaryT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitUnaryT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexVisitor ) return ((TexVisitor<? extends T>)visitor).visitUnaryT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivTContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(TexParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(TexParser.DIV, 0); }
		public MulDivTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterMulDivT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitMulDivT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexVisitor ) return ((TexVisitor<? extends T>)visitor).visitMulDivT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubsupTContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOWN() { return getToken(TexParser.DOWN, 0); }
		public List<TerminalNode> CURLY_OPEN() { return getTokens(TexParser.CURLY_OPEN); }
		public TerminalNode CURLY_OPEN(int i) {
			return getToken(TexParser.CURLY_OPEN, i);
		}
		public List<TerminalNode> CURLY_CLOSE() { return getTokens(TexParser.CURLY_CLOSE); }
		public TerminalNode CURLY_CLOSE(int i) {
			return getToken(TexParser.CURLY_CLOSE, i);
		}
		public TerminalNode UP() { return getToken(TexParser.UP, 0); }
		public SubsupTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterSubsupT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitSubsupT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexVisitor ) return ((TexVisitor<? extends T>)visitor).visitSubsupT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexTContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CURLY_OPEN() { return getToken(TexParser.CURLY_OPEN, 0); }
		public TerminalNode CURLY_CLOSE() { return getToken(TexParser.CURLY_CLOSE, 0); }
		public TerminalNode UP() { return getToken(TexParser.UP, 0); }
		public TerminalNode DOWN() { return getToken(TexParser.DOWN, 0); }
		public IndexTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterIndexT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitIndexT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexVisitor ) return ((TexVisitor<? extends T>)visitor).visitIndexT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChooseTContext extends ExpressionContext {
		public List<TerminalNode> CURLY_OPEN() { return getTokens(TexParser.CURLY_OPEN); }
		public TerminalNode CURLY_OPEN(int i) {
			return getToken(TexParser.CURLY_OPEN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> CURLY_CLOSE() { return getTokens(TexParser.CURLY_CLOSE); }
		public TerminalNode CURLY_CLOSE(int i) {
			return getToken(TexParser.CURLY_CLOSE, i);
		}
		public TerminalNode CHOOSE() { return getToken(TexParser.CHOOSE, 0); }
		public ChooseTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterChooseT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitChooseT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexVisitor ) return ((TexVisitor<? extends T>)visitor).visitChooseT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubTContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(TexParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(TexParser.MINUS, 0); }
		public TerminalNode PLUS_MINUS() { return getToken(TexParser.PLUS_MINUS, 0); }
		public AddSubTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterAddSubT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitAddSubT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexVisitor ) return ((TexVisitor<? extends T>)visitor).visitAddSubT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqrtTContext extends ExpressionContext {
		public TerminalNode SQRT() { return getToken(TexParser.SQRT, 0); }
		public TerminalNode CURLY_OPEN() { return getToken(TexParser.CURLY_OPEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CURLY_CLOSE() { return getToken(TexParser.CURLY_CLOSE, 0); }
		public TerminalNode SQUARE_OPEN() { return getToken(TexParser.SQUARE_OPEN, 0); }
		public TerminalNode SQUARE_CLOSE() { return getToken(TexParser.SQUARE_CLOSE, 0); }
		public SqrtTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterSqrtT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitSqrtT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexVisitor ) return ((TexVisitor<? extends T>)visitor).visitSqrtT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomTContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(TexParser.NUMBER, 0); }
		public TerminalNode WORD() { return getToken(TexParser.WORD, 0); }
		public AtomTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).enterAtomT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexListener ) ((TexListener)listener).exitAtomT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexVisitor ) return ((TexVisitor<? extends T>)visitor).visitAtomT(this);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FRAC:
				{
				_localctx = new FracTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(18);
				match(FRAC);
				setState(19);
				match(CURLY_OPEN);
				setState(20);
				expression(0);
				setState(21);
				match(CURLY_CLOSE);
				setState(22);
				match(CURLY_OPEN);
				setState(23);
				expression(0);
				setState(24);
				match(CURLY_CLOSE);
				}
				break;
			case CURLY_OPEN:
				{
				_localctx = new ChooseTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(26);
				match(CURLY_OPEN);
				setState(27);
				expression(0);
				setState(28);
				match(CURLY_CLOSE);
				setState(29);
				match(CHOOSE);
				setState(30);
				match(CURLY_OPEN);
				setState(31);
				expression(0);
				setState(32);
				match(CURLY_CLOSE);
				}
				break;
			case SQRT:
				{
				_localctx = new SqrtTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34);
				match(SQRT);
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SQUARE_OPEN) {
					{
					setState(35);
					match(SQUARE_OPEN);
					setState(36);
					expression(0);
					setState(37);
					match(SQUARE_CLOSE);
					}
				}

				setState(41);
				match(CURLY_OPEN);
				setState(42);
				expression(0);
				setState(43);
				match(CURLY_CLOSE);
				}
				break;
			case ROUND_OPEN:
				{
				_localctx = new BrTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				match(ROUND_OPEN);
				setState(46);
				expression(0);
				setState(47);
				match(ROUND_CLOSE);
				}
				break;
			case MINUS:
			case PLUS_MINUS:
				{
				_localctx = new UnaryTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==PLUS_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(50);
				expression(2);
				}
				break;
			case WORD:
			case NUMBER:
				{
				_localctx = new AtomTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				_la = _input.LA(1);
				if ( !(_la==WORD || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(86);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivTContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(54);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(55);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(56);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new AddSubTContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(57);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(58);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << PLUS_MINUS))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(59);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new SupsubTContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(60);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(61);
						match(UP);
						setState(62);
						match(CURLY_OPEN);
						setState(63);
						expression(0);
						setState(64);
						match(CURLY_CLOSE);
						setState(65);
						match(DOWN);
						setState(66);
						match(CURLY_OPEN);
						setState(67);
						expression(0);
						setState(68);
						match(CURLY_CLOSE);
						}
						break;
					case 4:
						{
						_localctx = new SubsupTContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(70);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(71);
						match(DOWN);
						setState(72);
						match(CURLY_OPEN);
						setState(73);
						expression(0);
						setState(74);
						match(CURLY_CLOSE);
						setState(75);
						match(UP);
						setState(76);
						match(CURLY_OPEN);
						setState(77);
						expression(0);
						setState(78);
						match(CURLY_CLOSE);
						}
						break;
					case 5:
						{
						_localctx = new IndexTContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(80);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(81);
						_la = _input.LA(1);
						if ( !(_la==UP || _la==DOWN) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(82);
						match(CURLY_OPEN);
						setState(83);
						expression(0);
						setState(84);
						match(CURLY_CLOSE);
						}
						break;
					}
					} 
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
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
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32^\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\22\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4*\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\67\n\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4Y\n\4\f"+
		"\4\16\4\\\13\4\3\4\2\3\6\5\2\4\6\2\7\4\2\16\16\22\22\3\2\17\20\4\2\24"+
		"\24\26\26\4\2\r\16\22\22\3\2\13\f\2f\2\b\3\2\2\2\4\21\3\2\2\2\6\66\3\2"+
		"\2\2\b\t\7\31\2\2\t\n\5\4\3\2\n\13\7\31\2\2\13\3\3\2\2\2\f\r\5\6\4\2\r"+
		"\16\7\3\2\2\16\17\5\4\3\2\17\22\3\2\2\2\20\22\5\6\4\2\21\f\3\2\2\2\21"+
		"\20\3\2\2\2\22\5\3\2\2\2\23\24\b\4\1\2\24\25\7\32\2\2\25\26\7\5\2\2\26"+
		"\27\5\6\4\2\27\30\7\6\2\2\30\31\7\5\2\2\31\32\5\6\4\2\32\33\7\6\2\2\33"+
		"\67\3\2\2\2\34\35\7\5\2\2\35\36\5\6\4\2\36\37\7\6\2\2\37 \7\4\2\2 !\7"+
		"\5\2\2!\"\5\6\4\2\"#\7\6\2\2#\67\3\2\2\2$)\7\25\2\2%&\7\7\2\2&\'\5\6\4"+
		"\2\'(\7\b\2\2(*\3\2\2\2)%\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\7\5\2\2,-\5\6"+
		"\4\2-.\7\6\2\2.\67\3\2\2\2/\60\7\t\2\2\60\61\5\6\4\2\61\62\7\n\2\2\62"+
		"\67\3\2\2\2\63\64\t\2\2\2\64\67\5\6\4\4\65\67\t\3\2\2\66\23\3\2\2\2\66"+
		"\34\3\2\2\2\66$\3\2\2\2\66/\3\2\2\2\66\63\3\2\2\2\66\65\3\2\2\2\67Z\3"+
		"\2\2\289\f\6\2\29:\t\4\2\2:Y\5\6\4\7;<\f\5\2\2<=\t\5\2\2=Y\5\6\4\6>?\f"+
		"\n\2\2?@\7\13\2\2@A\7\5\2\2AB\5\6\4\2BC\7\6\2\2CD\7\f\2\2DE\7\5\2\2EF"+
		"\5\6\4\2FG\7\6\2\2GY\3\2\2\2HI\f\t\2\2IJ\7\f\2\2JK\7\5\2\2KL\5\6\4\2L"+
		"M\7\6\2\2MN\7\13\2\2NO\7\5\2\2OP\5\6\4\2PQ\7\6\2\2QY\3\2\2\2RS\f\b\2\2"+
		"ST\t\6\2\2TU\7\5\2\2UV\5\6\4\2VW\7\6\2\2WY\3\2\2\2X8\3\2\2\2X;\3\2\2\2"+
		"X>\3\2\2\2XH\3\2\2\2XR\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\7\3\2\2"+
		"\2\\Z\3\2\2\2\7\21)\66XZ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}