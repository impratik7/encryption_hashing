import java.math.*;
import java.security.*;

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

class sha1
{
	public static void main(String arg[])throws NoSuchAlgorithmException
	{
		A obj=new A();

		String s="college";
		
		System.out.println("Hash="+obj.hash(s));
	}
}