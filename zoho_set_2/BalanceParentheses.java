package zoho_set_2;

import java.util.Stack;

public class BalanceParentheses {

	public static void main(String[] args) {
		Stack stack = new Stack();
		char[] str = "((abc)((de))".toCharArray();
		int flag = 0;
		char extraParen=' ';
		
		for(int j=0; j< str.length; j++)
		{
			if(str[j] == '(')
				flag++;
			else if(str[j] == ')')
				flag--;
		}
		if(flag > 0)
			extraParen = '(';
		else if(flag < 0)
		{
			extraParen = ')';
			flag = (-1)*flag;
		}
		for(int i=0; i< str.length; i++)
			stack.push(str[i]);
		
		char[]  op=new char[str.length-flag];
		int flg=1,g=0;
		
		for(int k=0; k< str.length; k++)
		{	
			char string =(char) stack.pop();
			if(string == extraParen && flg==1)
			{
				flg = 0;
				continue;
			}
			else{
				op[g++]=string;
			}
		}
		for(int l=op.length-1; l>=0; l--)
			System.out.print(op[l]);
	}

}
