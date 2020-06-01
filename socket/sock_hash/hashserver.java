import java.net.*;
import java.io.*;
import java.math.*;
import java.security.*;

class A
{
	public static String hash(String input)
	{
		try
		{
			MessageDigest md=MessageDigest.getInstance("MD5");
			
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

class hashserver
{
	public static void main(String args[])
	{
		A obj=new A();

		try
		{
			ServerSocket ss=new ServerSocket(4545);
			Socket s=ss.accept();
			
			String str="";
			while(!str.equals("stop"))
			{
				DataInputStream din=new DataInputStream(s.getInputStream());
				DataOutputStream dout=new DataOutputStream(s.getOutputStream());
				dout.writeUTF("HI");
				str=(String)din.readUTF();
				String result=obj.hash(str);
		
				System.out.println("From client="+result);
				

			}
			ss.close();
		}
		catch(Exception e)
		{
			System.out.println(e);	
		}
	}
}