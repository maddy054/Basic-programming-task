package task;
public class PojoTask {
  
	
	  private String name;
	  private Integer number;
	  
	  public String getName() { 
		  return this.name;
	  }
	  public void setName(String name) {
		  this.name = name;
	  }
	  
	  public int getNumber() {
		  return this.number;
	  }
	  public void setNumber(Integer number) {
		  this.number = number;
	  }
	  public PojoTask(String name,Integer number) {
          this.name = name;
          this.number = number;
	  }
	  public PojoTask() {
		  
	  }
	  @Override
	  public String toString() {
		  return "name "+this.name+" number "+this.number;
	  }

}
