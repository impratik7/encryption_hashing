import java.net.*;
import java.io.*;
import java.util.*;

class tserver
{
	public static void main(String args[])
	{
		try
		{
			ServerSocket ss=new ServerSocket(4545);
			Socket s=ss.accept();
		
			DataInputStream din=new DataInputStream(s.getInputStream());
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			Scanner sc=new Scanner(System.in);

			String str1,str2="";

			while(!str2.equals("stop"))
			{
				str2=din.readUTF();
				System.out.println(str2);
				
				str1=sc.next();
				dout.writeUTF(str1);

			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}