package �dev1;

public class StudentManager extends UserManager {
	public void loginToCourse (Student student) {
		System.out.println(student.studentNumber+" "+ "Numaral�"+" "+ student.firstName+" "+student.lastName+" "+"adl� ��renci kursa giri� yapt�");
	}
	public void completedToCourse(Student student) {
		System.out.println(student.studentNumber+" "+"Numaral�"+ " "+student.firstName+ " " +student.lastName+" " +"adl� ��renci kursu tamamlad�");
	}
}
