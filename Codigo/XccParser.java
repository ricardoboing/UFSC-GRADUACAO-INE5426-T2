// Generated from Xcc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XccParser extends Parser {
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
		RULE_program = 0, RULE_classlist = 1, RULE_classlistaux = 2, RULE_classdecl = 3, 
		RULE_classbody = 4, RULE_classbodyaux = 5, RULE_classbodyaux2 = 6, RULE_classbodyaux3 = 7, 
		RULE_vardecl = 8, RULE_intstringident = 9, RULE_cols = 10, RULE_vardeclaux = 11, 
		RULE_constructdecl = 12, RULE_methoddecl = 13, RULE_methodbody = 14, RULE_paramlist = 15, 
		RULE_paramlistaux = 16, RULE_statement = 17, RULE_intstring = 18, RULE_virgidentcols = 19, 
		RULE_statementaux = 20, RULE_statementaux2 = 21, RULE_expralocexpr = 22, 
		RULE_atribstat = 23, RULE_printstat = 24, RULE_readstat = 25, RULE_returnstat = 26, 
		RULE_superstat = 27, RULE_ifstat = 28, RULE_forstat = 29, RULE_forstataux = 30, 
		RULE_statlist = 31, RULE_lvalue = 32, RULE_lvalueaux = 33, RULE_alocexpression = 34, 
		RULE_alocexpression2 = 35, RULE_expression = 36, RULE_expresionaux = 37, 
		RULE_numexpression = 38, RULE_numexpressionaux = 39, RULE_term = 40, RULE_termaux = 41, 
		RULE_unaryexpr = 42, RULE_factor = 43, RULE_arglist = 44, RULE_arglistaux = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classlist", "classlistaux", "classdecl", "classbody", "classbodyaux", 
			"classbodyaux2", "classbodyaux3", "vardecl", "intstringident", "cols", 
			"vardeclaux", "constructdecl", "methoddecl", "methodbody", "paramlist", 
			"paramlistaux", "statement", "intstring", "virgidentcols", "statementaux", 
			"statementaux2", "expralocexpr", "atribstat", "printstat", "readstat", 
			"returnstat", "superstat", "ifstat", "forstat", "forstataux", "statlist", 
			"lvalue", "lvalueaux", "alocexpression", "alocexpression2", "expression", 
			"expresionaux", "numexpression", "numexpressionaux", "term", "termaux", 
			"unaryexpr", "factor", "arglist", "arglistaux"
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
	public String getGrammarFileName() { return "Xcc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XccParser(TokenStream input) {
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
			if ( listener instanceof XccListener ) ((XccListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
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
		public ClasslistauxContext classlistaux() {
			return getRuleContext(ClasslistauxContext.class,0);
		}
		public ClasslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterClasslist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitClasslist(this);
		}
	}

	public final ClasslistContext classlist() throws RecognitionException {
		ClasslistContext _localctx = new ClasslistContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			classdecl();
			setState(97);
			classlistaux();
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

	public static class ClasslistauxContext extends ParserRuleContext {
		public ClasslistContext classlist() {
			return getRuleContext(ClasslistContext.class,0);
		}
		public ClasslistauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classlistaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterClasslistaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitClasslistaux(this);
		}
	}

	public final ClasslistauxContext classlistaux() throws RecognitionException {
		ClasslistauxContext _localctx = new ClasslistauxContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classlistaux);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
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
		public TerminalNode CLASS() { return getToken(XccParser.CLASS, 0); }
		public List<TerminalNode> IDENT() { return getTokens(XccParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(XccParser.IDENT, i);
		}
		public ClassbodyContext classbody() {
			return getRuleContext(ClassbodyContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(XccParser.EXTENDS, 0); }
		public ClassdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterClassdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitClassdecl(this);
		}
	}

	public final ClassdeclContext classdecl() throws RecognitionException {
		ClassdeclContext _localctx = new ClassdeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classdecl);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(CLASS);
				setState(104);
				match(IDENT);
				setState(105);
				classbody();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(CLASS);
				setState(107);
				match(IDENT);
				setState(108);
				match(EXTENDS);
				setState(109);
				match(IDENT);
				setState(110);
				classbody();
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

	public static class ClassbodyContext extends ParserRuleContext {
		public TerminalNode ABRCHAVE() { return getToken(XccParser.ABRCHAVE, 0); }
		public ClassbodyauxContext classbodyaux() {
			return getRuleContext(ClassbodyauxContext.class,0);
		}
		public Classbodyaux2Context classbodyaux2() {
			return getRuleContext(Classbodyaux2Context.class,0);
		}
		public Classbodyaux3Context classbodyaux3() {
			return getRuleContext(Classbodyaux3Context.class,0);
		}
		public TerminalNode FECHCHAVE() { return getToken(XccParser.FECHCHAVE, 0); }
		public ClasslistContext classlist() {
			return getRuleContext(ClasslistContext.class,0);
		}
		public ClassbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterClassbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitClassbody(this);
		}
	}

	public final ClassbodyContext classbody() throws RecognitionException {
		ClassbodyContext _localctx = new ClassbodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classbody);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(ABRCHAVE);
				setState(114);
				classbodyaux();
				setState(115);
				classbodyaux2();
				setState(116);
				classbodyaux3();
				setState(117);
				match(FECHCHAVE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(ABRCHAVE);
				setState(120);
				classlist();
				setState(121);
				classbodyaux();
				setState(122);
				classbodyaux2();
				setState(123);
				classbodyaux3();
				setState(124);
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

	public static class ClassbodyauxContext extends ParserRuleContext {
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public TerminalNode PTVIR() { return getToken(XccParser.PTVIR, 0); }
		public ClassbodyauxContext classbodyaux() {
			return getRuleContext(ClassbodyauxContext.class,0);
		}
		public ClassbodyauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classbodyaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterClassbodyaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitClassbodyaux(this);
		}
	}

	public final ClassbodyauxContext classbodyaux() throws RecognitionException {
		ClassbodyauxContext _localctx = new ClassbodyauxContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classbodyaux);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				vardecl();
				setState(129);
				match(PTVIR);
				setState(130);
				classbodyaux();
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

	public static class Classbodyaux2Context extends ParserRuleContext {
		public ConstructdeclContext constructdecl() {
			return getRuleContext(ConstructdeclContext.class,0);
		}
		public Classbodyaux2Context classbodyaux2() {
			return getRuleContext(Classbodyaux2Context.class,0);
		}
		public Classbodyaux2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classbodyaux2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterClassbodyaux2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitClassbodyaux2(this);
		}
	}

	public final Classbodyaux2Context classbodyaux2() throws RecognitionException {
		Classbodyaux2Context _localctx = new Classbodyaux2Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_classbodyaux2);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				constructdecl();
				setState(136);
				classbodyaux2();
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

	public static class Classbodyaux3Context extends ParserRuleContext {
		public MethoddeclContext methoddecl() {
			return getRuleContext(MethoddeclContext.class,0);
		}
		public Classbodyaux3Context classbodyaux3() {
			return getRuleContext(Classbodyaux3Context.class,0);
		}
		public Classbodyaux3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classbodyaux3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterClassbodyaux3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitClassbodyaux3(this);
		}
	}

	public final Classbodyaux3Context classbodyaux3() throws RecognitionException {
		Classbodyaux3Context _localctx = new Classbodyaux3Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_classbodyaux3);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				methoddecl();
				setState(142);
				classbodyaux3();
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
		public IntstringidentContext intstringident() {
			return getRuleContext(IntstringidentContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(XccParser.IDENT, 0); }
		public ColsContext cols() {
			return getRuleContext(ColsContext.class,0);
		}
		public VardeclauxContext vardeclaux() {
			return getRuleContext(VardeclauxContext.class,0);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitVardecl(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_vardecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			intstringident();
			setState(148);
			match(IDENT);
			setState(149);
			cols();
			setState(150);
			vardeclaux();
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
		public TerminalNode INT() { return getToken(XccParser.INT, 0); }
		public TerminalNode STRING() { return getToken(XccParser.STRING, 0); }
		public TerminalNode IDENT() { return getToken(XccParser.IDENT, 0); }
		public IntstringidentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intstringident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterIntstringident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitIntstringident(this);
		}
	}

	public final IntstringidentContext intstringident() throws RecognitionException {
		IntstringidentContext _localctx = new IntstringidentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_intstringident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
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
		public TerminalNode ABRCOL() { return getToken(XccParser.ABRCOL, 0); }
		public TerminalNode FECHCOL() { return getToken(XccParser.FECHCOL, 0); }
		public ColsContext cols() {
			return getRuleContext(ColsContext.class,0);
		}
		public ColsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterCols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitCols(this);
		}
	}

	public final ColsContext cols() throws RecognitionException {
		ColsContext _localctx = new ColsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cols);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRCOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(ABRCOL);
				setState(155);
				match(FECHCOL);
				setState(156);
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

	public static class VardeclauxContext extends ParserRuleContext {
		public TerminalNode VIRG() { return getToken(XccParser.VIRG, 0); }
		public TerminalNode IDENT() { return getToken(XccParser.IDENT, 0); }
		public ColsContext cols() {
			return getRuleContext(ColsContext.class,0);
		}
		public VardeclauxContext vardeclaux() {
			return getRuleContext(VardeclauxContext.class,0);
		}
		public VardeclauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardeclaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterVardeclaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitVardeclaux(this);
		}
	}

	public final VardeclauxContext vardeclaux() throws RecognitionException {
		VardeclauxContext _localctx = new VardeclauxContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_vardeclaux);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VIRG:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(VIRG);
				setState(161);
				match(IDENT);
				setState(162);
				cols();
				setState(163);
				vardeclaux();
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
		public TerminalNode CONSTRUCTOR() { return getToken(XccParser.CONSTRUCTOR, 0); }
		public MethodbodyContext methodbody() {
			return getRuleContext(MethodbodyContext.class,0);
		}
		public ConstructdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterConstructdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitConstructdecl(this);
		}
	}

	public final ConstructdeclContext constructdecl() throws RecognitionException {
		ConstructdeclContext _localctx = new ConstructdeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constructdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(CONSTRUCTOR);
			setState(169);
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
		public TerminalNode IDENT() { return getToken(XccParser.IDENT, 0); }
		public MethodbodyContext methodbody() {
			return getRuleContext(MethodbodyContext.class,0);
		}
		public MethoddeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methoddecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterMethoddecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitMethoddecl(this);
		}
	}

	public final MethoddeclContext methoddecl() throws RecognitionException {
		MethoddeclContext _localctx = new MethoddeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_methoddecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			intstringident();
			setState(172);
			cols();
			setState(173);
			match(IDENT);
			setState(174);
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
		public TerminalNode ABRPAR() { return getToken(XccParser.ABRPAR, 0); }
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public TerminalNode FECHPAR() { return getToken(XccParser.FECHPAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MethodbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterMethodbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitMethodbody(this);
		}
	}

	public final MethodbodyContext methodbody() throws RecognitionException {
		MethodbodyContext _localctx = new MethodbodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_methodbody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(ABRPAR);
			setState(177);
			paramlist();
			setState(178);
			match(FECHPAR);
			setState(179);
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
		public IntstringidentContext intstringident() {
			return getRuleContext(IntstringidentContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(XccParser.IDENT, 0); }
		public ColsContext cols() {
			return getRuleContext(ColsContext.class,0);
		}
		public ParamlistauxContext paramlistaux() {
			return getRuleContext(ParamlistauxContext.class,0);
		}
		public ParamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterParamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitParamlist(this);
		}
	}

	public final ParamlistContext paramlist() throws RecognitionException {
		ParamlistContext _localctx = new ParamlistContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_paramlist);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				intstringident();
				setState(182);
				match(IDENT);
				setState(183);
				cols();
				setState(184);
				paramlistaux();
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

	public static class ParamlistauxContext extends ParserRuleContext {
		public TerminalNode VIRG() { return getToken(XccParser.VIRG, 0); }
		public IntstringidentContext intstringident() {
			return getRuleContext(IntstringidentContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(XccParser.IDENT, 0); }
		public ColsContext cols() {
			return getRuleContext(ColsContext.class,0);
		}
		public ParamlistauxContext paramlistaux() {
			return getRuleContext(ParamlistauxContext.class,0);
		}
		public ParamlistauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlistaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterParamlistaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitParamlistaux(this);
		}
	}

	public final ParamlistauxContext paramlistaux() throws RecognitionException {
		ParamlistauxContext _localctx = new ParamlistauxContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_paramlistaux);
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VIRG:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(VIRG);
				setState(190);
				intstringident();
				setState(191);
				match(IDENT);
				setState(192);
				cols();
				setState(193);
				paramlistaux();
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
		public TerminalNode IDENT() { return getToken(XccParser.IDENT, 0); }
		public ColsContext cols() {
			return getRuleContext(ColsContext.class,0);
		}
		public VirgidentcolsContext virgidentcols() {
			return getRuleContext(VirgidentcolsContext.class,0);
		}
		public TerminalNode PTVIR() { return getToken(XccParser.PTVIR, 0); }
		public StatementauxContext statementaux() {
			return getRuleContext(StatementauxContext.class,0);
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
		public TerminalNode ABRCHAVE() { return getToken(XccParser.ABRCHAVE, 0); }
		public StatlistContext statlist() {
			return getRuleContext(StatlistContext.class,0);
		}
		public TerminalNode FECHCHAVE() { return getToken(XccParser.FECHCHAVE, 0); }
		public TerminalNode BREAK() { return getToken(XccParser.BREAK, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statement);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				intstring();
				setState(199);
				match(IDENT);
				setState(200);
				cols();
				setState(201);
				virgidentcols();
				setState(202);
				match(PTVIR);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(IDENT);
				setState(205);
				statementaux();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				readstat();
				setState(207);
				match(PTVIR);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				returnstat();
				setState(210);
				match(PTVIR);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(212);
				ifstat();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(213);
				forstat();
				setState(214);
				match(PTVIR);
				}
				break;
			case ABRCHAVE:
				enterOuterAlt(_localctx, 7);
				{
				setState(216);
				match(ABRCHAVE);
				setState(217);
				statlist();
				setState(218);
				match(FECHCHAVE);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 8);
				{
				setState(220);
				match(BREAK);
				setState(221);
				match(PTVIR);
				}
				break;
			case PTVIR:
				enterOuterAlt(_localctx, 9);
				{
				setState(222);
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
		public TerminalNode INT() { return getToken(XccParser.INT, 0); }
		public TerminalNode STRING() { return getToken(XccParser.STRING, 0); }
		public IntstringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intstring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterIntstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitIntstring(this);
		}
	}

	public final IntstringContext intstring() throws RecognitionException {
		IntstringContext _localctx = new IntstringContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_intstring);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
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
		public TerminalNode VIRG() { return getToken(XccParser.VIRG, 0); }
		public TerminalNode IDENT() { return getToken(XccParser.IDENT, 0); }
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
			if ( listener instanceof XccListener ) ((XccListener)listener).enterVirgidentcols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitVirgidentcols(this);
		}
	}

	public final VirgidentcolsContext virgidentcols() throws RecognitionException {
		VirgidentcolsContext _localctx = new VirgidentcolsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_virgidentcols);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VIRG:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(VIRG);
				setState(228);
				match(IDENT);
				setState(229);
				cols();
				setState(230);
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

	public static class StatementauxContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(XccParser.IDENT, 0); }
		public ColsContext cols() {
			return getRuleContext(ColsContext.class,0);
		}
		public VirgidentcolsContext virgidentcols() {
			return getRuleContext(VirgidentcolsContext.class,0);
		}
		public TerminalNode PTVIR() { return getToken(XccParser.PTVIR, 0); }
		public Statementaux2Context statementaux2() {
			return getRuleContext(Statementaux2Context.class,0);
		}
		public TerminalNode ATR() { return getToken(XccParser.ATR, 0); }
		public ExpralocexprContext expralocexpr() {
			return getRuleContext(ExpralocexprContext.class,0);
		}
		public StatementauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterStatementaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitStatementaux(this);
		}
	}

	public final StatementauxContext statementaux() throws RecognitionException {
		StatementauxContext _localctx = new StatementauxContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statementaux);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(IDENT);
				setState(236);
				cols();
				setState(237);
				virgidentcols();
				setState(238);
				match(PTVIR);
				}
				break;
			case ABRCOL:
			case ATR:
			case PONTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				statementaux2();
				setState(241);
				match(ATR);
				setState(242);
				expralocexpr();
				setState(243);
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

	public static class Statementaux2Context extends ParserRuleContext {
		public TerminalNode ABRCOL() { return getToken(XccParser.ABRCOL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FECHCOL() { return getToken(XccParser.FECHCOL, 0); }
		public Statementaux2Context statementaux2() {
			return getRuleContext(Statementaux2Context.class,0);
		}
		public TerminalNode PONTO() { return getToken(XccParser.PONTO, 0); }
		public TerminalNode IDENT() { return getToken(XccParser.IDENT, 0); }
		public TerminalNode ABRPAR() { return getToken(XccParser.ABRPAR, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public TerminalNode FECHPAR() { return getToken(XccParser.FECHPAR, 0); }
		public Statementaux2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementaux2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterStatementaux2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitStatementaux2(this);
		}
	}

	public final Statementaux2Context statementaux2() throws RecognitionException {
		Statementaux2Context _localctx = new Statementaux2Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_statementaux2);
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(ABRCOL);
				setState(248);
				expression();
				setState(249);
				match(FECHCOL);
				setState(250);
				statementaux2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(PONTO);
				setState(253);
				match(IDENT);
				setState(254);
				match(ABRPAR);
				setState(255);
				arglist();
				setState(256);
				match(FECHPAR);
				setState(257);
				statementaux2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				match(PONTO);
				setState(260);
				match(IDENT);
				setState(261);
				statementaux2();
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
			if ( listener instanceof XccListener ) ((XccListener)listener).enterExpralocexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitExpralocexpr(this);
		}
	}

	public final ExpralocexprContext expralocexpr() throws RecognitionException {
		ExpralocexprContext _localctx = new ExpralocexprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expralocexpr);
		try {
			setState(267);
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
				setState(265);
				expression();
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
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
		public TerminalNode ATR() { return getToken(XccParser.ATR, 0); }
		public ExpralocexprContext expralocexpr() {
			return getRuleContext(ExpralocexprContext.class,0);
		}
		public AtribstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterAtribstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitAtribstat(this);
		}
	}

	public final AtribstatContext atribstat() throws RecognitionException {
		AtribstatContext _localctx = new AtribstatContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_atribstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			lvalue();
			setState(270);
			match(ATR);
			setState(271);
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
		public TerminalNode PRINT() { return getToken(XccParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterPrintstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitPrintstat(this);
		}
	}

	public final PrintstatContext printstat() throws RecognitionException {
		PrintstatContext _localctx = new PrintstatContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_printstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(PRINT);
			setState(274);
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
		public TerminalNode READ() { return getToken(XccParser.READ, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ReadstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterReadstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitReadstat(this);
		}
	}

	public final ReadstatContext readstat() throws RecognitionException {
		ReadstatContext _localctx = new ReadstatContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_readstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(READ);
			setState(277);
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
		public TerminalNode RETURN() { return getToken(XccParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterReturnstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitReturnstat(this);
		}
	}

	public final ReturnstatContext returnstat() throws RecognitionException {
		ReturnstatContext _localctx = new ReturnstatContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_returnstat);
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(RETURN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				match(RETURN);
				setState(281);
				expression();
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

	public static class SuperstatContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(XccParser.SUPER, 0); }
		public TerminalNode ABRPAR() { return getToken(XccParser.ABRPAR, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public TerminalNode FECHPAR() { return getToken(XccParser.FECHPAR, 0); }
		public SuperstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterSuperstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitSuperstat(this);
		}
	}

	public final SuperstatContext superstat() throws RecognitionException {
		SuperstatContext _localctx = new SuperstatContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_superstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(SUPER);
			setState(285);
			match(ABRPAR);
			setState(286);
			arglist();
			setState(287);
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
		public TerminalNode IF() { return getToken(XccParser.IF, 0); }
		public TerminalNode ABRPAR() { return getToken(XccParser.ABRPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FECHPAR() { return getToken(XccParser.FECHPAR, 0); }
		public TerminalNode THEN() { return getToken(XccParser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(XccParser.ELSE, 0); }
		public IfstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterIfstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitIfstat(this);
		}
	}

	public final IfstatContext ifstat() throws RecognitionException {
		IfstatContext _localctx = new IfstatContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ifstat);
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(IF);
				setState(290);
				match(ABRPAR);
				setState(291);
				expression();
				setState(292);
				match(FECHPAR);
				setState(293);
				match(THEN);
				setState(294);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(IF);
				setState(297);
				match(ABRPAR);
				setState(298);
				expression();
				setState(299);
				match(FECHPAR);
				setState(300);
				match(THEN);
				setState(301);
				statement();
				setState(302);
				match(ELSE);
				setState(303);
				statement();
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
		public TerminalNode FOR() { return getToken(XccParser.FOR, 0); }
		public TerminalNode ABRPAR() { return getToken(XccParser.ABRPAR, 0); }
		public List<ForstatauxContext> forstataux() {
			return getRuleContexts(ForstatauxContext.class);
		}
		public ForstatauxContext forstataux(int i) {
			return getRuleContext(ForstatauxContext.class,i);
		}
		public List<TerminalNode> PTVIR() { return getTokens(XccParser.PTVIR); }
		public TerminalNode PTVIR(int i) {
			return getToken(XccParser.PTVIR, i);
		}
		public TerminalNode FECHPAR() { return getToken(XccParser.FECHPAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterForstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitForstat(this);
		}
	}

	public final ForstatContext forstat() throws RecognitionException {
		ForstatContext _localctx = new ForstatContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_forstat);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(FOR);
				setState(308);
				match(ABRPAR);
				setState(309);
				forstataux();
				setState(310);
				match(PTVIR);
				setState(311);
				match(PTVIR);
				setState(312);
				forstataux();
				setState(313);
				match(FECHPAR);
				setState(314);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				match(FOR);
				setState(317);
				match(ABRPAR);
				setState(318);
				forstataux();
				setState(319);
				match(PTVIR);
				setState(320);
				expression();
				setState(321);
				match(PTVIR);
				setState(322);
				forstataux();
				setState(323);
				match(FECHPAR);
				setState(324);
				statement();
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

	public static class ForstatauxContext extends ParserRuleContext {
		public AtribstatContext atribstat() {
			return getRuleContext(AtribstatContext.class,0);
		}
		public ForstatauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstataux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterForstataux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitForstataux(this);
		}
	}

	public final ForstatauxContext forstataux() throws RecognitionException {
		ForstatauxContext _localctx = new ForstatauxContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_forstataux);
		try {
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
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

	public static class StatlistContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatlistContext statlist() {
			return getRuleContext(StatlistContext.class,0);
		}
		public StatlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterStatlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitStatlist(this);
		}
	}

	public final StatlistContext statlist() throws RecognitionException {
		StatlistContext _localctx = new StatlistContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_statlist);
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				statement();
				setState(334);
				statlist();
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

	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(XccParser.IDENT, 0); }
		public LvalueauxContext lvalueaux() {
			return getRuleContext(LvalueauxContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitLvalue(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(IDENT);
			setState(339);
			lvalueaux();
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

	public static class LvalueauxContext extends ParserRuleContext {
		public TerminalNode ABRCOL() { return getToken(XccParser.ABRCOL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FECHCOL() { return getToken(XccParser.FECHCOL, 0); }
		public TerminalNode PONTO() { return getToken(XccParser.PONTO, 0); }
		public TerminalNode IDENT() { return getToken(XccParser.IDENT, 0); }
		public TerminalNode ABRPAR() { return getToken(XccParser.ABRPAR, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public TerminalNode FECHPAR() { return getToken(XccParser.FECHPAR, 0); }
		public LvalueauxContext lvalueaux() {
			return getRuleContext(LvalueauxContext.class,0);
		}
		public LvalueauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalueaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterLvalueaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitLvalueaux(this);
		}
	}

	public final LvalueauxContext lvalueaux() throws RecognitionException {
		LvalueauxContext _localctx = new LvalueauxContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_lvalueaux);
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(ABRCOL);
				setState(342);
				expression();
				setState(343);
				match(FECHCOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				match(PONTO);
				setState(346);
				match(IDENT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				match(PONTO);
				setState(348);
				match(IDENT);
				setState(349);
				match(ABRPAR);
				setState(350);
				arglist();
				setState(351);
				match(FECHPAR);
				setState(352);
				lvalueaux();
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

	public static class AlocexpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(XccParser.NEW, 0); }
		public TerminalNode IDENT() { return getToken(XccParser.IDENT, 0); }
		public TerminalNode ABRPAR() { return getToken(XccParser.ABRPAR, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public TerminalNode FECHPAR() { return getToken(XccParser.FECHPAR, 0); }
		public IntstringidentContext intstringident() {
			return getRuleContext(IntstringidentContext.class,0);
		}
		public Alocexpression2Context alocexpression2() {
			return getRuleContext(Alocexpression2Context.class,0);
		}
		public AlocexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alocexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterAlocexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitAlocexpression(this);
		}
	}

	public final AlocexpressionContext alocexpression() throws RecognitionException {
		AlocexpressionContext _localctx = new AlocexpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_alocexpression);
		try {
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				match(NEW);
				setState(358);
				match(IDENT);
				setState(359);
				match(ABRPAR);
				setState(360);
				arglist();
				setState(361);
				match(FECHPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				match(NEW);
				setState(364);
				intstringident();
				setState(365);
				alocexpression2();
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

	public static class Alocexpression2Context extends ParserRuleContext {
		public TerminalNode ABRCOL() { return getToken(XccParser.ABRCOL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FECHCOL() { return getToken(XccParser.FECHCOL, 0); }
		public Alocexpression2Context alocexpression2() {
			return getRuleContext(Alocexpression2Context.class,0);
		}
		public Alocexpression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alocexpression2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterAlocexpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitAlocexpression2(this);
		}
	}

	public final Alocexpression2Context alocexpression2() throws RecognitionException {
		Alocexpression2Context _localctx = new Alocexpression2Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_alocexpression2);
		try {
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(ABRCOL);
				setState(370);
				expression();
				setState(371);
				match(FECHCOL);
				setState(372);
				alocexpression2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				match(ABRCOL);
				setState(375);
				expression();
				setState(376);
				match(FECHCOL);
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
		public List<NumexpressionContext> numexpression() {
			return getRuleContexts(NumexpressionContext.class);
		}
		public NumexpressionContext numexpression(int i) {
			return getRuleContext(NumexpressionContext.class,i);
		}
		public ExpresionauxContext expresionaux() {
			return getRuleContext(ExpresionauxContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expression);
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				numexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				numexpression();
				setState(382);
				expresionaux();
				setState(383);
				numexpression();
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

	public static class ExpresionauxContext extends ParserRuleContext {
		public TerminalNode MENOR() { return getToken(XccParser.MENOR, 0); }
		public TerminalNode MAIOR() { return getToken(XccParser.MAIOR, 0); }
		public TerminalNode MENORIG() { return getToken(XccParser.MENORIG, 0); }
		public TerminalNode MAIORIG() { return getToken(XccParser.MAIORIG, 0); }
		public TerminalNode IGUAL() { return getToken(XccParser.IGUAL, 0); }
		public TerminalNode DIFER() { return getToken(XccParser.DIFER, 0); }
		public ExpresionauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterExpresionaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitExpresionaux(this);
		}
	}

	public final ExpresionauxContext expresionaux() throws RecognitionException {
		ExpresionauxContext _localctx = new ExpresionauxContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expresionaux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
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

	public static class NumexpressionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public NumexpressionauxContext numexpressionaux() {
			return getRuleContext(NumexpressionauxContext.class,0);
		}
		public NumexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterNumexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitNumexpression(this);
		}
	}

	public final NumexpressionContext numexpression() throws RecognitionException {
		NumexpressionContext _localctx = new NumexpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_numexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			term();
			setState(390);
			numexpressionaux();
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

	public static class NumexpressionauxContext extends ParserRuleContext {
		public TerminalNode OPMAIS() { return getToken(XccParser.OPMAIS, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public NumexpressionauxContext numexpressionaux() {
			return getRuleContext(NumexpressionauxContext.class,0);
		}
		public TerminalNode OPMENOS() { return getToken(XccParser.OPMENOS, 0); }
		public NumexpressionauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numexpressionaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterNumexpressionaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitNumexpressionaux(this);
		}
	}

	public final NumexpressionauxContext numexpressionaux() throws RecognitionException {
		NumexpressionauxContext _localctx = new NumexpressionauxContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_numexpressionaux);
		try {
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPMAIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				match(OPMAIS);
				setState(393);
				term();
				setState(394);
				numexpressionaux();
				}
				break;
			case OPMENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				match(OPMENOS);
				setState(397);
				term();
				setState(398);
				numexpressionaux();
				}
				break;
			case EOF:
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
		public TermauxContext termaux() {
			return getRuleContext(TermauxContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			unaryexpr();
			setState(404);
			termaux();
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

	public static class TermauxContext extends ParserRuleContext {
		public TerminalNode OPVEZES() { return getToken(XccParser.OPVEZES, 0); }
		public UnaryexprContext unaryexpr() {
			return getRuleContext(UnaryexprContext.class,0);
		}
		public TermauxContext termaux() {
			return getRuleContext(TermauxContext.class,0);
		}
		public TerminalNode OPDIV() { return getToken(XccParser.OPDIV, 0); }
		public TerminalNode OPMOD() { return getToken(XccParser.OPMOD, 0); }
		public TermauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterTermaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitTermaux(this);
		}
	}

	public final TermauxContext termaux() throws RecognitionException {
		TermauxContext _localctx = new TermauxContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_termaux);
		try {
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPVEZES:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				match(OPVEZES);
				setState(407);
				unaryexpr();
				setState(408);
				termaux();
				}
				break;
			case OPDIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				match(OPDIV);
				setState(411);
				unaryexpr();
				setState(412);
				termaux();
				}
				break;
			case OPMOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(414);
				match(OPMOD);
				setState(415);
				unaryexpr();
				setState(416);
				termaux();
				}
				break;
			case EOF:
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
		public TerminalNode OPMAIS() { return getToken(XccParser.OPMAIS, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode OPMENOS() { return getToken(XccParser.OPMENOS, 0); }
		public UnaryexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterUnaryexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitUnaryexpr(this);
		}
	}

	public final UnaryexprContext unaryexpr() throws RecognitionException {
		UnaryexprContext _localctx = new UnaryexprContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_unaryexpr);
		try {
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPMAIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				match(OPMAIS);
				setState(422);
				factor();
				}
				break;
			case OPMENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				match(OPMENOS);
				setState(424);
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
				setState(425);
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
		public TerminalNode INTCONSTANT() { return getToken(XccParser.INTCONSTANT, 0); }
		public TerminalNode STRINGCONSTANT() { return getToken(XccParser.STRINGCONSTANT, 0); }
		public TerminalNode NULL() { return getToken(XccParser.NULL, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ABRPAR() { return getToken(XccParser.ABRPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FECHPAR() { return getToken(XccParser.FECHPAR, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_factor);
		try {
			setState(436);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTCONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				match(INTCONSTANT);
				}
				break;
			case STRINGCONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				match(STRINGCONSTANT);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(430);
				match(NULL);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(431);
				lvalue();
				}
				break;
			case ABRPAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(432);
				match(ABRPAR);
				setState(433);
				expression();
				setState(434);
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
		public ArglistauxContext arglistaux() {
			return getRuleContext(ArglistauxContext.class,0);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterArglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitArglist(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_arglist);
		try {
			setState(442);
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
				setState(438);
				expression();
				setState(439);
				arglistaux();
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

	public static class ArglistauxContext extends ParserRuleContext {
		public TerminalNode VIRG() { return getToken(XccParser.VIRG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArglistauxContext arglistaux() {
			return getRuleContext(ArglistauxContext.class,0);
		}
		public ArglistauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglistaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).enterArglistaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XccListener ) ((XccListener)listener).exitArglistaux(this);
		}
	}

	public final ArglistauxContext arglistaux() throws RecognitionException {
		ArglistauxContext _localctx = new ArglistauxContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_arglistaux);
		try {
			setState(449);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VIRG:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				match(VIRG);
				setState(445);
				expression();
				setState(446);
				arglistaux();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u01c6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\5\2a\n\2\3\3\3\3\3\3\3\4\3\4\5\4h\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5r\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6\u0081\n\6\3\7\3\7\3\7\3\7\3\7\5\7\u0088\n\7"+
		"\3\b\3\b\3\b\3\b\5\b\u008e\n\b\3\t\3\t\3\t\3\t\5\t\u0094\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00a1\n\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u00a9\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00be\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00c7\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u00e2\n\23\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u00ec\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u00f8\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u010a\n\27\3\30\3\30\5\30\u010e\n"+
		"\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\5"+
		"\34\u011d\n\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0134\n\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u0149\n\37\3 \3 \5 \u014d\n \3!\3!\3!\3!\5!"+
		"\u0153\n!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0166"+
		"\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0172\n$\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\5%\u017d\n%\3&\3&\3&\3&\3&\5&\u0184\n&\3\'\3\'\3(\3(\3(\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\5)\u0194\n)\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\5+\u01a6\n+\3,\3,\3,\3,\3,\5,\u01ad\n,\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\5-\u01b7\n-\3.\3.\3.\3.\5.\u01bd\n.\3/\3/\3/\3/\3/\5/\u01c4\n/\3/\2"+
		"\2\60\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>"+
		"@BDFHJLNPRTVXZ\\\2\5\4\2\b\t**\3\2\b\t\3\2\33 \2\u01c8\2`\3\2\2\2\4b\3"+
		"\2\2\2\6g\3\2\2\2\bq\3\2\2\2\n\u0080\3\2\2\2\f\u0087\3\2\2\2\16\u008d"+
		"\3\2\2\2\20\u0093\3\2\2\2\22\u0095\3\2\2\2\24\u009a\3\2\2\2\26\u00a0\3"+
		"\2\2\2\30\u00a8\3\2\2\2\32\u00aa\3\2\2\2\34\u00ad\3\2\2\2\36\u00b2\3\2"+
		"\2\2 \u00bd\3\2\2\2\"\u00c6\3\2\2\2$\u00e1\3\2\2\2&\u00e3\3\2\2\2(\u00eb"+
		"\3\2\2\2*\u00f7\3\2\2\2,\u0109\3\2\2\2.\u010d\3\2\2\2\60\u010f\3\2\2\2"+
		"\62\u0113\3\2\2\2\64\u0116\3\2\2\2\66\u011c\3\2\2\28\u011e\3\2\2\2:\u0133"+
		"\3\2\2\2<\u0148\3\2\2\2>\u014c\3\2\2\2@\u0152\3\2\2\2B\u0154\3\2\2\2D"+
		"\u0165\3\2\2\2F\u0171\3\2\2\2H\u017c\3\2\2\2J\u0183\3\2\2\2L\u0185\3\2"+
		"\2\2N\u0187\3\2\2\2P\u0193\3\2\2\2R\u0195\3\2\2\2T\u01a5\3\2\2\2V\u01ac"+
		"\3\2\2\2X\u01b6\3\2\2\2Z\u01bc\3\2\2\2\\\u01c3\3\2\2\2^a\5\4\3\2_a\3\2"+
		"\2\2`^\3\2\2\2`_\3\2\2\2a\3\3\2\2\2bc\5\b\5\2cd\5\6\4\2d\5\3\2\2\2eh\5"+
		"\4\3\2fh\3\2\2\2ge\3\2\2\2gf\3\2\2\2h\7\3\2\2\2ij\7\3\2\2jk\7*\2\2kr\5"+
		"\n\6\2lm\7\3\2\2mn\7*\2\2no\7\4\2\2op\7*\2\2pr\5\n\6\2qi\3\2\2\2ql\3\2"+
		"\2\2r\t\3\2\2\2st\7\5\2\2tu\5\f\7\2uv\5\16\b\2vw\5\20\t\2wx\7\7\2\2x\u0081"+
		"\3\2\2\2yz\7\5\2\2z{\5\4\3\2{|\5\f\7\2|}\5\16\b\2}~\5\20\t\2~\177\7\7"+
		"\2\2\177\u0081\3\2\2\2\u0080s\3\2\2\2\u0080y\3\2\2\2\u0081\13\3\2\2\2"+
		"\u0082\u0083\5\22\n\2\u0083\u0084\7\6\2\2\u0084\u0085\5\f\7\2\u0085\u0088"+
		"\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0082\3\2\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\r\3\2\2\2\u0089\u008a\5\32\16\2\u008a\u008b\5\16\b\2\u008b\u008e\3\2"+
		"\2\2\u008c\u008e\3\2\2\2\u008d\u0089\3\2\2\2\u008d\u008c\3\2\2\2\u008e"+
		"\17\3\2\2\2\u008f\u0090\5\34\17\2\u0090\u0091\5\20\t\2\u0091\u0094\3\2"+
		"\2\2\u0092\u0094\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0092\3\2\2\2\u0094"+
		"\21\3\2\2\2\u0095\u0096\5\24\13\2\u0096\u0097\7*\2\2\u0097\u0098\5\26"+
		"\f\2\u0098\u0099\5\30\r\2\u0099\23\3\2\2\2\u009a\u009b\t\2\2\2\u009b\25"+
		"\3\2\2\2\u009c\u009d\7\n\2\2\u009d\u009e\7\13\2\2\u009e\u00a1\5\26\f\2"+
		"\u009f\u00a1\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\27"+
		"\3\2\2\2\u00a2\u00a3\7\f\2\2\u00a3\u00a4\7*\2\2\u00a4\u00a5\5\26\f\2\u00a5"+
		"\u00a6\5\30\r\2\u00a6\u00a9\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a2\3"+
		"\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\31\3\2\2\2\u00aa\u00ab\7\r\2\2\u00ab"+
		"\u00ac\5\36\20\2\u00ac\33\3\2\2\2\u00ad\u00ae\5\24\13\2\u00ae\u00af\5"+
		"\26\f\2\u00af\u00b0\7*\2\2\u00b0\u00b1\5\36\20\2\u00b1\35\3\2\2\2\u00b2"+
		"\u00b3\7\16\2\2\u00b3\u00b4\5 \21\2\u00b4\u00b5\7\17\2\2\u00b5\u00b6\5"+
		"$\23\2\u00b6\37\3\2\2\2\u00b7\u00b8\5\24\13\2\u00b8\u00b9\7*\2\2\u00b9"+
		"\u00ba\5\26\f\2\u00ba\u00bb\5\"\22\2\u00bb\u00be\3\2\2\2\u00bc\u00be\3"+
		"\2\2\2\u00bd\u00b7\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be!\3\2\2\2\u00bf\u00c0"+
		"\7\f\2\2\u00c0\u00c1\5\24\13\2\u00c1\u00c2\7*\2\2\u00c2\u00c3\5\26\f\2"+
		"\u00c3\u00c4\5\"\22\2\u00c4\u00c7\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00bf"+
		"\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7#\3\2\2\2\u00c8\u00c9\5&\24\2\u00c9"+
		"\u00ca\7*\2\2\u00ca\u00cb\5\26\f\2\u00cb\u00cc\5(\25\2\u00cc\u00cd\7\6"+
		"\2\2\u00cd\u00e2\3\2\2\2\u00ce\u00cf\7*\2\2\u00cf\u00e2\5*\26\2\u00d0"+
		"\u00d1\5\64\33\2\u00d1\u00d2\7\6\2\2\u00d2\u00e2\3\2\2\2\u00d3\u00d4\5"+
		"\66\34\2\u00d4\u00d5\7\6\2\2\u00d5\u00e2\3\2\2\2\u00d6\u00e2\5:\36\2\u00d7"+
		"\u00d8\5<\37\2\u00d8\u00d9\7\6\2\2\u00d9\u00e2\3\2\2\2\u00da\u00db\7\5"+
		"\2\2\u00db\u00dc\5@!\2\u00dc\u00dd\7\7\2\2\u00dd\u00e2\3\2\2\2\u00de\u00df"+
		"\7\20\2\2\u00df\u00e2\7\6\2\2\u00e0\u00e2\7\6\2\2\u00e1\u00c8\3\2\2\2"+
		"\u00e1\u00ce\3\2\2\2\u00e1\u00d0\3\2\2\2\u00e1\u00d3\3\2\2\2\u00e1\u00d6"+
		"\3\2\2\2\u00e1\u00d7\3\2\2\2\u00e1\u00da\3\2\2\2\u00e1\u00de\3\2\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e2%\3\2\2\2\u00e3\u00e4\t\3\2\2\u00e4\'\3\2\2\2\u00e5"+
		"\u00e6\7\f\2\2\u00e6\u00e7\7*\2\2\u00e7\u00e8\5\26\f\2\u00e8\u00e9\5("+
		"\25\2\u00e9\u00ec\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e5\3\2\2\2\u00eb"+
		"\u00ea\3\2\2\2\u00ec)\3\2\2\2\u00ed\u00ee\7*\2\2\u00ee\u00ef\5\26\f\2"+
		"\u00ef\u00f0\5(\25\2\u00f0\u00f1\7\6\2\2\u00f1\u00f8\3\2\2\2\u00f2\u00f3"+
		"\5,\27\2\u00f3\u00f4\7\21\2\2\u00f4\u00f5\5.\30\2\u00f5\u00f6\7\6\2\2"+
		"\u00f6\u00f8\3\2\2\2\u00f7\u00ed\3\2\2\2\u00f7\u00f2\3\2\2\2\u00f8+\3"+
		"\2\2\2\u00f9\u00fa\7\n\2\2\u00fa\u00fb\5J&\2\u00fb\u00fc\7\13\2\2\u00fc"+
		"\u00fd\5,\27\2\u00fd\u010a\3\2\2\2\u00fe\u00ff\7\31\2\2\u00ff\u0100\7"+
		"*\2\2\u0100\u0101\7\16\2\2\u0101\u0102\5Z.\2\u0102\u0103\7\17\2\2\u0103"+
		"\u0104\5,\27\2\u0104\u010a\3\2\2\2\u0105\u0106\7\31\2\2\u0106\u0107\7"+
		"*\2\2\u0107\u010a\5,\27\2\u0108\u010a\3\2\2\2\u0109\u00f9\3\2\2\2\u0109"+
		"\u00fe\3\2\2\2\u0109\u0105\3\2\2\2\u0109\u0108\3\2\2\2\u010a-\3\2\2\2"+
		"\u010b\u010e\5J&\2\u010c\u010e\5F$\2\u010d\u010b\3\2\2\2\u010d\u010c\3"+
		"\2\2\2\u010e/\3\2\2\2\u010f\u0110\5B\"\2\u0110\u0111\7\21\2\2\u0111\u0112"+
		"\5.\30\2\u0112\61\3\2\2\2\u0113\u0114\7\22\2\2\u0114\u0115\5J&\2\u0115"+
		"\63\3\2\2\2\u0116\u0117\7\23\2\2\u0117\u0118\5B\"\2\u0118\65\3\2\2\2\u0119"+
		"\u011d\7\24\2\2\u011a\u011b\7\24\2\2\u011b\u011d\5J&\2\u011c\u0119\3\2"+
		"\2\2\u011c\u011a\3\2\2\2\u011d\67\3\2\2\2\u011e\u011f\7\25\2\2\u011f\u0120"+
		"\7\16\2\2\u0120\u0121\5Z.\2\u0121\u0122\7\17\2\2\u01229\3\2\2\2\u0123"+
		"\u0124\7\26\2\2\u0124\u0125\7\16\2\2\u0125\u0126\5J&\2\u0126\u0127\7\17"+
		"\2\2\u0127\u0128\7\'\2\2\u0128\u0129\5$\23\2\u0129\u0134\3\2\2\2\u012a"+
		"\u012b\7\26\2\2\u012b\u012c\7\16\2\2\u012c\u012d\5J&\2\u012d\u012e\7\17"+
		"\2\2\u012e\u012f\7\'\2\2\u012f\u0130\5$\23\2\u0130\u0131\7\27\2\2\u0131"+
		"\u0132\5$\23\2\u0132\u0134\3\2\2\2\u0133\u0123\3\2\2\2\u0133\u012a\3\2"+
		"\2\2\u0134;\3\2\2\2\u0135\u0136\7\30\2\2\u0136\u0137\7\16\2\2\u0137\u0138"+
		"\5> \2\u0138\u0139\7\6\2\2\u0139\u013a\7\6\2\2\u013a\u013b\5> \2\u013b"+
		"\u013c\7\17\2\2\u013c\u013d\5$\23\2\u013d\u0149\3\2\2\2\u013e\u013f\7"+
		"\30\2\2\u013f\u0140\7\16\2\2\u0140\u0141\5> \2\u0141\u0142\7\6\2\2\u0142"+
		"\u0143\5J&\2\u0143\u0144\7\6\2\2\u0144\u0145\5> \2\u0145\u0146\7\17\2"+
		"\2\u0146\u0147\5$\23\2\u0147\u0149\3\2\2\2\u0148\u0135\3\2\2\2\u0148\u013e"+
		"\3\2\2\2\u0149=\3\2\2\2\u014a\u014d\5\60\31\2\u014b\u014d\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d?\3\2\2\2\u014e\u0153\5$\23\2"+
		"\u014f\u0150\5$\23\2\u0150\u0151\5@!\2\u0151\u0153\3\2\2\2\u0152\u014e"+
		"\3\2\2\2\u0152\u014f\3\2\2\2\u0153A\3\2\2\2\u0154\u0155\7*\2\2\u0155\u0156"+
		"\5D#\2\u0156C\3\2\2\2\u0157\u0158\7\n\2\2\u0158\u0159\5J&\2\u0159\u015a"+
		"\7\13\2\2\u015a\u0166\3\2\2\2\u015b\u015c\7\31\2\2\u015c\u0166\7*\2\2"+
		"\u015d\u015e\7\31\2\2\u015e\u015f\7*\2\2\u015f\u0160\7\16\2\2\u0160\u0161"+
		"\5Z.\2\u0161\u0162\7\17\2\2\u0162\u0163\5D#\2\u0163\u0166\3\2\2\2\u0164"+
		"\u0166\3\2\2\2\u0165\u0157\3\2\2\2\u0165\u015b\3\2\2\2\u0165\u015d\3\2"+
		"\2\2\u0165\u0164\3\2\2\2\u0166E\3\2\2\2\u0167\u0168\7\32\2\2\u0168\u0169"+
		"\7*\2\2\u0169\u016a\7\16\2\2\u016a\u016b\5Z.\2\u016b\u016c\7\17\2\2\u016c"+
		"\u0172\3\2\2\2\u016d\u016e\7\32\2\2\u016e\u016f\5\24\13\2\u016f\u0170"+
		"\5H%\2\u0170\u0172\3\2\2\2\u0171\u0167\3\2\2\2\u0171\u016d\3\2\2\2\u0172"+
		"G\3\2\2\2\u0173\u0174\7\n\2\2\u0174\u0175\5J&\2\u0175\u0176\7\13\2\2\u0176"+
		"\u0177\5H%\2\u0177\u017d\3\2\2\2\u0178\u0179\7\n\2\2\u0179\u017a\5J&\2"+
		"\u017a\u017b\7\13\2\2\u017b\u017d\3\2\2\2\u017c\u0173\3\2\2\2\u017c\u0178"+
		"\3\2\2\2\u017dI\3\2\2\2\u017e\u0184\5N(\2\u017f\u0180\5N(\2\u0180\u0181"+
		"\5L\'\2\u0181\u0182\5N(\2\u0182\u0184\3\2\2\2\u0183\u017e\3\2\2\2\u0183"+
		"\u017f\3\2\2\2\u0184K\3\2\2\2\u0185\u0186\t\4\2\2\u0186M\3\2\2\2\u0187"+
		"\u0188\5R*\2\u0188\u0189\5P)\2\u0189O\3\2\2\2\u018a\u018b\7!\2\2\u018b"+
		"\u018c\5R*\2\u018c\u018d\5P)\2\u018d\u0194\3\2\2\2\u018e\u018f\7\"\2\2"+
		"\u018f\u0190\5R*\2\u0190\u0191\5P)\2\u0191\u0194\3\2\2\2\u0192\u0194\3"+
		"\2\2\2\u0193\u018a\3\2\2\2\u0193\u018e\3\2\2\2\u0193\u0192\3\2\2\2\u0194"+
		"Q\3\2\2\2\u0195\u0196\5V,\2\u0196\u0197\5T+\2\u0197S\3\2\2\2\u0198\u0199"+
		"\7#\2\2\u0199\u019a\5V,\2\u019a\u019b\5T+\2\u019b\u01a6\3\2\2\2\u019c"+
		"\u019d\7$\2\2\u019d\u019e\5V,\2\u019e\u019f\5T+\2\u019f\u01a6\3\2\2\2"+
		"\u01a0\u01a1\7%\2\2\u01a1\u01a2\5V,\2\u01a2\u01a3\5T+\2\u01a3\u01a6\3"+
		"\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u0198\3\2\2\2\u01a5\u019c\3\2\2\2\u01a5"+
		"\u01a0\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6U\3\2\2\2\u01a7\u01a8\7!\2\2\u01a8"+
		"\u01ad\5X-\2\u01a9\u01aa\7\"\2\2\u01aa\u01ad\5X-\2\u01ab\u01ad\5X-\2\u01ac"+
		"\u01a7\3\2\2\2\u01ac\u01a9\3\2\2\2\u01ac\u01ab\3\2\2\2\u01adW\3\2\2\2"+
		"\u01ae\u01b7\7(\2\2\u01af\u01b7\7)\2\2\u01b0\u01b7\7&\2\2\u01b1\u01b7"+
		"\5B\"\2\u01b2\u01b3\7\16\2\2\u01b3\u01b4\5J&\2\u01b4\u01b5\7\17\2\2\u01b5"+
		"\u01b7\3\2\2\2\u01b6\u01ae\3\2\2\2\u01b6\u01af\3\2\2\2\u01b6\u01b0\3\2"+
		"\2\2\u01b6\u01b1\3\2\2\2\u01b6\u01b2\3\2\2\2\u01b7Y\3\2\2\2\u01b8\u01b9"+
		"\5J&\2\u01b9\u01ba\5\\/\2\u01ba\u01bd\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc"+
		"\u01b8\3\2\2\2\u01bc\u01bb\3\2\2\2\u01bd[\3\2\2\2\u01be\u01bf\7\f\2\2"+
		"\u01bf\u01c0\5J&\2\u01c0\u01c1\5\\/\2\u01c1\u01c4\3\2\2\2\u01c2\u01c4"+
		"\3\2\2\2\u01c3\u01be\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4]\3\2\2\2!`gq\u0080"+
		"\u0087\u008d\u0093\u00a0\u00a8\u00bd\u00c6\u00e1\u00eb\u00f7\u0109\u010d"+
		"\u011c\u0133\u0148\u014c\u0152\u0165\u0171\u017c\u0183\u0193\u01a5\u01ac"+
		"\u01b6\u01bc\u01c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}