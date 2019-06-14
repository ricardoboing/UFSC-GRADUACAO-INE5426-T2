import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Semantico extends LL1XccBaseListener {
	private TabelaDeSimbolo tabelaDeSimbolo;
	private ParseTreeProperty<Object> treeValores;
	private ParseTreeProperty<String> treeTipos;
	
	public Semantico(TabelaDeSimbolo tabelaDeSimbolo) {
		super();
		this.tabelaDeSimbolo = tabelaDeSimbolo;
		this.treeValores = new ParseTreeProperty<Object>();
		this.treeTipos = new ParseTreeProperty<String>();
	}
	
	@Override public void enterProgram(LL1XccParser.ProgramContext ctx) {
		//System.out.println("P : "+ctx.getText());
	}
	@Override public void enterProgram2(LL1XccParser.Program2Context ctx) {
		//System.out.println("P2: "+ctx.getText());
	}
	@Override public void enterDec(LL1XccParser.DecContext ctx) {
		
	}
	@Override public void enterVardecl(LL1XccParser.VardeclContext ctx) {
		ParseTree naoTerminalFirst;
		naoTerminalFirst = ctx.getChild(0);
		
		// Primeiro naoTerminal da producao == intstringident
		if (naoTerminalFirst.getClass() == LL1XccParser.IntstringidentContext.class) {
			LL1XccParser.IntstringidentContext intStringIdent;
			intStringIdent = (LL1XccParser.IntstringidentContext)naoTerminalFirst;
			
			Lexema identificador;
			identificador = this.tabelaDeSimbolo.getLexema(ctx.IDENT().getText());
			
			// Erro semantico: redeclaracao de identificador
			if (!identificador.getTipo().equals("")) {
				TabelaDeErroSemantico.redeclaracaoDeIdentificador(ctx.IDENT().getSymbol());
				return;
			}
			
			// INT
			if (intStringIdent.INT() != null) {
				identificador.setTipo("int");
			}
			// STRING
			else if (intStringIdent.STRING() != null) {
				identificador.setTipo("string");
			}
			else if (intStringIdent.IDENT() != null) {
				Token tokenIdentificador;
				tokenIdentificador = intStringIdent.IDENT().getSymbol();
				
				Lexema lexemaIdentificador;
				lexemaIdentificador = this.tabelaDeSimbolo.getLexema(tokenIdentificador.getText());
				
				// Erro semantico: identificador de tipo nao declarado
				if (lexemaIdentificador.getTipo().equals("")) {
					TabelaDeErroSemantico.identificadorNaoDeclarado(tokenIdentificador);
				}
				
				identificador.setTipo(intStringIdent.IDENT().getText());
			}
		}
	}
	@Override public void enterIntstringident(LL1XccParser.IntstringidentContext ctx) {
		//System.out.println("enterIntstringident: ");
		//System.out.println(" enterIntstringident: "+ctx.INT());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override public void enterExpression(LL1XccParser.ExpressionContext ctx) {}
	
	
	
	
	@Override public void enterTerm(LL1XccParser.TermContext ctx) {}
	@Override public void exitTerm(LL1XccParser.TermContext ctx) {
		if (this.treeValores.get(ctx) != null) {
			System.out.println(this.treeValores.get(ctx));
			System.out.println(this.treeTipos.get(ctx));
		}
		this.treeValores.put(ctx.getParent(), this.treeValores.get(ctx));
		this.treeTipos.put(ctx.getParent(), this.treeTipos.get(ctx));
	}
	
	@Override public void enterTerm1(LL1XccParser.Term1Context ctx) {}
	@Override public void exitTerm1(LL1XccParser.Term1Context ctx) {
		Object valorTerm, valorTerm1;
		valorTerm = this.treeValores.get(ctx.getParent());
		valorTerm1 = this.treeValores.get(ctx);
		
		String tipoTerm, tipoTerm1;
		tipoTerm = this.treeTipos.get(ctx.getParent());
		tipoTerm1 = this.treeTipos.get(ctx);
		
		// Producao term1 := epsilon
		if (ctx.OPVEZES() == null && ctx.OPDIV() == null && ctx.OPMOD() == null) {
			return;
		}
		
		// Erro semantico
		if (!tipoTerm.equals(tipoTerm1)) {
			Token tokenOperacao;
			if (ctx.OPVEZES() != null) {
				tokenOperacao = ctx.OPVEZES().getSymbol();
			}
			else if (ctx.OPDIV() != null) {
				tokenOperacao = ctx.OPDIV().getSymbol();
			}
			else {
				tokenOperacao = ctx.OPMOD().getSymbol();
			}
			
			TabelaDeErroSemantico.operacaoComTiposIncompativeis(tokenOperacao, tipoTerm, tipoTerm1);
			
			this.treeValores.removeFrom(ctx.getParent());
			this.treeTipos.removeFrom(ctx.getParent());
			
			return;
		}
		// Erro semantico
		if (tipoTerm.equals("string")) {
			Token tokenOperacao;
			if (ctx.OPVEZES() != null) {
				tokenOperacao = ctx.OPVEZES().getSymbol();
			}
			else if (ctx.OPDIV() != null) {
				tokenOperacao = ctx.OPDIV().getSymbol();
			}
			else {
				tokenOperacao = ctx.OPMOD().getSymbol();
			}
			
			this.treeValores.removeFrom(ctx.getParent());
			this.treeTipos.removeFrom(ctx.getParent());
			
			TabelaDeErroSemantico.operacaoIndefinidaParaOTipo(tokenOperacao, tipoTerm);
			return;
		}
		// Calcula valor int de acordo com a operacao especificada
		if (tipoTerm.equals("int")) {
			Integer valorTermInteger, valorUnaryInteger;
			valorTermInteger = (Integer) valorTerm;
			valorUnaryInteger = (Integer) valorTerm1;
			
			// MULTIPLICACAO
			if (ctx.OPVEZES() != null) {
				valorTerm1 = valorTermInteger * valorUnaryInteger;
			}
			// DIVISAO
			else if (ctx.OPDIV() != null) {
				valorTerm1 = valorTermInteger / valorUnaryInteger;
			}
			// MOD
			else {
				valorTerm1 = valorTermInteger % valorUnaryInteger;
			}
			
			this.treeValores.put(ctx.getParent(), valorTerm1);
			return;
		}
		
	}
	
	@Override public void enterUnaryexpr(LL1XccParser.UnaryexprContext ctx) {}
	@Override public void exitUnaryexpr(LL1XccParser.UnaryexprContext ctx) {
		if (ctx.getChild(0).getClass() == LL1XccParser.FactorContext.class) {
			this.treeValores.put(ctx.getParent(), this.treeValores.get(ctx));
			this.treeTipos.put(ctx.getParent(), this.treeTipos.get(ctx));
		}
	}
	
	@Override public void enterFactor(LL1XccParser.FactorContext ctx) {
		if (ctx.INTCONSTANT() != null) {
			Integer valor;
			valor = Integer.parseInt(ctx.INTCONSTANT().getSymbol().getText());
			
			this.treeValores.put(ctx, valor);
			this.treeTipos.put(ctx, "int");
			return;
		}
		if (ctx.STRINGCONSTANT() != null) {
			String valor;
			valor = ctx.STRINGCONSTANT().getSymbol().getText();
			
			this.treeValores.put(ctx, valor);
			this.treeTipos.put(ctx, "string");
			return;
		}
	}
	@Override public void exitFactor(LL1XccParser.FactorContext ctx) {
		this.treeValores.put(ctx.getParent(), this.treeValores.get(ctx));
		this.treeTipos.put(ctx.getParent(), this.treeTipos.get(ctx));
	}
	
	@Override public void enterStatement(LL1XccParser.StatementContext ctx) {
		//System.out.println("enterStantement: "+ctx.IDENT());
	}
	
	
	
	
	
	
	/*
	@Override public void enterTerm(LL1XccParser.TermContext ctx) {
		System.out.println("enterTerm");
		
		ParseTree naoTerminalFirst;
		naoTerminalFirst = ctx.getChild(0);
		
		// term := unaryexpr term1
		if (naoTerminalFirst.getClass() == LL1XccParser.UnaryexprContext.class) {
			LL1XccParser.FactorContext naoTerminalFactor;
			naoTerminalFactor = (LL1XccParser.FactorContext) naoTerminalFirst.getChild(0);
			
			// factor := INTCONSTANT
			if (naoTerminalFactor.INTCONSTANT() != null) {
				System.out.println(";"+naoTerminalFactor.INTCONSTANT());
				
				Integer integerIntConstant;
				integerIntConstant = Integer.parseInt(naoTerminalFactor.INTCONSTANT().getText());
				
				this.expressions.put(ctx, naoTerminalFactor.INTCONSTANT());
			}
		}
	}*/
}
