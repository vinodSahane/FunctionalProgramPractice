package programming;

import java.util.Arrays;
import java.util.List;

public class FP02Structured {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(200,100,13,24,22,26,45,450);
		
		int sum = printSumNumberInListStructure(numbers);
		System.out.println(sum);

	}

	private static int printSumNumberInListStructure(List<Integer> numbers) {
		int sum = 0;
		for(int number:numbers) {
			sum+=number;
		}
		return sum;
	}

	
}
