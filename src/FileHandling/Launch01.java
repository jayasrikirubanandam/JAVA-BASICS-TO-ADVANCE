package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Flushable;
import java.io.IOException;

//input output operations - .io package
//here file writer / reader reads single char at a time . so the no of hits to hard disk is more . 
//to make it more efficient buffer reader and writer is added to it .

//BufferedReader/ writer can be used for efficiency purpose -> this is not an replacemnet for file reader.It just boost t
public class Launch01 {

	public static void main(String[] args) throws IOException {
		
		
		File file = new File("/Users/jayk/Desktop/java.txt");
		//FileWriter writer = null;
		FileReader reader = new FileReader(file);
		BufferedReader re = new BufferedReader(reader);
		
		try {
			
			//file.createNewFile();
			//writer = new FileWriter(file);
			//writer.write("Java");
			
//			int i= reader.read();
//			while(i != -1) {
//				System.out.print((char)i);
//				i= reader.read();
//				
//			}
			String str = re.readLine();
			
			while(str != null) {
				System.out.println(str);
				str = re.readLine();
				
			}
			
			
		} catch (IOException e) {
			
			System.out.println("Invalid");
		}
	
		finally {
		
				//writer.close();
				reader.close();
				re.close();
				
		}
		
		

	}

}
