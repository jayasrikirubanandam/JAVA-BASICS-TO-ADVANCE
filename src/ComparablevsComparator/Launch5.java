package ComparablevsComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee2 implements Comparable<Employee2>{
	int empId;
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	String empName;
	int empAge;

	public Employee2() {

	}

	public Employee2(int empId, String empName, int empAge) {
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
	public int compareTo(Employee2 o) {
		if(this.empAge > o.empAge)
			return 1;
		else
			return -1;
		
	}


}
public class Launch5 {

	public static void main(String[] args) {
		List<Employee2> ls = Arrays.asList(
				new Employee2(1,"JAy",5),
				new Employee2(2,"Raj",34),
				new Employee2(3,"Lasksh",13),
				new Employee2(4,"Andhu",5));
		
		Comparator<Employee2> com = Comparator.comparingInt(Employee2 :: getEmpAge).thenComparing(Employee2 :: getEmpName);

		
		
		Collections.sort(ls,com);
		System.out.println(ls);

	}

}
