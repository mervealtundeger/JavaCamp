package homework3;

public class UserManager {

	public void add(User user) {
		System.out.println(user.getId()+" NUMARALI KULLANICI EKLENDI.");
	}
	
	public void delete(User user) {
		System.out.println(user.getId()+" NUMARALI KULLANICI SILINDI.");
	}
	
	public void addMultipleUser(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
	
	
}
