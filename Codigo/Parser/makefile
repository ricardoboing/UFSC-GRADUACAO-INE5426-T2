_ANTLR = antlr-4.7.2-complete.jar
_FILES = *.java
_XCC = java xcc

compiler: create

run:
	@echo "xcc run $(FILE)"
	@$(_XCC) $(FILE)

create:
	@echo "Gerando compilador xcc..."
	@java -jar $(_ANTLR) LL1Xcc.g4
	@javac -classpath $(_ANTLR) $(_FILES)
	@rm *.tokens
	@rm *.interp
	@touch Xcc_Tabela_De_Simbolos.txt
	@touch Xcc_Lista_De_Tokens.txt
	@echo "Sucesso!"

clean:
	@rm *.class
	@echo "Sucesso!"