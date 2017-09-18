package dao;

import java.util.List;

import beans.Employee;

public interface EmployeeDaoInterface {
	public int save(Employee e);
	public boolean update(Employee e);
	public boolean delete(Employee e);
	public List<Employee> find();

}
