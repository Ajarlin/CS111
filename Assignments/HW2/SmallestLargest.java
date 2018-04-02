
public class SmallestLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double smallest;
		double largest;
		double num;
		double first;
		int i=0;
		
		System.out.println("Enter a termination value");
		double n=IO.readDouble();
		int count=0;
		
 
		
			System.out.println("Input your numbers");
			num=IO.readDouble();
			smallest=num;
			largest=num;
			
				while(num!=n){
				System.out.println("Input your numbers");
				num=IO.readDouble();
			
				if(num>largest && num!=n){
					largest=num;
								}	
			
				if(num<smallest && num!=n){
				
					smallest=num;
								}
			i++;
			count++;	
			}
				
				if(count<1){
					IO.reportBadInput();
				}
			if(count>=1){
			IO.outputDoubleAnswer(largest);
			IO.outputDoubleAnswer(smallest);
			}
		}
		
	

}
