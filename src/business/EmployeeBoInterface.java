package business;

import beans.Employee;

public interface EmployeeBoInterface 
{
	public int saveEmployee(Employee e); 
	public boolean updateEmployee(Employee e);
	public boolean deleteEmployee(Employee e);
}
