package love.java8.String;

import java.util.StringJoiner;

public class StringJoiner8 {
	public static void main(String[] args) {
		StringJoiner joiner=new StringJoiner(",");
		joiner.add("love").add("kumar").add("bhatia");
		String s=joiner.toString();
		System.out.println(s);
		
		//to add post fix and prefix
		StringJoiner joiner2=new StringJoiner(",","{","}");
		joiner2.add("love").add("kumar").add("bhatia");
		String s1=joiner2.toString();
		System.out.println(s1);
		
		//String joiner can be used directly from string class
		String s3=String.join(",", "love","kumar","bhatia");
		System.out.println(s3);
		
		//From String class , with an iterable
		String [] tab= {"love","kumar","bhatia"};
		String s4=String.join(",",tab);
		System.out.println(s4);
	}

}
