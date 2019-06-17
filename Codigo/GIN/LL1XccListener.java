// Generated from LL1Xcc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LL1XccParser}.
 */
public interface LL1XccListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LL1XccParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LL1XccParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#classlist}.
	 * @param ctx the parse tree
	 */
	void enterClasslist(LL1XccParser.ClasslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#classlist}.
	 * @param ctx the parse tree
	 */
	void exitClasslist(LL1XccParser.ClasslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#classlist2}.
	 * @param ctx the parse tree
	 */
	void enterClasslist2(LL1XccParser.Classlist2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#classlist2}.
	 * @param ctx the parse tree
	 */
	void exitClasslist2(LL1XccParser.Classlist2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(LL1XccParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(LL1XccParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#intstringident}.
	 * @param ctx the parse tree
	 */
	void enterIntstringident(LL1XccParser.IntstringidentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#intstringident}.
	 * @param ctx the parse tree
	 */
	void exitIntstringident(LL1XccParser.IntstringidentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#cols}.
	 * @param ctx the parse tree
	 */
	void enterCols(LL1XccParser.ColsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#cols}.
	 * @param ctx the parse tree
	 */
	void exitCols(LL1XccParser.ColsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#vardecl1}.
	 * @param ctx the parse tree
	 */
	void enterVardecl1(LL1XccParser.Vardecl1Context ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#vardecl1}.
	 * @param ctx the parse tree
	 */
	void exitVardecl1(LL1XccParser.Vardecl1Context ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(LL1XccParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(LL1XccParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#lvalue2}.
	 * @param ctx the parse tree
	 */
	void enterLvalue2(LL1XccParser.Lvalue2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#lvalue2}.
	 * @param ctx the parse tree
	 */
	void exitLvalue2(LL1XccParser.Lvalue2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#exps}.
	 * @param ctx the parse tree
	 */
	void enterExps(LL1XccParser.ExpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#exps}.
	 * @param ctx the parse tree
	 */
	void exitExps(LL1XccParser.ExpsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#numexpression2}.
	 * @param ctx the parse tree
	 */
	void enterNumexpression2(LL1XccParser.Numexpression2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#numexpression2}.
	 * @param ctx the parse tree
	 */
	void exitNumexpression2(LL1XccParser.Numexpression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#numexpression}.
	 * @param ctx the parse tree
	 */
	void enterNumexpression(LL1XccParser.NumexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#numexpression}.
	 * @param ctx the parse tree
	 */
	void exitNumexpression(LL1XccParser.NumexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(LL1XccParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(LL1XccParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#term1}.
	 * @param ctx the parse tree
	 */
	void enterTerm1(LL1XccParser.Term1Context ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#term1}.
	 * @param ctx the parse tree
	 */
	void exitTerm1(LL1XccParser.Term1Context ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#unaryexpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryexpr(LL1XccParser.UnaryexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#unaryexpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryexpr(LL1XccParser.UnaryexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(LL1XccParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(LL1XccParser.FactorContext ctx);
}