_ANTLR = antlr-4.7.2-complete.jar
_FILES = *.java
_XCC = java xcc

compiler: create run

run:
	@echo "xcc run $(FILE)"
	@$(_XCC) $(FILE)

create:
	@echo "Gerando compilador xcc..."
	@java -jar $(_ANTLR) Xcc.g4
	@javac -classpath $(_ANTLR) $(_FILES)
	@rm Xcc*.java
	@rm *.tokens
	@rm *.interp
	@touch Xcc_Tabela_De_Simbolos.txt
	@touch Xcc_Lista_De_Tokens.txt
	@echo "Sucesso!"

create_teste:
	@echo "Gerando compilador xcc..."
	@java -jar $(_ANTLR) Xcc.g4
	@javac -classpath $(_ANTLR) $(_FILES)
	@rm *.tokens
	@rm *.class
	@rm *.interp
	@echo "Sucesso!"

clean:
	@rm *.class
	@rm Xcc*.txt
	@echo "Sucesso!"