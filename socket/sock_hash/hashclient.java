import java.net.*;
import java.util.*;
import java.io.*;
import java.security.*;
import java.math.*;



class hashclient
{
	public static void main(String args[])
	{
		try
		{
			Socket s=new Socket("127.0.0.1",4545);
			
			String str="";
			while(!str.equals("stop"))
			{
				DataOutputStream dout=new DataOutputStream(s.getOutputStream());
				Scanner sc=new Scanner(System.in);
				str=sc.nextLine();
				dout.writeUTF(str);
				//dout.flush();
			}
	
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}