package app08f;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class User extends ActionSupport {

   private static List<String> userNames = new ArrayList<String>();

   static {
      userNames.add("harry");
      userNames.add("sally");
   }

   @Override
   public void validate() {
      if (userNames.contains(userName)) {
         addFieldError("userName", "'" + userName + "' has been taken.");
      }
   }

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
