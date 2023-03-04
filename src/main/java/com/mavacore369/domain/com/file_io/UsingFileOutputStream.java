package com.mavacore369.domain.com.file_io;

import java.io.*;

public class UsingFileOutputStream {

	public static void main(String[] args) {
		try {
			File file = new File("/home/virus_men/testJavaFile.txt");
			FileOutputStream fOutputStream = new FileOutputStream(file);
			BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(fOutputStream));
			bWriter.write("Write Somthing on this file.....");
			bWriter.newLine();
			bWriter.write("How are you ?");
			bWriter.newLine();
			bWriter.close();
		}catch(FileNotFoundException fileNotFound) {
			// Error when file  not found
			fileNotFound.printStackTrace();
		}catch(IOException io) {
			// Error when writing to the file
			io.printStackTrace();
		}
	}

}
