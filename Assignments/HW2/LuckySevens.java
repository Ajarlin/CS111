
public class LuckySevens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Input: Lower range number");
		int low = IO.readInt();
		System.out.println("Input: Higher range number");
		int high = IO.readInt();
		int count=0;
		String num="";
		
		if(low>high || low==0 || high==0){
			IO.reportBadInput();
				}
		
		else{
			
			
			for(int i=low; i<=high; i++){
				
				num=""+(Math.abs(i));
				//System.out.println(num);
				
			for(int j=0; j<num.length(); j++){
				
				String s2=num.substring(j,j+1);
				//System.out.println(s2 + "s");
				if(s2.equals("7"))
				{
					count++;
					//System.out.println(num.charAt(j)==('7'));
					//System.out.println(s2+"t");
				}
				 
				/* int reduce=(i)%10;
				if(Math.abs(i)==7 || Math.abs(high)==7 || Math.abs(i/10)==7 || Math.abs(reduce)==7){
						count++;
						System.out.println("Low Range: " + low + " " + "High Range: " + high + " Digit: " + i);
						
				}
				*/
				
				
			}	
			
		/* for(int i=low; i<=high; i++)
		{
			for(int j=low; j<=high; j++){
			
					if(Math.abs(i/j)==7 || Math.abs(j)==7 || Math.abs(i)==7 || Math.abs(j)==7)
					//if(i%j==7)
				    //if(j/10==7)
					{
							count++;
							//System.out.println(i + " .. " + j + " i%j= " + i%j + "j/10" + j/10);
					}
			
			
										 }
		}
		*/
			
			}
		IO.outputIntAnswer(count);
		
		}
	}


}
