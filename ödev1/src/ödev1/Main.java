package �dev1;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.firstName="Gizem";
		student1.lastName="Kele�";
		student1.studentNumber="12";
		student1.email="g.keles@hotmail.com";
		student1.password= 123;
		
		Student student2 = new Student();
		student2.firstName="Hande";
		student2.lastName="G�ven";
		student2.studentNumber="13";
		student2.email="h.g�ven@hotmail.com";
		student2.password= 1234;
		
		Student student3 = new Student();
		student3.firstName="Buse";
		student3.lastName="Ba�p�nar";
		student3.studentNumber="14";
		student3.email="b.basp�nar@hotmail.com";
		student3.password= 103;
		
		User user1= new User();
		user1.firstName="Seray";
		user1.lastName="Malko�";
		user1.password=18;
		
		User user2= new User();
		user2.firstName="S�meyra";
		user2.lastName="�ekirdek";
		user2.password=18;
		
		User user3= new User();
		user3.firstName="�rem";
		user3.lastName="�kizler";
		user3.password=18;
		
		
		
		Instructor �nstructor = new Instructor();
		�nstructor.id=1;
		�nstructor.firstName="Engin";
		�nstructor.lastName="Demiro�";
		�nstructor.password=10;
		
		StudentManager studentManager = new StudentManager();
		studentManager.completedToCourse(student1);
		
		UserManager userManager=new UserManager();
		userManager.add(user1);
		
		InstructorManager �nstructorManager=new InstructorManager();
		�nstructorManager.deletedToCourse(�nstructor);
  
		
		studentManager.loginToCourse(student2);
		studentManager.completedToCourse(student3);
		
		userManager.register(user3);
		userManager.add(user2);
		
		
		�nstructorManager.addToCourse(�nstructor);
		�nstructorManager.updatedToCourse(�nstructor);
		
		
		
	}

}
