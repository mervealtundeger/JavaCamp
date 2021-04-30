package homework32;

public class StudentManager {

	
	public void addStudent(Student student) {
		System.out.println(student.getFirstName()+" "+student.getLastName()+" BASARIYLA KAYIT OLDUNUZ.");
	}
	
	public void deleteStudent(Student student) {
		System.out.println(student.getFirstName()+" "+student.getLastName()+" KAYDINIZ BASARIYLA SILINDI.");
	}
	
	public void registerCourse(Student student) {
		System.out.println("Merhaba "+student.getFirstName()+" . "+student.getCourseName()+" KURSU ALMIS BULUNMAKTASINIZ.");
	}
	
	public void showStudents(Student[] students) {
        for (Student student : students) {
        	System.out.println("Isim : " + student.getFirstName());
            System.out.println("Soyisim: " + student.getLastName());
            System.out.println("Email: " + student.getEmail());
            System.out.println("------");
		}
	}
}
