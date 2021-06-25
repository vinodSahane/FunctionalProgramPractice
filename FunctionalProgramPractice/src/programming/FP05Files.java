package programming;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class FP05Files {

	public static void main(String[] args) throws IOException {
		
		Files.lines(Paths.get("C:\\Users\\vinod sahane\\Desktop\\Text.txt"))
		.map(str->str.split(" "))
		.flatMap(Arrays::stream)
		.distinct()
		.sorted()
		.forEach(System.out::println);
		
		Files.list(Paths.get("."))
			.filter(Files::isDirectory)
			.forEach(System.out::println);

	}

}
