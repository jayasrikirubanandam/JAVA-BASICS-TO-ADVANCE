package ComparablevsComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//USING COMPARATOR 

//I cannot modify employee1 class -Not allowed in that case we can use comparator
class Employee1 {

	int empId;
	String empName;
	int empAge;

	public Employee1() {

	}

	public Employee1(int empId, String empName, int empAge) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + "]";
	}


}

//this class is mainly created to implement comparator
class GetEmp implements Comparator<Employee1>{


	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		if(o1.empId > o2.empId) {
			return 1;
		}else {
			return -1;
		}
	}

}
public class Launch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		List<Employee1> empList1 = Arrays.asList(
				new Employee1(34, "jay", 28),
				new Employee1(53, "Raj", 32),
				new Employee1(78, "Yuva", 31),
				new Employee1(24, "sri", 29)
				);


		//Collections.sort(empList1, new GetEmp());
		//empList1.sort(new GetEmp());

		//Anonymous class
		//		Comparator<Employee1> emp = new Comparator<Employee1>() {
		//			
		//			
		//			@Override
		//			public int compare(Employee1 o1, Employee1 o2) {
		//				if(o1.empId > o2.empId) {
		//					return 1;
		//				}else {
		//					return -1;
		//				}
		//			}
		//		};

		// Lambda expression

		Comparator<Employee1> emp1 = (Employee1 o1, Employee1 o2) ->
		{
			if(o1.empId > o2.empId) 
				return 1;
			else 
				return -1;

		};


		//applying lambda expression directly on the required place
		Collections.sort(empList1, 
				(Employee1 o1, Employee1 o2) ->
		{
			if(o1.empId > o2.empId) 
				return 1;
			else 
				return -1;

		}
				);
		System.out.println(empList1);
	}

}
