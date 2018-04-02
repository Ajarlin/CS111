
public class Party
{
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		System.out.println("How many people are coming to the party");
		int amountOfPeople = IO.readInt();
	
		System.out.println("How many slices should each person get");
		int slicePerPerson = IO.readInt();
	
		System.out.println("How many cans of soda should each person get");
		int sodaPerPerson = IO.readInt();
	
		System.out.println("How much does a pie cost");
		double piePrice = IO.readDouble();
	
		System.out.println("How many slices are in a pie");
		int slicePerPie = IO.readInt();
	
		System.out.println("How much is the price of a case of soda");
		double casePrice = IO.readDouble();
	
		System.out.println("How many cans are in a case");
		int cansInCase = IO.readInt();
	
		//declared and initialized variables
			double totalSlices = 0;
			double totalCans= 0;
			double amountOfPies = 0;
			double sodaCases = 0;
			double pizzaCost = 0;
			double sodaPrice = 0;
			double totalCost = 0; 
			
			totalSlices = amountOfPeople * slicePerPerson; 
			totalCans = amountOfPeople * sodaPerPerson;
			
	if(totalSlices % slicePerPie == 0){
		amountOfPies = totalSlices / slicePerPie;
	} else {
		amountOfPies = Math.ceil(totalSlices / slicePerPie);
	}
	
	if(totalCans % cansInCase == 0){
		sodaCases = totalCans / cansInCase;
	} else {
		sodaCases = Math.ceil(totalCans / cansInCase);
	}
	
	pizzaCost = amountOfPies * piePrice;
	sodaPrice = sodaCases * casePrice;
	totalCost = pizzaCost + sodaPrice; 
	
	IO.outputDoubleAnswer(totalCost);
	
	
	}
} 