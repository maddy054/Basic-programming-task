package tester;

import java.util.logging.Level;
import java.util.logging.Logger;

import task.PojoTask;

public class PojoTester {
	
	public static void main(String... args) {
		Logger logger = Logger.getLogger("myLogger");
		PojoTask myTask  = new PojoTask("maddy",54);
		 logger.log(Level.INFO,myTask.toString());
		
	    PojoTask newTask = new PojoTask();	
	    newTask.setName("madhavan");
	    newTask.setNumber(85);
	    
	    logger.log(Level.INFO,"name is "+newTask.getName());
	    logger.log(Level.INFO,"number is "+newTask.getNumber());
	}

}
