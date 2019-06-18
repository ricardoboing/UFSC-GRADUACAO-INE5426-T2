/**
 * Definicao da gramatica xpp
 */ 
grammar LL1Xcc;

// producoes para o analisador sintático (parser):
program 		: classlist
				| /* epsilon */;

classlist 		: classdecl classlist2;

classlist2 		: classlist
				| /* epsilon */;

classdecl 		: CLASS IDENT classdecl2;

classdecl2		: classbody 
				| EXTENDS IDENT classbody;

classbody 		: ABRCHAVE classbody1 classbody2 classbody3 FECHCHAVE
				| ABRCHAVE classlist classbody1 classbody2 classbody3 FECHCHAVE; 

classbody1 		: vardecl PTVIR classbody1
				| /* epsilon */; 

classbody2		: constructdecl classbody2
				| /* epsilon */;

classbody3 		: methoddecl classbody3
				| /* epsilon */;

vardecl 		: intstringident IDENT cols vardecl1;

intstringident 	: INT
				| STRING
				| IDENT;

cols 			: ABRCOL FECHCOL cols
				| /* epsilon */;

vardecl1 		: VIRG IDENT cols vardecl1
				| /* epsilon */;

constructdecl 	: CONSTRUCTOR methodbody;
methoddecl 		: intstringident cols IDENT methodbody;
methodbody 		: ABRPAR paramlist FECHPAR statement;

paramlist 		: intstringident IDENT cols paramlist1
				| /* epsilon */;

paramlist1 	: VIRG intstringident IDENT cols paramlist1
				| /* epsilon */;

statement 		: intstring IDENT cols virgidentcols PTVIR
				| IDENT statement2
				| printstat PTVIR
				| readstat PTVIR
				| returnstat PTVIR
				| ifstat
				| forstat
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

returnstat 		: RETURN returnstat1; 

returnstat1 	: expression
				| /* epsilon */;

superstat 		: SUPER ABRPAR arglist FECHPAR;

ifstat 			: IF ABRPAR expression FECHPAR THEN statement ifstat1;
				
ifstat1			: ELSE statement 
				| /* epsilon */;

forstat 		: FOR ABRPAR forstat1 PTVIR forstat2;

forstat1 		: atribstat
				| /* epsilon */;

forstat2 		: PTVIR forstat1 FECHPAR statement 
				| expression PTVIR forstat1 FECHPAR statement;

statlist 		: statement statlist1;

statlist1 		: statlist 
				| /* epsilon */;

lvalue 			: IDENT lvalue2;

lvalue2 		: ABRCOL expression FECHCOL
				| PONTO IDENT lvalue3
				| /* epsilon */;

lvalue3 		:  ABRPAR arglist FECHPAR lvalue2 
				| /* epsilon */;

alocexpression 	: NEW alocexpression3;

alocexpression2 : ABRCOL expression FECHCOL alocexpression4;

alocexpression3 : IDENT alocexpression5 
				| INT alocexpression2 
				| STRING alocexpression2;

alocexpression4 : alocexpression2 
				| /* epsilon */;

alocexpression5: ABRPAR arglist FECHPAR |alocexpression2;

expression 		: numexpression expresion3;

expression2 	: MENOR
				| MAIOR
				| MENORIG
				| MAIORIG
				| IGUAL
				| DIFER;

expresion3 		: expression2 numexpression | /* epsilon */;

numexpression 	: term numexpression2;

numexpression2 	: OPMAIS term numexpression2
				| OPMENOS term numexpression2
				| /* epsilon */;

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
				| ABRPAR expression FECHPAR;

arglist 		: expression arglist1
				| /* epsilon */;

arglist1 		: VIRG expression arglist1
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
