grammar JfkGrammar;

fragment SINGLE_SPACE   : '\u0020'; // ' '
fragment TABULATION     : '\u0009'; // '\t'
fragment LINE_FEED      : '\u000A'; // '\n'
fragment CARRAIGE_RETURN: '\u000D'; // '\r'

Odd_Numer_Okt: [0][0-7]*[1357];
Even_Number_Okt: [0][0-7]*[0246] -> skip ;

Odd_Number_Dec: [13579] | [1-9]+[0-9]*[13579];
Even_Number_Dec: ([2468] | [1-9]+[0-9]*[02468]) -> skip;

Odd_Numer_Hex: [0][Xx][0-9A-Fa-f]*[13579BDFbdf];
Even_Numer_Hex: [0][Xx][0-9A-Fa-f]*[02468ACEace]-> skip ;


LP  : '(' ;
RP  : ')' ;
POW : '^' ;
DoubleMultiply: '**' -> type(POW);
MUL : '*' ;
DIV : '/' ;
Colon: ':' -> type(DIV);
MOD : '%';
ADD : '+' ;
SUB : '-' ;


WhiteSpace    : ( SINGLE_SPACE | TABULATION )+ -> skip;
NewLine       : ( CARRAIGE_RETURN | LINE_FEED )+ -> skip;

number: (Odd_Numer_Okt|Even_Number_Okt|Odd_Number_Dec|Even_Number_Dec|Odd_Numer_Hex|Even_Numer_Hex);

expression: op = LP expression op = RP
          | expression op = POW expression
          | expression op = (MUL|DIV|MOD) expression
          | expression op = (ADD|SUB) expression
          | number
          ;

result: expression;