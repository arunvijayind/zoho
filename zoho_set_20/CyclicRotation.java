package zohoset20;


public class CyclicRotation{
	void rotation(char[] arr_2){
		char temp=arr_2[0];
		for(int i=1;i<arr_2.length;i++){
			arr_2[i-1]=arr_2[i];
		}
		arr_2[arr_2.length-1]=temp;
				
	}
	
	void printArray(char[] arr_2){
		for(int i=0;i<arr_2.length;i++){
			System.out.print(arr_2[i]);
		}
	}
	public boolean compare(char[] arr_1, char[] arr_2, boolean status) {
		for(int i=0,j=0;i<arr_1.length;i++,j++){
			if(arr_1[i]!=arr_2[j]){
				status=false;
				break;
			}
			else
				status=true;
		}
		return status;
		
	}
	public static void main(String args[]){
		
		cyclic_rotation cyclicRotation=new cyclic_rotation();
		char[] arr_1={'z','o','z','h','o'};
		char[] arr_2={'z','h','o','o','o'};
		boolean status=false;
		
		if(arr_1.length==arr_2.length){
			for(int i=0;i<arr_1.length;i++){
				status=cyclicRotation.compare(arr_1,arr_2, status);
				if(status==true){
					break;
				}
				cyclicRotation.rotation(arr_2);
			}
			
			
			
		}
		cyclicRotation.printArray(arr_2);

		if(status==true){
			System.out.println("The wors are cyclic rotation");
		}
		else{
			System.out.println("The wors are not cyclic rotation");
		}

	}
}
