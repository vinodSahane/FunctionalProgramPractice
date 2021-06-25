package programming;

import java.util.Arrays;
import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(23,12,13,24,22,26,45,45);
		//printAllNumberInListFunction(numbers);
		//printAllEvenNumberInListFunction(numbers);
		//printAllOddNumberInListFunction(numbers);
		printAllCubeNumberInListFunction(numbers);

	}

	private static void printAllCubeNumberInListFunction(List<Integer> numbers) {
		numbers.stream()
		        .filter(number->number%2 !=0)
		        .map(number->number*number*number)
		        .forEach(System.out::println);
		
	}

	private static void printAllOddNumberInListFunction(List<Integer> numbers) {
		numbers.stream()
		.filter(number->number%2 !=0)
		.forEach(System.out::println);
		
	}

	private static void printAllEvenNumberInListFunction(List<Integer> numbers) {
		numbers.stream()
				.filter(FP01Functional::filterdata)
				.forEach(System.out::println);
		
	}
	
	private static boolean filterdata(int number) {
		return number%2==0;
	}

	private static void printAllNumberInListFunction(List<Integer> numbers) {
		numbers.stream()
		.forEach(System.out::print);
		
	}
	

}
