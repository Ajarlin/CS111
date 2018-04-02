public class Sum
{
    public static void main(String[] args)
    {
		double sentinel,value,sum;
	
		System.out.print("Enter sentinel: ");
		sentinel=IO.readDouble();

		System.out.print("Enter value: ");
		value=IO.readDouble();
		sum=0;
		while (value!=sentinel){
			sum=sum+value;
			System.out.print("Enter value: ");
			value=IO.readDouble();
		}
		System.out.println("sum="+sum);		
	}   
}
