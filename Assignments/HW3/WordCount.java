
public class WordCount {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String test="Hello World, this is a test";
			String test1="R...U....ready";
			String test2="Tessty dawg";
			System.out.println("testCase #0: " + countWords(test, 4) + " Ans is: 4");
			System.out.println("testCase #1: " + countWords(test1, 1) + " Ans is: 2");
			System.out.println("testCase #2: " + countWords(test2, 6) + " Ans is: 2");
	}
	
	public static int countWords(String original, int minLength){
		
		 int count=0;
		 int counter=0;
		 original=original.toLowerCase();
		 
		    for (int i=0; i<original.length(); i++)
		    {
		        if (original.charAt(i) != ' ')
		        {
		            if(original.charAt(i)>='a' && original.charAt(i)<='z')
		            counter++;
		            continue;
		        }
		        if(counter>=minLength)
		        {
		             count++;
		        }
		        counter=0;
		    }
		    if(counter>=minLength){
		    return count+1;
		    }
		    else{
		    return count;
		    }
		 }
		
		
		
		
		
		
		
		/* int count=0;
		int counter=0;
		int temp=0;
		boolean word=false;
		String alphabet="abcdefghijklmnopqrstuvwxyz";
		
		for(int i=0; i<original.length(); i++){
			String str=original.toLowerCase();
			char letter=str.charAt(i);
			
			// if the char is a letter its word=true
			 if (Character.isLetter(str.charAt(i)) && i != original.length()-1) {
		            word = true;
		            
		            // if char isn't a letter and there have been letters before,
		            // counter goes up.
		        } else if (!Character.isLetter(str.charAt(i)) && word) {
		            count++;
		            if(count<=minLength){
		            	counter++;
		            }
		            word = false;
		            
		            // last word of String; if it doesn't end with a non letter, it
		            // wouldn't count without this.
		        } else if (Character.isLetter(str.charAt(i)) && i == original.length()-1) {
		            count++;
		        }	
			
			/* if(Character.isLetter(letter)==true){
				temp=count;
				count++;
			
				
			}
			System.out.println(" char At Index: " + letter + " "+ count);
			
			if(!Character.isLetter(letter)){
			if(count==minLength || count<minLength){
				counter++;

				
						}
			} 
			
		}
		
		return counter;  */
	}

