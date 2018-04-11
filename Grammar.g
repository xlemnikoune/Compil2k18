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
}
@members{
boolean mainFound = false;
}

axiom	: fichier EOF {if (!mainFound){System.err.println("main not found");System.exit(1);}} -> fichier //Ok ! 
;

fichier : decl* //Ok ! 
;

decl : declFun //Ok ! 
| declStruct
;

declStruct : 'struct' IDF '{' args? '}' -> ^('struct' IDF args?) //Ok ! 
;

args : IDF ':' type (',' IDF ':' type)* -> (^(IDF type))*//Ok ! 
;

declFun : 'fn' (IDF '(' args? ')' ('->' type)? block -> ^('fn' IDF args? ^('->' type)? block)
	|	{mainFound = true;}MAIN '(' ')' block -> ^('fn' MAIN block))
;

type : | 'i32'
| 'bool'
|IDF
	|	'vec' ('<' type '>') -> ^('vec' type) //Ok ! 
| '&' type -> ^('&' type)
;

block : '{' instruct* '}'-> ^(BLOCK instruct*) //Voir pour le dernier return (si expr)
;


callFun : '(' expr (',' expr)* ')' -> expr*;

newStruc : '{' IDF ':' bigExpr (',' IDF ':' bigExpr)* '}' -> ^(NEW ^(IDF bigExpr)*);

instruct : 
		expr ';' -> expr
| ';' -> 
| 'let' 'mut'? dotIDF (':' type)? '=' bigExpr ';' -> ^('let' 'mut'? (type)? ^('=' dotIDF bigExpr)) 
| 'while' expr block -> ^('while' expr block)
| 'return' expr? ';' -> ^('return' expr?)
| 'loop' block -> ^('loop' block)
| 'break' ';' -> 'break'
| ifExpr
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

vectExpr : starExpr ('['^ expr ']'!)?;

starExpr 
	:	 STAR moinsExpr -> ^(UNISTAR moinsExpr)
	| moinsExpr;
	
moinsExpr 
	:	 SUB atom -> ^(UNISUB atom)
	| atom;


dotExpr : vectExpr ('.'^ (IDF | 'len' '('!')'! ))?;

unExpr : (UNAIRE^|EPERLU^)? dotExpr;

atom : INT
| BOOL
|	 IDF^ ((callFun))?
| '('expr')'-> expr; 

expr : 'vec' '!' '[' expr ']' -> ^('vec' expr)
| 'print' '!' '(' expr ')' -> ^('print' expr)
| block
|	binExpr1;


bigbinExpr1 : bigbinExpr2 (EQUAL^ bigbinExpr2)*; 

bigbinExpr2 : bigbinExpr3(ORBOOL^ bigbinExpr3)*; 

bigbinExpr3 : bigbinExpr4(ANDBOOL^ bigbinExpr4)*; 

bigbinExpr4 : bigbinExpr5((PREV^|OPBOOLEQ^|NEXT^) bigbinExpr5)*; 

bigbinExpr5 : bigbinExpr6((ADD|SUB)^ bigbinExpr6)*; 

bigbinExpr6 : bigunExpr ((STAR^|DIV^) bigunExpr)*;

bigvectExpr : bigstarExpr ('['^ bigExpr ']'!)?;

bigstarExpr 
	:	 STAR bigmoinsExpr -> ^(UNISTAR bigmoinsExpr)
	| bigmoinsExpr;
	
bigmoinsExpr 
	:	 SUB bigatom -> ^(UNISUB bigatom)
	| bigatom;


bigdotExpr : bigvectExpr ('.'^ (IDF | 'len' '('!')'! ))?;

bigunExpr : (UNAIRE^|EPERLU^)? bigdotExpr; 

bigExpr 
:	'vec' '!' '[' expr (',' expr)*']' -> ^('vec' expr*)
| 'print' '!' '(' expr ')' -> ^('print' expr)
| block
|	bigbinExpr1;

bigatom : INT
| BOOL
|	 IDF^ (newStruc|callFun)?
| '('bigExpr')' -> bigExpr;


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

BOOL 	:	'true' | 'false'
;

IDF 			: ('a'..'z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
;


INT 			: '0'..'9'+
;



STRING	
: '"' ~('\r' | '\n' | '"')* '"'
;	

COMMENT			: '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};

ATTRIBUTE : '#' ( options {greedy=false;} : .)* ('\n'|'\t') {$channel=HIDDEN;}; 

WS  			: ( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};