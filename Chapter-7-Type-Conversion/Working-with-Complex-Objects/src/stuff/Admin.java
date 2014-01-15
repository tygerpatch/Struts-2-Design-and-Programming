package stuff;

import com.opensymphony.xwork2.ActionSupport;

public class Admin extends ActionSupport {

   public String execute() {
      // code to insert the employee to the db here
      return SUCCESS;
   }

   // *** employee property
   private Employee employee;

   public Employee getEmployee() {
      return employee;
   }

   public void setEmployee(Employee employees) {
      this.employee = employees;
   }

   // *** adminId property
   private String adminId;

   public String getAdminId() {
      return adminId;
   }

   public void setAdminId(String adminId) {
      this.adminId = adminId;
   }
}
