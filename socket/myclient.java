import java.net.*;
import java.util.*;
import java.io.*;

class myclient
{
	public static void main(String args[])
	{
		try
		{
			Socket s=new Socket("localhost",4545);
			
			String str="";
			while(!str.equals("stop"))
			{
				DataOutputStream dout=new DataOutputStream(s.getOutputStream());
				Scanner sc=new Scanner(System.in);
				str=sc.nextLine();
				dout.writeUTF(str);
				dout.flush();
			}
	
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}