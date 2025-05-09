package FileHandling;
//to transfer data securely from your application to file - serialization , we convert object to byte/binary format 
//other way is deserialization.
import java.io.*;
class Student implements Serializable{

	private int id;
	private String name;
	private int marks;
	
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	
	 void disp() {
		System.out.println("Student [id=" + id + ", name=" + name + ", marks=" + marks + "]"); 
	}
	
	
}

public class Launch02 {

	public static void main(String[] args) throws IOException {
		
		Student s1 = new Student(1,"Jay",97);
		Student s2 = new Student(2,"Raj",97);
		s1.disp();
		
		//serialization convert object to byte 
		
		try {
			FileOutputStream fos = new FileOutputStream("/Users/jayk/Desktop/obj.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(s1);
			oos.writeObject(s2);
			
			// we cant close here what happens if exception throws in the above line.the lines below do not execute .T
			//thats why we need to close this at finally block
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		finally {
			
		}
		
		
		
	}

}
