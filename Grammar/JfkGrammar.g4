grammar JfkGrammar;

fragment SINGLE_SPACE   : '\u0020'; // ' '
fragment TABULATION     : '\u0009'; // '\t'
fragment LINE_FEED      : '\u000A'; // '\n'
fragment CARRAIGE_RETURN: '\u000D'; // '\r'

Odd_Numer_Okt: [0][0-7]*[1357];
Even_Number_Okt: [0][0-7]*[0246] -> skip ;

Odd_Number_Dec: [13579] | [1-9]+[0-9]*[13579];
Even_Number_Dec: ([2468] | [1-9]+[0-9]*[02468]) -> skip;

Odd_Numer_Hex: [0]('x')[0-9A-F]*[13579BDF];
Even_Numer_Hex: [0]('x')[0-9A-F]*[02468ACE]-> skip ;


MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
LB  : '(' ;
RB  : ')' ;
POW : '^' ;

WhiteSpace    : ( SINGLE_SPACE | TABULATION )+ -> skip;
NewLine       : ( CARRAIGE_RETURN | LINE_FEED )+ -> skip;

first_operation: POW;
second_operation: MUL|DIV;
third_operation: ADD|SUB;

number: (Odd_Numer_Okt|Even_Number_Okt|Odd_Number_Dec|Even_Number_Dec|Odd_Numer_Hex|Even_Numer_Hex)*;

expression: LB expression RB
          | expression first_operation expression
          | expression second_operation expression
          | expression third_operation expression
          | number
          ;

result : expression ;