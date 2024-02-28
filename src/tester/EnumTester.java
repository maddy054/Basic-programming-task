package tester;
import java.util.logging.Level;
import java.util.logging.Logger;

import task.Color;

public class EnumTester {
	static Logger logger = Logger.getLogger("myLogger");
	public static void main(String[] args) {
		for (Color color : Color.getColor()) {
			logger.log(Level.INFO,"Color code of " + color + " is " + color.getColorCode());
        }

        System.out.println("Ordinal values:");
        for (Color color : Color.getColor()) {
        	logger.log(Level.INFO,color.getOrdinal()+ ": " + color);
           
        }
	}

}
