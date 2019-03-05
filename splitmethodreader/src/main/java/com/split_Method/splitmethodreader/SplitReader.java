package com.split_Method.splitmethodreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SplitReader {

	public static void main(String[] args)
    {
        //Input file which needs to be parsed
        String fileToParse = "C:\\Users\\GROSU-TI\\eclipse-workspace\\openCSV\\students.csv";
        BufferedReader fileReader = null;
         
        //Delimiter used in CSV file
        final String DELIMITER = ",";
        try
        {
            String line = "";
            //Create the file reader
            fileReader = new BufferedReader(new FileReader(fileToParse));
            int counter = 0;
            String firstname = "";
            String lastname = "";
            String averagegrade = "";
            String yearofstudy = "";
            //Read the file line by line
            while ((line = fileReader.readLine()) != null)
            {
                //Get all tokens available in line
                String[] tokens = line.split(DELIMITER);
                
                
//              
                counter++;
                if(counter == 1) {
                	firstname = tokens[0];
                	lastname = tokens[1];
                	averagegrade = tokens[2];
                	yearofstudy = tokens[3];
                }else {
                	System.out.printf("%s : %s%n",firstname,tokens[0]);
                	System.out.printf("%s : %s%n",lastname,tokens[01]);
                	System.out.printf("%s : %s%n",averagegrade,tokens[2]);
                	System.out.printf("%s : %s%n",yearofstudy,tokens[3]);
                	System.out.println();
                }
//                System.out.println(tokens[0]);
                
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally
        {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
