/************************
 * Ciro Amaral
 * Java II
 * Assignement 5 part 1
 * 02/21/2017
 ************************/

import java.io.*;

public class FileDetails {
	
	public FileDetails(String string) {
		
		File file = new File("/Users/Ciro/Lesson5/SprLab5.doc");
		
		if(file.exists()){
			
		System.out.println("Name: " + file.getName());
		System.out.println("Path: " + file.getPath());
		System.out.println("Size: " + file.length() + " bytes");
		System.out.println("Can the file be read? " + file.canRead());
		System.out.println("Can the file be written? " + file.canWrite());
		}	
	}

	public static void main(String[] args) {
		
		FileDetails fd = new FileDetails("SprLab5.doc");
		
	}
	
}

