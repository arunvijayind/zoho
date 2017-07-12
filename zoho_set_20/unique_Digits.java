package zohoset20;

public class unique_Digits {
	
	
	void printArray(char[] arr_2){
		for(int i=0;i<arr_2.length;i++){
			System.out.print(arr_2[i]);
		}
	}
	
	private boolean compare(char c, char[] str_arr, int i) {
		
		char var=Character.toLowerCase(c);
		for(int j=i-1;j>=0;j--){
			
			char arr=Character.toLowerCase(str_arr[j]);
			if(var==arr){
				return true;
			}
		}
		
		
		return false;
	}
	
	private char change(char c) {
		if(c=='9' || c=='Z' || c=='z'){
			if(c=='9')
				return '0';
			else if(c=='Z')
				return 'A';
			else if(c=='z')
				return 'a';
		}
		else{
			int bytecode=(int)c;
			c=(char)++bytecode;
			return c;
		}
		return c;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		unique_Digits uniq=new unique_Digits();
		String str="aBuzZ9900";
		boolean status=false;
		System.out.println(27%26);
		char[] str_arr=str.toCharArray();
		for(int i=0,j=str_arr.length-1;j>=0;i++,j--){
			status=uniq.compare(str_arr[i],str_arr,i);
			while(status==true){
				str_arr[i]=uniq.change(str_arr[i]);
				status=uniq.compare(str_arr[i],str_arr, i);
			}
		}
		uniq.printArray(str_arr);
	}
}
