package stuff;

import com.opensymphony.xwork2.ActionSupport;

public class VisitorTestAction extends ActionSupport {
   // *** userName property
   private String userName;

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   // *** password property
   private String password;

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }
}
