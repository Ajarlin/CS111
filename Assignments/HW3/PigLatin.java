
public class PigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String test1="Alien";
	String test2="English";
	String test3="Yolo";
			System.out.println(translate(test1));
			System.out.println(translate(test2));
			System.out.println(translate(test3));
	}

	
	
	public static String translate(String original){
	
		String letter=(original.substring(0,1));
		String first=letter.toLowerCase();
		
		
		if(first.equals("a") || first.equals("e") || first.equals("i") || first.equals("o") || first.equals("u")){
			original=original+"way";
		}
		else{
			original=original.substring(1,original.length()) + first + "ay";
		}
		
		return original;
	}
}
