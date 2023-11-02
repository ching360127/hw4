package hw4;
import java.io.*;

public class page19 {
	public static void main() throws IOException {
		System.out.println("Are you a boy?");
		System.out.println("please enter Y or N");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char letter=str.charAt(0);
		if(letter=='Y'||letter=='y') {
			System.out.println("oh! you are a boy");			
		} else if(letter=='N'||letter=='n') {
			System.out.println("oh! you are a girl");			
		} else {
			System.out.println("please enter Y or N");
			
		}
			
	}
}