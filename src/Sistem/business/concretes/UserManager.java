package Sistem.business.concretes;

import java.util.List;

import Sistem.business.abstracts.UserService;
import Sistem.core.utils.Validator;
import Sistem.dataAccess.abstracts.UserDao;
import Sistem.entities.concretes.User;

public class UserManager implements UserService{

	private Validator validator;
	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		
	 this.userDao = userDao;
	}
	
	@Override
	public void add(User user) {
		
		if(user.getFirstName().length()<2 || user.getLastName().length()<2) {
			System.out.println("isim veya soyisim en az 2 karakter olmalıdır");
			return;
		}
		if(user.getPassword().length()-1 <6) {
			System.out.println("parola en az 6 karakterden oluşmalıdır");
			return;
		}
		
		//ekleme işlemi
		 if (validator.isValidEmail(user.getEmail())) {
			 this.userDao.add(user);
		 }else {
			 System.out.println("E mail hatalı girildi");
			 return;
		 }
	}

	@Override
	public void delete(User user) {
		
		this.userDao.delete(user);
		
	}

	@Override
	public void update(User user) {
		this.userDao.update(user);
		
	}

	@Override
	public User get(int id) {
		
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return null;
	}

}
