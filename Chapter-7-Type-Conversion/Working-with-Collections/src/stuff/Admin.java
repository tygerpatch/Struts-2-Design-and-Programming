package stuff;

import java.util.Collection;
import com.opensymphony.xwork2.ActionSupport;

public class Admin extends ActionSupport {
   // *** employees property
   private Collection employees;

   public Collection getEmployees() {
      return employees;
   }

   public void setEmployees(Collection employees) {
      this.employees = employees;
   }
}
