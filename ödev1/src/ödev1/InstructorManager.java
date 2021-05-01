package ödev1;

public class InstructorManager extends UserManager{
  public void addToCourse (Instructor ýnstructor) {
	  System.out.println(ýnstructor.firstName+" "+ýnstructor.lastName+" "+"adlý eðitmen kurs ekledi");
  }
  public void deletedToCourse (Instructor ýnstructor) {
	  System.out.println(ýnstructor.firstName+" "+ýnstructor.lastName+" "+"adlý eðitmen kursu sildi");
  }
  public void updatedToCourse(Instructor ýnstructor) {
	  System.out.println(ýnstructor.firstName+" "+ýnstructor.lastName+" "+"adlý eðitmen kursu güncelledi");
  }
	
	
	
	
	
	
}
