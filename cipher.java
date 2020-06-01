import java.util.*;

class A
{
		Scanner sc=new Scanner(System.in);
		String msg,cipher="";
		int i,k,len;
		char ch;
	
	void encrypt()
	{

		System.out.println("Enter plain text");
		msg=sc.nextLine();

		System.out.println("Enter no k");
		k=sc.nextInt();
		
		len=msg.length();

		for(i=0;i<len;i++)
		{
			ch=msg.charAt(i);
			cipher+=(char)(ch+k);
		}
		System.out.println("Cipher="+cipher);
	}
//***************************************************************

	void decrypt()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cipher text");
		String cip=sc.nextLine();
		String original="";
		len=cip.length();

		for(i=0;i<len;i++)
		{
			ch=cip.charAt(i);
			original+=(char)(ch-k);
		}

		
		System.out.println("Original="+original);	
	}
}

class cipher
{
	public static void main(String s[])
	{
		A x=new A();
		x.encrypt();
		x.decrypt();
		
	}
}		
	