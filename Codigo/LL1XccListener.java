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
	 * Enter a parse tree produced by {@link LL1XccParser#program2}.
	 * @param ctx the parse tree
	 */
	void enterProgram2(LL1XccParser.Program2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#program2}.
	 * @param ctx the parse tree
	 */
	void exitProgram2(LL1XccParser.Program2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#program3}.
	 * @param ctx the parse tree
	 */
	void enterProgram3(LL1XccParser.Program3Context ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#program3}.
	 * @param ctx the parse tree
	 */
	void exitProgram3(LL1XccParser.Program3Context ctx);
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
	 * Enter a parse tree produced by {@link LL1XccParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(LL1XccParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(LL1XccParser.VardeclContext ctx);
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
	 * Enter a parse tree produced by {@link LL1XccParser#constructdecl}.
	 * @param ctx the parse tree
	 */
	void enterConstructdecl(LL1XccParser.ConstructdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#constructdecl}.
	 * @param ctx the parse tree
	 */
	void exitConstructdecl(LL1XccParser.ConstructdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#methoddecl}.
	 * @param ctx the parse tree
	 */
	void enterMethoddecl(LL1XccParser.MethoddeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#methoddecl}.
	 * @param ctx the parse tree
	 */
	void exitMethoddecl(LL1XccParser.MethoddeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#methodbody}.
	 * @param ctx the parse tree
	 */
	void enterMethodbody(LL1XccParser.MethodbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#methodbody}.
	 * @param ctx the parse tree
	 */
	void exitMethodbody(LL1XccParser.MethodbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void enterParamlist(LL1XccParser.ParamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void exitParamlist(LL1XccParser.ParamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#paramlist1}.
	 * @param ctx the parse tree
	 */
	void enterParamlist1(LL1XccParser.Paramlist1Context ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#paramlist1}.
	 * @param ctx the parse tree
	 */
	void exitParamlist1(LL1XccParser.Paramlist1Context ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LL1XccParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LL1XccParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#intstring}.
	 * @param ctx the parse tree
	 */
	void enterIntstring(LL1XccParser.IntstringContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#intstring}.
	 * @param ctx the parse tree
	 */
	void exitIntstring(LL1XccParser.IntstringContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#virgidentcols}.
	 * @param ctx the parse tree
	 */
	void enterVirgidentcols(LL1XccParser.VirgidentcolsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#virgidentcols}.
	 * @param ctx the parse tree
	 */
	void exitVirgidentcols(LL1XccParser.VirgidentcolsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#statement2}.
	 * @param ctx the parse tree
	 */
	void enterStatement2(LL1XccParser.Statement2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#statement2}.
	 * @param ctx the parse tree
	 */
	void exitStatement2(LL1XccParser.Statement2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#statement3}.
	 * @param ctx the parse tree
	 */
	void enterStatement3(LL1XccParser.Statement3Context ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#statement3}.
	 * @param ctx the parse tree
	 */
	void exitStatement3(LL1XccParser.Statement3Context ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#expralocexpr}.
	 * @param ctx the parse tree
	 */
	void enterExpralocexpr(LL1XccParser.ExpralocexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#expralocexpr}.
	 * @param ctx the parse tree
	 */
	void exitExpralocexpr(LL1XccParser.ExpralocexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#atribstat}.
	 * @param ctx the parse tree
	 */
	void enterAtribstat(LL1XccParser.AtribstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#atribstat}.
	 * @param ctx the parse tree
	 */
	void exitAtribstat(LL1XccParser.AtribstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#printstat}.
	 * @param ctx the parse tree
	 */
	void enterPrintstat(LL1XccParser.PrintstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#printstat}.
	 * @param ctx the parse tree
	 */
	void exitPrintstat(LL1XccParser.PrintstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#readstat}.
	 * @param ctx the parse tree
	 */
	void enterReadstat(LL1XccParser.ReadstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#readstat}.
	 * @param ctx the parse tree
	 */
	void exitReadstat(LL1XccParser.ReadstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#returnstat}.
	 * @param ctx the parse tree
	 */
	void enterReturnstat(LL1XccParser.ReturnstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#returnstat}.
	 * @param ctx the parse tree
	 */
	void exitReturnstat(LL1XccParser.ReturnstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#returnstat1}.
	 * @param ctx the parse tree
	 */
	void enterReturnstat1(LL1XccParser.Returnstat1Context ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#returnstat1}.
	 * @param ctx the parse tree
	 */
	void exitReturnstat1(LL1XccParser.Returnstat1Context ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#superstat}.
	 * @param ctx the parse tree
	 */
	void enterSuperstat(LL1XccParser.SuperstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#superstat}.
	 * @param ctx the parse tree
	 */
	void exitSuperstat(LL1XccParser.SuperstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void enterIfstat(LL1XccParser.IfstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void exitIfstat(LL1XccParser.IfstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#ifstat1}.
	 * @param ctx the parse tree
	 */
	void enterIfstat1(LL1XccParser.Ifstat1Context ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#ifstat1}.
	 * @param ctx the parse tree
	 */
	void exitIfstat1(LL1XccParser.Ifstat1Context ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#forstat}.
	 * @param ctx the parse tree
	 */
	void enterForstat(LL1XccParser.ForstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#forstat}.
	 * @param ctx the parse tree
	 */
	void exitForstat(LL1XccParser.ForstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#forstat1}.
	 * @param ctx the parse tree
	 */
	void enterForstat1(LL1XccParser.Forstat1Context ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#forstat1}.
	 * @param ctx the parse tree
	 */
	void exitForstat1(LL1XccParser.Forstat1Context ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#forstat2}.
	 * @param ctx the parse tree
	 */
	void enterForstat2(LL1XccParser.Forstat2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#forstat2}.
	 * @param ctx the parse tree
	 */
	void exitForstat2(LL1XccParser.Forstat2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#statlist}.
	 * @param ctx the parse tree
	 */
	void enterStatlist(LL1XccParser.StatlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#statlist}.
	 * @param ctx the parse tree
	 */
	void exitStatlist(LL1XccParser.StatlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#statlist1}.
	 * @param ctx the parse tree
	 */
	void enterStatlist1(LL1XccParser.Statlist1Context ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#statlist1}.
	 * @param ctx the parse tree
	 */
	void exitStatlist1(LL1XccParser.Statlist1Context ctx);
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
	 * Enter a parse tree produced by {@link LL1XccParser#lvalue3}.
	 * @param ctx the parse tree
	 */
	void enterLvalue3(LL1XccParser.Lvalue3Context ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#lvalue3}.
	 * @param ctx the parse tree
	 */
	void exitLvalue3(LL1XccParser.Lvalue3Context ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#alocexpression}.
	 * @param ctx the parse tree
	 */
	void enterAlocexpression(LL1XccParser.AlocexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#alocexpression}.
	 * @param ctx the parse tree
	 */
	void exitAlocexpression(LL1XccParser.AlocexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#alocexpression2}.
	 * @param ctx the parse tree
	 */
	void enterAlocexpression2(LL1XccParser.Alocexpression2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#alocexpression2}.
	 * @param ctx the parse tree
	 */
	void exitAlocexpression2(LL1XccParser.Alocexpression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#alocexpression3}.
	 * @param ctx the parse tree
	 */
	void enterAlocexpression3(LL1XccParser.Alocexpression3Context ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#alocexpression3}.
	 * @param ctx the parse tree
	 */
	void exitAlocexpression3(LL1XccParser.Alocexpression3Context ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#alocexpression4}.
	 * @param ctx the parse tree
	 */
	void enterAlocexpression4(LL1XccParser.Alocexpression4Context ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#alocexpression4}.
	 * @param ctx the parse tree
	 */
	void exitAlocexpression4(LL1XccParser.Alocexpression4Context ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#alocexpression5}.
	 * @param ctx the parse tree
	 */
	void enterAlocexpression5(LL1XccParser.Alocexpression5Context ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#alocexpression5}.
	 * @param ctx the parse tree
	 */
	void exitAlocexpression5(LL1XccParser.Alocexpression5Context ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LL1XccParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LL1XccParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#expression2}.
	 * @param ctx the parse tree
	 */
	void enterExpression2(LL1XccParser.Expression2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#expression2}.
	 * @param ctx the parse tree
	 */
	void exitExpression2(LL1XccParser.Expression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#expresion3}.
	 * @param ctx the parse tree
	 */
	void enterExpresion3(LL1XccParser.Expresion3Context ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#expresion3}.
	 * @param ctx the parse tree
	 */
	void exitExpresion3(LL1XccParser.Expresion3Context ctx);
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
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(LL1XccParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(LL1XccParser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link LL1XccParser#arglist1}.
	 * @param ctx the parse tree
	 */
	void enterArglist1(LL1XccParser.Arglist1Context ctx);
	/**
	 * Exit a parse tree produced by {@link LL1XccParser#arglist1}.
	 * @param ctx the parse tree
	 */
	void exitArglist1(LL1XccParser.Arglist1Context ctx);
}