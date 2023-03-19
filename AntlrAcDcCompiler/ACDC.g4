grammar ACDC;

prog: dss ;

dss: dcl dss
    | stm dss
    |;

stm: ID ASSIGN exp SEMI
    | PRINT ID SEMI;

dcl: ty ID dclp;

dclp: ASSIGN exp SEMI
    | SEMI;

exp: tr expp;

expp: MINUS tr expp
    |PLUS tr expp
    |;

tr: val trp;


trp: DIV val trp
    | TIMES val trp
    |;
ty: TYFLOAT
    |TYINT;

val:ID
    |INT
    | FLOAT;




TYFLOAT:('float');
TYINT:('int');
PRINT: ('print');
ID :[a-zA-Z_]+[a-zA-Z0-9_]*;
INT: [0-9]+;
FLOAT:[0-9]+'.'+[0-9]*;
ASSIGN: ('=');
PLUS:('+');
MINUS:('-');
TIMES:('*');
DIV:('/');
SEMI:(';');
WS: [ \t\n\r] + -> skip;
