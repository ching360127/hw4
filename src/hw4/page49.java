package hw4;

public class page49 {
	public static void main() {
		int[][]test;
		test=new int[2][5];
		
		test[0][0]=80;
		test[0][1]=60;
		test[0][2]=22;
		test[0][3]=50;
		test[0][4]=75;
		test[0][0]=90;
		test[0][1]=55;
		test[0][2]=68;
		test[0][3]=72;


				
		for(int i=0;i<test[i].length;i++) {
			System.out.println("the 1(st,nd,rd,th) person's national language score is "+ test[0][i]+"point(s)");
			System.out.println("the 1(st,nd,rd,th) person's mathematics score is "+ test[1][i]+"point(s)");
		}
	}
}