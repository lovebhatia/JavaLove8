package love.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionExample {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,-10);
		Integer red=list.stream().reduce(0,Integer::max);
		Optional<Integer> red1=list.stream().reduce(Integer::max);
		
		//it will give the sum of identity element and sum of integers in the list.
		System.out.println(red1);
	}

}
