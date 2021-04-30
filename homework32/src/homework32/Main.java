package homework32;
public class Main {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Merve");
		student1.setLastName("Altundeger");
		student1.setEmail("ödev@123456789.com");
		student1.setPasword("ödevtamam");
		student1.setCourseName("java#");
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Büsra");
		student2.setLastName("Altundeger");
		student2.setEmail("büsra@tamam.com");
		student2.setPasword("bus123456789");
		student2.setCourseName("liseögrencisi");
		
		Instructor instructor1= new Instructor();
		instructor1.setId(3);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demirog");
		instructor1.setEmail("engin.demirog@engin123456.com");
		instructor1.setPasword("devamarkadaslar");
		instructor1.setNumberOfStudent(2000);
		instructor1.setCourseName("Java, C#, Python, Ruby");
		
		Instructor instructor2= new Instructor();
		instructor2.setId(4);
		instructor2.setFirstName("Mevlüt");
		instructor2.setLastName("Focus");
		instructor2.setEmail("focus@deneme.com");
		instructor2.setPasword("focus123456");
		instructor2.setNumberOfStudent(264);
		instructor2.setCourseName("Python, Java, C# , C++");
		
		Student[] students= {student1, student2};
		
		StudentManager studentManager= new StudentManager();
		studentManager.addStudent(student1);
		System.out.println("--------");
		studentManager.registerCourse(student1);
		System.out.println("--------");
		studentManager.deleteStudent(student2);
		System.out.println("--------");
		studentManager.showStudents(students);
		
		
		Instructor[] instructors= {instructor1, instructor2};
		
		InstructorManager instructorManager= new InstructorManager();
		instructorManager.addInstructor(instructor1);
		System.out.println("--------");
		instructorManager.addCourse(instructor1);
		System.out.println("--------");
		instructorManager.getNumberOfStudent(instructor2);
		System.out.println("--------");
		
		instructorManager.showInstructors(instructors);
		
		
		UserManager userManager = new UserManager();
		userManager.add(instructor1);
		System.out.println("--------");
		userManager.delete(student2);
		System.out.println("--------");
		userManager.addMultipleUser(instructors);
		

	}

}
