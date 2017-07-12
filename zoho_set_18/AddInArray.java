package zoho_set_18;

public class AddInArray {

	public static void main(String[] args) {
		int arr1[]={1,0,0},arr2[]={1,1};
		int arr1_length=arr1.length,arr2_length=arr2.length;
		int max_arr_size=(arr1_length>arr2_length)?arr1_length:arr2_length;
		int sum=0,reminder=0;
		int[] sum_arr=new int[max_arr_size];
		
		for(int i=max_arr_size-1,j=0;i>=0;i--,j++){
			if(arr1_length>=0 && arr2_length >=0)
				sum=sum+arr1[--arr1_length]+arr2[--arr2_length];
			else
				sum+=
			reminder=sum%10;
			sum=sum/10;
			sum_arr[j]=reminder;
		}
		
		for(int i=max_arr_size-1;i>=0;i--){
			System.out.print(sum_arr[i]);
		}
	}
}
