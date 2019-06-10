/**
 * Definicao da gramatica xpp
 */ 
grammar Xcc;

// producoes para o analisador sintático (parser):
program 		: classlist
				| /* epsilon */;

classlist 		: classdecl classlist2;

classlist2 		: classlist
				| /* epsilon */;

classdecl 		: CLASS IDENT classbody
				| CLASS IDENT EXTENDS IDENT classbody;

classbody 		: ABRCHAVE classbody1 classbody2 classbody3 FECHCHAVE
				| ABRCHAVE classlist classbody1 classbody2 classbody3 FECHCHAVE; 

classbody1 		: vardecl PTVIR classbody1
				| /* epsilon */; 

classbody2		: constructdecl classbody2
				| /* epsilon */;

classbody3 		: methoddecl classbody3
				| /* epsilon */;

vardecl 		: intstringident IDENT cols vardeclaux;

intstringident 	: INT
				| STRING
				| IDENT;

cols 			: ABRCOL FECHCOL cols
				| /* epsilon */;

vardeclaux 		: VIRG IDENT cols vardeclaux
				| /* epsilon */; 

constructdecl 	: CONSTRUCTOR methodbody;
methoddecl 		: intstringident cols IDENT methodbody;
methodbody 		: ABRPAR paramlist FECHPAR statement;

paramlist 		: intstringident IDENT cols paramlistaux
				| /* epsilon */;

paramlistaux 	: VIRG intstringident IDENT cols paramlistaux
				| /* epsilon */;

statement 		: intstring IDENT cols virgidentcols PTVIR
				| IDENT statement2
				| readstat PTVIR
				| returnstat PTVIR
				| ifstat
				| forstat PTVIR
				| ABRCHAVE statlist FECHCHAVE
				| BREAK PTVIR
				| PTVIR;

intstring 		: INT
				| STRING;

virgidentcols 	: VIRG IDENT cols virgidentcols
				| /* epsilon */;

statement2 		: IDENT cols virgidentcols PTVIR
				| statement3 ATR expralocexpr PTVIR;

statement3		: ABRCOL expression FECHCOL statement3
				| PONTO IDENT ABRPAR arglist FECHPAR statement3
				| PONTO IDENT statement3
				| /* epsilon */;

expralocexpr	: expression
				| alocexpression;

atribstat 		: lvalue ATR expralocexpr;
printstat 		: PRINT expression;
readstat 		: READ lvalue;

returnstat 		: RETURN
				| RETURN expression;

superstat 		: SUPER ABRPAR arglist FECHPAR;

ifstat 			: IF ABRPAR expression FECHPAR THEN statement
				| IF ABRPAR expression FECHPAR THEN statement ELSE statement;

forstat 		: FOR ABRPAR forstataux PTVIR PTVIR forstataux FECHPAR statement
				| FOR ABRPAR forstataux PTVIR expression PTVIR forstataux FECHPAR statement;

forstataux 		: atribstat
				| /* epsilon */;

statlist 		: statement
				| statement statlist;

lvalue 			: IDENT lvalue2;

lvalue2 		: ABRCOL expression FECHCOL
				| PONTO IDENT
				| PONTO IDENT ABRPAR arglist FECHPAR lvalue2
				| /* epsilon */;

alocexpression 	: NEW IDENT ABRPAR arglist FECHPAR
				| NEW intstringident alocexpression2;

alocexpression2 : ABRCOL expression FECHCOL alocexpression2
				| ABRCOL expression FECHCOL;

expression 		: numexpression
				| numexpression expression2 numexpression;

expression2 	: MENOR
				| MAIOR
				| MENORIG
				| MAIORIG
				| IGUAL
				| DIFER;

numexpression 	: term numexpression2;

numexpression2 	: OPMAIS term numexpression2
				| OPMENOS term numexpression2
				| /* epsilon */;

term 			: unaryexpr termaux;

termaux 		: OPVEZES unaryexpr termaux
				| OPDIV unaryexpr termaux
				| OPMOD unaryexpr termaux
				| /* epsilon */;

unaryexpr 		: OPMAIS factor
				| OPMENOS factor
				| factor;

factor 			: INTCONSTANT
				| STRINGCONSTANT
				| NULL
				| lvalue
				| ABRPAR expression FECHPAR;

arglist 		: expression arglistaux
				| /* epsilon */;

arglistaux 		: VIRG expression arglistaux
				| /* epsilon */;



















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
