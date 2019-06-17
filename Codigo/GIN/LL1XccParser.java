// Generated from LL1Xcc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LL1XccParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, EXTENDS=2, ABRCHAVE=3, PTVIR=4, FECHCHAVE=5, INT=6, STRING=7, 
		ABRCOL=8, FECHCOL=9, VIRG=10, CONSTRUCTOR=11, ABRPAR=12, FECHPAR=13, BREAK=14, 
		ATR=15, PRINT=16, READ=17, RETURN=18, SUPER=19, IF=20, ELSE=21, FOR=22, 
		PONTO=23, NEW=24, MENOR=25, MAIOR=26, MENORIG=27, MAIORIG=28, IGUAL=29, 
		DIFER=30, OPMAIS=31, OPMENOS=32, OPVEZES=33, OPDIV=34, OPMOD=35, NULL=36, 
		THEN=37, INTCONSTANT=38, STRINGCONSTANT=39, IDENT=40, WS=41;
	public static final int
		RULE_program = 0, RULE_classlist = 1, RULE_classlist2 = 2, RULE_dec = 3, 
		RULE_intstringident = 4, RULE_cols = 5, RULE_vardecl1 = 6, RULE_lvalue = 7, 
		RULE_lvalue2 = 8, RULE_exps = 9, RULE_numexpression2 = 10, RULE_numexpression = 11, 
		RULE_term = 12, RULE_term1 = 13, RULE_unaryexpr = 14, RULE_factor = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classlist", "classlist2", "dec", "intstringident", "cols", 
			"vardecl1", "lvalue", "lvalue2", "exps", "numexpression2", "numexpression", 
			"term", "term1", "unaryexpr", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'extends'", "'{'", "';'", "'}'", "'int'", "'string'", 
			"'['", "']'", "','", "'constructor'", "'('", "')'", "'break'", "'='", 
			"'print'", "'read'", "'return'", "'super'", "'if'", "'else'", "'for'", 
			"'.'", "'new'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'null'", "'then'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "EXTENDS", "ABRCHAVE", "PTVIR", "FECHCHAVE", "INT", "STRING", 
			"ABRCOL", "FECHCOL", "VIRG", "CONSTRUCTOR", "ABRPAR", "FECHPAR", "BREAK", 
			"ATR", "PRINT", "READ", "RETURN", "SUPER", "IF", "ELSE", "FOR", "PONTO", 
			"NEW", "MENOR", "MAIOR", "MENORIG", "MAIORIG", "IGUAL", "DIFER", "OPMAIS", 
			"OPMENOS", "OPVEZES", "OPDIV", "OPMOD", "NULL", "THEN", "INTCONSTANT", 
			"STRINGCONSTANT", "IDENT", "WS"
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
	public String getGrammarFileName() { return "LL1Xcc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LL1XccParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ClasslistContext classlist() {
			return getRuleContext(ClasslistContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				classlist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ClasslistContext extends ParserRuleContext {
		public Classlist2Context classlist2() {
			return getRuleContext(Classlist2Context.class,0);
		}
		public ClasslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterClasslist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitClasslist(this);
		}
	}

	public final ClasslistContext classlist() throws RecognitionException {
		ClasslistContext _localctx = new ClasslistContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			classlist2();
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

	public static class Classlist2Context extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LL1XccParser.IDENT, 0); }
		public TerminalNode ATR() { return getToken(LL1XccParser.ATR, 0); }
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public TerminalNode PTVIR() { return getToken(LL1XccParser.PTVIR, 0); }
		public Classlist2Context classlist2() {
			return getRuleContext(Classlist2Context.class,0);
		}
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public Classlist2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classlist2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterClasslist2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitClasslist2(this);
		}
	}

	public final Classlist2Context classlist2() throws RecognitionException {
		Classlist2Context _localctx = new Classlist2Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_classlist2);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(IDENT);
				setState(39);
				match(ATR);
				setState(40);
				exps();
				setState(41);
				match(PTVIR);
				setState(42);
				classlist2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				dec();
				setState(45);
				match(PTVIR);
				setState(46);
				classlist2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class DecContext extends ParserRuleContext {
		public IntstringidentContext intstringident() {
			return getRuleContext(IntstringidentContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LL1XccParser.IDENT, 0); }
		public ColsContext cols() {
			return getRuleContext(ColsContext.class,0);
		}
		public Vardecl1Context vardecl1() {
			return getRuleContext(Vardecl1Context.class,0);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitDec(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			intstringident();
			setState(52);
			match(IDENT);
			setState(53);
			cols();
			setState(54);
			vardecl1();
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

	public static class IntstringidentContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LL1XccParser.INT, 0); }
		public TerminalNode STRING() { return getToken(LL1XccParser.STRING, 0); }
		public TerminalNode IDENT() { return getToken(LL1XccParser.IDENT, 0); }
		public IntstringidentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intstringident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterIntstringident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitIntstringident(this);
		}
	}

	public final IntstringidentContext intstringident() throws RecognitionException {
		IntstringidentContext _localctx = new IntstringidentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_intstringident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << IDENT))) != 0)) ) {
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

	public static class ColsContext extends ParserRuleContext {
		public TerminalNode ABRCOL() { return getToken(LL1XccParser.ABRCOL, 0); }
		public TerminalNode INTCONSTANT() { return getToken(LL1XccParser.INTCONSTANT, 0); }
		public TerminalNode FECHCOL() { return getToken(LL1XccParser.FECHCOL, 0); }
		public ColsContext cols() {
			return getRuleContext(ColsContext.class,0);
		}
		public ColsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterCols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitCols(this);
		}
	}

	public final ColsContext cols() throws RecognitionException {
		ColsContext _localctx = new ColsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cols);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRCOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(ABRCOL);
				setState(59);
				match(INTCONSTANT);
				setState(60);
				match(FECHCOL);
				setState(61);
				cols();
				}
				break;
			case PTVIR:
			case VIRG:
				enterOuterAlt(_localctx, 2);
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

	public static class Vardecl1Context extends ParserRuleContext {
		public TerminalNode VIRG() { return getToken(LL1XccParser.VIRG, 0); }
		public TerminalNode IDENT() { return getToken(LL1XccParser.IDENT, 0); }
		public ColsContext cols() {
			return getRuleContext(ColsContext.class,0);
		}
		public Vardecl1Context vardecl1() {
			return getRuleContext(Vardecl1Context.class,0);
		}
		public Vardecl1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterVardecl1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitVardecl1(this);
		}
	}

	public final Vardecl1Context vardecl1() throws RecognitionException {
		Vardecl1Context _localctx = new Vardecl1Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_vardecl1);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VIRG:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(VIRG);
				setState(66);
				match(IDENT);
				setState(67);
				cols();
				setState(68);
				vardecl1();
				}
				break;
			case PTVIR:
				enterOuterAlt(_localctx, 2);
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

	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LL1XccParser.IDENT, 0); }
		public Lvalue2Context lvalue2() {
			return getRuleContext(Lvalue2Context.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitLvalue(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(IDENT);
			setState(74);
			lvalue2();
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

	public static class Lvalue2Context extends ParserRuleContext {
		public TerminalNode ABRCOL() { return getToken(LL1XccParser.ABRCOL, 0); }
		public TerminalNode INTCONSTANT() { return getToken(LL1XccParser.INTCONSTANT, 0); }
		public TerminalNode FECHCOL() { return getToken(LL1XccParser.FECHCOL, 0); }
		public Lvalue2Context lvalue2() {
			return getRuleContext(Lvalue2Context.class,0);
		}
		public Lvalue2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterLvalue2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitLvalue2(this);
		}
	}

	public final Lvalue2Context lvalue2() throws RecognitionException {
		Lvalue2Context _localctx = new Lvalue2Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_lvalue2);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRCOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(ABRCOL);
				setState(77);
				match(INTCONSTANT);
				setState(78);
				match(FECHCOL);
				setState(79);
				lvalue2();
				}
				break;
			case EOF:
			case PTVIR:
			case FECHPAR:
			case OPMAIS:
			case OPMENOS:
			case OPVEZES:
			case OPDIV:
			case OPMOD:
				enterOuterAlt(_localctx, 2);
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

	public static class ExpsContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Numexpression2Context numexpression2() {
			return getRuleContext(Numexpression2Context.class,0);
		}
		public ExpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterExps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitExps(this);
		}
	}

	public final ExpsContext exps() throws RecognitionException {
		ExpsContext _localctx = new ExpsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exps);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			term();
			setState(84);
			numexpression2();
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

	public static class Numexpression2Context extends ParserRuleContext {
		public TerminalNode OPMAIS() { return getToken(LL1XccParser.OPMAIS, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Numexpression2Context numexpression2() {
			return getRuleContext(Numexpression2Context.class,0);
		}
		public TerminalNode OPMENOS() { return getToken(LL1XccParser.OPMENOS, 0); }
		public Numexpression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numexpression2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterNumexpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitNumexpression2(this);
		}
	}

	public final Numexpression2Context numexpression2() throws RecognitionException {
		Numexpression2Context _localctx = new Numexpression2Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_numexpression2);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPMAIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(OPMAIS);
				setState(87);
				term();
				setState(88);
				numexpression2();
				}
				break;
			case OPMENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(OPMENOS);
				setState(91);
				term();
				setState(92);
				numexpression2();
				}
				break;
			case EOF:
			case PTVIR:
			case FECHPAR:
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

	public static class NumexpressionContext extends ParserRuleContext {
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public NumexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterNumexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitNumexpression(this);
		}
	}

	public final NumexpressionContext numexpression() throws RecognitionException {
		NumexpressionContext _localctx = new NumexpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_numexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			exps();
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

	public static class TermContext extends ParserRuleContext {
		public UnaryexprContext unaryexpr() {
			return getRuleContext(UnaryexprContext.class,0);
		}
		public Term1Context term1() {
			return getRuleContext(Term1Context.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			unaryexpr();
			setState(100);
			term1();
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

	public static class Term1Context extends ParserRuleContext {
		public TerminalNode OPVEZES() { return getToken(LL1XccParser.OPVEZES, 0); }
		public UnaryexprContext unaryexpr() {
			return getRuleContext(UnaryexprContext.class,0);
		}
		public Term1Context term1() {
			return getRuleContext(Term1Context.class,0);
		}
		public TerminalNode OPDIV() { return getToken(LL1XccParser.OPDIV, 0); }
		public TerminalNode OPMOD() { return getToken(LL1XccParser.OPMOD, 0); }
		public Term1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterTerm1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitTerm1(this);
		}
	}

	public final Term1Context term1() throws RecognitionException {
		Term1Context _localctx = new Term1Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_term1);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPVEZES:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(OPVEZES);
				setState(103);
				unaryexpr();
				setState(104);
				term1();
				}
				break;
			case OPDIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(OPDIV);
				setState(107);
				unaryexpr();
				setState(108);
				term1();
				}
				break;
			case OPMOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				match(OPMOD);
				setState(111);
				unaryexpr();
				setState(112);
				term1();
				}
				break;
			case EOF:
			case PTVIR:
			case FECHPAR:
			case OPMAIS:
			case OPMENOS:
				enterOuterAlt(_localctx, 4);
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

	public static class UnaryexprContext extends ParserRuleContext {
		public TerminalNode OPMAIS() { return getToken(LL1XccParser.OPMAIS, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode OPMENOS() { return getToken(LL1XccParser.OPMENOS, 0); }
		public UnaryexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterUnaryexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitUnaryexpr(this);
		}
	}

	public final UnaryexprContext unaryexpr() throws RecognitionException {
		UnaryexprContext _localctx = new UnaryexprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unaryexpr);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPMAIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(OPMAIS);
				setState(118);
				factor();
				}
				break;
			case OPMENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(OPMENOS);
				setState(120);
				factor();
				}
				break;
			case ABRPAR:
			case NULL:
			case INTCONSTANT:
			case STRINGCONSTANT:
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				factor();
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode INTCONSTANT() { return getToken(LL1XccParser.INTCONSTANT, 0); }
		public TerminalNode STRINGCONSTANT() { return getToken(LL1XccParser.STRINGCONSTANT, 0); }
		public TerminalNode NULL() { return getToken(LL1XccParser.NULL, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ABRPAR() { return getToken(LL1XccParser.ABRPAR, 0); }
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public TerminalNode FECHPAR() { return getToken(LL1XccParser.FECHPAR, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_factor);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTCONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(INTCONSTANT);
				}
				break;
			case STRINGCONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(STRINGCONSTANT);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				match(NULL);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				lvalue();
				}
				break;
			case ABRPAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				match(ABRPAR);
				setState(129);
				exps();
				setState(130);
				match(FECHPAR);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0089\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\5"+
		"\2%\n\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\64\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7B\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\bJ\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\nT\n\n\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fb\n\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17v\n\17\3\20\3\20\3\20\3\20\3\20\5\20}\n\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u0087\n\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \2\3\4\2\b\t**\2\u0089\2$\3\2\2\2\4&\3\2\2\2\6\63\3\2"+
		"\2\2\b\65\3\2\2\2\n:\3\2\2\2\fA\3\2\2\2\16I\3\2\2\2\20K\3\2\2\2\22S\3"+
		"\2\2\2\24U\3\2\2\2\26a\3\2\2\2\30c\3\2\2\2\32e\3\2\2\2\34u\3\2\2\2\36"+
		"|\3\2\2\2 \u0086\3\2\2\2\"%\5\4\3\2#%\3\2\2\2$\"\3\2\2\2$#\3\2\2\2%\3"+
		"\3\2\2\2&\'\5\6\4\2\'\5\3\2\2\2()\7*\2\2)*\7\21\2\2*+\5\24\13\2+,\7\6"+
		"\2\2,-\5\6\4\2-\64\3\2\2\2./\5\b\5\2/\60\7\6\2\2\60\61\5\6\4\2\61\64\3"+
		"\2\2\2\62\64\3\2\2\2\63(\3\2\2\2\63.\3\2\2\2\63\62\3\2\2\2\64\7\3\2\2"+
		"\2\65\66\5\n\6\2\66\67\7*\2\2\678\5\f\7\289\5\16\b\29\t\3\2\2\2:;\t\2"+
		"\2\2;\13\3\2\2\2<=\7\n\2\2=>\7(\2\2>?\7\13\2\2?B\5\f\7\2@B\3\2\2\2A<\3"+
		"\2\2\2A@\3\2\2\2B\r\3\2\2\2CD\7\f\2\2DE\7*\2\2EF\5\f\7\2FG\5\16\b\2GJ"+
		"\3\2\2\2HJ\3\2\2\2IC\3\2\2\2IH\3\2\2\2J\17\3\2\2\2KL\7*\2\2LM\5\22\n\2"+
		"M\21\3\2\2\2NO\7\n\2\2OP\7(\2\2PQ\7\13\2\2QT\5\22\n\2RT\3\2\2\2SN\3\2"+
		"\2\2SR\3\2\2\2T\23\3\2\2\2UV\5\32\16\2VW\5\26\f\2W\25\3\2\2\2XY\7!\2\2"+
		"YZ\5\32\16\2Z[\5\26\f\2[b\3\2\2\2\\]\7\"\2\2]^\5\32\16\2^_\5\26\f\2_b"+
		"\3\2\2\2`b\3\2\2\2aX\3\2\2\2a\\\3\2\2\2a`\3\2\2\2b\27\3\2\2\2cd\5\24\13"+
		"\2d\31\3\2\2\2ef\5\36\20\2fg\5\34\17\2g\33\3\2\2\2hi\7#\2\2ij\5\36\20"+
		"\2jk\5\34\17\2kv\3\2\2\2lm\7$\2\2mn\5\36\20\2no\5\34\17\2ov\3\2\2\2pq"+
		"\7%\2\2qr\5\36\20\2rs\5\34\17\2sv\3\2\2\2tv\3\2\2\2uh\3\2\2\2ul\3\2\2"+
		"\2up\3\2\2\2ut\3\2\2\2v\35\3\2\2\2wx\7!\2\2x}\5 \21\2yz\7\"\2\2z}\5 \21"+
		"\2{}\5 \21\2|w\3\2\2\2|y\3\2\2\2|{\3\2\2\2}\37\3\2\2\2~\u0087\7(\2\2\177"+
		"\u0087\7)\2\2\u0080\u0087\7&\2\2\u0081\u0087\5\20\t\2\u0082\u0083\7\16"+
		"\2\2\u0083\u0084\5\24\13\2\u0084\u0085\7\17\2\2\u0085\u0087\3\2\2\2\u0086"+
		"~\3\2\2\2\u0086\177\3\2\2\2\u0086\u0080\3\2\2\2\u0086\u0081\3\2\2\2\u0086"+
		"\u0082\3\2\2\2\u0087!\3\2\2\2\13$\63AISau|\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}