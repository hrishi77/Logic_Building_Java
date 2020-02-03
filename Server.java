import java.io.*;
import java.net.*;
class Server
{
	public static void main(String arg[])throws Exception
	{
		System.out.println("Server is Running");
		
		ServerSocket SS = new ServerSocket(1024);
		Socket S = SS.accept();
		BufferedReader brk = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader brs = new BufferedReader(new InputStreamReader(S.getInputStream()));
		PrintStream ps = new PrintStream(S.getOutputStream());
		String str1,str2;
		
		while(true)
		{
			str1 = brs.readLine();
			if(str1==null)
			{
				break;
			}
			System.out.println("Message from Client is :"+str1);
			System.out.println("Enter the Message for Client:");
			str2 = brk.readLine();
			ps.println(str2);
			
		}
	}
}
