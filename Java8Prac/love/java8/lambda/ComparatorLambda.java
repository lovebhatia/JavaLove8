package love.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {
	public static void main(String[] args) {
		
		Comparator<String> comparatorSimple=new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.length(), o2.length());
			}
		};
		
		Comparator<String> comparatorLambda= (s1,s2) -> {
			return Integer.compare(s1.length(), s2.length());			
		};
		
		
		List<String> list=Arrays.asList("***","**","****","*");
		Collections.sort(list, comparatorSimple);
		Collections.sort(list, comparatorLambda);
		for(String s: list)
		{
			System.out.println(s);
		}
	}

}
