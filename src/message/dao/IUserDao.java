package message.dao;

import message.Message;
import message.Pager;
import message.User;

public interface IUserDao {
	public void add(User user, int userId);
	public void delete(int id);
	public void update(User user);
	public Message load(int id);
	public Pager<User> list();
}
