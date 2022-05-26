package com.ami.streams;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _Stream {
	
	public static void main(String[] args) {
		
		List<Customer> clist = List.of(
				new Customer(91,"parker",89.90,"MALE"),
				new Customer(99,"jake",87.87,"MALE"),
				new Customer(97,"Kate",78.86,"FEMALE")
				);
		
//		map(Function<T,R>)
		Consumer<? super String> action = r -> System.out.println(r);
		clist.stream().map(c -> c.name).forEach(action);
		clist.stream().map(c -> c.gender).forEach(r -> System.out.println(r));
		clist.stream().map(c -> c.gender).collect(Collectors.toSet()).forEach(System.out::println);
		
//		allMatch(Predicate<T>)
		boolean allMatch = clist.stream().allMatch(c -> c.gender.equals("MALE"));
		System.out.println(allMatch);
		
//		anyMatch(Predicate<T>)
		boolean anyMatch = clist.stream().anyMatch(c -> c.gender.equals("FEMALE"));
		System.out.println(anyMatch);
		
//		noneMatch(Predicate<T>)
		boolean noneMatch = clist.stream().noneMatch(c -> c.price>90.0);
		System.out.println(noneMatch);
		
//		distinct() [ to be explained]
//		Stream<Customer> distinct = clist.stream().distinct();
//		distinct.forEach(System.out::println);
		
//		filter(Predicate<T>)
		clist.stream().filter(c -> c.gender.equals("MALE")).forEach(System.out::println);
		
//		findAny() [ picks random obj of the stream returns in the form of Optional<T>
		Optional<Customer> findAny = clist.stream().findAny();
		System.out.println(findAny);
		
		List<List<String>> list = List.of(
				List.of("sam","jake","peter"),
				List.of("Bat","ball","catch"),
				List.of("Cricket","Hockey","Chess")
				);
		List<String> list2 = list.stream().flatMap(Collection::stream).collect(Collectors.toList());
		System.out.println(list2);
		
	}
	
	static class Customer {
		int id;
		String name;
		Double price;
		String gender;
		public Customer(int id, String name, Double price, String gender) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
			this.gender =  gender;
		}
		@Override
		public String toString() {
			return "Customer [id=" + id + ", name=" + name + ", price=" + price + ", gender=" + gender + "]";
		}
		
	}

}
