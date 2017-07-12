package zohoset20;

public class max_path {

	public static void main(String[] args) {
		int[][] matrix={{56,45,12,24},{75,95,32,5},{12,75,35,50}};
		max_path(matrix,3,4);
		display_Matrix(matrix,3,4);
		

	}

	private static void max_path(int[][] matrix, int m, int n) {
		int i,j;
		int temp_matrix[][]=new int[m+1][n+1];
		temp_matrix[0][0]=matrix[0][0];
		
		for(i=1;i<m;i++){
			temp_matrix[i][0]=matrix[i][0]+temp_matrix[i-1][0];
		}
		for(j=1;j<n;j++){
			temp_matrix[0][j]=matrix[0][j]+temp_matrix[0][j-1];
		}
		
		for(i=1;i<m;i++){
			for(j=1;j<n;j++){
				int node=max(temp_matrix[i-1][j-1],temp_matrix[i][j-1],temp_matrix[i-1][j]);
				temp_matrix[i][j]=matrix[i][j]+node;
			}
		}
		
		display_Matrix(temp_matrix,m,n);
		find_path(temp_matrix,matrix,m,n);
		
		
		
	}

	private static void find_path(int[][] temp_matrix, int[][] matrix, int m, int n) {
		int i,j;
		System.out.print(matrix[m-1][n-1]+"->");
		for(i=m-1,j=n-1;i>0&&j>0;){
			
				if(temp_matrix[i][j]-temp_matrix[i-1][j-1]==matrix[i][j]){
					System.out.print(matrix[i-1][j-1]);
					i=i-1;
					j=j-1;
				}
				else if(temp_matrix[i][j]-temp_matrix[i][j-1]==matrix[i][j]){
					System.out.print(matrix[i-1][j-1]);
					i=i;
					j=j-1;
				}
				else if(temp_matrix[i][j]-temp_matrix[i-1][j]==matrix[i][j]){
					System.out.print(matrix[i-1][j-1]);
					i=i-1;
					j=j;	
				}
				if(i>0&&j>0)
					System.out.print("->");
			
		}
		System.out.println();
	}

	private static int max(int i, int j, int k) {
		if(i>j)
			return (i>k)?i:k;
		else if(i>k)
			return (i>j)?i:j;
		else 
			return (k>j)?k:j;
		
	}

	private static void display_Matrix(int[][] temp_matrix, int m, int n) {
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(temp_matrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}


/*System.out.println(matrix[2][3]+"->");
for(i=m-1,j=n-1;i>0&&j>0;){
	
		if(temp_matrix[i][j]-temp_matrix[i-1][j-1]==matrix[i-1][j-1]){
			System.out.println(matrix[i-1][j-1]+"->");
			i=i-1;
			j=j-1;
		}
		else if(temp_matrix[i][j]-temp_matrix[i][j-1]==matrix[i][j-1]){
			System.out.println(matrix[i-1][j-1]+"->");
			i=i;
			j=j-1;
		}
		else if(temp_matrix[i][j]-temp_matrix[i-1][j]==matrix[i-1][j]){
			System.out.println(matrix[i-1][j-1]+"->");
			i=i-1;
			j=j;
		
		
	}
}*/