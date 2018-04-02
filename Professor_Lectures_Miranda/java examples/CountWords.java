public class CountWords {
   public static void main(String[] args){
	   int count=0;
	   String currentWord="";
	   System.out.print("Enter a String: ");
	   String myString=IO.readString();
	   myString=" "+myString+" ";
	   for (int i=0;i<myString.length();i++){
		   char c=myString.charAt(i);
		   if (c!=' '){
			   currentWord+=c;
		   }
		   else{
			   if (!currentWord.isEmpty()){
				   System.out.println(currentWord);
				   currentWord="";
				   count++;
			   }
		   }
	   }
	   System.out.print("total words: "+count);
   }
}