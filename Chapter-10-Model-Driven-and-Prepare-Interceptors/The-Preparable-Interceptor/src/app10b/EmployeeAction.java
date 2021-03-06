package app10b;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import java.util.List;

public class EmployeeAction extends ActionSupport implements Preparable, ModelDriven {

   public String list() {
      employees = EmployeeManager.getEmployees();
      return SUCCESS;
   }

   public String create() {
      EmployeeManager.create(employee);
      return SUCCESS;
   }

   public String edit() {
      return SUCCESS;
   }

   public String update() {
      EmployeeManager.update(employee);
      return SUCCESS;
   }

   public String delete() {
      EmployeeManager.delete(employeeId);
      return SUCCESS;
   }

   // *** Preparable interface
   public void prepare() throws Exception {
      if (employeeId == 0) {
         employee = new Employee();
      }
      else {
         employee = EmployeeManager.find(employeeId);
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

   // *** employeeId property
   private int employeeId;

   public int getEmployeeId() {
      return employeeId;
   }

   public void setEmployeeId(int employeeId) {
      this.employeeId = employeeId;
   }

   // *** employees property
   private List<Employee> employees;

   public List<Employee> getEmployees() {
      employees = EmployeeManager.getEmployees();
      return employees;
   }

   public void setEmployees(List<Employee> employees) {
      this.employees = employees;
   }
}
