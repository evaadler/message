package message.dao;

import message.Comment;
import message.Pager;

public interface ICommentDao {
	public void add(Comment comment, int userId, int msgId);
	public void delete(int id);
	public Comment load(int id);
	public Pager<Comment> list(int msgId);
}
