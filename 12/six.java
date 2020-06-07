import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class six {
	public static void main(String[] args)
	{
		try {
			//URL url=new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
			URL url=new URL("http://guidetogrammar.org/grammar/gettysburg.htm");
			int count=0;
			Scanner input=new Scanner(url.openStream());
			while(input.hasNext())
			{
				String line=input.next();
				count++;
			}
			System.out.println("the number of words is "+count);
		}
		catch(MalformedURLException ex)
		{
			System.out.println("Invalid URL");
		}
		catch(IOException ex)
		{
			System.out.println("I/O Errors: no such file");
		}
	}
}