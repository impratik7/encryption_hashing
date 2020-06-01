import java.net.*;
import java.io.*;
import java.util.*;

class tclient
{
	public static void main(String args[])
	{
		try
		{
			Socket s=new Socket("localhost",4545);

			DataInputStream din=new DataInputStream(s.getInputStream());
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			Scanner sc=new Scanner(System.in);

			String str2,str1="";
			
			while(!str1.equals("stop"))
			{
				
				
				str2=sc.next();
				dout.writeUTF(str2);

				str1=din.readUTF();
				System.out.println(str1);

			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}