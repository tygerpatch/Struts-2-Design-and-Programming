package stuff;

import com.opensymphony.xwork2.ActionSupport;

public class RegExTestAction extends ActionSupport {
   // *** phone property
   private String phone;

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }
}
