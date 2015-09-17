package message.dao;

import message.Message;
import message.Pager;

public interface IMessageDao {
	public void add(Message message, int userId);
	public void delete(int id);
	public void update(Message message);
	public Message load(int id);
	public Pager<Message> list();
}
