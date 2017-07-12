package zohoset20;

public class sort_Array {
	
	public void printArray(int[] sort){
		for(int i=0;i<sort.length;i++){
			System.out.print(sort[i]);
		}
	}
	
	private int[] find_sort(int[] arr) {
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]<arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	public int[][] find_accurence_of_elements(int[] arr) {
		//find no of unique elements
		int count=1;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]!=arr[i+1])
					count++;
		}
		int[][] arr1=new int[count][2];
		
		count=0;
		int k=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
					
				}
			}
			arr1[k][0]=arr[i];
			arr1[k][1]=count;
			i=count;
			count=0;
			System.out.println(arr1[k++][0]+""+arr1[k++][1]);
		}
		return arr1;
	}
	public static void main(String[] args) {
		int[] arr={2,3,2,4,5,12,2,3,3,3,12};
		
		sort_Array srt=new sort_Array();
		arr=srt.find_sort(arr);
		//srt.printArray(arr);
		int[][] uniqArr=srt.find_accurence_of_elements(arr);
		//srt.printArray(uniqArr);
		
		

	}
	

	

	

}
