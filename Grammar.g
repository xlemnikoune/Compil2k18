grammar Grammar;

options {
	backtrack 		= false;
	k 		= 1;
	output 		= AST;
	ASTLabelType	= CommonTree;
}

tokens {
	BLOCK;
	NEW;
	VEC;
	CALLFUN;
	UNISUB;
	UNISTAR;
	ANOBLOCK;
	RES;
}

@members{
boolean mainFound = false;
}

axiom	: fichier EOF {if (!mainFound){System.err.println("main not found");}} -> fichier //Ok ! 
;

fichier : decl* //Ok ! 
;

decl : declFun //Ok ! 
| declStruct
;

declStruct : 'struct' IDF '{' args? '}' -> ^('struct' IDF args?) //Ok ! 
;

args : IDF ':' type (',' IDF ':' type)* -> (^(IDF type))*//Ok ! 
;

declFun : 'fn' (IDF '(' args? ')' ('->' type)? block -> ^('fn' IDF ^('->' type)? args?  block)
	|	{mainFound = true;}MAIN '(' ')' block -> ^('fn' MAIN block))
;

type : | 'i32'
| 'bool'
|IDF
	|	'vec' ('<' type '>') -> ^('vec' type) //Ok ! 
| '&' type -> ^('&' type)
;

block : '{' instruct'}'-> ^(BLOCK  instruct) //Voir pour le dernier return (si expr)
;


callFun : '(' (expr (',' expr)*)? ')' -> ^(CALLFUN expr*);

newStruc : '{' IDF ':' bigExpr (',' IDF ':' bigExpr)* '}' -> ^(NEW ^(IDF bigExpr)*);

instrBoucle 
	:	';' instruct? -> instruct?
	| -> RES;

instruct : 
		expr instrBoucle
| ';' instruct?-> instruct?
| 'let' 'mut'? dotIDF (':' type)? '=' bigExpr ';' instruct?-> ^('let' 'mut'? (type)? ^('=' dotIDF bigExpr))  instruct?
| 'while' expr block instruct?-> ^('while' expr block) instruct?
| 'return' expr? ';' instruct?-> ^('return' expr?) instruct?
| 'break' ';' instruct?-> 'break' instruct?
| ifExpr instruct?
;

dotIDF 	: 
IDF ('.'^ IDF)?;

ifExpr : 'if' expr block ('else' block )? -> ^('if' expr block ^('else' block)?);

binExpr1 : binExpr2 (EQUAL^ binExpr2)*; 

binExpr2 : binExpr3(ORBOOL^ binExpr3)*; 

binExpr3 : binExpr4(ANDBOOL^ binExpr4)*; 

binExpr4 : binExpr5((PREV^|OPBOOLEQ^|NEXT^) binExpr5)*; 

binExpr5 : binExpr6((ADD^|SUB^)  binExpr6)*; 

binExpr6 : unExpr ((STAR^|DIV^) unExpr)*; 

vectExpr : starExpr ('['^ expr ']'!)*;

starExpr 
	:	 STAR moinsExpr -> ^(UNISTAR moinsExpr)
	| moinsExpr;
	
moinsExpr 
	:	 SUB moinsExpr -> ^(UNISUB moinsExpr)
	| atom;


dotExpr : vectExpr ('.'^ (IDF | 'len' '('!')'! ))?;

unExpr : (UNAIRE^|EPERLU^)? dotExpr;

atom : INT
| BOOL
|	 IDF^ ((callFun))?
| block -> ^(ANOBLOCK block)
| '('expr')'-> expr; 

expr : 'vec' '!' '[' expr(',' expr)* ']' -> ^('vec' expr*)
|'print' '!' '(' exS  (',' exS)* ')' -> ^('print' exS*)
|'input' '(' STRING ')' -> ^('input' STRING)
|	binExpr1;

exS : expr
| STRING;

bigbinExpr1 : bigbinExpr2 (EQUAL^ bigbinExpr2)*; 

bigbinExpr2 : bigbinExpr3(ORBOOL^ bigbinExpr3)*;

bigbinExpr3 : bigbinExpr4(ANDBOOL^ bigbinExpr4)*; 

bigbinExpr4 : bigbinExpr5((PREV^|OPBOOLEQ^|NEXT^) bigbinExpr5)*; 

bigbinExpr5 : bigbinExpr6((ADD|SUB)^ bigbinExpr6)*; 

bigbinExpr6 : bigunExpr ((STAR^|DIV^) bigunExpr)*;

bigvectExpr : bigstarExpr ('['^ bigExpr ']'!)*;

bigstarExpr 
	:	 STAR bigmoinsExpr -> ^(UNISTAR bigmoinsExpr)
	| bigmoinsExpr;
	
bigmoinsExpr 
	:	 SUB bigmoinsExpr -> ^(UNISUB bigmoinsExpr)
	| bigatom;


bigdotExpr : bigvectExpr ('.'^ (IDF | 'len' '('!')'! ))?;

bigunExpr : (UNAIRE^|EPERLU^)? bigdotExpr; 

bigExpr 
:	'vec' '!' '[' expr (',' expr)*']' -> ^('vec' expr*)
|   'print' '!' '(' exS (',' exS)* ')' -> ^('print' exS*)
|'input' '(' STRING ')' -> ^('input' STRING)
|	bigbinExpr1;

bigatom : INT
| BOOL
|	 IDF^ (newStruc|callFun)?
| block -> ^(ANOBLOCK block)
|'('bigExpr')' -> bigExpr;


EQUAL : '=';

ORBOOL : '||';

ANDBOOL : '&&';

PREV 	:	 '<';
NEXT 	:	 '>';

OPBOOLEQ : '=='|'!='|'<='|'>=';

ADD : '+';

STAR 	:	 '*';

DIV : '/';

UNAIRE :  '!';

EPERLU 	:	 '&';

IF 	:	 'if'
;

SUB 	:	 '-';

MAIN 	:	'main'
	;

BOOL 	:	'true' |'false'
;

IDF 			: ('a'..'z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
;


INT 			: '0'..'9'+
;

WS  			: ( ' '| '\t' | '\r' | '\n' ) {$channel=HIDDEN;};

STRING	
: '"' ~('\r' | '\n' | '"')* '"'
;	

COMMENT			: '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};

ATTRIBUTE : '#' ( options {greedy=false;} : .)* ('\n'|'\t') {$channel=HIDDEN;}; 

