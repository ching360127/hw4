package hw4;
import java.io.*;

public class page16 {
	public static void main() throws IOException {
		System.out.println("please enter an integer");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char letter=str.charAt(0);
		
		switch(letter) {
			case 'a': {
				System.out.println("you entered a");
				break;
			}
			case 'b': {
				System.out.println("you entered b");
				break;
			}
			default: {
				System.out.println("please enter a or b");
				break;
			}
		}
			
	}
}