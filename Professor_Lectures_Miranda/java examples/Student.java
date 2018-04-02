public class Student {
	private String name;
	private double exam1,exam2,exam3;
	
	public Student(String inName){
		name=inName;
		exam1=0;
		exam2=0;
		exam3=0;
	}
	
	public double getExam(int inNumber){
		switch(inNumber){
		case 1: 
			return exam1;
		case 2:
			return exam2;
		case 3:
			return exam3;
		}
		return 0;
	}
	
	public void display(){
		System.out.print("Name: "+name);
		System.out.print("    exam1="+exam1);
		System.out.print("    exam2="+exam2);
		System.out.print("    exam3="+exam3);
		System.out.println("   average="+getAverage());
		System.out.print("------------------------------------------");
		System.out.println("------------------------------------------");
	}
	
	public void setExam(int examNumber,double inGrade){
		switch (examNumber){
			case 1:
				this.exam1=inGrade;
				break;
			case 2:
				this.exam2=inGrade;
				break;
			case 3:
				this.exam3=inGrade;
				break;			
		}
	}
	
	public double getAverage(){
		double avg=(exam1+exam2+exam3)/3;
		return avg;
	}
	
	public String getName(){
		return name;
	}
	
}
