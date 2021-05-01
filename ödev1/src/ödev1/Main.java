package ödev1;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.firstName="Gizem";
		student1.lastName="Keleş";
		student1.studentNumber="12";
		student1.email="g.keles@hotmail.com";
		student1.password= 123;
		
		Student student2 = new Student();
		student2.firstName="Hande";
		student2.lastName="Güven";
		student2.studentNumber="13";
		student2.email="h.güven@hotmail.com";
		student2.password= 1234;
		
		Student student3 = new Student();
		student3.firstName="Buse";
		student3.lastName="Başpınar";
		student3.studentNumber="14";
		student3.email="b.baspınar@hotmail.com";
		student3.password= 103;
		
		User user1= new User();
		user1.firstName="Seray";
		user1.lastName="Malkoç";
		user1.password=18;
		
		User user2= new User();
		user2.firstName="Sümeyra";
		user2.lastName="Çekirdek";
		user2.password=18;
		
		User user3= new User();
		user3.firstName="İrem";
		user3.lastName="İkizler";
		user3.password=18;
		
		
		
		Instructor ınstructor = new Instructor();
		ınstructor.id=1;
		ınstructor.firstName="Engin";
		ınstructor.lastName="Demiroğ";
		ınstructor.password=10;
		
		StudentManager studentManager = new StudentManager();
		studentManager.completedToCourse(student1);
		
		UserManager userManager=new UserManager();
		userManager.add(user1);
		
		InstructorManager ınstructorManager=new InstructorManager();
		ınstructorManager.deletedToCourse(ınstructor);
  
		
		studentManager.loginToCourse(student2);
		studentManager.completedToCourse(student3);
		
		userManager.register(user3);
		userManager.add(user2);
		
		
		ınstructorManager.addToCourse(ınstructor);
		ınstructorManager.updatedToCourse(ınstructor);
		
		
		
	}

}
