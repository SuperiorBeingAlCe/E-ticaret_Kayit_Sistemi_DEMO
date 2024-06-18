package Sistem;

import Sistem.business.abstracts.UserService;
import Sistem.business.concretes.UserManager;
import Sistem.dataAccess.concretes.SuperiorUserDao;
import Sistem.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new SuperiorUserDao());
		User user1 = new User(1,"Ekrem","İmamoğlu", "Ekrembey1453@gmail.com","132352525");
userService.add(user1);

	
		
	}

}
