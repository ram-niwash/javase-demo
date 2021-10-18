package com.techhub.javasedemo.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class ExceptionTypeMain {

	public static void main(String[] args) {
		System.out.println("************ Program Started ************");

		File file = new File("/abc/xyz/myfile.txt");

//		InputStream inputStream =new FileInputStream(file);

		System.out.println("************ Program Ended ************");
	}

}
