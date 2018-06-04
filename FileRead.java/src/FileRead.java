/************************
 * Ciro Amaral
 * Java II
 * Assignement 5 part 3
 * 02/21/2017
 ************************/

import java.io.*;

//Reading files class
public class FileRead {

	//Constructor
	public FileRead(String path) {
		
		//Creating file object
		File file1 = new File(path);
		FileInputStream fin;
		int i = 0;
		char c;
		
		//check to see if file exist
		if(file1.exists()){
			
		//try and catch block
		try{
			fin = new FileInputStream(path);
			String content;
			byte[] fileContent = new byte[10];
			i = fin.read(fileContent);
			content = new String(fileContent);
			System.out.println(content);
			fin.close();
		
		}
		catch(IOException e){
			e.printStackTrace();
		}
		}
		else{
			System.out.println("File does not exist");
		}
	}

	public static void main(String[] args) {
		FileRead fr = new FileRead("myfile.txt");

	}

}
