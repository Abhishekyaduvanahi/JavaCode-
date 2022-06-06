package operators;
/*
     Category      '             Operator               '            Priority       
    --------------          ' -------------                  '     ------------
       Unary                ' ++,--,+,-,!                    '    First
                            '                                        '
      Multiplicative        '  *,/,%                         '    Second
      Additive              '  +,-                           '    Third
      Relational            ' <,<=,>=,>                      '    Fourth 
      Equality              ' ==, !=                         '    Fifth
      Conditional AND       '&&                              '    Sixth
      Conditional OR        '||                              '    Seven
      Ternary               '?:                              '    Eight
      Assignment            '=,+=,-=,*=,/=,%=                '    Lowest
*/


public class OperatorPresedence {

	public static void main(String[] args) {
       
		int result = 7+2 * 4;
		System.out.println("Result :- " + result );
		
		 result = (7+2) * 4;
		System.out.println("Result :- " + result );
		
		
		System.out.println("Hello Mr. Lee You are a Great Person ");
		//Lee == Abhishek 
		
		
	}

}
