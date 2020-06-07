import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class eight {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter a filename:");
		File file = new File(in.nextLine());
		int[] count=new int[26];
		if (!file.exists()) {
			System.out.println("File doesn't exist");
			System.exit(1);
		}
		try{
			Scanner input = new Scanner(file);
			while (input.hasNext()) {
				String line=input.next().toUpperCase();
				for(int i=0;i<line.length();i++)
				{
					if(line.charAt(i)>=65&&line.charAt(i)<=90)
						count[line.charAt(i)-'A']++;
				}
			}
			for(int i=0;i<26;i++)
			{
				char word=(char)('A'+i);
				System.out.println("Number of "+word+"'s: "+count[i]);
			}
		}
		catch(FileNotFoundException ex){
	           System.out.println(ex);
	           System.exit(0);
		}
	}
}