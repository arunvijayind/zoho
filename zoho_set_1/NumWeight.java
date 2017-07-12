/**
 * Question
 
 *  Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the following conditions
    1. 5 if a perfect square
    2. 4 if multiple of 4 and divisible by 6
    3. 3 if even number

And sort the numbers based on the weight and print it as follows

<10,its_weight>,<36,its weight><89,its weight>

Should display the numbers based on increasing order.
 */


package zoho_set_1;

public class NumWeight 
{
	public static void main(String[] args) 
	{
		int[] numArray = {10, 36, 54, 89, 12};
		int numLength = numArray.length;
		
		for(int i=0; i<numLength; i++)			//sort the elements in ascending order		
			for(int j=i+1; j<numLength; j++)
				if(numArray[i] > numArray[j])
				{
					int temp = numArray[i];
					numArray[i] = numArray[j];
					numArray[j] = temp;
				}
		int[] numWeight = new int[numLength];
		
		for(int i=0; i<numLength; i++)
		{
			numWeight[i] = 0;
			int sq =(int) Math.sqrt(numArray[i]);
			if((sq*sq) == numArray[i])
				numWeight[i] += 5;
			
			if((numArray[i]%4 == 0) && (numArray[i]%6 == 0))
				numWeight[i] +=4;
			
			if(numArray[i]%2 == 0)
				numWeight[i] += 3;	
		}
		
		for(int i=0; i<numLength; i++)
		{
			System.out.print("<"+numArray[i]+","+numWeight[i]+">");
			if(i!=numLength-1)
				System.out.print(",");
		}
	}
}
/* Output
 * <10,3>,<12,7>,<36,12>,<54,3>,<89,0>
 * */
 

