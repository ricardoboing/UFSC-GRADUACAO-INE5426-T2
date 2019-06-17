/**
 * Definicao da gramatica xpp
 */ 
grammar LL1Xcc;

// producoes para o analisador sintático (parser):
program 		: classlist
				| /* epsilon */;

classlist 		: classlist2;

classlist2		: IDENT ATR exps PTVIR classlist2
				| dec PTVIR classlist2
				| /* epsilon */;

dec 			: intstringident IDENT cols vardecl1;

intstringident 	: INT
				| STRING
				| IDENT;

cols 			: ABRCOL INTCONSTANT FECHCOL cols
				| /* epsilon */;

vardecl1 		: VIRG IDENT cols vardecl1
				| /* epsilon */;

lvalue 			: IDENT lvalue2;

lvalue2 		: ABRCOL INTCONSTANT FECHCOL lvalue2
				| /* epsilon */;

exps 			: term numexpression2;

numexpression2 	: OPMAIS term numexpression2
				| OPMENOS term numexpression2
				| /* epsilon */;

numexpression 	: exps;

term 			: unaryexpr term1;

term1 			: OPVEZES unaryexpr term1
				| OPDIV unaryexpr term1
				| OPMOD unaryexpr term1
				| /* epsilon */;

unaryexpr 		: OPMAIS factor
				| OPMENOS factor
				| factor;

factor 			: INTCONSTANT
				| STRINGCONSTANT
				| NULL
				| lvalue
				| ABRPAR exps FECHPAR;
















// regras do analisador léxico, no formato TOKEN : lexema;
CLASS			: 'class';
EXTENDS 		: 'extends';
ABRCHAVE 		: '{';
PTVIR 			: ';';
FECHCHAVE 		: '}';
INT 			: 'int';
STRING 			: 'string';
ABRCOL 			: '[';
FECHCOL 		: ']';
VIRG 			: ',';
CONSTRUCTOR 	: 'constructor';
ABRPAR 			: '(';
FECHPAR			: ')';
BREAK 			: 'break';
ATR 			: '=';
PRINT 			: 'print';
READ 			: 'read';
RETURN 			: 'return';
SUPER 			: 'super';
IF 				: 'if';
ELSE 			: 'else';
FOR 			: 'for';
PONTO 			: '.';
NEW 			: 'new';
MENOR 			: '<';
MAIOR 			: '>';
MENORIG 		: '<=';
MAIORIG 		: '>=';
IGUAL 			: '==';
DIFER 			: '!=';
OPMAIS 			: '+';
OPMENOS 		: '-';
OPVEZES 		: '*';
OPDIV 			: '/';
OPMOD 			: '%';
NULL 			: 'null';
THEN			: 'then';

// fragmentos sao usados para formar regras de algum token, mas nao sao considerados tokens per se.
fragment LOWERCASE: [a-z];
fragment UPPERCASE: [A-Z];
fragment DIGIT: [0-9];
fragment ESPECIAL:
(
':'
| '|'
| ';'
| '+'
| '-'
| '?'
| ' '
| '_'
| '['
| ']'
| '('
| ')'
| '{'
| '}'
| '.'
| '<'
| '>'
| '/'
| '*'
| '@'
| '#'
| '$'
| '%'
| '^'
| '&'
| '~'
| ','
| [\u0060]
| [\u005C]
| [\u00C0-\u00C5]
| [\u00C7-\u00CF]
| [\u00D1-\u00D6]
| [\u00D9-\u00DC]
| [\u00E0-\u00E4]
| [\u00E7-\u00EF]
| [\u00F2-\u00F6]
| [\u00F9-\u00FC]
);

INTCONSTANT : (DIGIT)+;
STRINGCONSTANT : ["](LOWERCASE | UPPERCASE | DIGIT | ESPECIAL)*["];

// ANTLR4 resolve a ambiguidade ao usar a primeira declaracao, por isso declaramos os tokens das palavras reservadas antes do token do IDENT:
IDENT : [A-Za-z_][A-Za-z_0-9]*;

// desconsideramos espacos em branco, 'tabs' e quebras de linha; para o analisador lexico:
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
