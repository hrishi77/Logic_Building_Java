import java.io.*;
import java.net.*;
class Client
{
	public static void main(String arg[])throws Exception
	{
		System.out.println("Clinet is Running");
		
		Socket S = new Socket("localhost",1024);
		BufferedReader brk = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader brs = new BufferedReader(new InputStreamReader(S.getInputStream()));
		PrintStream ps = new PrintStream(S.getOutputStream());
		String str1,str2;
		
		while(true)
		{
			System.out.println("Enter the Message for Srever:");
			str1 = brk.readLine();
			if(str1.equals("Exit"))
			{
				break;
			}
			ps.println(str1);
			str2 = brs.readLine();
			System.out.println("Message from Server is :"+str2);
		}
	}
}
