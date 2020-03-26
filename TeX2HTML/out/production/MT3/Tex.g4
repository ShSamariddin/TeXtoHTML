grammar Tex;



tex      : DOLLARS eq DOLLARS                                                              #texT
;

eq       : expression '=' eq                                                                    #eqT
            | expression                                                                         #endeqT
;

expression  : FRAC CURLY_OPEN expression CURLY_CLOSE CURLY_OPEN expression CURLY_CLOSE               #fracT
            | CURLY_OPEN expression CURLY_CLOSE CHOOSE CURLY_OPEN expression CURLY_CLOSE                                                          #chooseT
            | SQRT (SQUARE_OPEN expression SQUARE_CLOSE)? CURLY_OPEN    expression CURLY_CLOSE       #sqrtT
            | expression UP CURLY_OPEN expression CURLY_CLOSE DOWN CURLY_OPEN expression CURLY_CLOSE #supsubT
            | expression DOWN CURLY_OPEN expression CURLY_CLOSE UP CURLY_OPEN expression CURLY_CLOSE #subsupT
            | expression (UP|DOWN) CURLY_OPEN expression CURLY_CLOSE                                 #indexT
            | ROUND_OPEN expression ROUND_CLOSE                                                      #brT
            | expression (MUL|DIV) expression                                                        #mulDivT
            | expression (PLUS|MINUS|PLUS_MINUS) expression                                          #addSubT
            | (MINUS|PLUS_MINUS) expression                                                          #unaryT
            | (NUMBER|WORD)                                                                          #atomT
;

CHOOSE: '\\choose';
CURLY_OPEN : '{';
CURLY_CLOSE : '}';
SQUARE_OPEN : '[';
SQUARE_CLOSE : ']';
ROUND_OPEN : '(';
ROUND_CLOSE : ')';
UP : '^';
DOWN : '_';
PLUS : '+';
MINUS : '-';
WORD   : ('a'..'z'|'A'..'Z')+;
NUMBER : [1-9][0-9]*;
WHITESPACE : [ \n\t\r]+ -> skip;
PLUS_MINUS : '\\pm';
SIGMA : '\\sum';
MUL : '\\cdot'|'\\times'|'*';
SQRT : '\\sqrt';
DIV : '\\div'|'/';
BEGIN_DOC : '\\begin{document}';
END_DOC : '\\end{document}';
DOLLARS : '$';

FRAC : '\\frac';

