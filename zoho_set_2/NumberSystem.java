package zoho_set_2;

public class NumberSystem {

	public static void main(String[] args) {
		int number = 5;
		
		for(int itr=2; itr<number+2; itr++){
			show(itr);
			System.out.println();
		}
	}

	private static void show(int itr) {
		int[] binary = new int[50];
		int i = itr;
		int j = 0;
		
		while(i > 0)
		{
			binary[j++] = i%2;
			i = i/2;
		}
		for(int k=j-2; k>=0; k--)
		{
			if(binary[k] == 0)
				System.out.print("3");
			else
				System.out.print("4");
		}
	}
}
/* Output
	3
	4
	33
	34
	43
 * 
 * 
 */
