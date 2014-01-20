package app11a.dao;

import java.sql.SQLException;
import java.util.List;

import app11a.Employee;
import app11a.EmployeeSearchCriteria;

public interface EmployeeDAO {
   public void createEmployee(Employee employee) throws SQLException;
   public void updateEmployee(Employee customer) throws SQLException;
   public Employee getEmployee(int employeeId) throws SQLException;
   public void deleteEmployee(int employeeId) throws SQLException;
   public List<Employee> searchEmployees(EmployeeSearchCriteria searchCriteria) throws SQLException;
}
