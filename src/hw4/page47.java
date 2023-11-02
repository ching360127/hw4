package hw4;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class page47 {
	public static void main() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("please enter 5 people 's score");
		int test[] = new int[5];
		
		for(int i=0;i<test.length;i++) {
			String str= br.readLine();
			test[i]=Integer.parseInt(str);
		}
		
        Arrays.sort(test, Collections.reverseOrder());       
		
		for(int i=0;i<test.length;i++) {
			System.out.println(i+"(st,nd,rd,th)'s score is "+test[i]);
			
		}
	
	}
}