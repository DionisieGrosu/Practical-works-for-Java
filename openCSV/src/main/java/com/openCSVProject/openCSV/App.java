package com.openCSVProject.openCSV;
import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*; 
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter; 
import java.util.ArrayList;


public class App {
	private static final String filePath  = "C:\\Users\\GROSU-TI\\eclipse-workspace\\openCSV\\students.csv";

	public static void main(String[] args) throws IOException { 
		Scanner input = new Scanner(System.in);
		ArrayList<String[]> Array = new ArrayList<String[]>();
		try {
		File file =  new File(filePath);
		if(file.isFile())
		{
			System.out.println("File open!");
		}
		FileReader read = new FileReader(file);
		
		if(read.ready() == false) {
			read.close();
			FileWriter outputfile = new FileWriter(file,true);
			CSVWriter writer = new CSVWriter(outputfile);
			String[] header = {"First Name", "Last Name", "Average Grade","Year of Study"};
			writer.writeNext(header);
			
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
				String[] data = {firstName,lastName,averageGrade,yearOfStudy};
				Array.add(data);
				writer.writeNext(data);
				try{
					System.out.println("Press 0 to exit or 1 to continue");
				check = input.nextInt();
				}catch(InputMismatchException e){
					System.out.println("Press 0 to exit or 1 to continue");
					input.nextLine();
					check = input.nextInt();
				}
			}
			writer.close();
			}else {
				FileWriter outputfile = new FileWriter(file,true);
				CSVWriter writer = new CSVWriter(outputfile);
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
					String[] data = {firstName,lastName,averageGrade,yearOfStudy};
					Array.add(data);
					writer.writeNext(data);
					try{
						System.out.println("Press 0 to exit or 1 to continue");
					check = input.nextInt();
					}catch(InputMismatchException e){
						System.out.println("Press 0 to exit or 1 to continue");
						input.nextLine();
						check = input.nextInt();
					}
				
			}
				writer.close();
			}
		}catch(java.io.FileNotFoundException e){
			e.printStackTrace();
		}
    }
}