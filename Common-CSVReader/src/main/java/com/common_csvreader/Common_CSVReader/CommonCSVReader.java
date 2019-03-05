package com.common_csvreader.Common_CSVReader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CommonCSVReader {

	 private static final String SAMPLE_CSV_FILE_PATH = "C:\\Users\\GROSU-TI\\eclipse-workspace\\openCSV\\students.csv";

	    public static void main(String[] args) throws IOException {
	        try (
	            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
	            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
//	            		.withFirstRecordAsHeader()
//	                    .withIgnoreHeaderCase()
//	                    .withTrim());
	        ) {
	        	String firstname = "";
	        	String lastname = "";
	        	String averagegrade = "";
	        	String yearofstudy = "";
	        	int counter = 0;
	            for (CSVRecord csvRecord : csvParser) {
	                // Accessing values by the names assigned to each column
	            	counter++;
	            	if(counter == 1) {
	            		firstname = csvRecord.get(0);
	 	                lastname = csvRecord.get(1);
	 	                averagegrade = csvRecord.get(2);
	 	                yearofstudy = csvRecord.get(3);
	            	}else {
	            		String firstnamevalue = csvRecord.get(0);
		                String lastnamevalue = csvRecord.get(1);
		                String averagegradevalue = csvRecord.get(2);
		                String yearofstudyvalue = csvRecord.get(3);
		                System.out.printf("%s : %s%n",firstname,firstnamevalue);
		                System.out.printf("%s : %s%n",lastname,lastnamevalue);
		                System.out.printf("%s : %s%n",averagegrade,averagegradevalue);
		                System.out.printf("%s : %s%n",yearofstudy,yearofstudyvalue);
		                System.out.println();
	            	}
	                
	            }
	        	List<CSVRecord> csvRecords = csvParser.getRecords();
	        	for(int i = 0; i < csvRecords.size(); i++)
	        	{
	        		System.out.println(csvRecords.get(0));
	        	}
	        }
	    }
}
