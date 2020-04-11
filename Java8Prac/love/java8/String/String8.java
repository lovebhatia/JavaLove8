package love.java8.String;

import java.util.stream.IntStream;

public class String8 {
	public static void main(String[] args) {
		String s="Hello World!";
		IntStream stream=s.chars();
		stream	
				.mapToObj(letter -> (char)letter)
				.map(Character :: toUpperCase)
				.forEach(System.out::println);
	}
}
