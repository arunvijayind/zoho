package zoho;

public class Fibonacci {

	public static void main(String[] args) {
		int number=4;
		fibonacci(number);
	}

	private static void fibonacci(int number) {
		int a = 0;
		int b = 1;

		if(number == 1)
			System.out.print(a);
		else
			System.out.print(a+","+b);
			for(int i=2; i<number; i++){
				int c=a+b;
				System.out.print(","+c);
				a=b;
				b=c;
			}
	}

}
