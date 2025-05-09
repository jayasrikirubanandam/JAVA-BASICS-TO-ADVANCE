package Generics;
//Gnerics is a feature of an progragramming where you define the type of an variable , class , function while instantiating the class 
//its act as a placeholder where you define the datatypes at instantiating the class
class Stu<T> {

	private T id;
	private T name;
	private T marks;
	
	public Stu(T id, T name, T marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Stu [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
}



public class Launch01 {

	public static void main(String[] args) {
		
		Stu<Stu> s = new Stu(4,"Jay",90);
		System.out.println(s.toString());
		
		
	}

}
