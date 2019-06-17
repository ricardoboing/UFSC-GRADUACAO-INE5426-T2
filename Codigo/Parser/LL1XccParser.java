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
		RULE_program = 0, RULE_classlist = 1, RULE_classlist2 = 2, RULE_classdecl = 3, 
		RULE_classdecl2 = 4, RULE_classbody = 5, RULE_classbody1 = 6, RULE_classbody2 = 7, 
		RULE_classbody3 = 8, RULE_vardecl = 9, RULE_dec = 10, RULE_intstringident = 11, 
		RULE_cols = 12, RULE_vardecl1 = 13, RULE_constructdecl = 14, RULE_methoddecl = 15, 
		RULE_methodbody = 16, RULE_paramlist = 17, RULE_paramlist1 = 18, RULE_statement = 19, 
		RULE_intstring = 20, RULE_virgidentcols = 21, RULE_statement2 = 22, RULE_statement3 = 23, 
		RULE_expralocexpr = 24, RULE_atribstat = 25, RULE_printstat = 26, RULE_readstat = 27, 
		RULE_returnstat = 28, RULE_returnstat1 = 29, RULE_superstat = 30, RULE_ifstat = 31, 
		RULE_ifstat1 = 32, RULE_forstat = 33, RULE_forstat1 = 34, RULE_forstat2 = 35, 
		RULE_statlist = 36, RULE_statlist1 = 37, RULE_lvalue = 38, RULE_lvalue2 = 39, 
		RULE_alocexpression = 40, RULE_alocexpression2 = 41, RULE_alocexpression3 = 42, 
		RULE_alocexpression4 = 43, RULE_alocexpression5 = 44, RULE_expression = 45, 
		RULE_expression2 = 46, RULE_expresion3 = 47, RULE_numexpression = 48, 
		RULE_exps = 49, RULE_numexpression2 = 50, RULE_term = 51, RULE_term1 = 52, 
		RULE_unaryexpr = 53, RULE_factor = 54, RULE_arglist = 55, RULE_arglist1 = 56;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classlist", "classlist2", "classdecl", "classdecl2", "classbody", 
			"classbody1", "classbody2", "classbody3", "vardecl", "dec", "intstringident", 
			"cols", "vardecl1", "constructdecl", "methoddecl", "methodbody", "paramlist", 
			"paramlist1", "statement", "intstring", "virgidentcols", "statement2", 
			"statement3", "expralocexpr", "atribstat", "printstat", "readstat", "returnstat", 
			"returnstat1", "superstat", "ifstat", "ifstat1", "forstat", "forstat1", 
			"forstat2", "statlist", "statlist1", "lvalue", "lvalue2", "alocexpression", 
			"alocexpression2", "alocexpression3", "alocexpression4", "alocexpression5", 
			"expression", "expression2", "expresion3", "numexpression", "exps", "numexpression2", 
			"term", "term1", "unaryexpr", "factor", "arglist", "arglist1"
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
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				classlist();
				}
				break;
			case EOF:
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

	public static class ClasslistContext extends ParserRuleContext {
		public ClassdeclContext classdecl() {
			return getRuleContext(ClassdeclContext.class,0);
		}
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
			setState(118);
			classdecl();
			setState(119);
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
		public ClasslistContext classlist() {
			return getRuleContext(ClasslistContext.class,0);
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
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				classlist();
				}
				break;
			case EOF:
			case FECHCHAVE:
			case INT:
			case STRING:
			case CONSTRUCTOR:
			case IDENT:
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

	public static class ClassdeclContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(LL1XccParser.CLASS, 0); }
		public TerminalNode IDENT() { return getToken(LL1XccParser.IDENT, 0); }
		public Classdecl2Context classdecl2() {
			return getRuleContext(Classdecl2Context.class,0);
		}
		public ClassdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterClassdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitClassdecl(this);
		}
	}

	public final ClassdeclContext classdecl() throws RecognitionException {
		ClassdeclContext _localctx = new ClassdeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(CLASS);
			setState(126);
			match(IDENT);
			setState(127);
			classdecl2();
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

	public static class Classdecl2Context extends ParserRuleContext {
		public ClassbodyContext classbody() {
			return getRuleContext(ClassbodyContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(LL1XccParser.EXTENDS, 0); }
		public TerminalNode IDENT() { return getToken(LL1XccParser.IDENT, 0); }
		public Classdecl2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdecl2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterClassdecl2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitClassdecl2(this);
		}
	}

	public final Classdecl2Context classdecl2() throws RecognitionException {
		Classdecl2Context _localctx = new Classdecl2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_classdecl2);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRCHAVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				classbody();
				}
				break;
			case EXTENDS:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(EXTENDS);
				setState(131);
				match(IDENT);
				setState(132);
				classbody();
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

	public static class ClassbodyContext extends ParserRuleContext {
		public TerminalNode ABRCHAVE() { return getToken(LL1XccParser.ABRCHAVE, 0); }
		public Classbody1Context classbody1() {
			return getRuleContext(Classbody1Context.class,0);
		}
		public Classbody2Context classbody2() {
			return getRuleContext(Classbody2Context.class,0);
		}
		public Classbody3Context classbody3() {
			return getRuleContext(Classbody3Context.class,0);
		}
		public TerminalNode FECHCHAVE() { return getToken(LL1XccParser.FECHCHAVE, 0); }
		public ClasslistContext classlist() {
			return getRuleContext(ClasslistContext.class,0);
		}
		public ClassbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterClassbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitClassbody(this);
		}
	}

	public final ClassbodyContext classbody() throws RecognitionException {
		ClassbodyContext _localctx = new ClassbodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classbody);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(ABRCHAVE);
				setState(136);
				classbody1();
				setState(137);
				classbody2();
				setState(138);
				classbody3();
				setState(139);
				match(FECHCHAVE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(ABRCHAVE);
				setState(142);
				classlist();
				setState(143);
				classbody1();
				setState(144);
				classbody2();
				setState(145);
				classbody3();
				setState(146);
				match(FECHCHAVE);
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

	public static class Classbody1Context extends ParserRuleContext {
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public TerminalNode PTVIR() { return getToken(LL1XccParser.PTVIR, 0); }
		public Classbody1Context classbody1() {
			return getRuleContext(Classbody1Context.class,0);
		}
		public Classbody1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classbody1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterClassbody1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitClassbody1(this);
		}
	}

	public final Classbody1Context classbody1() throws RecognitionException {
		Classbody1Context _localctx = new Classbody1Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_classbody1);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				vardecl();
				setState(151);
				match(PTVIR);
				setState(152);
				classbody1();
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

	public static class Classbody2Context extends ParserRuleContext {
		public ConstructdeclContext constructdecl() {
			return getRuleContext(ConstructdeclContext.class,0);
		}
		public Classbody2Context classbody2() {
			return getRuleContext(Classbody2Context.class,0);
		}
		public Classbody2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classbody2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterClassbody2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitClassbody2(this);
		}
	}

	public final Classbody2Context classbody2() throws RecognitionException {
		Classbody2Context _localctx = new Classbody2Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_classbody2);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				constructdecl();
				setState(158);
				classbody2();
				}
				break;
			case FECHCHAVE:
			case INT:
			case STRING:
			case IDENT:
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

	public static class Classbody3Context extends ParserRuleContext {
		public MethoddeclContext methoddecl() {
			return getRuleContext(MethoddeclContext.class,0);
		}
		public Classbody3Context classbody3() {
			return getRuleContext(Classbody3Context.class,0);
		}
		public Classbody3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classbody3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterClassbody3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitClassbody3(this);
		}
	}

	public final Classbody3Context classbody3() throws RecognitionException {
		Classbody3Context _localctx = new Classbody3Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_classbody3);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				methoddecl();
				setState(164);
				classbody3();
				}
				break;
			case FECHCHAVE:
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

	public static class VardeclContext extends ParserRuleContext {
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public Vardecl1Context vardecl1() {
			return getRuleContext(Vardecl1Context.class,0);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitVardecl(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_vardecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			dec();
			setState(170);
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

	public static class DecContext extends ParserRuleContext {
		public IntstringidentContext intstringident() {
			return getRuleContext(IntstringidentContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LL1XccParser.IDENT, 0); }
		public ColsContext cols() {
			return getRuleContext(ColsContext.class,0);
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
		enterRule(_localctx, 20, RULE_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			intstringident();
			setState(173);
			match(IDENT);
			setState(174);
			cols();
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
		enterRule(_localctx, 22, RULE_intstringident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
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
		enterRule(_localctx, 24, RULE_cols);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRCOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(ABRCOL);
				setState(179);
				match(INTCONSTANT);
				setState(180);
				match(FECHCOL);
				setState(181);
				cols();
				}
				break;
			case PTVIR:
			case VIRG:
			case FECHPAR:
			case IDENT:
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
		enterRule(_localctx, 26, RULE_vardecl1);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VIRG:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(VIRG);
				setState(186);
				match(IDENT);
				setState(187);
				cols();
				setState(188);
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

	public static class ConstructdeclContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(LL1XccParser.CONSTRUCTOR, 0); }
		public MethodbodyContext methodbody() {
			return getRuleContext(MethodbodyContext.class,0);
		}
		public ConstructdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterConstructdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitConstructdecl(this);
		}
	}

	public final ConstructdeclContext constructdecl() throws RecognitionException {
		ConstructdeclContext _localctx = new ConstructdeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constructdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(CONSTRUCTOR);
			setState(194);
			methodbody();
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

	public static class MethoddeclContext extends ParserRuleContext {
		public IntstringidentContext intstringident() {
			return getRuleContext(IntstringidentContext.class,0);
		}
		public ColsContext cols() {
			return getRuleContext(ColsContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LL1XccParser.IDENT, 0); }
		public MethodbodyContext methodbody() {
			return getRuleContext(MethodbodyContext.class,0);
		}
		public MethoddeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methoddecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterMethoddecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitMethoddecl(this);
		}
	}

	public final MethoddeclContext methoddecl() throws RecognitionException {
		MethoddeclContext _localctx = new MethoddeclContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methoddecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			intstringident();
			setState(197);
			cols();
			setState(198);
			match(IDENT);
			setState(199);
			methodbody();
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

	public static class MethodbodyContext extends ParserRuleContext {
		public TerminalNode ABRPAR() { return getToken(LL1XccParser.ABRPAR, 0); }
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public TerminalNode FECHPAR() { return getToken(LL1XccParser.FECHPAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MethodbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterMethodbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitMethodbody(this);
		}
	}

	public final MethodbodyContext methodbody() throws RecognitionException {
		MethodbodyContext _localctx = new MethodbodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_methodbody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(ABRPAR);
			setState(202);
			paramlist();
			setState(203);
			match(FECHPAR);
			setState(204);
			statement();
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

	public static class ParamlistContext extends ParserRuleContext {
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public Paramlist1Context paramlist1() {
			return getRuleContext(Paramlist1Context.class,0);
		}
		public ParamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterParamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitParamlist(this);
		}
	}

	public final ParamlistContext paramlist() throws RecognitionException {
		ParamlistContext _localctx = new ParamlistContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_paramlist);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				dec();
				setState(207);
				paramlist1();
				}
				break;
			case FECHPAR:
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

	public static class Paramlist1Context extends ParserRuleContext {
		public TerminalNode VIRG() { return getToken(LL1XccParser.VIRG, 0); }
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public Paramlist1Context paramlist1() {
			return getRuleContext(Paramlist1Context.class,0);
		}
		public Paramlist1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlist1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterParamlist1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitParamlist1(this);
		}
	}

	public final Paramlist1Context paramlist1() throws RecognitionException {
		Paramlist1Context _localctx = new Paramlist1Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_paramlist1);
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VIRG:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(VIRG);
				setState(213);
				dec();
				setState(214);
				paramlist1();
				}
				break;
			case FECHPAR:
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

	public static class StatementContext extends ParserRuleContext {
		public IntstringContext intstring() {
			return getRuleContext(IntstringContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LL1XccParser.IDENT, 0); }
		public ColsContext cols() {
			return getRuleContext(ColsContext.class,0);
		}
		public VirgidentcolsContext virgidentcols() {
			return getRuleContext(VirgidentcolsContext.class,0);
		}
		public TerminalNode PTVIR() { return getToken(LL1XccParser.PTVIR, 0); }
		public Statement2Context statement2() {
			return getRuleContext(Statement2Context.class,0);
		}
		public PrintstatContext printstat() {
			return getRuleContext(PrintstatContext.class,0);
		}
		public ReadstatContext readstat() {
			return getRuleContext(ReadstatContext.class,0);
		}
		public ReturnstatContext returnstat() {
			return getRuleContext(ReturnstatContext.class,0);
		}
		public IfstatContext ifstat() {
			return getRuleContext(IfstatContext.class,0);
		}
		public ForstatContext forstat() {
			return getRuleContext(ForstatContext.class,0);
		}
		public TerminalNode ABRCHAVE() { return getToken(LL1XccParser.ABRCHAVE, 0); }
		public StatlistContext statlist() {
			return getRuleContext(StatlistContext.class,0);
		}
		public TerminalNode FECHCHAVE() { return getToken(LL1XccParser.FECHCHAVE, 0); }
		public TerminalNode BREAK() { return getToken(LL1XccParser.BREAK, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statement);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				intstring();
				setState(220);
				match(IDENT);
				setState(221);
				cols();
				setState(222);
				virgidentcols();
				setState(223);
				match(PTVIR);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(IDENT);
				setState(226);
				statement2();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				printstat();
				setState(228);
				match(PTVIR);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				readstat();
				setState(231);
				match(PTVIR);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(233);
				returnstat();
				setState(234);
				match(PTVIR);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 6);
				{
				setState(236);
				ifstat();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 7);
				{
				setState(237);
				forstat();
				}
				break;
			case ABRCHAVE:
				enterOuterAlt(_localctx, 8);
				{
				setState(238);
				match(ABRCHAVE);
				setState(239);
				statlist();
				setState(240);
				match(FECHCHAVE);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 9);
				{
				setState(242);
				match(BREAK);
				setState(243);
				match(PTVIR);
				}
				break;
			case PTVIR:
				enterOuterAlt(_localctx, 10);
				{
				setState(244);
				match(PTVIR);
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

	public static class IntstringContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LL1XccParser.INT, 0); }
		public TerminalNode STRING() { return getToken(LL1XccParser.STRING, 0); }
		public IntstringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intstring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterIntstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitIntstring(this);
		}
	}

	public final IntstringContext intstring() throws RecognitionException {
		IntstringContext _localctx = new IntstringContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_intstring);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==STRING) ) {
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

	public static class VirgidentcolsContext extends ParserRuleContext {
		public TerminalNode VIRG() { return getToken(LL1XccParser.VIRG, 0); }
		public TerminalNode IDENT() { return getToken(LL1XccParser.IDENT, 0); }
		public ColsContext cols() {
			return getRuleContext(ColsContext.class,0);
		}
		public VirgidentcolsContext virgidentcols() {
			return getRuleContext(VirgidentcolsContext.class,0);
		}
		public VirgidentcolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virgidentcols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterVirgidentcols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitVirgidentcols(this);
		}
	}

	public final VirgidentcolsContext virgidentcols() throws RecognitionException {
		VirgidentcolsContext _localctx = new VirgidentcolsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_virgidentcols);
		try {
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VIRG:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(VIRG);
				setState(250);
				match(IDENT);
				setState(251);
				cols();
				setState(252);
				virgidentcols();
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

	public static class Statement2Context extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LL1XccParser.IDENT, 0); }
		public ColsContext cols() {
			return getRuleContext(ColsContext.class,0);
		}
		public VirgidentcolsContext virgidentcols() {
			return getRuleContext(VirgidentcolsContext.class,0);
		}
		public TerminalNode PTVIR() { return getToken(LL1XccParser.PTVIR, 0); }
		public Statement3Context statement3() {
			return getRuleContext(Statement3Context.class,0);
		}
		public TerminalNode ATR() { return getToken(LL1XccParser.ATR, 0); }
		public ExpralocexprContext expralocexpr() {
			return getRuleContext(ExpralocexprContext.class,0);
		}
		public Statement2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterStatement2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitStatement2(this);
		}
	}

	public final Statement2Context statement2() throws RecognitionException {
		Statement2Context _localctx = new Statement2Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_statement2);
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(IDENT);
				setState(258);
				cols();
				setState(259);
				virgidentcols();
				setState(260);
				match(PTVIR);
				}
				break;
			case ABRCOL:
			case ATR:
			case PONTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				statement3();
				setState(263);
				match(ATR);
				setState(264);
				expralocexpr();
				setState(265);
				match(PTVIR);
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

	public static class Statement3Context extends ParserRuleContext {
		public TerminalNode ABRCOL() { return getToken(LL1XccParser.ABRCOL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FECHCOL() { return getToken(LL1XccParser.FECHCOL, 0); }
		public Statement3Context statement3() {
			return getRuleContext(Statement3Context.class,0);
		}
		public TerminalNode PONTO() { return getToken(LL1XccParser.PONTO, 0); }
		public TerminalNode IDENT() { return getToken(LL1XccParser.IDENT, 0); }
		public TerminalNode ABRPAR() { return getToken(LL1XccParser.ABRPAR, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public TerminalNode FECHPAR() { return getToken(LL1XccParser.FECHPAR, 0); }
		public Statement3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterStatement3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitStatement3(this);
		}
	}

	public final Statement3Context statement3() throws RecognitionException {
		Statement3Context _localctx = new Statement3Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_statement3);
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(ABRCOL);
				setState(270);
				expression();
				setState(271);
				match(FECHCOL);
				setState(272);
				statement3();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(PONTO);
				setState(275);
				match(IDENT);
				setState(276);
				match(ABRPAR);
				setState(277);
				arglist();
				setState(278);
				match(FECHPAR);
				setState(279);
				statement3();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				match(PONTO);
				setState(282);
				match(IDENT);
				setState(283);
				statement3();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
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

	public static class ExpralocexprContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AlocexpressionContext alocexpression() {
			return getRuleContext(AlocexpressionContext.class,0);
		}
		public ExpralocexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expralocexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterExpralocexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitExpralocexpr(this);
		}
	}

	public final ExpralocexprContext expralocexpr() throws RecognitionException {
		ExpralocexprContext _localctx = new ExpralocexprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expralocexpr);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRPAR:
			case OPMAIS:
			case OPMENOS:
			case NULL:
			case INTCONSTANT:
			case STRINGCONSTANT:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				expression();
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				alocexpression();
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

	public static class AtribstatContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ATR() { return getToken(LL1XccParser.ATR, 0); }
		public ExpralocexprContext expralocexpr() {
			return getRuleContext(ExpralocexprContext.class,0);
		}
		public AtribstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterAtribstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitAtribstat(this);
		}
	}

	public final AtribstatContext atribstat() throws RecognitionException {
		AtribstatContext _localctx = new AtribstatContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_atribstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			lvalue();
			setState(292);
			match(ATR);
			setState(293);
			expralocexpr();
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

	public static class PrintstatContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(LL1XccParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterPrintstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitPrintstat(this);
		}
	}

	public final PrintstatContext printstat() throws RecognitionException {
		PrintstatContext _localctx = new PrintstatContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_printstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(PRINT);
			setState(296);
			expression();
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

	public static class ReadstatContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(LL1XccParser.READ, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ReadstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterReadstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitReadstat(this);
		}
	}

	public final ReadstatContext readstat() throws RecognitionException {
		ReadstatContext _localctx = new ReadstatContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_readstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(READ);
			setState(299);
			lvalue();
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

	public static class ReturnstatContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(LL1XccParser.RETURN, 0); }
		public Returnstat1Context returnstat1() {
			return getRuleContext(Returnstat1Context.class,0);
		}
		public ReturnstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterReturnstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitReturnstat(this);
		}
	}

	public final ReturnstatContext returnstat() throws RecognitionException {
		ReturnstatContext _localctx = new ReturnstatContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_returnstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(RETURN);
			setState(302);
			returnstat1();
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

	public static class Returnstat1Context extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Returnstat1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstat1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterReturnstat1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitReturnstat1(this);
		}
	}

	public final Returnstat1Context returnstat1() throws RecognitionException {
		Returnstat1Context _localctx = new Returnstat1Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_returnstat1);
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRPAR:
			case OPMAIS:
			case OPMENOS:
			case NULL:
			case INTCONSTANT:
			case STRINGCONSTANT:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				expression();
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

	public static class SuperstatContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(LL1XccParser.SUPER, 0); }
		public TerminalNode ABRPAR() { return getToken(LL1XccParser.ABRPAR, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public TerminalNode FECHPAR() { return getToken(LL1XccParser.FECHPAR, 0); }
		public SuperstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterSuperstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitSuperstat(this);
		}
	}

	public final SuperstatContext superstat() throws RecognitionException {
		SuperstatContext _localctx = new SuperstatContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_superstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(SUPER);
			setState(309);
			match(ABRPAR);
			setState(310);
			arglist();
			setState(311);
			match(FECHPAR);
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

	public static class IfstatContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LL1XccParser.IF, 0); }
		public TerminalNode ABRPAR() { return getToken(LL1XccParser.ABRPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FECHPAR() { return getToken(LL1XccParser.FECHPAR, 0); }
		public TerminalNode THEN() { return getToken(LL1XccParser.THEN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Ifstat1Context ifstat1() {
			return getRuleContext(Ifstat1Context.class,0);
		}
		public IfstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterIfstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitIfstat(this);
		}
	}

	public final IfstatContext ifstat() throws RecognitionException {
		IfstatContext _localctx = new IfstatContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ifstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(IF);
			setState(314);
			match(ABRPAR);
			setState(315);
			expression();
			setState(316);
			match(FECHPAR);
			setState(317);
			match(THEN);
			setState(318);
			statement();
			setState(319);
			ifstat1();
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

	public static class Ifstat1Context extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(LL1XccParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Ifstat1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstat1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterIfstat1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitIfstat1(this);
		}
	}

	public final Ifstat1Context ifstat1() throws RecognitionException {
		Ifstat1Context _localctx = new Ifstat1Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_ifstat1);
		try {
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(ELSE);
				setState(322);
				statement();
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

	public static class ForstatContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(LL1XccParser.FOR, 0); }
		public TerminalNode ABRPAR() { return getToken(LL1XccParser.ABRPAR, 0); }
		public Forstat1Context forstat1() {
			return getRuleContext(Forstat1Context.class,0);
		}
		public TerminalNode PTVIR() { return getToken(LL1XccParser.PTVIR, 0); }
		public Forstat2Context forstat2() {
			return getRuleContext(Forstat2Context.class,0);
		}
		public ForstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterForstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitForstat(this);
		}
	}

	public final ForstatContext forstat() throws RecognitionException {
		ForstatContext _localctx = new ForstatContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_forstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(FOR);
			setState(327);
			match(ABRPAR);
			setState(328);
			forstat1();
			setState(329);
			match(PTVIR);
			setState(330);
			forstat2();
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

	public static class Forstat1Context extends ParserRuleContext {
		public AtribstatContext atribstat() {
			return getRuleContext(AtribstatContext.class,0);
		}
		public Forstat1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstat1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterForstat1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitForstat1(this);
		}
	}

	public final Forstat1Context forstat1() throws RecognitionException {
		Forstat1Context _localctx = new Forstat1Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_forstat1);
		try {
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				atribstat();
				}
				break;
			case PTVIR:
			case FECHPAR:
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

	public static class Forstat2Context extends ParserRuleContext {
		public TerminalNode PTVIR() { return getToken(LL1XccParser.PTVIR, 0); }
		public Forstat1Context forstat1() {
			return getRuleContext(Forstat1Context.class,0);
		}
		public TerminalNode FECHPAR() { return getToken(LL1XccParser.FECHPAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Forstat2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstat2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterForstat2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitForstat2(this);
		}
	}

	public final Forstat2Context forstat2() throws RecognitionException {
		Forstat2Context _localctx = new Forstat2Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_forstat2);
		try {
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PTVIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(PTVIR);
				setState(337);
				forstat1();
				setState(338);
				match(FECHPAR);
				setState(339);
				statement();
				}
				break;
			case ABRPAR:
			case OPMAIS:
			case OPMENOS:
			case NULL:
			case INTCONSTANT:
			case STRINGCONSTANT:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				expression();
				setState(342);
				match(PTVIR);
				setState(343);
				forstat1();
				setState(344);
				match(FECHPAR);
				setState(345);
				statement();
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

	public static class StatlistContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statlist1Context statlist1() {
			return getRuleContext(Statlist1Context.class,0);
		}
		public StatlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterStatlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitStatlist(this);
		}
	}

	public final StatlistContext statlist() throws RecognitionException {
		StatlistContext _localctx = new StatlistContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_statlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			statement();
			setState(350);
			statlist1();
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

	public static class Statlist1Context extends ParserRuleContext {
		public StatlistContext statlist() {
			return getRuleContext(StatlistContext.class,0);
		}
		public Statlist1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statlist1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterStatlist1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitStatlist1(this);
		}
	}

	public final Statlist1Context statlist1() throws RecognitionException {
		Statlist1Context _localctx = new Statlist1Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_statlist1);
		try {
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRCHAVE:
			case PTVIR:
			case INT:
			case STRING:
			case BREAK:
			case PRINT:
			case READ:
			case RETURN:
			case IF:
			case FOR:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				statlist();
				}
				break;
			case FECHCHAVE:
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
		enterRule(_localctx, 76, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(IDENT);
			setState(357);
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
		enterRule(_localctx, 78, RULE_lvalue2);
		try {
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRCOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				match(ABRCOL);
				setState(360);
				match(INTCONSTANT);
				setState(361);
				match(FECHCOL);
				setState(362);
				lvalue2();
				}
				break;
			case PTVIR:
			case FECHCOL:
			case VIRG:
			case FECHPAR:
			case ATR:
			case MENOR:
			case MAIOR:
			case MENORIG:
			case MAIORIG:
			case IGUAL:
			case DIFER:
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

	public static class AlocexpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(LL1XccParser.NEW, 0); }
		public Alocexpression3Context alocexpression3() {
			return getRuleContext(Alocexpression3Context.class,0);
		}
		public AlocexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alocexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterAlocexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitAlocexpression(this);
		}
	}

	public final AlocexpressionContext alocexpression() throws RecognitionException {
		AlocexpressionContext _localctx = new AlocexpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_alocexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(NEW);
			setState(367);
			alocexpression3();
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

	public static class Alocexpression2Context extends ParserRuleContext {
		public TerminalNode ABRCOL() { return getToken(LL1XccParser.ABRCOL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FECHCOL() { return getToken(LL1XccParser.FECHCOL, 0); }
		public Alocexpression4Context alocexpression4() {
			return getRuleContext(Alocexpression4Context.class,0);
		}
		public Alocexpression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alocexpression2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterAlocexpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitAlocexpression2(this);
		}
	}

	public final Alocexpression2Context alocexpression2() throws RecognitionException {
		Alocexpression2Context _localctx = new Alocexpression2Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_alocexpression2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(ABRCOL);
			setState(370);
			expression();
			setState(371);
			match(FECHCOL);
			setState(372);
			alocexpression4();
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

	public static class Alocexpression3Context extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LL1XccParser.IDENT, 0); }
		public Alocexpression5Context alocexpression5() {
			return getRuleContext(Alocexpression5Context.class,0);
		}
		public TerminalNode INT() { return getToken(LL1XccParser.INT, 0); }
		public Alocexpression2Context alocexpression2() {
			return getRuleContext(Alocexpression2Context.class,0);
		}
		public TerminalNode STRING() { return getToken(LL1XccParser.STRING, 0); }
		public Alocexpression3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alocexpression3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterAlocexpression3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitAlocexpression3(this);
		}
	}

	public final Alocexpression3Context alocexpression3() throws RecognitionException {
		Alocexpression3Context _localctx = new Alocexpression3Context(_ctx, getState());
		enterRule(_localctx, 84, RULE_alocexpression3);
		try {
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				match(IDENT);
				setState(375);
				alocexpression5();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				match(INT);
				setState(377);
				alocexpression2();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				match(STRING);
				setState(379);
				alocexpression2();
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

	public static class Alocexpression4Context extends ParserRuleContext {
		public Alocexpression2Context alocexpression2() {
			return getRuleContext(Alocexpression2Context.class,0);
		}
		public Alocexpression4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alocexpression4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterAlocexpression4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitAlocexpression4(this);
		}
	}

	public final Alocexpression4Context alocexpression4() throws RecognitionException {
		Alocexpression4Context _localctx = new Alocexpression4Context(_ctx, getState());
		enterRule(_localctx, 86, RULE_alocexpression4);
		try {
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRCOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				alocexpression2();
				}
				break;
			case PTVIR:
			case FECHPAR:
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

	public static class Alocexpression5Context extends ParserRuleContext {
		public TerminalNode ABRPAR() { return getToken(LL1XccParser.ABRPAR, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public TerminalNode FECHPAR() { return getToken(LL1XccParser.FECHPAR, 0); }
		public Alocexpression2Context alocexpression2() {
			return getRuleContext(Alocexpression2Context.class,0);
		}
		public Alocexpression5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alocexpression5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterAlocexpression5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitAlocexpression5(this);
		}
	}

	public final Alocexpression5Context alocexpression5() throws RecognitionException {
		Alocexpression5Context _localctx = new Alocexpression5Context(_ctx, getState());
		enterRule(_localctx, 88, RULE_alocexpression5);
		try {
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				match(ABRPAR);
				setState(387);
				arglist();
				setState(388);
				match(FECHPAR);
				}
				break;
			case ABRCOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				alocexpression2();
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

	public static class ExpressionContext extends ParserRuleContext {
		public NumexpressionContext numexpression() {
			return getRuleContext(NumexpressionContext.class,0);
		}
		public Expresion3Context expresion3() {
			return getRuleContext(Expresion3Context.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			numexpression();
			setState(394);
			expresion3();
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

	public static class Expression2Context extends ParserRuleContext {
		public TerminalNode MENOR() { return getToken(LL1XccParser.MENOR, 0); }
		public TerminalNode MAIOR() { return getToken(LL1XccParser.MAIOR, 0); }
		public TerminalNode MENORIG() { return getToken(LL1XccParser.MENORIG, 0); }
		public TerminalNode MAIORIG() { return getToken(LL1XccParser.MAIORIG, 0); }
		public TerminalNode IGUAL() { return getToken(LL1XccParser.IGUAL, 0); }
		public TerminalNode DIFER() { return getToken(LL1XccParser.DIFER, 0); }
		public Expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitExpression2(this);
		}
	}

	public final Expression2Context expression2() throws RecognitionException {
		Expression2Context _localctx = new Expression2Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_expression2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOR) | (1L << MAIOR) | (1L << MENORIG) | (1L << MAIORIG) | (1L << IGUAL) | (1L << DIFER))) != 0)) ) {
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

	public static class Expresion3Context extends ParserRuleContext {
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public NumexpressionContext numexpression() {
			return getRuleContext(NumexpressionContext.class,0);
		}
		public Expresion3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterExpresion3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitExpresion3(this);
		}
	}

	public final Expresion3Context expresion3() throws RecognitionException {
		Expresion3Context _localctx = new Expresion3Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_expresion3);
		try {
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MENOR:
			case MAIOR:
			case MENORIG:
			case MAIORIG:
			case IGUAL:
			case DIFER:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				expression2();
				setState(399);
				numexpression();
				}
				break;
			case PTVIR:
			case FECHCOL:
			case VIRG:
			case FECHPAR:
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
		enterRule(_localctx, 96, RULE_numexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
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
		enterRule(_localctx, 98, RULE_exps);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			term();
			setState(407);
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
		enterRule(_localctx, 100, RULE_numexpression2);
		try {
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPMAIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				match(OPMAIS);
				setState(410);
				term();
				setState(411);
				numexpression2();
				}
				break;
			case OPMENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				match(OPMENOS);
				setState(414);
				term();
				setState(415);
				numexpression2();
				}
				break;
			case PTVIR:
			case FECHCOL:
			case VIRG:
			case FECHPAR:
			case MENOR:
			case MAIOR:
			case MENORIG:
			case MAIORIG:
			case IGUAL:
			case DIFER:
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
		enterRule(_localctx, 102, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			unaryexpr();
			setState(421);
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
		enterRule(_localctx, 104, RULE_term1);
		try {
			setState(436);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPVEZES:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				match(OPVEZES);
				setState(424);
				unaryexpr();
				setState(425);
				term1();
				}
				break;
			case OPDIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				match(OPDIV);
				setState(428);
				unaryexpr();
				setState(429);
				term1();
				}
				break;
			case OPMOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(431);
				match(OPMOD);
				setState(432);
				unaryexpr();
				setState(433);
				term1();
				}
				break;
			case PTVIR:
			case FECHCOL:
			case VIRG:
			case FECHPAR:
			case MENOR:
			case MAIOR:
			case MENORIG:
			case MAIORIG:
			case IGUAL:
			case DIFER:
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
		enterRule(_localctx, 106, RULE_unaryexpr);
		try {
			setState(443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPMAIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				match(OPMAIS);
				setState(439);
				factor();
				}
				break;
			case OPMENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				match(OPMENOS);
				setState(441);
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
				setState(442);
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
		public NumexpressionContext numexpression() {
			return getRuleContext(NumexpressionContext.class,0);
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
		enterRule(_localctx, 108, RULE_factor);
		try {
			setState(453);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTCONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				match(INTCONSTANT);
				}
				break;
			case STRINGCONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				match(STRINGCONSTANT);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(447);
				match(NULL);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(448);
				lvalue();
				}
				break;
			case ABRPAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(449);
				match(ABRPAR);
				setState(450);
				numexpression();
				setState(451);
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

	public static class ArglistContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Arglist1Context arglist1() {
			return getRuleContext(Arglist1Context.class,0);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterArglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitArglist(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_arglist);
		try {
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRPAR:
			case OPMAIS:
			case OPMENOS:
			case NULL:
			case INTCONSTANT:
			case STRINGCONSTANT:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				expression();
				setState(456);
				arglist1();
				}
				break;
			case FECHPAR:
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

	public static class Arglist1Context extends ParserRuleContext {
		public TerminalNode VIRG() { return getToken(LL1XccParser.VIRG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Arglist1Context arglist1() {
			return getRuleContext(Arglist1Context.class,0);
		}
		public Arglist1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).enterArglist1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LL1XccListener ) ((LL1XccListener)listener).exitArglist1(this);
		}
	}

	public final Arglist1Context arglist1() throws RecognitionException {
		Arglist1Context _localctx = new Arglist1Context(_ctx, getState());
		enterRule(_localctx, 112, RULE_arglist1);
		try {
			setState(466);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VIRG:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				match(VIRG);
				setState(462);
				expression();
				setState(463);
				arglist1();
				}
				break;
			case FECHPAR:
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u01d7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\5\2w\n\2\3"+
		"\3\3\3\3\3\3\4\3\4\5\4~\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u0088"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0097\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u009e\n\b\3\t\3\t\3\t\3\t\5\t\u00a4\n\t\3\n\3"+
		"\n\3\n\3\n\5\n\u00aa\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00ba\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00c2\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\5\23\u00d5\n\23\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u00dc\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u00f8\n\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0102\n"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u010e\n\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u0120\n\31\3\32\3\32\5\32\u0124\n\32\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\5\37\u0135"+
		"\n\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\5\"\u0147\n\""+
		"\3#\3#\3#\3#\3#\3#\3$\3$\5$\u0151\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\5%\u015e\n%\3&\3&\3&\3\'\3\'\5\'\u0165\n\'\3(\3(\3(\3)\3)\3)\3)\3)\5"+
		")\u016f\n)\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\5,\u017f\n,\3-\3"+
		"-\5-\u0183\n-\3.\3.\3.\3.\3.\5.\u018a\n.\3/\3/\3/\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\5\61\u0195\n\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\5\64\u01a5\n\64\3\65\3\65\3\65\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u01b7\n\66\3\67"+
		"\3\67\3\67\3\67\3\67\5\67\u01be\n\67\38\38\38\38\38\38\38\38\58\u01c8"+
		"\n8\39\39\39\39\59\u01ce\n9\3:\3:\3:\3:\3:\5:\u01d5\n:\3:\2\2;\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnpr\2\5\4\2\b\t**\3\2\b\t\3\2\33 \2\u01cf\2v\3\2\2\2\4x\3\2"+
		"\2\2\6}\3\2\2\2\b\177\3\2\2\2\n\u0087\3\2\2\2\f\u0096\3\2\2\2\16\u009d"+
		"\3\2\2\2\20\u00a3\3\2\2\2\22\u00a9\3\2\2\2\24\u00ab\3\2\2\2\26\u00ae\3"+
		"\2\2\2\30\u00b2\3\2\2\2\32\u00b9\3\2\2\2\34\u00c1\3\2\2\2\36\u00c3\3\2"+
		"\2\2 \u00c6\3\2\2\2\"\u00cb\3\2\2\2$\u00d4\3\2\2\2&\u00db\3\2\2\2(\u00f7"+
		"\3\2\2\2*\u00f9\3\2\2\2,\u0101\3\2\2\2.\u010d\3\2\2\2\60\u011f\3\2\2\2"+
		"\62\u0123\3\2\2\2\64\u0125\3\2\2\2\66\u0129\3\2\2\28\u012c\3\2\2\2:\u012f"+
		"\3\2\2\2<\u0134\3\2\2\2>\u0136\3\2\2\2@\u013b\3\2\2\2B\u0146\3\2\2\2D"+
		"\u0148\3\2\2\2F\u0150\3\2\2\2H\u015d\3\2\2\2J\u015f\3\2\2\2L\u0164\3\2"+
		"\2\2N\u0166\3\2\2\2P\u016e\3\2\2\2R\u0170\3\2\2\2T\u0173\3\2\2\2V\u017e"+
		"\3\2\2\2X\u0182\3\2\2\2Z\u0189\3\2\2\2\\\u018b\3\2\2\2^\u018e\3\2\2\2"+
		"`\u0194\3\2\2\2b\u0196\3\2\2\2d\u0198\3\2\2\2f\u01a4\3\2\2\2h\u01a6\3"+
		"\2\2\2j\u01b6\3\2\2\2l\u01bd\3\2\2\2n\u01c7\3\2\2\2p\u01cd\3\2\2\2r\u01d4"+
		"\3\2\2\2tw\5\4\3\2uw\3\2\2\2vt\3\2\2\2vu\3\2\2\2w\3\3\2\2\2xy\5\b\5\2"+
		"yz\5\6\4\2z\5\3\2\2\2{~\5\4\3\2|~\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\7\3\2\2"+
		"\2\177\u0080\7\3\2\2\u0080\u0081\7*\2\2\u0081\u0082\5\n\6\2\u0082\t\3"+
		"\2\2\2\u0083\u0088\5\f\7\2\u0084\u0085\7\4\2\2\u0085\u0086\7*\2\2\u0086"+
		"\u0088\5\f\7\2\u0087\u0083\3\2\2\2\u0087\u0084\3\2\2\2\u0088\13\3\2\2"+
		"\2\u0089\u008a\7\5\2\2\u008a\u008b\5\16\b\2\u008b\u008c\5\20\t\2\u008c"+
		"\u008d\5\22\n\2\u008d\u008e\7\7\2\2\u008e\u0097\3\2\2\2\u008f\u0090\7"+
		"\5\2\2\u0090\u0091\5\4\3\2\u0091\u0092\5\16\b\2\u0092\u0093\5\20\t\2\u0093"+
		"\u0094\5\22\n\2\u0094\u0095\7\7\2\2\u0095\u0097\3\2\2\2\u0096\u0089\3"+
		"\2\2\2\u0096\u008f\3\2\2\2\u0097\r\3\2\2\2\u0098\u0099\5\24\13\2\u0099"+
		"\u009a\7\6\2\2\u009a\u009b\5\16\b\2\u009b\u009e\3\2\2\2\u009c\u009e\3"+
		"\2\2\2\u009d\u0098\3\2\2\2\u009d\u009c\3\2\2\2\u009e\17\3\2\2\2\u009f"+
		"\u00a0\5\36\20\2\u00a0\u00a1\5\20\t\2\u00a1\u00a4\3\2\2\2\u00a2\u00a4"+
		"\3\2\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\21\3\2\2\2\u00a5"+
		"\u00a6\5 \21\2\u00a6\u00a7\5\22\n\2\u00a7\u00aa\3\2\2\2\u00a8\u00aa\3"+
		"\2\2\2\u00a9\u00a5\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\23\3\2\2\2\u00ab"+
		"\u00ac\5\26\f\2\u00ac\u00ad\5\34\17\2\u00ad\25\3\2\2\2\u00ae\u00af\5\30"+
		"\r\2\u00af\u00b0\7*\2\2\u00b0\u00b1\5\32\16\2\u00b1\27\3\2\2\2\u00b2\u00b3"+
		"\t\2\2\2\u00b3\31\3\2\2\2\u00b4\u00b5\7\n\2\2\u00b5\u00b6\7(\2\2\u00b6"+
		"\u00b7\7\13\2\2\u00b7\u00ba\5\32\16\2\u00b8\u00ba\3\2\2\2\u00b9\u00b4"+
		"\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\33\3\2\2\2\u00bb\u00bc\7\f\2\2\u00bc"+
		"\u00bd\7*\2\2\u00bd\u00be\5\32\16\2\u00be\u00bf\5\34\17\2\u00bf\u00c2"+
		"\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2"+
		"\35\3\2\2\2\u00c3\u00c4\7\r\2\2\u00c4\u00c5\5\"\22\2\u00c5\37\3\2\2\2"+
		"\u00c6\u00c7\5\30\r\2\u00c7\u00c8\5\32\16\2\u00c8\u00c9\7*\2\2\u00c9\u00ca"+
		"\5\"\22\2\u00ca!\3\2\2\2\u00cb\u00cc\7\16\2\2\u00cc\u00cd\5$\23\2\u00cd"+
		"\u00ce\7\17\2\2\u00ce\u00cf\5(\25\2\u00cf#\3\2\2\2\u00d0\u00d1\5\26\f"+
		"\2\u00d1\u00d2\5&\24\2\u00d2\u00d5\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d0"+
		"\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5%\3\2\2\2\u00d6\u00d7\7\f\2\2\u00d7"+
		"\u00d8\5\26\f\2\u00d8\u00d9\5&\24\2\u00d9\u00dc\3\2\2\2\u00da\u00dc\3"+
		"\2\2\2\u00db\u00d6\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\'\3\2\2\2\u00dd\u00de"+
		"\5*\26\2\u00de\u00df\7*\2\2\u00df\u00e0\5\32\16\2\u00e0\u00e1\5,\27\2"+
		"\u00e1\u00e2\7\6\2\2\u00e2\u00f8\3\2\2\2\u00e3\u00e4\7*\2\2\u00e4\u00f8"+
		"\5.\30\2\u00e5\u00e6\5\66\34\2\u00e6\u00e7\7\6\2\2\u00e7\u00f8\3\2\2\2"+
		"\u00e8\u00e9\58\35\2\u00e9\u00ea\7\6\2\2\u00ea\u00f8\3\2\2\2\u00eb\u00ec"+
		"\5:\36\2\u00ec\u00ed\7\6\2\2\u00ed\u00f8\3\2\2\2\u00ee\u00f8\5@!\2\u00ef"+
		"\u00f8\5D#\2\u00f0\u00f1\7\5\2\2\u00f1\u00f2\5J&\2\u00f2\u00f3\7\7\2\2"+
		"\u00f3\u00f8\3\2\2\2\u00f4\u00f5\7\20\2\2\u00f5\u00f8\7\6\2\2\u00f6\u00f8"+
		"\7\6\2\2\u00f7\u00dd\3\2\2\2\u00f7\u00e3\3\2\2\2\u00f7\u00e5\3\2\2\2\u00f7"+
		"\u00e8\3\2\2\2\u00f7\u00eb\3\2\2\2\u00f7\u00ee\3\2\2\2\u00f7\u00ef\3\2"+
		"\2\2\u00f7\u00f0\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8"+
		")\3\2\2\2\u00f9\u00fa\t\3\2\2\u00fa+\3\2\2\2\u00fb\u00fc\7\f\2\2\u00fc"+
		"\u00fd\7*\2\2\u00fd\u00fe\5\32\16\2\u00fe\u00ff\5,\27\2\u00ff\u0102\3"+
		"\2\2\2\u0100\u0102\3\2\2\2\u0101\u00fb\3\2\2\2\u0101\u0100\3\2\2\2\u0102"+
		"-\3\2\2\2\u0103\u0104\7*\2\2\u0104\u0105\5\32\16\2\u0105\u0106\5,\27\2"+
		"\u0106\u0107\7\6\2\2\u0107\u010e\3\2\2\2\u0108\u0109\5\60\31\2\u0109\u010a"+
		"\7\21\2\2\u010a\u010b\5\62\32\2\u010b\u010c\7\6\2\2\u010c\u010e\3\2\2"+
		"\2\u010d\u0103\3\2\2\2\u010d\u0108\3\2\2\2\u010e/\3\2\2\2\u010f\u0110"+
		"\7\n\2\2\u0110\u0111\5\\/\2\u0111\u0112\7\13\2\2\u0112\u0113\5\60\31\2"+
		"\u0113\u0120\3\2\2\2\u0114\u0115\7\31\2\2\u0115\u0116\7*\2\2\u0116\u0117"+
		"\7\16\2\2\u0117\u0118\5p9\2\u0118\u0119\7\17\2\2\u0119\u011a\5\60\31\2"+
		"\u011a\u0120\3\2\2\2\u011b\u011c\7\31\2\2\u011c\u011d\7*\2\2\u011d\u0120"+
		"\5\60\31\2\u011e\u0120\3\2\2\2\u011f\u010f\3\2\2\2\u011f\u0114\3\2\2\2"+
		"\u011f\u011b\3\2\2\2\u011f\u011e\3\2\2\2\u0120\61\3\2\2\2\u0121\u0124"+
		"\5\\/\2\u0122\u0124\5R*\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124"+
		"\63\3\2\2\2\u0125\u0126\5N(\2\u0126\u0127\7\21\2\2\u0127\u0128\5\62\32"+
		"\2\u0128\65\3\2\2\2\u0129\u012a\7\22\2\2\u012a\u012b\5\\/\2\u012b\67\3"+
		"\2\2\2\u012c\u012d\7\23\2\2\u012d\u012e\5N(\2\u012e9\3\2\2\2\u012f\u0130"+
		"\7\24\2\2\u0130\u0131\5<\37\2\u0131;\3\2\2\2\u0132\u0135\5\\/\2\u0133"+
		"\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135=\3\2\2\2"+
		"\u0136\u0137\7\25\2\2\u0137\u0138\7\16\2\2\u0138\u0139\5p9\2\u0139\u013a"+
		"\7\17\2\2\u013a?\3\2\2\2\u013b\u013c\7\26\2\2\u013c\u013d\7\16\2\2\u013d"+
		"\u013e\5\\/\2\u013e\u013f\7\17\2\2\u013f\u0140\7\'\2\2\u0140\u0141\5("+
		"\25\2\u0141\u0142\5B\"\2\u0142A\3\2\2\2\u0143\u0144\7\27\2\2\u0144\u0147"+
		"\5(\25\2\u0145\u0147\3\2\2\2\u0146\u0143\3\2\2\2\u0146\u0145\3\2\2\2\u0147"+
		"C\3\2\2\2\u0148\u0149\7\30\2\2\u0149\u014a\7\16\2\2\u014a\u014b\5F$\2"+
		"\u014b\u014c\7\6\2\2\u014c\u014d\5H%\2\u014dE\3\2\2\2\u014e\u0151\5\64"+
		"\33\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u014f\3\2\2\2\u0151"+
		"G\3\2\2\2\u0152\u0153\7\6\2\2\u0153\u0154\5F$\2\u0154\u0155\7\17\2\2\u0155"+
		"\u0156\5(\25\2\u0156\u015e\3\2\2\2\u0157\u0158\5\\/\2\u0158\u0159\7\6"+
		"\2\2\u0159\u015a\5F$\2\u015a\u015b\7\17\2\2\u015b\u015c\5(\25\2\u015c"+
		"\u015e\3\2\2\2\u015d\u0152\3\2\2\2\u015d\u0157\3\2\2\2\u015eI\3\2\2\2"+
		"\u015f\u0160\5(\25\2\u0160\u0161\5L\'\2\u0161K\3\2\2\2\u0162\u0165\5J"+
		"&\2\u0163\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165"+
		"M\3\2\2\2\u0166\u0167\7*\2\2\u0167\u0168\5P)\2\u0168O\3\2\2\2\u0169\u016a"+
		"\7\n\2\2\u016a\u016b\7(\2\2\u016b\u016c\7\13\2\2\u016c\u016f\5P)\2\u016d"+
		"\u016f\3\2\2\2\u016e\u0169\3\2\2\2\u016e\u016d\3\2\2\2\u016fQ\3\2\2\2"+
		"\u0170\u0171\7\32\2\2\u0171\u0172\5V,\2\u0172S\3\2\2\2\u0173\u0174\7\n"+
		"\2\2\u0174\u0175\5\\/\2\u0175\u0176\7\13\2\2\u0176\u0177\5X-\2\u0177U"+
		"\3\2\2\2\u0178\u0179\7*\2\2\u0179\u017f\5Z.\2\u017a\u017b\7\b\2\2\u017b"+
		"\u017f\5T+\2\u017c\u017d\7\t\2\2\u017d\u017f\5T+\2\u017e\u0178\3\2\2\2"+
		"\u017e\u017a\3\2\2\2\u017e\u017c\3\2\2\2\u017fW\3\2\2\2\u0180\u0183\5"+
		"T+\2\u0181\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0181\3\2\2\2\u0183"+
		"Y\3\2\2\2\u0184\u0185\7\16\2\2\u0185\u0186\5p9\2\u0186\u0187\7\17\2\2"+
		"\u0187\u018a\3\2\2\2\u0188\u018a\5T+\2\u0189\u0184\3\2\2\2\u0189\u0188"+
		"\3\2\2\2\u018a[\3\2\2\2\u018b\u018c\5b\62\2\u018c\u018d\5`\61\2\u018d"+
		"]\3\2\2\2\u018e\u018f\t\4\2\2\u018f_\3\2\2\2\u0190\u0191\5^\60\2\u0191"+
		"\u0192\5b\62\2\u0192\u0195\3\2\2\2\u0193\u0195\3\2\2\2\u0194\u0190\3\2"+
		"\2\2\u0194\u0193\3\2\2\2\u0195a\3\2\2\2\u0196\u0197\5d\63\2\u0197c\3\2"+
		"\2\2\u0198\u0199\5h\65\2\u0199\u019a\5f\64\2\u019ae\3\2\2\2\u019b\u019c"+
		"\7!\2\2\u019c\u019d\5h\65\2\u019d\u019e\5f\64\2\u019e\u01a5\3\2\2\2\u019f"+
		"\u01a0\7\"\2\2\u01a0\u01a1\5h\65\2\u01a1\u01a2\5f\64\2\u01a2\u01a5\3\2"+
		"\2\2\u01a3\u01a5\3\2\2\2\u01a4\u019b\3\2\2\2\u01a4\u019f\3\2\2\2\u01a4"+
		"\u01a3\3\2\2\2\u01a5g\3\2\2\2\u01a6\u01a7\5l\67\2\u01a7\u01a8\5j\66\2"+
		"\u01a8i\3\2\2\2\u01a9\u01aa\7#\2\2\u01aa\u01ab\5l\67\2\u01ab\u01ac\5j"+
		"\66\2\u01ac\u01b7\3\2\2\2\u01ad\u01ae\7$\2\2\u01ae\u01af\5l\67\2\u01af"+
		"\u01b0\5j\66\2\u01b0\u01b7\3\2\2\2\u01b1\u01b2\7%\2\2\u01b2\u01b3\5l\67"+
		"\2\u01b3\u01b4\5j\66\2\u01b4\u01b7\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01a9"+
		"\3\2\2\2\u01b6\u01ad\3\2\2\2\u01b6\u01b1\3\2\2\2\u01b6\u01b5\3\2\2\2\u01b7"+
		"k\3\2\2\2\u01b8\u01b9\7!\2\2\u01b9\u01be\5n8\2\u01ba\u01bb\7\"\2\2\u01bb"+
		"\u01be\5n8\2\u01bc\u01be\5n8\2\u01bd\u01b8\3\2\2\2\u01bd\u01ba\3\2\2\2"+
		"\u01bd\u01bc\3\2\2\2\u01bem\3\2\2\2\u01bf\u01c8\7(\2\2\u01c0\u01c8\7)"+
		"\2\2\u01c1\u01c8\7&\2\2\u01c2\u01c8\5N(\2\u01c3\u01c4\7\16\2\2\u01c4\u01c5"+
		"\5b\62\2\u01c5\u01c6\7\17\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01bf\3\2\2\2"+
		"\u01c7\u01c0\3\2\2\2\u01c7\u01c1\3\2\2\2\u01c7\u01c2\3\2\2\2\u01c7\u01c3"+
		"\3\2\2\2\u01c8o\3\2\2\2\u01c9\u01ca\5\\/\2\u01ca\u01cb\5r:\2\u01cb\u01ce"+
		"\3\2\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01c9\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ce"+
		"q\3\2\2\2\u01cf\u01d0\7\f\2\2\u01d0\u01d1\5\\/\2\u01d1\u01d2\5r:\2\u01d2"+
		"\u01d5\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01cf\3\2\2\2\u01d4\u01d3\3\2"+
		"\2\2\u01d5s\3\2\2\2\"v}\u0087\u0096\u009d\u00a3\u00a9\u00b9\u00c1\u00d4"+
		"\u00db\u00f7\u0101\u010d\u011f\u0123\u0134\u0146\u0150\u015d\u0164\u016e"+
		"\u017e\u0182\u0189\u0194\u01a4\u01b6\u01bd\u01c7\u01cd\u01d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}