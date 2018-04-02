
public class PayFriend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your payment");
		double x = IO.readDouble();
		double y=0; //Fee amount
		
		double f1=.03;
		double f2=6;
		double f3=.01;
		double f4=15;
		double f5=.01;
		
			if(x<100 || x==100){
				y=5;
			
		}
			else if(x>100 && x<1000){
				double v1=(x*f1);
	
				if(v1>f2)
				{
					y=v1;
				}
				else
					y=f2;
				
			
		}
			else if((x>1000 || x==1000) && x<10000){
				double v3=(x*f3);
				if(v3>f4){
					y=v3;
				}
				else
					y=f4;
		}
			else if(x>10000 || x==10000){
				double v4=(10000*f5); //f5=1% so its equal to 100
				double v5=(5000*.02);
				if((x>10000 || x==10000) && x<15000)
					{
					y=(x-10000)*.02+v4;
					}
				else if((x>15000 || x==15000) && x<20000){
					y=v5+v4;
				}
				else if(x>20000){
					y=v4+v5+((x-15000)*.03);
				}
		}
			
			IO.outputDoubleAnswer(y);
		
		
	}
}


