package  com.classes;
import java.util.Arrays;

public class ArraysApp {
	public static void main(String[] args) {
		int[] numbers = {
			1,4,7,3,56,47
		};
		
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
}