package com.Common_CSVProject.common_csv;
import java.util.Scanner;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.InputMismatchException;

public class CSVWriter {
	 private static final String SAMPLE_CSV_FILE = "C:\\Users\\GROSU-TI\\eclipse-workspace\\common-csv\\studets.csv";

	    public static void main(String[] args) throws IOException {
	    	Scanner input = new Scanner(System.in);
	    	Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE));
	    	if(reader.ready() == false) {
	    		reader.close();
	    		try (
		        		
	    	            BufferedWriter writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE));

	    	            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
	    	                    .withHeader("First Name", "Last Name", "Average Grade","Year of Study"));
	    	    ) 	{
	    	        	
	    			addData(csvPrinter,input);
	    				
	    			}
	    			  
	    	        
	    	    }else {
		    	    	reader.close();
		    	    	try(
		    	    	 BufferedWriter writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE),StandardOpenOption.APPEND);
		    	    			CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
		    	    	){
		    	    		addData(csvPrinter,input);
		    	    	
		    	         }
	    	    }
	    }
	    	    	
	    	    
	    	

	    
	    private static void addData(CSVPrinter csvPrinter, Scanner input) throws IOException {
	    	System.out.println("Зress 0 to exit or 1 to continue");
			int check = input.nextInt();
			while(check != 0) {
				input.nextLine();
				System.out.println("Enter student first name!");
				String firstName = input.next();
				System.out.println("Enter student's last name!");
				String lastName = input.next();
				System.out.println("Enter student's Average Grade!");
				String averageGrade = input.next();
				System.out.println("Enter student's Year of Study!");
				String yearOfStudy = input.next();
				csvPrinter.printRecord(firstName,lastName,averageGrade,yearOfStudy);
				csvPrinter.flush(); 
				
				try{
					System.out.println("Press 0 to exit or 1 to continue");
				check = input.nextInt();
				}catch(InputMismatchException e){
					System.out.println("Press 0 to exit or 1 to continue");
					input.nextLine();
					check = input.nextInt();
				}
			}
	    }
	    
 }

	    
	    

	
