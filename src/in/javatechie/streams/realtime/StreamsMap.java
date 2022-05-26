package in.javatechie.streams.realtime;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.Set;

public class StreamsMap {
	
	public static void main(String[] args) {
		
		Map<Integer, Employee> mapData = DataBase.mapData();
		
//		mapData.forEach((key,value) -> System.out.println(key+" : "+value));
		
		//1.print only names and in order (ascending)
//		mapData.entrySet().stream().map(emp -> emp.getValue().getName()).sorted().forEach(System.out::println);
		
		//2.sort based on id
//		List<Employee> list = mapData.entrySet().stream().map(emp -> emp.getValue()).collect(Collectors.toList());
//		list.stream().sorted(Comparator.comparing(Employee::getId)).forEach(System.out::println);
		
//		mapData.entrySet().stream().map(emp -> emp.getValue()).sorted(Comparator.comparing(Employee::getDept)).forEach(System.out::println);
		
		//3. sort based on the value elements/members/variables
//		mapData.entrySet().stream().sorted((e1,e2)->e2.getValue().getSal().compareTo(e1.getValue().getSal()))
//								   .forEach(System.out::println);
		
		
		
		HashMap<Integer, Employee> collect = mapData.entrySet().stream()
												.sorted((e1,e2)->e1.getValue().getSal().compareTo(e2.getValue().getSal()))
												.collect(Collectors.toMap(
														Map.Entry::getKey,
														Map.Entry::getValue,
														(e1,e2)-> e1,
														LinkedHashMap::new)
												);
		collect.entrySet().stream().forEach(System.out::println);
		
		//4. others
//		mapData.entrySet().stream().forEach(obj -> System.out.println(obj));
		
//		Collections.sort();
		
//		Set<Entry<Integer, Employee>> es = mapData.entrySet();
		
//		es.forEach(val -> System.out.println(val));
	
		//practice***************************
		
		mapData.entrySet().stream().sorted((e1,e2)->e1.getValue().getName().compareTo(e2.getValue().getName()))
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)-> e1, LinkedHashMap::new));
	
	}

}
