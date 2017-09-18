package dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import beans.Employee;

public class EmployeeDao implements EmployeeDaoInterface
{
private HibernateTemplate ht;

	public void setHt(HibernateTemplate ht) {
	this.ht = ht;
}

	@Override
	public int save(Employee e) {
		int i = (int)ht.save(e);
		return i;
	}

	@Override
	public boolean update(Employee e) {
		ht.update(e);
		return true;
	}

	@Override
	public boolean delete(Employee e) {
		ht.delete(e);
		return true;
	}

	@Override
	public List<Employee> find() {
	
		return null;
	}
	

}
