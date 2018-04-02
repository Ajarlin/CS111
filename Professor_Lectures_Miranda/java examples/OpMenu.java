public class OpMenu 
{
    public static void main(String[] args)
    {
	double x,y,z;

	System.out.print("Enter one number : ");
	x=IO.readDouble();
	
	System.out.print  ("Enter another number : ");
	y=IO.readDouble();
	

	System.out.println("1. Add");
	System.out.println("2. Subtract");
	System.out.println("3. Multiply");
	System.out.println("4. Divide");
	System.out.print("Enter option : ");

	int op=IO.readInt();

	switch(op){
	case 1:
	    z=x+y;
	    System.out.println("x + y = "+z);
	    break;
	case 2:
	    z=x-y;
	    System.out.println("x - y = "+z);
	    break;
	case 3:
	    z=x*y;
	    System.out.println("x * y = "+z);
	    break;
	case 4:
	    if (y==0){
		IO.reportBadInput();
		return;
	    }
	    else{
		z=x/y;
		System.out.println("x / y = "+z);
	    }
	    break;
	default:
	    System.out.println("option must be 1, 2, 3, or 4");
	    break;
	} // switch
    } //
}
