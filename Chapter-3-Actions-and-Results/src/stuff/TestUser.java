package stuff;

import com.opensymphony.xwork2.ActionSupport;

public class TestUser extends ActionSupport {
   public String execute() {
      return SUCCESS;
   }

   public String fooBar() {
      Integer.parseInt("This will throw an exception");
      return SUCCESS;
   }

   // *** userName property
   private String userName = "bu di";

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
