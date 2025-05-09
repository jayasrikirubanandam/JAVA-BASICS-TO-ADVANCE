package ComparablevsComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student1 implements Comparable<Student1>{
	
	private int id;
	private String name;
	private char grade;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public char getGrade() {
		return grade;
	}


	public void setGrade(char grade) {
		this.grade = grade;
	}


	public Student1(int id, String name, char grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}


	public int compareTo(Student1 o) {
		
		if(this.getGrade() == o.getGrade()) {
		if(this.getName().charAt(0) > o.getName().charAt(0)) {
			
				return 1;
			}else {
				return -1;
			}
			
		}
		else {
			if(this.getGrade() > o.getGrade()) {
				return 1;
			}else {
				return -1;
			}
		}
		
		
	}
	
	
	
}
public class Launch4 {

	public static void main(String[] args) {
		
		
		List<Student1> students =  Arrays.asList(
				new Student1(17,"Jay",'A'),
				new Student1(20,"Raj",'D'),
				new Student1(18,"Sri",'A'));
		
		
		
		
		Collections.sort(students);
		
		for(Student1 s : students)
			System.out.println(s);
		

	}

}
