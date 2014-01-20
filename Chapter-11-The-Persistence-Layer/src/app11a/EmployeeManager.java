package app11a;
import java.sql.SQLException;
import java.util.List;

import app11a.dao.DAOFactory;
import app11a.dao.EmployeeDAO;

public class EmployeeManager {

   public static List<Employee> getEmployees() {
      return search(new EmployeeSearchCriteria());
   }

   public static void create(Employee employee) {
      EmployeeDAO employeeDAO = DAOFactory.getEmployeeDAO();
      try {
         employeeDAO.createEmployee(employee);
      }
      catch (SQLException e) {
      }
   }

   public static void delete(int employeeId) {
      EmployeeDAO employeeDAO = DAOFactory.getEmployeeDAO();
      try {
         employeeDAO.deleteEmployee(employeeId);
      }
      catch (SQLException e) {
      }
   }

   public static Employee find(int employeeId) {
      EmployeeDAO employeeDAO = DAOFactory.getEmployeeDAO();
      try {
         return employeeDAO.getEmployee(employeeId);
      }
      catch (SQLException e) {
      }
      return null;
   }

   public static void update(Employee employee) {
      EmployeeDAO employeeDAO = DAOFactory.getEmployeeDAO();
      try {
         employeeDAO.updateEmployee(employee);
      }
      catch (SQLException e) {
      }
   }

   public static List<Employee> search(EmployeeSearchCriteria criteria) {
      EmployeeDAO employeeDAO = DAOFactory.getEmployeeDAO();
      try {
         return employeeDAO.searchEmployees(criteria);
      }
      catch (SQLException e) {
      }
      return null;
   }
}
