package homework3;

public class InstructorManager {

	public void addInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" EKLENDI.");
	}
	
	public void addCourse(Instructor instructor) {
		System.out.println("Merhaba "+instructor.getFirstName()+" . "+instructor.getCourseName()+" KURSLAR BASARIYLA EKLENDI.");
	}
	
	public void addMultipleCourse(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			addCourse(instructor);
		}
	}
	
	public void getNumberOfStudent(Instructor instructor) {
		System.out.println("Merhaba "+instructor.getFirstName()+" . "+"SUANKÝ OGRENCI SAYINIZ : "+instructor.getNumberOfStudent());
	}
	 public void showInstructors(Instructor[] instructors) {
	        System.out.println("---------------EGITMENLER--------------");
	        System.out.println("---------------------------------------");
		 	for (Instructor instructor : instructors) {	        	
	        	System.out.println("ISIM : " + instructor.getFirstName());
		        System.out.println("SOYAD: " + instructor.getLastName());
		        System.out.println("EMAÝL: " + instructor.getEmail());
		        System.out.println("---------------------------------");
			}
		 	
	 }

	
	
	
	
	
	
	
	
}
