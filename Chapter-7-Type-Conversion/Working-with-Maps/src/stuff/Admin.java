package stuff;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class Admin extends ActionSupport {

   // *** employees property
   private Map employees;

   public Map getEmployees() {
      return employees;
   }

   public void setEmployees(Map employees) {
      this.employees = employees;
   }

   // *** userName property
   private String[] userName;

   public String[] getUserName() {
      return userName;
   }

   public void setUserName(String[] userName) {
      this.userName = userName;
   }
}
