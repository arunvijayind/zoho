package zoho_set_1;

public class PrintPattern {

	public static void main(String[] args) {
		
		char[] str = "PROGRAM".toCharArray();
		int length = str.length;
		
		for(int i=0; i<length; i++){			// for that much amount of line printed
			for(int j=0; j<length; j++){		// to take elements of char array
				if(j==i || j==(length-1-i)){
					System.out.print(str[j]);
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
/*output

P     M
 R   A 
  O R  
   G   
  O R  
 R   A 
P     M


*/
