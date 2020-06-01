import java.net.*;
import java.util.*;
import java.io.*;

class myclient2
{
	public static void main(String args[])
	{
		try
		{
			Socket s=new Socket("localhost",4545);
			
			String str2,str1="";
			while(!str1.equals("stop"))
			{
				DataInputStream din=new DataInputStream(s.getInputStream());
				DataOutputStream dout=new DataOutputStream(s.getOutputStream());
				Scanner sc=new Scanner(System.in);
				
				
				str2=sc.nextLine();
				dout.writeUTF(str2);
				
				str1=(String)din.readUTF();
				System.out.println("From server="+str1);
			}
	
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}