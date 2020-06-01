import java.util.*;

class A
{
	Scanner sc=new Scanner(System.in);
	String name,prn,cipher="",original="";
	int i,len,plen,as;
	char ch;
	
	void input()
	{
		System.out.println("Enter name");
		name=sc.nextLine();
		len=name.length();
		
		System.out.println("Enter prn");
		prn=sc.nextLine();
		plen=prn.length();
	}

	void enc()
	{
		for(i=0;i<len;i++)
		{
			ch=name.charAt(i);
			cipher+=(char)(ch+plen);
		}
		System.out.println("Cipher="+cipher);
	}

	void dec()
	{	
		
		
		for(i=0;i<len;i++)
		{
			ch=cipher.charAt(i);
			original+=(char)(ch-plen);
		}
		System.out.println("ORIGINAL"+original);
		
	}
}

class sym
{
	public static void main(String args[])
	{
		A obj=new A();
		obj.input();
		obj.enc();
		obj.dec();
	}
}