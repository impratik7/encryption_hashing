import java.util.*;
public class symmetric
{
	public static void main (String [] arg)
	{
		int i,len,as,y,d,klen;
		char ch;
		String a, b,k;

		Scanner q=new Scanner(System.in);
		System.out.println("Enter your PRN");
		k=q.next();
		klen=k.length();

		Scanner x=new Scanner(System.in);
		System.out.println("Enter your name");
		a=x.next();
		len=a.length();
		String str[]=new String[len];

		for(i=0;i<len;i++)
		{
			ch=a.charAt(i);
			System.out.println(" "+ch);
			as=(int)ch + klen;
			System.out.println(ch+"="+as);
			str[i]=Integer.toString(as);
		}
		
		System.out.println("cipher text: ");
		for(y=(len-1);y>=0;y--)
		{
			System.out.print(str[y]);
		}
			System.out.println("\n"+"plain text:");

		for(i=0;i<len;i++)
		{
			as=Integer.valueOf(str[i]);
			d=as-klen;
			ch=(char)d;
			System.out.print(ch);
		}
	}
}
