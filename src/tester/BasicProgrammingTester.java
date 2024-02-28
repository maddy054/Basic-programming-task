package tester;	

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import invalidexception.InputInvalidException;
import task.BasicProgrammingTask;
import task.BasicTask;

public class BasicProgrammingTester {
	public static void main(String... args) {
		BasicProgrammingTask myTask = new BasicProgrammingTask();
		Logger logger = Logger.getLogger(TimeTester.class.getName());
		
		try(Scanner intScanner = new Scanner(System.in);
				Scanner taskScanner = new Scanner(System.in)){
		int select = 0;
		do {
		
			try {
				
				 logger.log(Level.INFO,"choose any one ");
				select = intScanner.nextInt();
	            switch(select) {
	            
	            case 1:
	           
	            	 logger.log(Level.INFO,"Enter the name of the file ");
	            	String name = taskScanner.nextLine();
	            	
	            	File myFile = myTask.createFile(name);
				
	            	 logger.log(Level.INFO,"Enter the number of text you want to add ");
	            	int count = intScanner.nextInt();
				    String[] text = new String[count];
	            	for(int i=0;i<count;i++) {
	            		 logger.log(Level.INFO,"Enter the text "+(i+1)+" to write in file");
	            	    text[i] = taskScanner.nextLine(); 
	            	}
	            	myTask.writeOnFile(myFile, text);
	            	break;
	            case 2:
	            case 4:
	            	
	            	Properties myProperty = myTask.getProperty();
	            	 logger.log(Level.INFO,"Enter the number of key value pair add to properties");
	            	int propCount = intScanner.nextInt();
	            	
	            	for(int i=0;i<propCount;i++) {
	            		 logger.log(Level.INFO,"enter the key");
	            		String key = taskScanner.nextLine();
	            		 logger.log(Level.INFO,"enter the corresponding value");
	            		String value = taskScanner.nextLine();
	            		myTask.storeValue(null, key, value);
	            	
	            	}
	            	 logger.log(Level.INFO,"The value of properties afetr adding keys and value pair "+myProperty);
	            	
	            	if(select == 2) {
	            		File propFile = myTask.createFile("myprop.txt");
	            		myTask.writePropOnFile(propFile, myProperty);
	            		Properties myProp = new Properties();
	            		myTask.getFromFile(propFile,null);
		            	 logger.log(Level.INFO,"The property retrieved from the file is "+myProp);
	            	}
	            	else {
	            		 logger.log(Level.INFO,"enter the path ");
	            		String filePath = taskScanner.nextLine();
	            		File propFile = myTask.createFile(filePath,"myprop.txt");
	            		myTask.writePropOnFile(propFile, myProperty);
	            		
	            		Properties myProp = new Properties();
	            		myTask.getFromFile(propFile,myProp);
		            	 logger.log(Level.INFO,"The property retrieved from the file is "+myProp);
	            		
	            	}
	            	
	            	break;
	            case 3:
	            	 logger.log(Level.INFO,"Enter the directory of the file ");
	            	String path = taskScanner.nextLine();
	            	
	            	 logger.log(Level.INFO,"Enter the name of the file ");
	                name = taskScanner.nextLine();
	            	
	                myFile = myTask.createFile(path ,name);
	            	 logger.log(Level.INFO,myFile.toString());
	            	
				
	            	 logger.log(Level.INFO,"Enter the number of text you want to add ");
	            	count = intScanner.nextInt();
				    String[] tex = new String[count];
	            	for(int i=0;i<count;i++) {
	            		 logger.log(Level.INFO,"Enter the text "+(i+1)+" to write in file");
	            		 tex[i] = taskScanner.nextLine(); 
	            		myTask.writeOnFile(myFile, tex);
	            	}
	            	 logger.log(Level.INFO,"successfully Writed on file");
	            	break;
	            case 5:
	            	 logger.log(Level.INFO,"enter the string ");
	            	String value = taskScanner.nextLine();
	            	
	            	BasicTask myBasicTask = new BasicTask(value);
	            	 logger.log(Level.INFO,	myBasicTask.toString());
	            	
	            }
			
			}catch(IOException io) {
				logger.log(Level.SEVERE,io.getCause().toString());

			}catch(InputInvalidException ie) {
				ie.printStackTrace();
				 logger.log(Level.SEVERE,ie.getCause().toString());
			}	
			
			
		}while(select !=0);
	}
}
}
