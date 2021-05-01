package ödev1;

public class StudentManager extends UserManager {
	public void loginToCourse (Student student) {
		System.out.println(student.studentNumber+" "+ "Numaralı"+" "+ student.firstName+" "+student.lastName+" "+"adlı öğrenci kursa giriş yaptı");
	}
	public void completedToCourse(Student student) {
		System.out.println(student.studentNumber+" "+"Numaralı"+ " "+student.firstName+ " " +student.lastName+" " +"adlı öğrenci kursu tamamladı");
	}
}
