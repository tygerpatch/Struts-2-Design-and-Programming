package app11a.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import app11a.Employee;

public class EmployeeDAOMySQLImpl extends DAOBase implements EmployeeDAO {
   private static final String CREATE_EMPLOYEE_SQL = "INSERT INTO employees (firstName,lastName) VALUES (?, ?)";

   public void createEmployee(Employee employee) throws SQLException {
      Connection connection = null;
      PreparedStatement preparedStatement = null;
      // Recall that PreparedStatement(s) can have parameters, Statement(s) do not
      try {
         connection = getConnection();

         preparedStatement = connection.prepareStatement(CREATE_EMPLOYEE_SQL);
         preparedStatement.setString(1, employee.getFirstName());
         preparedStatement.setString(2, employee.getLastName());
         preparedStatement.executeUpdate();
         preparedStatement.close();
         // Even though closing the Connection object will also close any of its Statement objects,
         // it's considered good programming practice to explicitly close the Statement.
      }
      finally {
         connection.close();
      }
   }

   private static final String UPDATE_EMPLOYEE_SQL = "UPDATE employees SET firstName=?, lastName=? WHERE id = ?";

   public void updateEmployee(Employee employee) throws SQLException {
      Connection connection = null;
      PreparedStatement preparedStatement = null;
      try {
         connection = getConnection();
         preparedStatement = connection.prepareStatement(UPDATE_EMPLOYEE_SQL);
         preparedStatement.setString(1, employee.getFirstName());
         preparedStatement.setString(2, employee.getLastName());
         preparedStatement.setInt(3, employee.getId());
         preparedStatement.executeUpdate();
         preparedStatement.close();
      }
      finally {
         connection.close();
      }
   }

   private static final String GET_EMPLOYEE_SQL = "SELECT firstName, lastName FROM employees WHERE id = ?";

   public Employee getEmployee(int employeeId) throws SQLException {
      Connection connection = null;
      PreparedStatement preparedStatement = null;
      ResultSet resultSet = null;
      Employee employee = new Employee();
      try {
         connection = getConnection();
         preparedStatement = connection.prepareStatement(GET_EMPLOYEE_SQL);
         preparedStatement.setInt(1, employeeId);
         resultSet = preparedStatement.executeQuery();
         if (resultSet.next()) {
            employee.setFirstName(resultSet.getString("firstName"));
            employee.setLastName(resultSet.getString("lastName"));
            employee.setId(employeeId);
         }
         resultSet.close();
         // Although closing a Statement also closes its ResultSet(s), it's still good to explicitly close the ResultSet.
         preparedStatement.close();
      }
      finally {
         connection.close();
      }
      return employee;
   }

   private static final String DELETE_EMPLOYEE_SQL = "DELETE FROM employees WHERE id = ?";

   public void deleteEmployee(int employeeId) throws SQLException {
      Connection connection = null;
      PreparedStatement preparedStatement = null;
      try {
         connection = getConnection();
         preparedStatement = connection.prepareStatement(DELETE_EMPLOYEE_SQL);
         preparedStatement.setInt(1, employeeId);
         preparedStatement.executeUpdate();
         preparedStatement.close();
      }
      finally {
         connection.close();
      }
   }

   private static final String SEARCH_EMPLOYEES_SQL = "SELECT id, firstName, lastName FROM employees";

   public List<Employee> getEmployees() throws SQLException {
      List<Employee> employees = new ArrayList<Employee>();
      Connection connection = null;
      Statement statement = null;
      ResultSet resultSet = null;

      try {
         connection = getConnection();
         statement = connection.createStatement();
         resultSet = statement.executeQuery(SEARCH_EMPLOYEES_SQL);
         while (resultSet.next()) {
            Employee employee = new Employee();
            employee.setId(resultSet.getInt("id"));
            employee.setFirstName(resultSet.getString("firstName"));
            employee.setLastName(resultSet.getString("lastName"));
            employees.add(employee);
         }
         resultSet.close();
         statement.close();
      }
      finally {
         connection.close();
      }
      return employees;
   }
}