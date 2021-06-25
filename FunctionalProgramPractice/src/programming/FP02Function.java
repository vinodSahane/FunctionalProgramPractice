package programming;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class FP02Function {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(220,110,24,22,26,45,50);
		
		//int sum = printSumNumberInListFunctional(numbers);
		//int sum = printSumNumberInListNANFunctional(numbers);
		//int sum = printMAXNumberInListFunctional(numbers);
		int sum = printMINNumberInListFunctional(numbers);
		System.out.println(sum);

	}

	private static int printMINNumberInListFunctional(List<Integer> numbers) {
		System.out.println(numbers.stream()
			.max(Integer::compare));
		return numbers.stream()
				.reduce(Integer.MAX_VALUE, (x,y)->x>y?y:x);
		
	}

	private static int printMAXNumberInListFunctional(List<Integer> numbers) {
		return numbers.stream()  
		    .reduce(Integer.MIN_VALUE, (x,y)->x>y?x:y);
		
	}

	private static int printSumNumberInListFunctional(List<Integer> numbers) {
		return numbers.stream()
			.reduce(0, FP02Function::sum);
		
	}
	
	private static int printSumNumberInListNANFunctional(List<Integer> numbers) {
		BinaryOperator<Integer> sumBinaryOperator = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				// TODO Auto-generated method stub
				return t+u;
			}
			
		};
		return numbers.stream()
			.reduce(0, sumBinaryOperator);
		
	}
	
	private static int sum(int a, int b) {
		return a + b;
	}

	
}
