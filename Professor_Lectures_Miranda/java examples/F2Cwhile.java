public class F2Cwhile {
    public static void main(String[] args) {
	double fahr;
	double celsius;

	do{
	    System.out.print("Enter Temperature in Fahernheit : ");
	    fahr=IO.readDouble();
	    if (fahr<-459.67){
		System.out.println("Temperature must be >= 459.67 ");
	    }
	}
	while (fahr<-459.67);
	celsius=(fahr-32)*5/9;
	IO.outputDoubleAnswer(celsius);	
    }
}


    
