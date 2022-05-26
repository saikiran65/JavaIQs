package in.javatechie.functionalInterfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student{
	Integer id;
	String name;
	
	
	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

public class MyLambdaEg {
	

	public static void main(String[] args) {
		
		Student s1 = new Student(131,"sam");
		Student s2 = new Student(102,"peter");
		Student s3 = new Student(121,"brooke");
		
		List<Student> list = Arrays.asList(s1,s2,s3);
		
		Collections.sort(list, (t1,t2)-> t1.name.compareTo(t2.name));
		
		list.stream().forEach(t -> System.out.println(t));
		
		
	}
	

}
