import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class xcc {
	public static void main(String[] args) throws IOException {
		String diretorio, nomeDoArquivo;
		diretorio = Paths.get("").toAbsolutePath().toString()+"/";
		nomeDoArquivo = "fonte.xpp";//args[0];
		
		CharStream input;
		input = CharStreams.fromFileName(diretorio+nomeDoArquivo);
		
		LL1XccLexer lexer;
		lexer = new LL1XccLexer(input);
		
		CommonTokenStream tokens;
		tokens = new CommonTokenStream(lexer);
		tokens.getNumberOfOnChannelTokens(); // Gambiarra pra gerar os tokens (bug do antlr???)
				
		Vocabulary vocabularioAntlr;
		vocabularioAntlr = lexer.getVocabulary();
		
		LL1XccParser parser;
		parser = new LL1XccParser(tokens);
		
		List<Token> listaDeTokens;
		listaDeTokens = tokens.getTokens();
		
		TabelaDeSimbolo tabelaDeSimbolo;
		tabelaDeSimbolo = new TabelaDeSimbolo(vocabularioAntlr, listaDeTokens);
		
		ParseTree arvore;
		arvore = parser.program();
		
		Semantico semantico;
		semantico = new Semantico(tabelaDeSimbolo);
		
		// Realiza a analise semantica
		ParseTreeWalker walker;
		walker = new ParseTreeWalker();
		walker.walk(semantico, arvore);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		FileWriter arquivoListaDeToken, arquivoTabelaDeSimbolo;
		try {
			arquivoListaDeToken = new FileWriter(new File(diretorio+"Xcc_Lista_De_Tokens.txt"));
			arquivoTabelaDeSimbolo = new FileWriter(new File(diretorio+"Xcc_Tabela_De_Simbolos.txt"));
			
			//System.out.println("-------------------- LISTA DE TOKENS --------------------");
			for (int c = 0; c < listaDeTokens.size(); c++) {
				Token token = listaDeTokens.get(c);
				
				if (token.getText() != "<EOF>") {
					String nomeDoToken;
					nomeDoToken = vocabularioAntlr.getSymbolicName(token.getType());
					
					arquivoListaDeToken.write(nomeDoToken+"\n");
				}
			}
			System.out.println("");
			
			//tabelaDeSimbolo.setTipoDoLexema("ano", ELexema.INT);
			//tabelaDeSimbolo.setTipoDoLexema("data", ELexema.INT);
			//tabelaDeSimbolo.setTipoDoLexema("mes", ELexema.INT);
			//tabelaDeSimbolo.setTipoDoLexema("bintree", ELexema.STRING);
			
			String tabelaDeSimboloToString;
			tabelaDeSimboloToString = tabelaDeSimbolo.getToString();
			arquivoTabelaDeSimbolo.write(tabelaDeSimboloToString);
			System.out.println("-------------------- TABELA DE SIMBOLOS --------------------");
			System.out.println(tabelaDeSimboloToString);
			
			arquivoListaDeToken.close();
			arquivoTabelaDeSimbolo.close();
			
		} catch (IOException e) {
			System.out.println("catch IOException");
		} catch (Exception e) {
			System.out.println("catch Exception: ");
			e.printStackTrace();
		}
		//System.out.println("Update file ListaDeToken.txt");
		//System.out.println("Update file TabelaDeSimbolos.txt");
	}
}
