package homework2;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course("\n YAZILIM GELÝÞTÝRÝCÝ YETÝSTÝRME KAMPI",1, null, null, 0);
		Course course2 = new Course("ENGÝN DEMÝROG",2, null, null, 0 );
		Course course3 = new Course("PROGRAMLAMAYA GÝRÝS",3, null, null, 0 );
		Course[] courses = { course1,course2,course3};
		for(Course course : courses) {
			System.out.println(course.name);
		}
		System.out.println(".............................................");
		Category category1= new Category(1,"\n hepsi");
		Category category2= new Category(2,"programlama");
		Category[] categories = {category1,category2};
		for(Category category : categories) {
			System.out.print(category.name);
			
		}
		CourseManager courseManager =new CourseManager();
		courseManager.takeTheCourse(course1);
		courseManager.takeTheCourse(course2);
		courseManager.takeTheCourse(course3);
		
	}

}
