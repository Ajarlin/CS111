
public class TwoSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double term;
		double secondSmallest;
		double small;
		double temp;
		double count = 0;
		
		System.out.println("Enter termination number: ");
		term=IO.readDouble();
		temp=IO.readDouble();
		
		while(temp == term){
			IO.reportBadInput();
			temp=IO.readDouble();
		}
		
		secondSmallest=temp;
		small=temp;
		
		while(true){
			temp=IO.readDouble();
			if(count<1 && temp==term){
				IO.reportBadInput();
				continue;
			}
			
			else if(count<1 && temp!=term){
				if(temp> secondSmallest){
					secondSmallest=temp;
			}
				
				
			count++;
			}
			
			else if(temp == term){
				IO.outputDoubleAnswer(small);
				IO.outputDoubleAnswer(secondSmallest);
				break;
			}
		}
		

	}

}
