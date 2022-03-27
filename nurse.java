package Hospital;

public class nurse extends HospitalEmployee {
	
	public int numOfPatients;
	
	nurse(){
		numOfPatients = 0;
		name = "";
		number  = 0;
	}
	nurse(String name, int number, int numOfPatients){
		this.name = name;
		this.number = number;
		this.numOfPatients = numOfPatients;
	}
	
	public String toString() {
		
		return (name + number + " has " + numOfPatients + " patients");
	}
	
	public void work() {
		System.out.println (name + " works for the hospital. " + name + " is a nurse with "+numOfPatients + " patients");
	}

}
