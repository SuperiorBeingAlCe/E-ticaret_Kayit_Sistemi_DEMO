package Sistem.dataAccess.concretes;

import java.util.List;

import Sistem.dataAccess.abstracts.UserDao;
import Sistem.entities.concretes.User;

public class SuperiorUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName()+ " adlı kullanıcı Superior sistemine kayıt edildi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+ " adlı kullanıcı Superior sisteminden silindi");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+ " adlı kullanıcının bilgileri Superior sisteminden güncellendi");
		
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
