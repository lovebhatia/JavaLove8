package love.java8.collector;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import love.java8.model.Person;
import sun.reflect.generics.tree.Tree;

public class CollectorExample {
	public static void main(String[] args) {
		List<Person> persons=new ArrayList<Person>();
		persons.add(new Person("love",279));
		persons.add(new Person("dove1",278));
		persons.add(new Person("pove2",277));
		persons.add(new Person("sove3",272));
		persons.add(new Person("kove4",275));
		persons.add(new Person("move5",274));
		persons.add(new Person("love6",272));
		persons.add(new Person("pove7",272));
		persons.add(new Person("pove8",271));
		
		
		/*
		
		try(
				BufferedReader reader=new BufferedReader(new InputStreamReader(CollectorExample.class.getResourceAsStream("people.txt")));
				Stream<String>  stream=reader.lines();
			)
		{
			stream.map(line -> {
				String[] s=line.split(" ");
				Person p=new Person(s[0].trim(), Integer.parseInt(s[1]));
				persons.add(p);
				return p;
				
			})
			.forEach(System.out::println);
		} catch (IOException e) {
			// TODO: handle exception
		}
		*/
		//Stream<Person> stream=persons.stream();
		Optional<Person> optional=
				persons.stream().filter(p -> p.getAge() > 272)
				.min(Comparator.comparing(Person:: getAge));
		System.out.println(optional);
		
		
		
		Optional<Person> optional2=
				persons.stream().filter(p -> p.getAge()<272)
				.max(Comparator.comparing(Person::getAge));
		System.out.println(optional2);
		
		
		//Map<Integer, List<Person>> map=
		//Map<Integer, Long> map=
		//Map<Integer, List<String>> map=
		//Map<Integer, Set<String>> map=
		Map<Integer,String> map=
		persons.stream()
		//.collect(Collectors.groupingBy(Person :: getAge,Collectors.counting()));
		//.collect(Collectors.groupingBy(Person :: getAge,Collectors.mapping(Person :: getName, Collectors.toList())));
		//.collect(Collectors.groupingBy(Person :: getAge,Collectors.mapping(Person :: getName, Collectors.toCollection(TreeSet::new))));
		.collect(Collectors.groupingBy(Person :: getAge,Collectors.mapping(Person :: getName, Collectors.joining(", "))));
		System.out.println(map);
				 
	}

}
