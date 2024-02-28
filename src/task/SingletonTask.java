package task;

public class SingletonTask {
	private static SingletonTask myTask = null;

	private SingletonTask(){
		
	}
	public SingletonTask getInstance() {
		if(myTask == null ) {
			myTask = new SingletonTask();
		}
		return myTask;
	}
}
