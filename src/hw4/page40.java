package hw4;
import java.lang.reflect.Array;

public class page40 {
	public static void main() {
		int[]intArray=(int[]) Array.newInstance(int.class,3);
		
		Array.set(intArray, 0, 123);
		Array.set(intArray, 0, 456);
		Array.set(intArray, 0, 789);
		
		System.out.println("intArray[0] =" + Array.get(intArray, 0));
		System.out.println("intArray[1] =" + Array.get(intArray, 1));
		System.out.println("intArray[2] =" + Array.get(intArray, 2));
	}
}