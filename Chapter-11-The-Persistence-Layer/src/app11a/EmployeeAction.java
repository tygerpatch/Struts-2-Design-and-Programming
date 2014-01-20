package app11a;

import app11a.dao.DAOFactory;
import app11a.dao.EmployeeDAO;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import java.sql.SQLException;
import java.util.List;

public class EmployeeAction extends ActionSupport implements Preparable, ModelDriven {

   public String list() throws SQLException {
      return SUCCESS;
   }

   public String create() throws SQLException {
      EmployeeDAO employeeDAO = DAOFactory.getEmployeeDAO();
      employeeDAO.createEmployee(employee);
      return SUCCESS;
   }

   public String edit() {
      return SUCCESS;
   }

   public String update() throws SQLException {
      EmployeeDAO employeeDAO = DAOFactory.getEmployeeDAO();
      employeeDAO.updateEmployee(employee);
      return SUCCESS;
   }

   public String delete() throws SQLException {
      EmployeeDAO employeeDAO = DAOFactory.getEmployeeDAO();
      employeeDAO.deleteEmployee(employeeId);
      return SUCCESS;
   }

   // *** (read-only) employees property

   public List<Employee> getEmployees() throws SQLException {
      return DAOFactory.getEmployeeDAO().getEmployees();
   }

   // *** employeeId property
   private int employeeId;

   public int getEmployeeId() {
      return employeeId;
   }

   public void setEmployeeId(int employeeId) {
      this.employeeId = employeeId;
   }

   // *** Preparable interface
   public void prepare() throws Exception {
      if (employeeId == 0) {
         employee = new Employee();
      }
      else {
         EmployeeDAO employeeDAO = DAOFactory.getEmployeeDAO();
         employee =  employeeDAO.getEmployee(employeeId);
      }
   }

   // *** ModelDriven interface
   public Object getModel() {
      return employee;
   }

   // *** employee property
   private Employee employee;

   public Employee getEmployee() {
      return employee;
   }

   public void setEmployee(Employee employee) {
      this.employee = employee;
   }

}
