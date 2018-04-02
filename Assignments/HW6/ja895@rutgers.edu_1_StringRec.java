
public class StringRec {

	   public static String decompress(String compressedText) {
		   
	       char c;
	       String decompressed="";
	       
	       if(compressedText.length()<=1){ // a char at length 1 could only be itself
	    	   return compressedText;
	    	   }
	       
	       		c=compressedText.charAt(0);
	       		
	       		if(Character.isDigit(c)){
	       			if(c!='0'){
	       				c--;
	       				decompressed+=compressedText.substring(1,2)+decompress(c+compressedText.substring(1));
	       				}  
	       			else{
	       				decompressed+=decompress(compressedText.substring(2));
	       				}  
	   	}
	       else{
	    	   decompressed+=compressedText.substring(0,1)+decompress(compressedText.substring(1));
	       		}
	       		return decompressed;

	   }
	   
	   
	   public static void main(String args[]){
		   
		   String str = "q9w5e2rt5y4qw2Er3T";
		   String str1 = "w2oo";
		   String str2 = "3l";
		   
		   System.out.println(decompress(str));
		   System.out.println(decompress(str1));
		   System.out.println(decompress(str2));
		   
	   }
}
