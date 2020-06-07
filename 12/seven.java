import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class seven {
	public static void main(String[] args) {
		File file = new File("src/Lincoln.txt");
		/*1 2 3 4 5 6 7 8 9
		  9 8 7 6 5 4 3 2 1
		  1 1 1 1 1 1 1 1 1
		  9 9 9 9 9 9 9 9 9 */
		if (!file.exists()) {
			System.out.println("File doesn't exist");
			System.exit(1);
		}
		try{
			Scanner input = new Scanner(file);
			double sum=0;
			double aver=0;
			double count=0;
			while (input.hasNext()) {
				String line=input.next();
				if(line.charAt(0)>=48&&line.charAt(0)<=57)
				{
					sum+=line.charAt(0)-48;
					count++;
				}
			}
			aver=sum/count;
			input.close();
			System.out.println("the sum is:"+sum+",the average is:"+aver);
		}
	    catch(FileNotFoundException ex){
            System.out.println(ex);
            System.exit(0);
		}
	}
}