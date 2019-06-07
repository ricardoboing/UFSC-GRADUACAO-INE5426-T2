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
	@echo "Sucesso!"
	@rm Xcc*.java
	@rm *.tokens
	@rm *.interp

create_teste:
	@echo "Gerando compilador xcc..."
	@java -jar $(_ANTLR) Xcc.g4
	@javac -classpath $(_ANTLR) $(_FILES)
	@echo "Sucesso!"
	@rm *.tokens
	@rm *.class
	@rm *.interp

clean:
	@rm *.class