package zohoset20;

public class regular_expression {
	
	boolean match(String str1, String str2)
	{   
		char[] first=str1.toCharArray();
		char[] second=str2.toCharArray();
		
	    // If we reach at the end of both strings, we are done
	    if (first[0] == '\0' && second[0] == '\0')
	        return true;
	 
	    // Make sure that the characters after '*' are present
	    // in second string. This function assumes that the first
	    // string will not contain two consecutive '*'
	    if (first[0] == '*' && (first[0+1]) != '\0' && second[0] == '\0')
	        return false;
	 
	  
	 
	    // If there is *, then there are two possibilities
	    // a) We consider current character of second string
	    // b) We ignore current character of second string.
	    if (first[0] == '*')
	        return match(first[0+1], second) || match(first, second+1);
	    return false;
	}

	public static void main(String[] args) {
	
		
		    test("g*ks", "geeks"); // Yes
		    test("ge?ks*", "geeksforgeeks"); // Yes
		    test("g*k", "gee");  // No because 'k' is not in second
		    test("*pqrs", "pqrst"); // No because 't' is not in first
		    test("abc*bcd", "abcdhghgbcd"); // Yes
		    test("abc*c?d", "abcd"); // No because second must have 2
		                             // instances of 'c'
		    test("*c*d", "abcd"); // Yes
		    test("*?c*d", "abcd"); // Yes
		    
		
		

	}
	// A function to run test cases
	private static void test(String first, String second) {
		match(first, second)? System.out.println("Yes"): System.out.println("No");
	}

}
