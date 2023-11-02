package hw4;
import java.io.*;

public class page8 {
	public static void main() throws IOException {
		System.out.println("please enter an integer");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		if(num==1)
			System.out.println("you entered 1");
			System.out.println("Selected 1");
		System.out.println("Process Terminated");		
	}
}
