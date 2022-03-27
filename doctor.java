package Hospital;

public class doctor extends HospitalEmployee {
	public String specialty;
	
	doctor(){
		name = "";
		number  = 0;
		specialty = "";
	}	
	
	doctor(String name, int number, String specialty){
		this.name = name;
		this.number = number;
		this.specialty = specialty;
	}
	
	public String toString() {
		
		return (name +" " +number + " " + specialty);
	}
	
	
	public void work() {
		System.out.println(name + " works for the hospital. " + name + " is a(n) " + specialty + " doctor");
	}

}
