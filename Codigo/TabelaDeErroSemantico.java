import org.antlr.v4.runtime.Token;

public class TabelaDeErroSemantico {
	public static void redeclaracaoDeIdentificador(Token token) {
		String lexema;
		lexema = token.getText();
		
		int lin, col;
		lin = token.getLine();
		col = token.getCharPositionInLine();
		
		System.out.print("Linha "+lin+":"+col);
		System.out.println(" - identificador \""+lexema+"\" ja foi declarado.");
	}
	public static void identificadorNaoDeclarado(Token token) {
		String lexema;
		lexema = token.getText();
		
		int lin, col;
		lin = token.getLine();
		col = token.getCharPositionInLine();
		
		System.out.print("Linha "+lin+":"+col);
		System.out.println(" - identificador \""+lexema+"\" nao foi declarado.");
	}
	public static void operacaoComTiposIncompativeis(Token tokenOperacao, String tipo1, String tipo2) {
		int lin, col;
		lin = tokenOperacao.getLine();
		col = tokenOperacao.getCharPositionInLine();
		
		System.out.print("Linha "+lin+":"+col);
		System.out.println(" - \""+tipo1+"\" e \""+tipo2+"\" incompativeis para "+tokenOperacao.getText()+".");
	}
	public static void operacaoIndefinidaParaOTipo(Token tokenOperacao, String tipo) {
		int lin, col;
		lin = tokenOperacao.getLine();
		col = tokenOperacao.getCharPositionInLine();
		
		System.out.print("Linha "+lin+":"+col);
		System.out.println(" - "+tokenOperacao.getText()+" nao foi definido para "+tipo+".");
	}
}
