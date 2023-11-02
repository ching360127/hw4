package hw4;
import java.io.*;

public class page34 {
	public static void main() throws IOException {
		System.out.println("how many times does the loop need to run?(1~10");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
				
		for(int i=1;i <=10;i++) {
			if(i==res)
				continue;
			System.out.println(i+"time(s) processing");
		}			
	}
}