/************************

 * Ciro Amaral
 * Java II
 * Assignement 5 part 2
 * 02/21/2017
 ************************/

import java.io.*;

public class FileWrite {
	
	
	//Constructor
	public FileWrite(String path, String text) {
		File file1 = null;
		FileOutputStream writer = null;
		
		// try block to catch IO exception
		try{
			file1 = new File(path);
			
				//Check to see if file exist
				if(!file1.exists()){
					writer = new FileOutputStream(file1);
					file1.createNewFile();
					byte a1[] = new byte[10];
					a1 = text.getBytes();
					writer.write(a1);
				}
				else{
					System.out.println("File Already Exist");
				}
		}
		
		catch(IOException e){
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		
		FileWrite fw = new FileWrite("NameOfFileToBeCreated.txt", "Content of the file created.");

	}

}
