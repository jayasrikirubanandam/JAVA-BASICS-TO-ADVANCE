package ComparablevsComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//BOTH USED FOR SORTING OBJECTS 
//using COMPARABLE - you can use only when you are able to modify the class.
//Sometimes class will be static in that case we have to use comparator

class Employee implements Comparable<Employee>{
	
	int empId;
	String empName;
	int empAge;
	
	

	public Employee(int empId, String empName, int empAge) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + "]";
	}
	
	@Override
	public int compareTo(Employee e) {
	//sort based on age
		if(this.empAge  > e.empAge && this.empId > e.empId) {
			return 1;
		}else {
			return -1;
		}
	}
	
}
public class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List empList = new ArrayList();
		empList.add(new Employee(34, "jay", 28));
		empList.add(new Employee(53, "Raj", 32));
		empList.add(new Employee(78, "Yuva", 31));
		empList.add(new Employee(24, "sri", 29));
		
		
		List empList1 = Arrays.asList(
		new Employee(34, "jay", 28),
		new Employee(53, "Raj", 32),
		new Employee(78, "Yuva", 31),
		new Employee(24, "sri", 29)
		);
		
		//collections is a class from util package which has all algorithm in method form.
		Collections.sort(empList); // doesn't know on what basis it has to sort

		System.out.println(empList);
	}

	

}
