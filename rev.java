import java.util.*;

class rev
{
	public static void main(String args[])
	{
		String str="college";
		int i,len;
		char ch;

		len=str.length();
		
		for(i=(len-1);i>=0;i--)
		{
			ch=(char)str.charAt(i);
			System.out.print(ch);
		}
	}
}