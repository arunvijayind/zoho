package zoho_set_2;

public class ArraySorting 
{

	public static void main(String[] args) 
	{
		int arr[]= {1, 2, 3, 4, 5, 6, 7};
		int arrLength=arr.length;
		int i=0,j=arrLength-1;

		System.out.print("{");
		for(int k=0; k<arrLength; k++)
		{
			if(k%2 != 0)
				System.out.print(arr[i++]);
			else
				System.out.print(arr[j--]);
			
			if(k!=arrLength-1)
				System.out.print(",");
		}
		System.out.println("}");
	}

}

/* Output
 * {7,1,6,2,5,3,4}
 * */
