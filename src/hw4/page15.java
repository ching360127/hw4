package hw4;
import java.io.*;

public class page15 {
	public static void main() throws IOException {
		System.out.println("please enter an integer");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		switch(num) {
			case 1: {
				System.out.println("you entered 1");
			}
			case 2: {
				System.out.println("you entered 1");
			}
			default: {
				System.out.println("please enter 1 or 2");
			}
		}
			
	}
}