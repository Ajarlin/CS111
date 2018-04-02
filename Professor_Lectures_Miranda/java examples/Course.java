public class Course {
	private String name;
	private Student[] list;
	private int nStudents;
	
	public Course(String inName,int n){
		name=inName;
		list=new Student[n];
		nStudents=0;
	}
	
	public Student getStudent(int inId){
		Student s=list[inId];
		return s;
	}
	
	public int addStudent(String inName,double inE1,double inE2,double inE3){
		int pos=-1;
		if (nStudents<list.length){
			pos=nStudents;
			Student s=new Student(inName);
			s.setExam(1,inE1);
			s.setExam(2,inE2);
			s.setExam(3,inE3);
			list[pos]=s;
			nStudents++;
		}
		return pos;
	}

	public void displayStudents(){
		for (int i=0;i<nStudents;i++){
			list[i].display();
		}	
	}
	
	public void displayStudent(int inId){
		if (inId<nStudents){
			list[inId].display();
		}
	}
	
	public String getCourseName(){
		return name;
	}
}
