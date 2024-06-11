package task;			


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import helper.Helper;
import invalidexception.InputInvalidException;

public class BasicProgrammingTask {
	
	public void createDir(String path) throws IOException {
		File myFile = new File(path);
		myFile.mkdirs();
	}
	
	public File createFile(String name) throws IOException {
		File myFile = new File(name	);
		myFile.createNewFile();
		return myFile;
	}
	
	public File createFile(String path ,String name) throws IOException {
		
		File myFile = new File(path,name);
		if(!myFile.exists())
		{
			createDir(path);
		}

		myFile.createNewFile();
	    return myFile;
	}
	
	public void writeOnFile(File myFile,String[] text) throws IOException {
	
		FileWriter myWriter = new FileWriter(myFile);
		try(BufferedWriter myBuffer = new BufferedWriter(myWriter)){
			for(int i=0;i<text.length;i++)
			{
				myBuffer.write(text[i]);
				myBuffer.newLine();
			
			}
		}
	}
	
    public Properties  getProperty() {
    	return new Properties();
    }	
    
    public void  storeValue(Properties myProperties,Object key,Object value) throws InputInvalidException {
    	 Helper.checkNull(myProperties);
         myProperties.put(key,value);
    }
    
    public void writePropOnFile(File myFile,Properties myProperties) throws IOException ,InputInvalidException{		

    	Helper.checkNull(myProperties);
    	
    	try(FileWriter myWriter = new FileWriter(myFile)){
    		myProperties.store(myWriter, "prop");
      
    	}
    	
    }
    
    public void getFromFile(File myFile,Properties myProperties) throws IOException{
    	
        try(FileReader myReader = new FileReader(myFile)){
        	myProperties.load(myReader);
        
        }
       
    }
    
}
