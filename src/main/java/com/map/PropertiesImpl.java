package com.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesImpl {

	public static void main(String[] args) throws Exception,FileNotFoundException {
		Properties p=new Properties();
		FileInputStream fs=new FileInputStream("abc.properties");
		p.load(fs);
		System.out.println(p);
		
		String s=p.getProperty("1");
		System.out.println(s);
		p.setProperty("1","dhoni");
		FileOutputStream fo=new FileOutputStream("abc.properties");
		p.store(fo,"updated by rishabh sharma");
		
	}

}
