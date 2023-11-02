package hw4;
import java.io.*;

public class page21 {
	public static void main() throws IOException {
		System.out.println("please enter an integer");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		char ans = (res==1)?'A':'B';
		System.out.println("Selected" + ans + "plan");
			
	}
}