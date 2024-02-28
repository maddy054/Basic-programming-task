package tester;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NewTester {
    public static void main(String[] args) {
    	Logger logger = Logger.getLogger("myLogger");
        try {
            Class<?> myClass = Class.forName("task.PojoTask");
            Object myObject = myClass.getDeclaredConstructor().newInstance();

            System.out.println("Default Constructor Invoked");
            Constructor<?> constructor = myClass.getDeclaredConstructor(String.class, Integer.class);
            Object newObj = constructor.newInstance("maddy", 42);
  
            System.out.println("Overloaded Constructor Invoked");
        
            Method getterMethod = myClass.getDeclaredMethod("getName");
            Object result = getterMethod.invoke(newObj);
            logger.log(Level.INFO,"Getter Method Invoked - name " + result);

            Method setterMethod = myClass.getDeclaredMethod("setNumber", Integer.class);
            setterMethod.invoke(newObj, 99);
            logger.log(Level.INFO,"Setter Method Invoked");

        } catch (ReflectiveOperationException ex) {
        	logger.log(Level.SEVERE,ex.getMessage());
        }
    }
}
