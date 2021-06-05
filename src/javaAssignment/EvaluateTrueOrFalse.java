package javaAssignment;
public class EvaluateTrueOrFalse {
	
	
	public static void main(String[] args) {
		
		boolean SRH = true;
		boolean CSK = false;
		int RCB = 1;
		int MI = 2;
		
		System.out.println((RCB ^ MI) < 4); 
		/*returns true as one condition is true and other is false;
		 * 0001
		 * 0010
		 * 0000
		Exclusive XOR in java returns true if both have same value(works for boolean conditions and 1,0--doesn't work for strings)*/

		System.out.println(SRH || !CSK);
		/*Checks if atlease one condition is true. Here first condition matches, hence
		 * true.
		 */
		
        System.out.println((RCB | MI) == 3);
        /* True as the bitwise inclusive OR validates both the conditions and returns true if either of them matches.
		 * 0001
		 * 0010
		 * 0011
		 * */        
        
        /* System.out.println(MI && SRH); 
		 * Compilation error---> The operator && is undefined for the argument type(s) int, boolean
		 * Logical && works only for boolean types
		 * */
    }
}