grammar pblgrammar;

/*
    Parser Rules
*/

program : statement+ EOF;

statement : variable_declaration
          | array_declaration
          | print_statement
          ;

variable_declaration : VAR variable_name EQUAL variable_value
                     ;

array_declaration : ARRAY variable_name SQRBRACK DIGIT SQRBRACK
                  ;

variable_name : STRING
              ;

variable_value : GENDER DELIM GNDNAME DELIM
               | TYPEOFCALC DELIM function_parameters DELIM
               | TYPEOFCALC DELIM DELIM
               | PLANET DELIM PLANET_NAME DELIM
               | LOCATION DELIM DEG COMA DEG DELIM
               | SNAPSHOT DELIM date_of_birth COMA time_of_birth COMA zone COMA location DELIM
               | ASTROSIGN DELIM SIGN DELIM
               ;

function_parameters : variable_name + (COMA variable_name)?
                    ;

location : DEG COMA DEG
         ;

zone : STRING
     ;

date_of_birth : DAY COLON DIGIT COMA MONTH COLON DIGIT COMA YEAR COLON DIGIT
              ;

time_of_birth : DIGIT COLON DIGIT
              ;

print_statement : PRINT variable_name
                ;

bool : TRUE
     | FALSE
     ;
/*
    Lexer Rules
*/

VAR : V A R ;
SNAPSHOT : S N A P S H O T ;
ASTROSIGN : A S T R O S I G N ;
DETERMINE : D E T E R M I N E ;
FOR : F O R ;
DAY : D A Y ;
MONTH : M O N T H ;
YEAR : Y E A R ;
HOUR : H O U R ;
MINUTE : M I N U T E ;
PRINT : P R I N T ;
PLANET : P L A N E T ;
TRUE : T R U E ;
FALSE : F A L S E ;
ARRAY : A R R A Y ;
GENDER : G E N D E R ;
LOCATION : L O C A T I O N ;

DEG : NUM_REAL ('N' | 'S' | 'W' | 'E') NUM_REAL
    ;

SIGN : 'aries'
     | 'taurus'
     | 'gemini'
     | 'cancer'
     | 'leo'
     | 'virgo'
     | 'libra'
     | 'scorpio'
     | 'sagittarius'
     | 'capricorn'
     | 'aquaris'
     | 'pisces'
     ;
GNDNAME : 'male'
        | 'female'
        ;

PLANET_NAME : 'mercury'
            | 'venus'
            | 'mars'
            | 'jupiter'
            | 'saturn'
            | 'uranus'
            | 'neptune'
            | 'pluto'
            ;

TYPEOFCALC : 'getSnapChart'
           | 'planetsPos'
           | 'planetsInfo'
           | 'getHelp'
           | 'moon_sign'
           | 'sun_sign'
           | 'getSignHouse'
           | 'getPlanetHouse'
           | 'getPlanetPosition'
           ;

STRING : [a-zA-Z]+
       ;

DIGIT : [0-9]+
      ;

NUM_REAL
   : ('0' .. '9') + (('.' ('0' .. '9') + (EXPONENT)?)? | EXPONENT)
   ;

COLON : ':'
      ;

COMA : ','
     ;

WS : [ \r\n\t] -> skip
   ;

EQUAL : '='
      ;

DELIM : ('(' | ')')
      ;

SQRBRACK : ('[' | ']')
         ;

fragment EXPONENT
   : ('e') ('+' | '-')? ('0' .. '9') +
   ;

fragment A
   : ('a' | 'A')
   ;


fragment B
   : ('b' | 'B')
   ;


fragment C
   : ('c' | 'C')
   ;


fragment D
   : ('d' | 'D')
   ;


fragment E
   : ('e' | 'E')
   ;


fragment F
   : ('f' | 'F')
   ;


fragment G
   : ('g' | 'G')
   ;


fragment H
   : ('h' | 'H')
   ;


fragment I
   : ('i' | 'I')
   ;


fragment J
   : ('j' | 'J')
   ;


fragment K
   : ('k' | 'K')
   ;


fragment L
   : ('l' | 'L')
   ;


fragment M
   : ('m' | 'M')
   ;


fragment N
   : ('n' | 'N')
   ;


fragment O
   : ('o' | 'O')
   ;


fragment P
   : ('p' | 'P')
   ;


fragment Q
   : ('q' | 'Q')
   ;


fragment R
   : ('r' | 'R')
   ;


fragment S
   : ('s' | 'S')
   ;


fragment T
   : ('t' | 'T')
   ;


fragment U
   : ('u' | 'U')
   ;


fragment V
   : ('v' | 'V')
   ;


fragment W
   : ('w' | 'W')
   ;


fragment X
   : ('x' | 'X')
   ;


fragment Y
   : ('y' | 'Y')
   ;


fragment Z
   : ('z' | 'Z')
   ;