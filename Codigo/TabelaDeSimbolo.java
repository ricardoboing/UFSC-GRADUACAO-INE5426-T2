
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;

public class TabelaDeSimbolo {
	private Vocabulary vocabularioAntlr;
	
	private HashMap<String, TokenLexico> conjuntoDeToken;
	private HashMap<String, TokenLexico> conjuntoDeTokenPorLexema;
	
	public TabelaDeSimbolo(Vocabulary vocabularioAntlr, List<Token> listaDeTokens) {
		this.conjuntoDeToken = new HashMap<String, TokenLexico>();
		this.conjuntoDeTokenPorLexema = new HashMap<String, TokenLexico>();
		
		this.vocabularioAntlr = vocabularioAntlr;
		
		this.setListaDeTokens(listaDeTokens);
	}
	private void setListaDeTokens(List<Token> listaDeTokens) {
		for (int c = 0; c < listaDeTokens.size(); c++) {
			Token token = listaDeTokens.get(c);
			
			if (token.getText() != "<EOF>") {
				this.addLexema(token);
			}
		}
	}
	
	public void setTipoDoLexema(String nomeDoLexema, String tipoDoLexema) {
		Lexema lexema = this.getLexema(nomeDoLexema);
		lexema.setTipo(tipoDoLexema);
	}
	public void addLexema(Token tokenAntlr) {
		String nomeDoToken, nomeDoLexema;
		nomeDoLexema = tokenAntlr.getText();
		nomeDoToken = this.vocabularioAntlr.getSymbolicName(tokenAntlr.getType());
		
		TokenLexico tokenLexico;
		tokenLexico = this.conjuntoDeToken.get(nomeDoToken);
		
		if (tokenLexico == null) {
			tokenLexico = new TokenLexico(nomeDoToken);
			this.conjuntoDeToken.put(nomeDoToken, tokenLexico);
		}
		
		tokenLexico.addLexema(tokenAntlr);
		this.conjuntoDeTokenPorLexema.put(nomeDoLexema, tokenLexico);
	}
	
	public TokenLexico getToken(String nomeDoToken) {
		return this.conjuntoDeToken.get(nomeDoToken);
	}
	public TokenLexico getToken(Lexema lexema) {
		String nomeDoLexema;
		nomeDoLexema = lexema.getNome();
		
		return this.conjuntoDeTokenPorLexema.get(nomeDoLexema);
	}
	public Lexema getLexema(String nomeDoLexema) {
		return this.conjuntoDeTokenPorLexema.get(nomeDoLexema).getLexema(nomeDoLexema);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getToString() {
		int lengthDoMaiorToken, lengthDoMaiorLexema, lengthDoMaiorTipoDoLexema;
		lengthDoMaiorToken = 0;
		lengthDoMaiorLexema = 0;
		lengthDoMaiorTipoDoLexema = 0;
		
		String nomeDoToken, nomeDoLexema, tipoDoLexema;
		
		Iterator<TokenLexico> iteratorDoConjuntoDeToken;
		iteratorDoConjuntoDeToken = this.getIterator();
		
		while (iteratorDoConjuntoDeToken.hasNext()) {
			TokenLexico tokenLexico;
			tokenLexico = iteratorDoConjuntoDeToken.next();
			nomeDoToken = tokenLexico.getNome();
			
			if (nomeDoToken.length() > lengthDoMaiorToken) {
				lengthDoMaiorToken = nomeDoToken.length();
			}
			
			Iterator<Lexema> iteratorDoConjuntoDeLexema;
			iteratorDoConjuntoDeLexema = tokenLexico.getIterator();
			
			while (iteratorDoConjuntoDeLexema.hasNext()) {
				Lexema lexema;
				lexema = iteratorDoConjuntoDeLexema.next();
				nomeDoLexema = lexema.getNome();
				tipoDoLexema = lexema.getTipo();
				
				if (nomeDoLexema.length() > lengthDoMaiorLexema) {
					lengthDoMaiorLexema = nomeDoLexema.length();
				}
				
				if (tipoDoLexema.length() > lengthDoMaiorTipoDoLexema) {
					lengthDoMaiorTipoDoLexema = tipoDoLexema.length();
				}
			}
		}
		
		iteratorDoConjuntoDeToken = this.getIterator();
		
		nomeDoToken = "TOKENS";
		nomeDoLexema = "LEXEMAS";
		tipoDoLexema = "TIPO";
		
		if (nomeDoToken.length() > lengthDoMaiorToken) {
			lengthDoMaiorToken = nomeDoToken.length();
		}
		if (nomeDoLexema.length() > lengthDoMaiorLexema) {
			lengthDoMaiorLexema = nomeDoLexema.length();
		}
		if (tipoDoLexema.length() > lengthDoMaiorTipoDoLexema) {
			lengthDoMaiorTipoDoLexema = tipoDoLexema.length();
		}
		
		String espacoVazioToken, espacoVazioLexema, espacoVazioTipoDoLexema;
		espacoVazioLexema = "";
		espacoVazioToken = "";
		espacoVazioTipoDoLexema = "";
		
		for (int c = 0; c < lengthDoMaiorLexema; c++) {
			espacoVazioLexema += " ";
		}
		for (int c = 0; c < lengthDoMaiorToken; c++) {
			espacoVazioToken += " ";
		}
		for (int c = 0; c < lengthDoMaiorTipoDoLexema; c++) {
			espacoVazioTipoDoLexema += " ";
		}
		
		String print;
		print = nomeDoToken;
		print += espacoVazioToken.substring(nomeDoToken.length());
		print += " | ";
		print += nomeDoLexema;
		print += espacoVazioLexema.substring(nomeDoLexema.length());
		print += " | ";
		print += tipoDoLexema;
		print += espacoVazioTipoDoLexema.substring(tipoDoLexema.length());
		print += " | ";
		print += "OCORRENCIAS (linha:coluna)";
		print += "\n";
		
		while (iteratorDoConjuntoDeToken.hasNext()) {
			TokenLexico tokenLexico;
			tokenLexico = iteratorDoConjuntoDeToken.next();
			nomeDoToken = tokenLexico.getNome();
			
			Iterator<Lexema> iteratorDoConjuntoDeLexema;
			iteratorDoConjuntoDeLexema = tokenLexico.getIterator();
			
			while (iteratorDoConjuntoDeLexema.hasNext()) {
				Lexema lexema;
				lexema = iteratorDoConjuntoDeLexema.next();
				nomeDoLexema = lexema.getNome();
				tipoDoLexema = lexema.getTipo();
				
				Iterator<OcorrenciaLexema> iteratorDoConjuntoDeOcorrencia;
				iteratorDoConjuntoDeOcorrencia = lexema.getIterator();
				
				while (iteratorDoConjuntoDeOcorrencia.hasNext()) {
					OcorrenciaLexema ocorrenciaDeLexema;
					ocorrenciaDeLexema = iteratorDoConjuntoDeOcorrencia.next();
					
					print += nomeDoToken;
					print += espacoVazioToken.substring(nomeDoToken.length());
					print += " | ";
					print += nomeDoLexema;
					print += espacoVazioLexema.substring(nomeDoLexema.length());
					print += " | ";
					print += tipoDoLexema;
					print += espacoVazioTipoDoLexema.substring(tipoDoLexema.length());
					print += " | ";
					print += ocorrenciaDeLexema.getLinha()+":"+ocorrenciaDeLexema.getColuna();
					print += "\n";
				}
			}
		}
		
		return print;
	}
	
	public Iterator<TokenLexico> getIterator() {
		return this.conjuntoDeToken.values().iterator();
	}
}
