public class Menu {
	
	public static int displayMenu(){
		int opt;
		System.out.println("1. Add a student");
		System.out.println("2. Display student information");
		System.out.println("3. Change exam grade");
		System.out.println("4. Display course information");
		System.out.println("5. Exit");
		System.out.println();
		System.out.println("Enter option: ");
		opt=IO.readInt();		
		return opt;
	}
	
	public static void addStudent(Course c1){
		System.out.print("Enter name: ");
		String sname=IO.readString();
		System.out.print("Exam 1: ");
		double e1=IO.readDouble();
		System.out.print("Exam 2: ");
		double e2=IO.readDouble();
		System.out.print("Exam 3: ");
		double e3=IO.readDouble();
		int id=c1.addStudent(sname,e1,e2,e3);
		System.out.println("id = "+id);
	}

	public static void displayStudent(Course c1){
		System.out.print("Enter student id: ");
		int id=IO.readInt();
		c1.displayStudent(id);
	}
	
	public static void changeExamGrade(Course c1){
		System.out.print("Enter id: ");
		int id=IO.readInt();
		System.out.println("Enter exam number: ");
		int en=IO.readInt();
		System.out.println("New grade: ");
		double grade=IO.readDouble();
		Student s=c1.getStudent(id);
		s.setExam(en, grade);
	}

	public static void diplayCourseInfo(Course c1){
		System.out.println("Course: "+c1.getCourseName());
		c1.displayStudents();
	}
	
	
	public static void main(String[] args){
		System.out.print("Enter name of the course: ");
		String courseName=IO.readString();
		System.out.print("Enter number of students: ");
		int n=IO.readInt();
		Course c1;
		c1=new Course(courseName,n);
		int option = displayMenu();
		while (option!=5){
			switch(option){
			case 1:
				addStudent(c1);
				break;
			case 2:
				displayStudent(c1);
				break;
			case 3:
				changeExamGrade(c1);
				break;
			case 4:
				diplayCourseInfo(c1);
				break;
			}
			option=displayMenu();
		}
	}
}
