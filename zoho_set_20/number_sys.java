package zohoset20;

public class number_sys {
	
	void printString(int n)
	{
	    char str[]=new char[5];  			// To store result (Excel column name)
	    int i = 0;  						// To store current index in str which is result
	 
	    while (n>0)
	    {
	        // Find remainder
	        int rem = n%26;
	 
	        // If remainder is 0, then a 'Z' must be there in output
	        if (rem==0)
	        {
	            str[i++] = 'Z';
	            n = (n/26)-1;
	        }
	        else // If remainder is non-zero
	        {
	            str[i++] = (char) ((rem-1) + 'A');
	            n = n/26;
	        }
	    }
	    str[i] = '\0';
	 
	    // Reverse the string and print result
	    for(int i1=str.length-1;i1>=0;i1--){
	    	if(str[i1]!='\0')
	    		System.out.print(str[i1]);
	    }
	    System.out.println();
	}

	public static void main(String[] args) {
		 
		// Function to print Excel column name for a given column number
		number_sys numb=new number_sys(); 
		
		numb.printString(26);
		numb.printString(51);
		numb.printString(52);
		numb.printString(80);
		numb.printString(676);
		numb.printString(702);
		numb.printString(705);
		    
		

	}

}
