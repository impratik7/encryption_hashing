import java.math.*;
import java.security.*;
import java.util.*;

class A
{
	public static String hash(String input)
	{
		try
		{
			MessageDigest md=MessageDigest.getInstance("SHA-1");
			
			byte[] messagedigest=md.digest(input.getBytes());

			BigInteger no=new BigInteger(1,messagedigest);

			String hashtext=no.toString(16);

			while(hashtext.length()<32)
			{
				hashtext="0"+hashtext;
			}
			return hashtext;
		}
		catch(NoSuchAlgorithmException e)
		{
			throw new RuntimeException(e);
		}
	}
}

class trial
{
	public static void main(String args[])throws NoSuchAlgorithmException
	{
		A obj=new A();
		Scanner sc=new Scanner(System.in);
		
		
		String s=sc.next();
		
		System.out.println("HASH="+obj.hash(s));
	}
}