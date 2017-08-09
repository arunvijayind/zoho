package zoho;

public class knapsack {
		public static  void main(String args[]) {
			
			int val[]={110,100,120};
			int weight[]={10,20,30};
			int W=50;
			int n=val.length;
			System.out.println(knapsack(val,weight,W,n));
	
		}
		private static int knapsack(int[] val, int[] weight, int W,int n) {
			
			int [][]k = new int[n+1][W+1];
			
			for(int i=0; i<=n; i++){
				for(int w=0; w<=W; w++){
					if( i==0 || w==0)
						k[i][w]=0;
					else if(weight[i-1]<=w)
						k[i][w]=max(val[i-1]+k[i-1][w-weight[i-1]],k[i-1][w]);
					else
						k[i][w]=k[i-1][w];
				}
			}
			printMatrix(k);
			return k[n][W];
		}
		private static int max(int a, int b) {
			return (a>b) ? a: b; 	
		}
		private static void printMatrix(int[][] k) {
			for(int i=0; i<k.length; i++){
				for(int j =0; j<k[i].length; j++){
					System.out.print(k[i][j]+"  ");
				}
				System.out.println();
			}	
		}
}
