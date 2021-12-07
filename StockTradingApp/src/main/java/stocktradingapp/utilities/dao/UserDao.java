package StockTradingApp.utilities.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class UserDao {
	private HibernateTemplate hibernateTemplate;
	@Transactional
	public int insert(Student user)
	{
		int i=(Integer)this.hibernateTemplate.save(user);
		return i;		
	}
	//Get the Single Data(object)
	public User getUser(int userId)
	{
		Student user=this.hibernateTemplate.get(User.class,userId);
		return user;
	}
	public List<User> getAllStudents()
	{
		List<User> user=this.hibernateTemplate.loadAll(User.class);
		return user;
	}
	@Transactional
	public void delete(int studentId)
	{
		User user=this.hibernateTemplate.get(User.class,userId);
		this.hibernateTemplate.delete(user);
	}
	@Transactional
	public void update(User user)
	{
		this.hibernateTemplate.update(user);
	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
