package app.vortigaunt.webscheduler.repository;

import java.util.List;

import app.vortigaunt.webscheduler.model.Employee;

public interface EmployeeRepository {

	public Employee getEmployeeById(long id);
	
	public Employee getEmployeeByName(String name);
	
	public List<Employee> findEmployeeByName(String name);
	
	public List<Employee> getAllEmployees();
	
	public Employee saveEmployee(Employee employee);
}
