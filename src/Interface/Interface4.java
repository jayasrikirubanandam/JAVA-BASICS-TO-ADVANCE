package Interface;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Marker Interface- Serializable 

class Student implements Serializable{
	
	int id;
	String name;
	
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}


interface carable{
	
	
}

class Vehicle implements carable {
	
	void show () {
		System.out.println("it is a vehicle?");
	}
}


public class Interface4 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		// save this object in  a file. object to byte format - serializable
		Vehicle v = new Vehicle();
		if(v instanceof carable) {
			v.show();
		}
		Student s = new Student(17, "jayasri");
		
		FileOutputStream fos = new FileOutputStream("/Users/jayk/Desktop/obj.txt ");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.flush();
		oos.close();
		
		System.out.println("object is written on file ");
		
		// need object from file - byte to object format - deserializable
		
		FileInputStream fis = new FileInputStream("/Users/jayk/Desktop/obj.txt ");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s1 = (Student) ois.readObject();
		System.out.println("Id: " +s1.id + "Name:" + s1.name);

	}

}
