package programming;

import java.util.Arrays;
import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(23,12,13,24,22,26,45,45);
		//printAllNumberInListStructure(numbers);
		printAllEvenNumberInListStructure(numbers);

	}

	private static void printAllEvenNumberInListStructure(List<Integer> numbers) {
		for(Integer number: numbers) {
			if(number%2==0) {
				System.out.println(number);
			}
			
		}
		
	}

	private static void printAllNumberInListStructure(List<Integer> numbers) {
		//using general for loop approach
		
		for(Integer number: numbers) {
			System.out.println(number);
		}
		
	}

}
