//LuckyNines 2nd Program

public class LuckyNines{
	
	public static void main(String[] arguments){
		
		int lowerEnd = IO.readInt();	
		int upperEnd = IO.readInt();		
		countLuckyNines(lowerEnd, upperEnd);
}
	
	
	public static int countLuckyNines(int lowerEnd, int upperEnd){
		
		if (upperEnd < lowerEnd) {
			IO.reportBadInput();

			return -1;
			
		} 
		
		else 
			
		{
			
			int dif = upperEnd - lowerEnd;					
			int count = 0;								
			char[] hold = new char[dif];					
			
			/*		
						String s2=num.substring(j,j+1);
						//System.out.println(s2 + "s");
						if(s2.equals("9"))
						{
							count++;
							//System.out.println(num.charAt(j)==('7'));
							//System.out.println(s2+"t");
						}
						 */
			
			
			for(int i=lowerEnd; i<=upperEnd; i++) {	
				
				String numberAsString = Integer.toString(i);		
				numberAsString.getChars(0, numberAsString.length(), hold, 0);	
				
				for (int j=0; j<hold.length; j++){			
					if (hold[j] == '9'){
						count++;
}
}}
			IO.outputIntAnswer(count);
			return count;
		}
			
	}
}