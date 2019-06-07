import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class xcc {
	public static void main(String[] args) throws IOException {
		String diretorio = Paths.get("").toAbsolutePath().toString()+"/";
		String arquivo = args[0];
		
		CharStream input = CharStreams.fromFileName(diretorio+arquivo);

		XccLexer lexer = new XccLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		tokens.getNumberOfOnChannelTokens();
		
		XccParser parser = new XccParser(tokens);

		ParseTree arvore = parser.program();

		

		Vocabulary vocabularioAntlr = lexer.getVocabulary();
		
		List<Token> listTokens = tokens.getTokens();
		FileWriter arquivoListaDeToken, arquivoTabelaDeSimbolo;
		
		
		TabelaDeSimbolo tabelaDeSimbolo;
		tabelaDeSimbolo = new TabelaDeSimbolo(vocabularioAntlr);
		

		try {
			arquivoListaDeToken = new FileWriter(new File(diretorio+"Xcc_Lista_De_Token.txt"));
			arquivoTabelaDeSimbolo = new FileWriter(new File(diretorio+"Xcc_Tabela_De_Simbolo.txt"));
			
			//System.out.println("-------------------- LISTA DE TOKENS --------------------");
			for (int c = 0; c < listTokens.size(); c++) {
				Token token = listTokens.get(c);
				
				if (token.getText() != "<EOF>") {
					String nomeDoToken;
					nomeDoToken = vocabularioAntlr.getSymbolicName(token.getType());
					
					arquivoListaDeToken.write(nomeDoToken+"\n");
					//System.out.println(nomeDoToken);
					
					tabelaDeSimbolo.addLexema(token);
				}
			}
			//System.out.println();
			
			String tabelaDeSimboloToString;
			tabelaDeSimboloToString = tabelaDeSimbolo.getToString();
			
			arquivoTabelaDeSimbolo.write(tabelaDeSimboloToString);
			//System.out.println("-------------------- TABELA DE SIMBOLOS --------------------");
			//System.out.println(tabelaDeSimboloToString);
			
			arquivoListaDeToken.close();
			arquivoTabelaDeSimbolo.close();
			
		} catch (IOException e) {
		} catch (Exception e) {}

		System.out.println("Update file Xcc_Lista_De_Token.txt");
		System.out.println("Update file Xcc_Tabela_De_Simbolos.txt");
	}
}
