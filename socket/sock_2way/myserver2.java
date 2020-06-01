import java.net.*;
import java.io.*;
import java.util.*;

class myserver2
{
	public static void main(String args[])
	{
		try
		{
			ServerSocket ss=new ServerSocket(4545);
			Socket s=ss.accept();
			
			String str1,str2="";
			while(!str2.equals("stop"))
			{
				DataInputStream din=new DataInputStream(s.getInputStream());
				DataOutputStream dout=new DataOutputStream(s.getOutputStream());
				Scanner sc=new Scanner(System.in);
				
				
				str2=(String)din.readUTF();
		
				System.out.println("From client="+str2);

				str1=sc.next();

				dout.writeUTF(str1);

			}
			ss.close();
		}
		catch(Exception e)
		{
			System.out.println(e);	
		}
	}
}