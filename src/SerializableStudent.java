import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableStudent implements Serializable {

	String name;
	int age;
	
	public SerializableStudent(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) throws IOException {
		
		SerializableStudent student = new SerializableStudent("jay", 24);
		
		String filePath = "";
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(student);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//try with resources
		
		try(FileOutputStream fos = new FileOutputStream(filePath)){
			
		}
	}

}
