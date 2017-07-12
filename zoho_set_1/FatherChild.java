package zoho_set_1;

public class FatherChild 
{

	public static void main(String[] args) 
	{
		String[][] str = {
							{"luke" , "shaw"},
							{"wayne" , "rooney"},
							{"rooney" , "ronaldo"},
							{"shaw" , "rooney"}};
		String father = "rooney";	
		String[] child = new String[10];
		int j=0;
		for(int i=0; i<2; i++)
		{
			
			child=findChild(father, str, child);
			father=child[j++];
		}
		for(int i=0; i<child.length; i++)
			System.out.println(child[i]);
		

	}

	private static String[] findChild(String father, String[][] str, String[] child) {
		int j = 0;
		for(int i=0; i<4; i++)
			if(father == str[i][1])
				child[j++]=str[i][0];
		return child;
		
	}

}
