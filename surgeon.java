package Hospital;

public class surgeon extends doctor{
	public boolean operating;
	
	surgeon(){
		name = "";
		number = 0;
		operating = false;
	}
	
	surgeon(String name, int number,String specialty, boolean operating){
	this.name = name;
	this.number = number;
	this.specialty = specialty;
	this.operating = operating;
	
	}
	
	public String toString() {
		return (name+" "+number+" "+specialty + " Operating: " +operating );
	}
	public void work() {
		
		String isOperating;
		
		if(operating == true) 
			isOperating = " is ";
		else
			isOperating = " is not ";
				
		
		
		System.out.println(name + " works for the hospital. " + name + isOperating + " operating right now");
	}
		
}
	
	



