import java.net.*;
import java.io.*;

class myserver
{
	public static void main(String args[])
	{
		try
		{
			ServerSocket ss=new ServerSocket(4545);
			Socket s=ss.accept();
			
			String str="";
			while(!str.equals("stop"))
			{
				DataInputStream din=new DataInputStream(s.getInputStream());

				str=(String)din.readUTF();
		
				System.out.println("From client="+str);

			}
			ss.close();
		}
		catch(Exception e)
		{
			System.out.println(e);	
		}
	}
}