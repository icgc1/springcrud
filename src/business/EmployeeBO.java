package business;

import dao.EmployeeDaoInterface;
import beans.Employee;

public class EmployeeBO implements EmployeeBoInterface {
private EmployeeDaoInterface dao;

	public void setDao(EmployeeDaoInterface dao) {
	this.dao = dao;
}

	@Override
	public int saveEmployee(Employee e) {
		
		return dao.save(e);
	}

	@Override
	public boolean updateEmployee(Employee e) {
		
		return dao.update(e);
	}

	@Override
	public boolean deleteEmployee(Employee e) {
		// TODO Auto-generated method stub
		return dao.delete(e);
	}

}
