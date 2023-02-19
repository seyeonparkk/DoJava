package java006;
//오버로딩->메서드 재정의
class Student{
	String name;
	Double gpa;
	
	Student(String s,Double g){
		name=s;
		gpa=g;
	}
	Student(String s){
		name=s;
		gpa=null;
	}
}
public class JavaTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student s1=new Student("Justin");
		 Student s2=new Student("Justn");
		 System.out.println(s1.name+"\t"+s1.gpa);
		 System.out.println(s2.name+"\t"+s2.gpa);
	}

}
