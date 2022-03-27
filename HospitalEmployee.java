
package Hospital;

public class HospitalEmployee {
	
	protected String name;
	protected int number;
	
	public void work()
	{
		System.out.println (name + " works for the hospital.");
	}
	
	HospitalEmployee(){
		name = "";
		number = 0;
	}
	HospitalEmployee(String name, int number){
		this.name = name;
		this.number = number;
	}
	
	HospitalEmployee(String name){
		this.name = name;
		this.number = 0;
	}
	HospitalEmployee(int number){
		this.name = "";
		this.number = number;
	}
	
	public void setName(String name) {
		this.name = name;
				
	}
	
	
	public void setNumber(int number) {
		this.number = number;
				
	}
	
	public String getName() {
		
		return name;
	}
	
	public int getNumber() {
		
		return number;
	}
	
	
	public String toString() {
		
		return (name + " " + number);
		
		
	}
	
	
	
}
