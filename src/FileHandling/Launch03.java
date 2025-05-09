package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//try with resourses - replacement for finally 
//all resorsec implements implements autoclosable intefrace 

class Student1 implements Serializable{

	
	private int id;
	private String name;
	private int marks;
	
	public Student1(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	
	 void disp() {
		System.out.println("Student [id=" + id + ", name=" + name + ", marks=" + marks + "]"); 
	}
	
	
}

class Alien implements AutoCloseable{

	
	public void close() throws Exception {
		System.out.println("closing ");
		
	}
	
}
public class Launch03 {

	public static void main(String[] args) throws IOException {
		
		Student1 s1 = new Student1(1,"Jay",97);
		Student1 s2 = new Student1(2,"Raj",97);
		s1.disp();
		
		//serialization convert object to byte 
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/jayk/Desktop/obj.txt"))) {
			
			oos.writeObject(s1);
			oos.writeObject(s2);
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		//finally {
			// we cant close here what happens if exception throws in the above line.the lines below do not execute .T
						//thats why we need to close this at finally block
						//oos.close();
						//fos.close();
		//}
	}

}
