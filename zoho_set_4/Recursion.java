package zoho_set_3;

public class Recursion {

	public static void main(String[] args) {

		char[] string = " one two three four".toCharArray();
		int i = string.length;
		int j = i;
		print(string, --i, j);
	}
	public static void print(char[] string,int i, int j) {
		int amt = j;
		
		if(i >= 0){
			if(string[i] == ' ' || i==0)
			{
 				for(int k=i; k<j; k++)
				{
					System.out.print( string[k] );
					amt--;
				}
				j = amt;
			}
			print(string, --i, j);
		}
	}
}
