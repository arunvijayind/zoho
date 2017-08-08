package zoho;

public class SmallSubArr {

	public static void main(String[] args) {
		int arr[]={3,-4,2,-3,-1,7,-5};
		System.out.println(minvalue(arr));

		int arr1[]={2,6,8,1,4};
		System.out.println(minvalue(arr1));

	}

	private static int minvalue(int[] arr) {
		int len=arr.length;
		int min_so_for=Integer.MAX_VALUE,min_ending_here=0;

		for(int i=0; i<len; i++){
			min_ending_here = min_ending_here + arr[i];

			if(min_so_for>min_ending_here)
				min_so_for=min_ending_here;
			if(min_ending_here >0)
				min_ending_here=0;
		}

		return min_so_for;
	}

}
