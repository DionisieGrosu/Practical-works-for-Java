package com.Scanner.ScannerMethod;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerMethod {
	 public static void main(String[] args) throws FileNotFoundException
	    {
	        //Get scanner instance
	        Scanner scanner = new Scanner(new File("C:\\Users\\GROSU-TI\\eclipse-workspace\\openCSV\\students.csv"));
	         
	        //Set the delimiter used in file
	        scanner.useDelimiter(",");
	         
	        //Get all tokens and store them in some data structure
	        //I am just printing them
	       
	        while (scanner.hasNext())
	        {
	        	
	            System.out.print(scanner.next() + "|");
	        	
	        }
	        scanner.close();
	    }
	         
	        //Do not forget to close the scanner 
	    }
