// Generated from Xcc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XccParser}.
 */
public interface XccListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XccParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(XccParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(XccParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#classlist}.
	 * @param ctx the parse tree
	 */
	void enterClasslist(XccParser.ClasslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#classlist}.
	 * @param ctx the parse tree
	 */
	void exitClasslist(XccParser.ClasslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#classlistaux}.
	 * @param ctx the parse tree
	 */
	void enterClasslistaux(XccParser.ClasslistauxContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#classlistaux}.
	 * @param ctx the parse tree
	 */
	void exitClasslistaux(XccParser.ClasslistauxContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#classdecl}.
	 * @param ctx the parse tree
	 */
	void enterClassdecl(XccParser.ClassdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#classdecl}.
	 * @param ctx the parse tree
	 */
	void exitClassdecl(XccParser.ClassdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#classbody}.
	 * @param ctx the parse tree
	 */
	void enterClassbody(XccParser.ClassbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#classbody}.
	 * @param ctx the parse tree
	 */
	void exitClassbody(XccParser.ClassbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#classbodyaux}.
	 * @param ctx the parse tree
	 */
	void enterClassbodyaux(XccParser.ClassbodyauxContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#classbodyaux}.
	 * @param ctx the parse tree
	 */
	void exitClassbodyaux(XccParser.ClassbodyauxContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#classbodyaux2}.
	 * @param ctx the parse tree
	 */
	void enterClassbodyaux2(XccParser.Classbodyaux2Context ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#classbodyaux2}.
	 * @param ctx the parse tree
	 */
	void exitClassbodyaux2(XccParser.Classbodyaux2Context ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#classbodyaux3}.
	 * @param ctx the parse tree
	 */
	void enterClassbodyaux3(XccParser.Classbodyaux3Context ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#classbodyaux3}.
	 * @param ctx the parse tree
	 */
	void exitClassbodyaux3(XccParser.Classbodyaux3Context ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(XccParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(XccParser.VardeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#intstringident}.
	 * @param ctx the parse tree
	 */
	void enterIntstringident(XccParser.IntstringidentContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#intstringident}.
	 * @param ctx the parse tree
	 */
	void exitIntstringident(XccParser.IntstringidentContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#cols}.
	 * @param ctx the parse tree
	 */
	void enterCols(XccParser.ColsContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#cols}.
	 * @param ctx the parse tree
	 */
	void exitCols(XccParser.ColsContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#vardeclaux}.
	 * @param ctx the parse tree
	 */
	void enterVardeclaux(XccParser.VardeclauxContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#vardeclaux}.
	 * @param ctx the parse tree
	 */
	void exitVardeclaux(XccParser.VardeclauxContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#constructdecl}.
	 * @param ctx the parse tree
	 */
	void enterConstructdecl(XccParser.ConstructdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#constructdecl}.
	 * @param ctx the parse tree
	 */
	void exitConstructdecl(XccParser.ConstructdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#methoddecl}.
	 * @param ctx the parse tree
	 */
	void enterMethoddecl(XccParser.MethoddeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#methoddecl}.
	 * @param ctx the parse tree
	 */
	void exitMethoddecl(XccParser.MethoddeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#methodbody}.
	 * @param ctx the parse tree
	 */
	void enterMethodbody(XccParser.MethodbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#methodbody}.
	 * @param ctx the parse tree
	 */
	void exitMethodbody(XccParser.MethodbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void enterParamlist(XccParser.ParamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void exitParamlist(XccParser.ParamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#paramlistaux}.
	 * @param ctx the parse tree
	 */
	void enterParamlistaux(XccParser.ParamlistauxContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#paramlistaux}.
	 * @param ctx the parse tree
	 */
	void exitParamlistaux(XccParser.ParamlistauxContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(XccParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(XccParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#intstring}.
	 * @param ctx the parse tree
	 */
	void enterIntstring(XccParser.IntstringContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#intstring}.
	 * @param ctx the parse tree
	 */
	void exitIntstring(XccParser.IntstringContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#virgidentcols}.
	 * @param ctx the parse tree
	 */
	void enterVirgidentcols(XccParser.VirgidentcolsContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#virgidentcols}.
	 * @param ctx the parse tree
	 */
	void exitVirgidentcols(XccParser.VirgidentcolsContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#statementaux}.
	 * @param ctx the parse tree
	 */
	void enterStatementaux(XccParser.StatementauxContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#statementaux}.
	 * @param ctx the parse tree
	 */
	void exitStatementaux(XccParser.StatementauxContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#statementaux2}.
	 * @param ctx the parse tree
	 */
	void enterStatementaux2(XccParser.Statementaux2Context ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#statementaux2}.
	 * @param ctx the parse tree
	 */
	void exitStatementaux2(XccParser.Statementaux2Context ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#expralocexpr}.
	 * @param ctx the parse tree
	 */
	void enterExpralocexpr(XccParser.ExpralocexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#expralocexpr}.
	 * @param ctx the parse tree
	 */
	void exitExpralocexpr(XccParser.ExpralocexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#atribstat}.
	 * @param ctx the parse tree
	 */
	void enterAtribstat(XccParser.AtribstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#atribstat}.
	 * @param ctx the parse tree
	 */
	void exitAtribstat(XccParser.AtribstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#printstat}.
	 * @param ctx the parse tree
	 */
	void enterPrintstat(XccParser.PrintstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#printstat}.
	 * @param ctx the parse tree
	 */
	void exitPrintstat(XccParser.PrintstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#readstat}.
	 * @param ctx the parse tree
	 */
	void enterReadstat(XccParser.ReadstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#readstat}.
	 * @param ctx the parse tree
	 */
	void exitReadstat(XccParser.ReadstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#returnstat}.
	 * @param ctx the parse tree
	 */
	void enterReturnstat(XccParser.ReturnstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#returnstat}.
	 * @param ctx the parse tree
	 */
	void exitReturnstat(XccParser.ReturnstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#superstat}.
	 * @param ctx the parse tree
	 */
	void enterSuperstat(XccParser.SuperstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#superstat}.
	 * @param ctx the parse tree
	 */
	void exitSuperstat(XccParser.SuperstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void enterIfstat(XccParser.IfstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void exitIfstat(XccParser.IfstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#forstat}.
	 * @param ctx the parse tree
	 */
	void enterForstat(XccParser.ForstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#forstat}.
	 * @param ctx the parse tree
	 */
	void exitForstat(XccParser.ForstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#forstataux}.
	 * @param ctx the parse tree
	 */
	void enterForstataux(XccParser.ForstatauxContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#forstataux}.
	 * @param ctx the parse tree
	 */
	void exitForstataux(XccParser.ForstatauxContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#statlist}.
	 * @param ctx the parse tree
	 */
	void enterStatlist(XccParser.StatlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#statlist}.
	 * @param ctx the parse tree
	 */
	void exitStatlist(XccParser.StatlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(XccParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(XccParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#lvalueaux}.
	 * @param ctx the parse tree
	 */
	void enterLvalueaux(XccParser.LvalueauxContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#lvalueaux}.
	 * @param ctx the parse tree
	 */
	void exitLvalueaux(XccParser.LvalueauxContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#alocexpression}.
	 * @param ctx the parse tree
	 */
	void enterAlocexpression(XccParser.AlocexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#alocexpression}.
	 * @param ctx the parse tree
	 */
	void exitAlocexpression(XccParser.AlocexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#alocexpression2}.
	 * @param ctx the parse tree
	 */
	void enterAlocexpression2(XccParser.Alocexpression2Context ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#alocexpression2}.
	 * @param ctx the parse tree
	 */
	void exitAlocexpression2(XccParser.Alocexpression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(XccParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(XccParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#expresionaux}.
	 * @param ctx the parse tree
	 */
	void enterExpresionaux(XccParser.ExpresionauxContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#expresionaux}.
	 * @param ctx the parse tree
	 */
	void exitExpresionaux(XccParser.ExpresionauxContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#numexpression}.
	 * @param ctx the parse tree
	 */
	void enterNumexpression(XccParser.NumexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#numexpression}.
	 * @param ctx the parse tree
	 */
	void exitNumexpression(XccParser.NumexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#numexpressionaux}.
	 * @param ctx the parse tree
	 */
	void enterNumexpressionaux(XccParser.NumexpressionauxContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#numexpressionaux}.
	 * @param ctx the parse tree
	 */
	void exitNumexpressionaux(XccParser.NumexpressionauxContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(XccParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(XccParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#termaux}.
	 * @param ctx the parse tree
	 */
	void enterTermaux(XccParser.TermauxContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#termaux}.
	 * @param ctx the parse tree
	 */
	void exitTermaux(XccParser.TermauxContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#unaryexpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryexpr(XccParser.UnaryexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#unaryexpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryexpr(XccParser.UnaryexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(XccParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(XccParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(XccParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(XccParser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link XccParser#arglistaux}.
	 * @param ctx the parse tree
	 */
	void enterArglistaux(XccParser.ArglistauxContext ctx);
	/**
	 * Exit a parse tree produced by {@link XccParser#arglistaux}.
	 * @param ctx the parse tree
	 */
	void exitArglistaux(XccParser.ArglistauxContext ctx);
}