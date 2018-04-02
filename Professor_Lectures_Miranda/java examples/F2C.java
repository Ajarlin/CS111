public class F2C {
    public static void main(String[] args) {
	double fahr;
	double celsius;
	
	System.out.print("Enter Temperature in Fahernheit : ");
	fahr=IO.readDouble();
	if (fahr<-459.67){
	    System.out.println("Invalid Input");
	}
	else{
	    celsius=(fahr-32)*5/9;
	    IO.outputDoubleAnswer(celsius);	
	}
    }
}

    
