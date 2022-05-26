package in.javatechie.streams.realtime;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBase {
	
	static Employee e1 = new Employee(133,"Rupesh","IT",898989L);
	static Employee e2 = new Employee(141,"Suresh","POLITICAL",1898989L);
	static Employee e3 = new Employee(162,"Bharat","BUSINESS",998989L);
	static Employee e4 = new Employee(154,"Krishna","CIVIL",56349L);
	static Employee e5 = new Employee(198,"Vimal","CORE",454545L);
	
	public static List<Employee> data() {
		List<Employee> empList = Arrays.asList(e1,e2,e3,e4,e5);
		return empList;
	}
	
	public static Map<Integer,Employee> mapData(){
		Map<Integer,Employee> m1 = new HashMap<>();
		m1.put(9, e1);
		m1.put(8, e2);
		m1.put(6, e3);
		m1.put(4, e4);
		m1.put(5, e5);
		return m1;
	}
	
	

}
