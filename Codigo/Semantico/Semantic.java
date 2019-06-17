import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class Semantic extends LL1XccBaseListener {
	private ParseTreeProperty<Object> atributoHerdado;
	private ParseTreeProperty<Object> atributoSintetizado, atributoSintetizado2;
	
	private String arvore;
	
	private static final int INT_SIZE = 8;
	private static final int STRING_SIZE = 16;
	
	public Semantic() {
		super();
		this.atributoHerdado = new ParseTreeProperty<Object>();
		this.atributoSintetizado = new ParseTreeProperty<Object>();
		this.atributoSintetizado2 = new ParseTreeProperty<Object>();
		
		this.arvore = "";
	}
	
	@Override public void exitExps(LL1XccParser.ExpsContext ctx) {
		this.arvore += "exps ";
		System.out.println(this.arvore);
		this.arvore = "";
		
		// exps := term numexpression2
		if (ctx.getChild(0).getClass() == LL1XccParser.TermContext.class) {
			Object numexpression2Sintetizado;
			numexpression2Sintetizado = this.atributoSintetizado.get(ctx.getChild(1));
			
			this.atributoSintetizado.put(ctx, numexpression2Sintetizado);
		}
	}
	@Override public void exitNumexpression(LL1XccParser.NumexpressionContext ctx) {
		this.arvore += "numexpression ";
		
		// numexpression := exps
		if (ctx.getChild(0).getClass() == LL1XccParser.ExpsContext.class) {
			Object numexpression2Sintetizado;
			numexpression2Sintetizado = this.atributoSintetizado.get(ctx.getChild(0));
			
			this.atributoSintetizado.put(ctx, numexpression2Sintetizado);
		}
	}
	@Override public void exitTerm(LL1XccParser.TermContext ctx) {
		this.arvore += "term ";
		
		// term := unaryexpr term1
		if (ctx.getChild(0).getClass() == LL1XccParser.UnaryexprContext.class) {
			Object term1Sintetizado;
			term1Sintetizado = this.atributoSintetizado.get(ctx.getChild(1));
			
			// term.val = term1.syn
			this.atributoSintetizado.put(ctx, term1Sintetizado);
		}
		// Derivado de exps := term numexpression2
		if (ctx.getParent().getClass() == LL1XccParser.ExpsContext.class) {
			Object termSintetizado;
			termSintetizado = this.atributoSintetizado.get(ctx);
			
			// numexpression2.inh = term.syn (regra da producao que derivou term)
			this.atributoHerdado.put(ctx.getParent().getChild(1), termSintetizado);
		}
		//    Derivado de numexpression2 := OPMAIS term numexpression2(1)
		// ou Derivado de numexpression2 := OPMENOS term numexpression2(1)
		else if (ctx.getParent().getClass() == LL1XccParser.Numexpression2Context.class) {
			LL1XccParser.Numexpression2Context numexpression2;
			numexpression2 = (LL1XccParser.Numexpression2Context) ctx.getParent();
			
			String numexpression2Herdado, termSintetizado;
			numexpression2Herdado = (String) this.atributoHerdado.get(ctx.getParent());
			termSintetizado = (String) this.atributoSintetizado.get(ctx);
			
			if (numexpression2.OPMAIS() != null) {
				// numexpression2(1).inh = numexpression2.inh + term.val
				this.atributoHerdado.put(numexpression2.getChild(2), numexpression2Herdado + "+" + termSintetizado);
			} else if (numexpression2.OPMENOS() != null) {
				// numexpression2(1).inh = numexpression2.inh - term.val
				this.atributoHerdado.put(ctx.getParent().getChild(2), numexpression2Herdado + "-" + termSintetizado);
			}
		}
	}
	@Override public void exitUnaryexpr(LL1XccParser.UnaryexprContext ctx) {
		this.arvore += "unaryexpr ";
		
		// unaryexp := OPMAIS factor
		if (ctx.OPMAIS() != null) {
			Object factorSintetizado;
			factorSintetizado = this.atributoSintetizado.get(ctx.getChild(1));
			
			// unaryexp.syn = factor.syn
			this.atributoSintetizado.put(ctx, factorSintetizado);
		}
		// unaryexp := OPMENOS factor
		else if (ctx.OPMENOS() != null) {
			Integer factorSintetizado;
			factorSintetizado = (Integer) this.atributoSintetizado.get(ctx.getChild(1));
			
			// unaryexp.syn = factor.syn
			this.atributoSintetizado.put(ctx, (-1) * factorSintetizado);
		// unaryexp := factor
		} else {
			Object factorSintetizado;
			factorSintetizado = this.atributoSintetizado.get(ctx.getChild(0));
			
			// unaryexp.syn = factor.syn
			this.atributoSintetizado.put(ctx, factorSintetizado);
		}
		
		// Derivado de term := unaryexpr term1
		if (ctx.getParent().getClass() == LL1XccParser.TermContext.class) {
			Object unaryexprSintetizado;
			unaryexprSintetizado = this.atributoSintetizado.get(ctx);
			
			// term1.inh = unaryexpr.val (regra da producao que derivou unaryexpr)
			this.atributoHerdado.put(ctx.parent.getChild(1), unaryexprSintetizado);
		// Derivado de term1
		} else if (ctx.getParent().getClass() == LL1XccParser.Term1Context.class) {
			LL1XccParser.Term1Context term1;
			term1 = (LL1XccParser.Term1Context) ctx.getParent();
			
			String term1Herdado, unaryexprSintetizado;
			term1Herdado = (String) this.atributoHerdado.get(term1);
			unaryexprSintetizado = (String) this.atributoSintetizado.get(ctx);
			
			// Derivado de term1 := OP unaryexpr term1(1)
			if (term1.OPVEZES() != null) {
				// term1(1).inh = term1.inh * unaryexpr.val
				this.atributoHerdado.put(term1.getChild(2), term1Herdado + "*" + unaryexprSintetizado);
			}
			// Derivado de term1 := OP unaryexpr term1
			else if (term1.OPDIV() != null) {
				// term1(1).inh = term1.inh / unaryexpr.val
				this.atributoHerdado.put(term1.getChild(2), term1Herdado + "/" + unaryexprSintetizado);
			}
			// Derivado de term1 := OP unaryexpr term1
			else if (term1.OPMOD() != null) {
				// term1(1).inh = term1.inh % unaryexpr.val
				this.atributoHerdado.put(term1.getChild(2), term1Herdado + "%" + unaryexprSintetizado);
			}
		}
	}
	@Override public void exitFactor(LL1XccParser.FactorContext ctx) {
		this.arvore += "factor ";
		
		// factor := INTCONSTANT
		if (ctx.INTCONSTANT() != null) {
			// factor.syn = INTCONSTANT.vallex
			this.atributoSintetizado.put(ctx, ctx.INTCONSTANT().getText());
			return;
		}
		// factor := STRINGCONSTANT
		if (ctx.STRINGCONSTANT() != null) {
			// factor.syn = STRINGCONSTANT.vallex
			this.atributoSintetizado.put(ctx, ctx.STRINGCONSTANT().getText());
			return;
		}
		// factor := NULL
		if (ctx.NULL() != null) {
			// factor.syn = NULL.vallex
			this.atributoSintetizado.put(ctx, ctx.NULL().getText());
			return;
		}
		// factor := ABRAPAR numexpression FECHPAR
		if (ctx.ABRPAR() != null) {
			Object numexpressionSintetizado;
			numexpressionSintetizado = this.atributoSintetizado.get(ctx.getChild(1));
			
			// factor.syn = numexpression.syn
			this.atributoSintetizado.put(ctx, numexpressionSintetizado);
			return;
		}
		// factor := lvalue
		Object lvalueSintetizado;
		lvalueSintetizado = this.atributoSintetizado.get(ctx.getChild(0));
		
		// factor.syn = numexpression.syn
		this.atributoSintetizado.put(ctx, lvalueSintetizado);
	}
	@Override public void exitTerm1(LL1XccParser.Term1Context ctx) {
		this.arvore += "term1 ";
		
		//    term1 := OPVEZES unaryexpr term1(1)
		// ou term1 := OPDIV unaryexpr term1(1)
		// ou term1 := OPMOD unaryexpr term1(1)
		if (ctx.OPVEZES() != null || ctx.OPDIV() != null || ctx.OPMOD() != null) {
			Object term11Sintetizado;
			term11Sintetizado = this.atributoSintetizado.get(ctx.getChild(2));
			
			// factor.syn = numexpression.syn
			this.atributoSintetizado.put(ctx, term11Sintetizado);
			return;
		}
		// term1 := epsilon
		Object term1Herdado;
		term1Herdado = this.atributoHerdado.get(ctx);
		
		// term1.syn = term1.inh
		this.atributoSintetizado.put(ctx, term1Herdado);
	}
	@Override public void exitNumexpression2(LL1XccParser.Numexpression2Context ctx) {
		this.arvore += "numexpression2 ";
		
		//    numexpression2 := OPMAIS term numexpression2(1)
		// ou numexpression2 := OPMENOS term numexpression2(1)
		if (ctx.OPMAIS() != null || ctx.OPMENOS() != null) {
			Object numexpression21Sintetizado;
			numexpression21Sintetizado = this.atributoSintetizado.get(ctx.getChild(2));
			
			// numexpression2.syn = numexpression2(1).syn
			this.atributoSintetizado.put(ctx, numexpression21Sintetizado);
		// numexpression2 := epsilon
		} else {
			Object numexpression2Herdado;
			numexpression2Herdado = this.atributoHerdado.get(ctx);
			
			// numexpression2.syn = numexpression2.inh
			this.atributoSintetizado.put(ctx, numexpression2Herdado);
		}
	}
	@Override public void enterLvalue(LL1XccParser.LvalueContext ctx) {
		// lvalue := IDENT lvalue2
		if (ctx.IDENT() != null && ctx.getChild(1).getClass() == LL1XccParser.Lvalue2Context.class) {
			// lvalue2.inh = 1
			this.atributoHerdado.put(ctx.getChild(1), "");
		}
	}
	@Override public void exitLvalue(LL1XccParser.LvalueContext ctx) {
		this.arvore += "lvalue ";
		
		// lvalue := IDENT lvalue2
		if (ctx.IDENT() != null && ctx.getChild(1).getClass() == LL1XccParser.Lvalue2Context.class) {
			String lvalue2;
			lvalue2 = (String) this.atributoSintetizado.get(ctx.getChild(1));
			
			// lvalue.syn = IDENT.vallex + lvalue2.syn
			this.atributoSintetizado.put(ctx, ctx.IDENT() + lvalue2);
		}
	}
	@Override public void enterLvalue2(LL1XccParser.Lvalue2Context ctx) {
		// lvalue2 := ABRACOL INTCONSTANT FECHCOL lvalue2(1)
		if (ctx.ABRCOL() != null && ctx.INTCONSTANT() != null && ctx.FECHCOL() != null) {
			String parentHerdado, intconstant;
			
			parentHerdado = (String) this.atributoHerdado.get(ctx);
			intconstant = ctx.INTCONSTANT().getText();
			
			// lvalue2(1).inh = lvalue2.inh + "[" + INTCONSTANT.vallex + "]"
			this.atributoHerdado.put(ctx.getChild(3), parentHerdado+ "[" + intconstant + "]");
		}
	}
	@Override public void exitLvalue2(LL1XccParser.Lvalue2Context ctx) {
		this.arvore += "lvalue2 ";
		
		// lvalue2 := ABRACOL INTCONSTANT FECHCOL lvalue2(1)
		if (ctx.ABRCOL() != null && ctx.INTCONSTANT() != null && ctx.FECHCOL() != null) {
			Object lvalue21Sintetizado;
			lvalue21Sintetizado = this.atributoSintetizado.get(ctx.getChild(3));
			
			// lvalue2.syn = lvalue2(1).syn
			this.atributoSintetizado.put(ctx, lvalue21Sintetizado);
		// lvalue2 := epsilon
		} else {
			Object lvalue2Herdado;
			lvalue2Herdado = this.atributoHerdado.get(ctx);
			
			// lvalue2.syn = lvalue2.inh
			this.atributoSintetizado.put(ctx, lvalue2Herdado);
		}
	}
	
	/* 	-------------------------------------------
	 *	-------------------------------------------
	 *	--------- DECLARACAO DE VARIAVEIS ---------
	 * 	-------------------------------------------
	 * 	-------------------------------------------
	 */
	@Override public void exitDec(LL1XccParser.DecContext ctx) {
		this.arvore += "dec ";
		
		// dec := intstringident IDENT cols
		if (ctx.IDENT() != null) {
			Object colsSintetizado, colsHerdado;
			colsSintetizado = (Integer) this.atributoSintetizado.get(ctx.getChild(2));
			colsHerdado = (Integer) this.atributoHerdado.get(ctx.getChild(2));
			
			// dec.syn = cols.syn
			this.atributoSintetizado.put(ctx, colsSintetizado);
			// dec.syn2 = cols.inh
			this.atributoSintetizado2.put(ctx, colsHerdado);
			
			//    Derivado de vardecl := dec vardecl1
			// ou Derivado de paramlist := dec paramlist1
			if (ctx.getParent().getClass() == LL1XccParser.VardeclContext.class) {
				// vardecl1.inh = dec.syn2
				// paramlist1.inh = dec.syn2
				this.atributoHerdado.put(ctx.getParent().getChild(1), colsHerdado);
			}
		}
	}
	@Override public void exitParamlist(LL1XccParser.ParamlistContext ctx) {
		this.arvore += "paramlist ";
		System.out.println(this.arvore);
		this.arvore = "";
	}
	@Override public void exitVardecl(LL1XccParser.VardeclContext ctx) {
		this.arvore += "vardecl ";
		System.out.println(this.arvore);
		this.arvore = "";
		
		// vardecl := dec vardecl1
		if (ctx.getChild(0).getClass() == LL1XccParser.DecContext.class) {
			Integer decSintetizado, vardecl1Sintetizado;
			decSintetizado = (Integer) this.atributoSintetizado.get(ctx.getChild(0));
			vardecl1Sintetizado = (Integer) this.atributoSintetizado.get(ctx.getChild(1));
			
			// vardecl.syn = vardecl1.syn
			this.atributoSintetizado.put(ctx, decSintetizado + vardecl1Sintetizado);
		}
	}
	@Override public void exitIntstringident(LL1XccParser.IntstringidentContext ctx) {
		this.arvore += "intstringident ";
		
		// intstringident := INT
		if (ctx.INT() != null) {
			this.atributoSintetizado.put(ctx, Semantic.INT_SIZE);
		// intstringident := STRING
		} else if (ctx.STRING() != null) {
			this.atributoSintetizado.put(ctx, Semantic.STRING_SIZE);
		// intstringident := IDENT
		} else 	if (ctx.IDENT() != null) {
			this.atributoSintetizado.put(ctx, 0);//Semantic.INT_SIZE);
		}
		
		// Derivado de dec := intstringident IDENT cols
		if (ctx.getParent().getClass() == LL1XccParser.DecContext.class) {
			Object intstringidentSintetizado;
			intstringidentSintetizado = this.atributoSintetizado.get(ctx);
			
			this.atributoHerdado.put(ctx.getParent().getChild(2), intstringidentSintetizado);
		}
	}
	@Override public void enterCols(LL1XccParser.ColsContext ctx) {
		//    Derivado de: vardecl := intstringident IDENT cols vardecl1
		// ou Derivado de: paramlist := intstringident IDENT cols paramlist1
		if (ctx.getParent().getClass() == LL1XccParser.VardeclContext.class ||
			ctx.getParent().getClass() == LL1XccParser.ParamlistContext.class)
		{
			Object intStringIdentSintetizado;
			intStringIdentSintetizado = this.atributoSintetizado.get(ctx.getParent().getChild(0));
			
			// cols.inh = intstringident.val (regra da producao que derivou cols)
			this.atributoHerdado.put(ctx, intStringIdentSintetizado);
		}
		// cols := ABRCOL INTCONSTANT FECHCOL cols(1)
		if (ctx.ABRCOL() != null) {
			Integer colsHerdado, INTCONSTANT;
			colsHerdado = (Integer) this.atributoHerdado.get(ctx);
			INTCONSTANT = Integer.parseInt(ctx.INTCONSTANT().getSymbol().getText());
			
			// cols(1).inh = INTCONSTANT.VALLEX * cols.inh
			this.atributoHerdado.put(ctx.getChild(3), INTCONSTANT * colsHerdado);
		}
	}
	@Override public void exitCols(LL1XccParser.ColsContext ctx) {
		this.arvore += "cols ";
		
		// Derivado de: vardecl := intstringident IDENT cols vardecl1
		if (ctx.getParent().getClass() == LL1XccParser.VardeclContext.class) {
			Object colsHerdado;
			colsHerdado = this.atributoHerdado.get(ctx);
			
			// vardecl1.inh = cols.inh (regra da producao que derivou cols)
			this.atributoHerdado.put(ctx.getParent().getChild(3), colsHerdado);
		}
		// cols := ABRCOL INTCONSTANT FECHCOL cols(1)
		if (ctx.ABRCOL() != null) {
			Object cols1Sintetizado;
			cols1Sintetizado = this.atributoSintetizado.get(ctx.getChild(3));
			
			// cols.syn = cols(1).syn
			this.atributoSintetizado.put(ctx, cols1Sintetizado);
		// cols := epsilon
		} else {
			Object colsHerdado;
			colsHerdado = this.atributoHerdado.get(ctx);
			
			// cols.syn = cols.inh
			this.atributoSintetizado.put(ctx, colsHerdado);
		}
	}
	@Override public void enterVardecl1(LL1XccParser.Vardecl1Context ctx) {
		// vardecl1 := VIRG IDENT cols vardecl1(1)
		if (ctx.VIRG() != null) {
			Object vardecl1Herdado;
			vardecl1Herdado = this.atributoHerdado.get(ctx);
			
			// cols.inh = vardecl1.inh
			this.atributoHerdado.put(ctx.getChild(2), vardecl1Herdado);
			// vardecl1(1).inh = cols.inh (vardecl1.inh)
			this.atributoHerdado.put(ctx.getChild(3), vardecl1Herdado);
		}
	}
	@Override public void exitVardecl1(LL1XccParser.Vardecl1Context ctx) {
		this.arvore += "vardecl1 ";
		
		// vardecl1 := VIRG IDENT cols vardecl1(1)
		if (ctx.VIRG() != null) {
			Integer varDecl11Sintetizado, colsSintetizado;
			colsSintetizado = (Integer) this.atributoSintetizado.get(ctx.getChild(2));
			varDecl11Sintetizado = (Integer) this.atributoSintetizado.get(ctx.getChild(3));
			
			// varDecl.syn = cols.syn + varDecl1.syn
			this.atributoSintetizado.put(ctx, colsSintetizado + varDecl11Sintetizado);
		// varDecl1 := epsilon
		// varDecl1.syn = 0
		} else {
			this.atributoSintetizado.put(ctx, 0);
		}
	}
}
