public class Average
{
    public static void main(String[] args)
    {
	double sentinel,value,sum,average;
	int count;
	System.out.print("Enter sentinel: ");
	sentinel=IO.readDouble();
	System.out.print("Enter value: ");
	value=IO.readDouble();
	sum=0;
	count=0;	
	while (value!=sentinel){
	    sum=sum+value;
	    count++;
	    System.out.print("Enter value: ");
	    value=IO.readDouble();
	}
	if (count==0){
	    System.out.println("There is no data");
	}
	else{
	    average=sum/count;
	    System.out.println("average="+average);
	}
    }   
}
