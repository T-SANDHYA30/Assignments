package com.exceptionss;

import java.io.File;
import java.io.FileNotFoundException;

public class FilenotFound {
	
	private static void useFile(File f) throws  FileNotFoundException {
		if(!f.exists())
			throw new FileNotFoundException();
		// TODO Auto-generated method stub

	}

	public static void main(String[] args)throws FileNotFoundException {
		// TODO Auto-generated method stub
		File f=new File("filerepo.txt");
		useFile(f);

	}

}
