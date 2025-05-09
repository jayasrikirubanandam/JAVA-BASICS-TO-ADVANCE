package ComparablevsComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
	
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


	public Student(int id, String name, char grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
	
	
	
}
public class Launch3 {

	public static void main(String[] args) {
		
		List<Student> students =  Arrays.asList(
				new Student(17,"Jay",'A'),
				new Student(20,"Raj",'D'),
				new Student(18,"Sri",'A'));
		
		//ArrayList<Integer> no = (ArrayList<Integer>)Arrays.asList(2,12,1);
		
		Comparator<Student> comp = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.getGrade() == (o2.getGrade())) {
					if(o1.getName().charAt(0) > o2.getName().charAt(0)) {
						return 1;
					}else {
						return -1;
					}
				}
				else {
					if(o1.getGrade() > o2.getGrade()) {
						return 1;
					}else {
						return -1;
					}
				}
				
			
			}
			
		};
		//Collections.sort(students,comp );
		Collections.sort(students, 
				(Student o1, Student o2)  ->
		{
				if(o1.getGrade() == (o2.getGrade())) {
					if(o1.getName().charAt(0) > o2.getName().charAt(0)) {
						return 1;
					}else {
						return -1;
					}
				}
				else {
					if(o1.getGrade() > o2.getGrade()) {
						return 1;
					}else {
						return -1;
					}
				}
				
			
			}
			
	);
		
		
		for(Student s : students)
			System.out.println(s);

	}

}
