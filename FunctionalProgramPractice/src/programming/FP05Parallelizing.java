package programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class FP05Parallelizing {

	public static void main(String[] args) {
		System.out.println("processor I5");
		long time = System.currentTimeMillis();
	    System.out.println(LongStream.range(0, 1000000000).parallel().sum());
	    System.out.println(LongStream.range(0, 1000000000).parallel().sum());
	    System.out.println(LongStream.range(0, 1000000000).parallel().sum());
	    System.out.println(LongStream.range(0, 1000000000).parallel().sum());
	    System.out.println(LongStream.range(0, 1000000000).parallel().sum());
	    
	    System.out.println(System.currentTimeMillis()-time);

	}

	

	
}
