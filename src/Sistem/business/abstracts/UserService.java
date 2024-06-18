package Sistem.business.abstracts;

import java.util.List;

import Sistem.entities.concretes.User;

public interface UserService {
	public void add(User user);
	public void delete(User user);
	public void update(User user);
	User get(int id);
	List<User> getAll();
}
