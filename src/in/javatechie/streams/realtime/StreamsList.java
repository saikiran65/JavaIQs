package in.javatechie.streams.realtime;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class myComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o1.getSal()-o2.getSal());
	}
	
}

public class StreamsList {
	
	public static void main(String[] args) {
		
		List<Employee> empList = DataBase.data();
		
//------- sorting based on sal ------------
		
//		1. conventional process (Collections.sort()-------
		/*
		Collections.sort(empList,new myComparator());
		empList.forEach(emp -> System.out.println(emp));
		*/
		
//		2.using lambda expression (Collections.sort()--------
		/*
		Collections.sort(empList,(emp1,emp2) -> (emp1.getId()-emp2.getId()));
		empList.forEach(emp -> System.out.println(emp));
		*/
		
//		3.using Streams ----------------------
		/*
		empList.stream().sorted(new myComparator()).forEach(emp -> System.out.println(emp));
		empList.stream().sorted((emp1,emp2)->(emp1.getId()-emp2.getId())).forEach(emp -> System.out.println(emp));
		*/
		
//		4.Comparator.comparing() method ------------------------
		/*
		empList.stream().sorted(Comparator.comparing(emp -> emp.getSal())).forEach(emp -> System.out.println(emp));
		empList.stream().sorted(Comparator.comparing(emp -> -emp.getSal())).forEach(emp -> System.out.println(emp));
		*/
		
//		5.MethodReference------------
//		empList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
		
		//Practice***************************
		
//		empList.stream().sorted((e1,e2)->e1.getDept().compareTo(e2.getDept())).forEach(System.out::println);
//		empList.stream().sorted(new myComparator()).forEach(System.out::println);
//		empList.stream().sorted(Comparator.comparing(Employee::getDept)).forEach(System.out::println);
		empList.stream().sorted(Comparator.comparing(v -> v.getDept())).forEach(System.out::println);
	}
	
	

}
