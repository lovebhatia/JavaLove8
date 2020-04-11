package love.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ChainConsumers {
	public static void main(String[] args) {
		List<String> strings=Arrays.asList("one","two","three","four","five");
		List<String> result= new ArrayList<String>();
		
		Consumer<String> c1= new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		Consumer<String> c2= (s1) -> System.out.println(s1);
		//with method reference
		Consumer<String> c3=System.out::println;
		
		Consumer<String> consumer= s-> result.add(s);
		Consumer<String> consumer2= result::add;
		
		//strings.forEach(c3);
		strings.forEach(c3.andThen(consumer2));
		System.out.println("Size  of list : " +result.size());
	}

}
