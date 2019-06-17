import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class Semantic extends LL1XccBaseListener {
	private ParseTreeProperty<Object> atributoHerdado, atributoHerdado2;
	private ParseTreeProperty<Object> atributoSintetizado, atributoSintetizado2;
	
	private String arvore, codigo;
	
	private static final int INT_SIZE = 8;
	private static final int STRING_SIZE = 16;
	
	private int contadorLetraDoAlfabeto = 0;
	private int contadorLetraDoAlfabeto2 = 0;
	
	private String alfabeto[] =
	{
		"a", "b", "c", "d", "e", "f", "g", "h", "i",
		"j", "k", "l", "m", "n", "o", "p", "q", "r",
		"s", "t", "u", "v", "w", "y", "x", "z"
	};
	
	public Semantic() {
		super();
		this.atributoHerdado = new ParseTreeProperty<Object>();
		this.atributoHerdado2 = new ParseTreeProperty<Object>();
		
		this.atributoSintetizado = new ParseTreeProperty<Object>();
		this.atributoSintetizado2 = new ParseTreeProperty<Object>();
		
		this.arvore = "";
		this.codigo = "";
	}
	
	public void sintetizado(ParseTree ctx, Object valor) {
		this.atributoSintetizado.put(ctx, valor);
	}
	public void sintetizado2(ParseTree ctx, Object valor) {
		this.atributoSintetizado2.put(ctx, valor);
	}
	public void herdado(ParseTree ctx, Object valor) {
		this.atributoHerdado.put(ctx, valor);
	}
	public void herdado2(ParseTree ctx, Object valor) {
		this.atributoHerdado2.put(ctx, valor);
	}
	
	public Object sintetizado(ParseTree ctx) {
		return this.atributoSintetizado.get(ctx);
	}
	public Object sintetizado2(ParseTree ctx) {
		return this.atributoSintetizado2.get(ctx);
	}
	public Object herdado2(ParseTree ctx) {
		return this.atributoHerdado2.get(ctx);
	}
	public Object herdado(ParseTree ctx) {
		return this.atributoHerdado.get(ctx);
	}
	
	public String letraDoAlfabeto() {
		String retorno;
		retorno = this.alfabeto[this.contadorLetraDoAlfabeto]+""+this.contadorLetraDoAlfabeto2;
		
		this.contadorLetraDoAlfabeto++;
		if (this.contadorLetraDoAlfabeto > 25) {
			this.contadorLetraDoAlfabeto = 0;
			this.contadorLetraDoAlfabeto2++;
		}
		
		return retorno;
	}
	
	@Override public void exitProgram(LL1XccParser.ProgramContext ctx) {
		//System.out.println(this.arvore);
		System.out.println(this.codigo);
	}
	
	/* 	-------------------------------------------
	 *	-------------------------------------------
	 *	---------- EXPRESSOES ARITMETICAS ---------
	 * 	-------------------------------------------
	 * 	-------------------------------------------
	 */
	@Override public void exitExps(LL1XccParser.ExpsContext ctx) {
		this.arvore += "exps \n";
		// exps := term numexpression2
		if (ctx.getChild(0).getClass() == LL1XccParser.TermContext.class) {
			sintetizado(ctx, sintetizado(ctx.getChild(1)));
			sintetizado2(ctx, sintetizado2(ctx.getChild(1)));
		}
	}
	@Override public void exitNumexpression(LL1XccParser.NumexpressionContext ctx) {
		this.arvore += "numexpression ";
		
		// numexpression := exps
		if (ctx.getChild(0).getClass() == LL1XccParser.ExpsContext.class) {
			sintetizado(ctx, sintetizado(ctx.getChild(0)));
			sintetizado2(ctx, sintetizado2(ctx.getChild(0)));
		}
	}
	@Override public void exitTerm(LL1XccParser.TermContext ctx) {
		this.arvore += "term ";
		
		// term := unaryexpr term1
		if (ctx.getChild(0).getClass() == LL1XccParser.UnaryexprContext.class) {
			sintetizado(ctx, sintetizado(ctx.getChild(1)));
			sintetizado2(ctx, sintetizado2(ctx.getChild(1)));
		}
		
		// Heranca de irmaos
		ParseTree parent;
		parent = ctx.getParent();
		
		// Derivado de numexpression2
		if (parent.getClass() == LL1XccParser.Numexpression2Context.class) {
			// numexpression2 := OP? term numexpression2
			if (parent.getChild(1).getClass() == LL1XccParser.TermContext.class) {
				herdado(parent.getChild(2), sintetizado(parent.getChild(1)));
				herdado2(parent.getChild(2), sintetizado2(parent.getChild(1)));
			}
		} else
		// exps := term numexpression2
		if (parent.getClass() == LL1XccParser.ExpsContext.class) {
			herdado(parent.getChild(1), sintetizado(parent.getChild(0)));
			herdado2(parent.getChild(1), sintetizado2(parent.getChild(0)));
		}
	}
	@Override public void exitTerm1(LL1XccParser.Term1Context ctx) {
		this.arvore += "term1 ";
		
		// term1 := OP? unaryexpr term1
		if (ctx.getChildCount() > 0) {
			if (ctx.getChild(1).getClass() == LL1XccParser.UnaryexprContext.class) {
				sintetizado2(ctx, this.letraDoAlfabeto() );
				
				String operacao;
				operacao = "";
				
				// term1 := OPVEZES unaryexpr term1
				if (ctx.OPVEZES() != null) {
					sintetizado(ctx, ((String)herdado(ctx)) + "*" + ((String) sintetizado(ctx.getChild(2))) );
					
					operacao += "*";
				} else 
				// term1 := OPDIV unaryexpr term1
				if (ctx.OPDIV() != null) {
					sintetizado(ctx, ((String)herdado(ctx)) + "/" + ((String) sintetizado(ctx.getChild(2))) );
					
					operacao += "/";
				} else 
				// term1 := OPMOD unaryexpr term1
				if (ctx.OPMOD() != null) {
					sintetizado(ctx, ((String)herdado(ctx)) + "%" + ((String) sintetizado(ctx.getChild(2))) );
					
					operacao += "%";
				}
				
				this.codigo += sintetizado2(ctx) + " = ";
				this.codigo += herdado2(ctx);
				this.codigo += operacao;
				this.codigo += sintetizado2(ctx.getChild(2));
				this.codigo += "\n";
			}
		// term1 := epsilon
		} else {
			sintetizado(ctx, herdado(ctx));
			sintetizado2(ctx, herdado2(ctx));
		}
	}
	@Override public void exitUnaryexpr(LL1XccParser.UnaryexprContext ctx) {
		this.arvore += "unaryexpr ";
		
		// unaryexpr := factor
		if (ctx.getChild(0).getClass() == LL1XccParser.FactorContext.class) {
			sintetizado(ctx, sintetizado(ctx.getChild(0)));
			sintetizado2(ctx, sintetizado2(ctx.getChild(0)));
		} else
		if (ctx.getChild(1).getClass() == LL1XccParser.FactorContext.class) {
			// unaryexpr := OPMAIS factor
			if (ctx.OPMAIS() != null) {
				sintetizado(ctx, sintetizado(ctx.getChild(1)));
				sintetizado2(ctx, sintetizado2(ctx.getChild(1)));
			} else
			// unaryexpr := OPMENOS factor
			if (ctx.OPMENOS() != null) {
				sintetizado(ctx, (("-") + sintetizado(ctx.getChild(1)) ));
				
				sintetizado2(ctx, this.letraDoAlfabeto());
				this.codigo += sintetizado2(ctx)+" = (-1)*" + sintetizado2(ctx.getChild(1))+ "\n";
			}
		}
		
		// Heranca de irmaos
		
		ParseTree parent;
		parent = ctx.getParent();
		
		// term := unaryexpr term1
		if (parent.getChild(0).getClass() == LL1XccParser.UnaryexprContext.class) {
			herdado(parent.getChild(1), sintetizado(parent.getChild(0)));
			herdado2(parent.getChild(1), sintetizado2(parent.getChild(0)));
		} else
		// term1 := OP? unaryexpr term1
		if (parent.getChild(1).getClass() == LL1XccParser.UnaryexprContext.class) {
			herdado(parent.getChild(2), sintetizado(parent.getChild(1)));
			herdado2(parent.getChild(2), sintetizado2(parent.getChild(1)));
		}
	}
	@Override public void exitFactor(LL1XccParser.FactorContext ctx) {
		this.arvore += "factor ";
		
		// factor := lvalue
		if (ctx.getChild(0).getClass() == LL1XccParser.LvalueContext.class) {
			sintetizado(ctx, sintetizado(ctx.getChild(0)));
			sintetizado2(ctx, sintetizado2(ctx.getChild(0)));
		} else
		// factor := INTCONSTANT
		if (ctx.INTCONSTANT() != null) {
			sintetizado(ctx, ctx.INTCONSTANT().getText());
			sintetizado2(ctx, sintetizado(ctx));
		} else
		// factor := STRINGCONSTANT
		if (ctx.STRINGCONSTANT() != null) {
			sintetizado(ctx, ctx.STRINGCONSTANT().getText());
			sintetizado2(ctx, sintetizado(ctx));
		} else
		// factor := NULL
		if (ctx.NULL() != null) {
			sintetizado(ctx, ctx.NULL().getText());
			sintetizado2(ctx, sintetizado(ctx));
		} else
		// factor := ABRPAR numexpression FECHPAR
		if (ctx.ABRPAR() != null) {
			sintetizado(ctx, sintetizado(ctx.getChild(1)));
			sintetizado2(ctx, sintetizado2(ctx.getChild(1)));
		}
	}
	@Override public void exitNumexpression2(LL1XccParser.Numexpression2Context ctx) {
		this.arvore += "numexpression2 ";
		
		if (ctx.getChildCount() > 0) {
			sintetizado2(ctx, this.letraDoAlfabeto());
			
			String operacao;
			operacao = "";
			
			// numexpression2 := OPMAIS term numexpression2
			if (ctx.OPMAIS() != null) {
				sintetizado(ctx, herdado(ctx) + "+" + sintetizado(ctx.getChild(2)) );
				operacao += "+";
			} else
			// numexpression2 := OPMENOS term numexpression2
			if (ctx.OPMENOS() != null) {
				sintetizado(ctx, herdado(ctx) + "-" + sintetizado(ctx.getChild(2)) );
				operacao += "-";
			}
			
			this.codigo += sintetizado2(ctx);
			this.codigo += " = ";
			this.codigo += herdado2(ctx) + operacao + sintetizado2(ctx.getChild(2))+"\n";
		// numexpression2 := epsilon
		} else {
			sintetizado(ctx, herdado(ctx));
			sintetizado2(ctx, herdado2(ctx));
		}
	}
	
	@Override public void exitLvalue(LL1XccParser.LvalueContext ctx) {
		this.arvore += "lvalue ";
		
		// lvalue := IDENT lvalue2
		if (ctx.IDENT() != null) {
			sintetizado(ctx, ctx.IDENT().getText()+ sintetizado(ctx.getChild(1)));
			sintetizado2(ctx, sintetizado(ctx));
		}
	}
	@Override public void exitLvalue2(LL1XccParser.Lvalue2Context ctx) {
		this.arvore += "lvalue2 ";
		
		// lvalue2 := ABRCOL INTCONSTANT FECHCOL lvalue2
		if (ctx.ABRCOL() != null) {
			sintetizado(ctx, "["+ctx.INTCONSTANT().getText()+"]"+sintetizado(ctx.getChild(3)));
		// lvalue2 := epsilon
		} else {
			sintetizado(ctx, "");
		}
	}
	
	/* 	-------------------------------------------
	 *	-------------------------------------------
	 *	--------- DECLARACAO DE VARIAVEIS ---------
	 * 	-------------------------------------------
	 * 	-------------------------------------------
	 */
	@Override public void exitDec(LL1XccParser.DecContext ctx) {
		//this.arvore += "dec \n";
		
		// dec := intstringident IDENT cols vardecl1
		if (ctx.getChild(0).getClass() == LL1XccParser.IntstringidentContext.class) {
			this.codigo += sintetizado(ctx.getChild(2))+ " "+ctx.IDENT().getText()+"\n";
		}
	}
	@Override public void enterCols(LL1XccParser.ColsContext ctx) {
		// cols := ABRCOL INTCONSTANT FECHCOL cols
		if (ctx.ABRCOL() != null) {
			herdado(ctx.getChild(3), ((Integer)herdado(ctx)) * Integer.parseInt(ctx.INTCONSTANT().getText()) );
		// cols := epsilon
		} else {
			sintetizado(ctx, herdado(ctx));
		}
	}
	@Override public void exitCols(LL1XccParser.ColsContext ctx) {
		//this.arvore += "cols ";
		
		// cols := ABRCOL INTCONSTANT FECHCOL cols
		if (ctx.ABRCOL() != null) {
			sintetizado(ctx, sintetizado(ctx.getChild(3)));
		// cols := epsilon
		} else {
			sintetizado(ctx, herdado(ctx));
		}
	}
	@Override public void enterVardecl1(LL1XccParser.Vardecl1Context ctx) {
		// vardecl1 := VIRG IDENT cols vardecl1
		if (ctx.VIRG() != null) {
			herdado(ctx.getChild(2), herdado(ctx));
			herdado(ctx.getChild(3), herdado(ctx));
		// vardecl1 := epsilon
		} else {
			sintetizado(ctx, herdado(ctx));
		}
	}
	@Override public void exitVardecl1(LL1XccParser.Vardecl1Context ctx) {
		//this.arvore += "vardecl1 ";
		
		// vardecl1 := VIRG IDENT cols vardecl1
		if (ctx.VIRG() != null) {
			this.codigo += sintetizado(ctx.getChild(2))+ " "+ctx.IDENT().getText()+"\n";
		}
	}
	@Override public void exitIntstringident(LL1XccParser.IntstringidentContext ctx) {
		//this.arvore += "intstringident ";
		
		// intstringident := INT
		if (ctx.INT() != null) {
			sintetizado(ctx, INT_SIZE);
		} else
		// intstringident := STRING
		if (ctx.STRING() != null) {
			sintetizado(ctx, STRING_SIZE);
		}
		
		ParseTree parent;
		parent = ctx.getParent();
		
		// dec := intstringident IDENT cols vardecl1
		if (parent.getChild(2).getClass() == LL1XccParser.ColsContext.class) {
			herdado(parent.getChild(2), sintetizado(ctx));
			herdado(parent.getChild(3), sintetizado(ctx));
		}
	}
}
