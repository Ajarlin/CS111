
public class Compress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//q9w5e2rt5y4qw2Er3T
		String comp = compress("qwwwwwwwwweeeeerrtyyyyyqqqqwEErTTT");
		//String comp2= compress("aaaadddddddddddd");
		//String comp3= compress("ccccdddddddddddd");
		//2 He2lo
		System.out.println(comp);
		//System.out.println(comp3);
		
		//String Test2="gfff    hyy";
		//System.out.println(comp2);
		//g3f4 h2y
		
	}
	
	
	public static String compress(String original){
		
		int count=0;
	    String str="";

	    for (int i=0; i<original.length(); i++) {
	        char letter = original.charAt(i);
	        count = 1;

	        while (i + 1<original.length() && original.charAt(i) == original.charAt(i+1)) {
	            count++;
	            i++;
	        }

	        if (count==1) {
	        	//so if count==1, 1 wont show up
	        	//concat adds the strings together, similar to ""+""
	            str = str.concat(Character.toString(letter));
	        } 
	        else {
	            str = str.concat(Integer.toString(count).concat(Character.toString(letter)));
	        }
	    }
	    
	    return str;
	}
	
}
