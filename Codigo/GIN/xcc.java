import java.io.IOException;
import java.nio.file.Paths;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class xcc {
	public static void main(String[] args) throws IOException {
		String diretorio, nomeDoArquivo;
		diretorio = Paths.get("").toAbsolutePath().toString()+"/";
		nomeDoArquivo = args[0];
		
		CharStream input;
		input = CharStreams.fromFileName(diretorio+nomeDoArquivo);
		
		LL1XccLexer lexer;
		lexer = new LL1XccLexer(input);
		
		CommonTokenStream tokens;
		tokens = new CommonTokenStream(lexer);
		tokens.getNumberOfOnChannelTokens(); // Gambiarra pra gerar os tokens (bug do antlr???)
		
		LL1XccParser parser;
		parser = new LL1XccParser(tokens);
		
		ParseTree arvore;
		arvore = parser.program();
		
		Semantic semantico;
		semantico = new Semantic();
		
		// Realiza a analise semantica
		ParseTreeWalker walker;
		walker = new ParseTreeWalker();
		walker.walk(semantico, arvore);
	}
}
