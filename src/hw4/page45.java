package hw4;
import java.io.*;

public class page45 {
	public static void main() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("please enter 5 people 's score");
		int test[] = new int[5];
		for(int i=0;i<test.length;i++) {
			String str= br.readLine();
			test[i]=Integer.parseInt(str);
		}
		
		for(int s=0;s<test.length-1;s++) {
			for(int t=s+1;t<test.length-1;t++) {
				if(test[t]>test[s]) {
					int tmp = test[t];
					test[t] = test[s];
					test[s] =tmp;
				}
				
			}
		}
		
		for(int i=0;i<test.length;i++) {
			System.out.println(i+"(st,nd,rd,th)'s score is "+test[i]);
			
		}
	
	}
}