import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class five {
	public static void main(String[] args) {
		int[] random1 = new int[100];
		int[] random2 = new int[100];
		for (int i = 0; i < 100; i++) {
			random1[i] = (int) (Math.random() * 101);
		}
		File file = new File("Exercise12_15.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(1);
		}
		try{
			PrintWriter output = new PrintWriter(file); 
			for (int i = 0; i < 100; i++) {
				output.print(random1[i]);
				output.print(" ");
			}
			output.close();
			Scanner input = new Scanner(file);
			int j = 0;
			while (input.hasNext()) {
				random2[j++] = input.nextInt();
			}
			input.close();
		}
	    catch(FileNotFoundException ex){
            System.out.println(ex);
            System.exit(0);
        }
		for (int i = 0; i < random2.length - 1; i++) {
			int min = random2[i];
			int a = i;
			for (int k = i + 1; k < random2.length; k++) {
				if (min > random2[k]) {
					min = random2[k];
					a = k;
				}
			}
			if (a != i) {
				random2[a] = random2[i];
				random2[i] = min;
			}
		}
		for (int i = 0; i < random2.length; i++) {
			if(i%10==0)
				System.out.println();
			System.out.print("\t"+random2[i]);
		}
	}
}