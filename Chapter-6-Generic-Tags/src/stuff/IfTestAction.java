package stuff;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class IfTestAction extends ActionSupport {
   public String execute() {
      if (userName != null && userName.length() > 0 && password != null
            && password.length() > 0) {
         ServletActionContext.getContext().getSession().put("loggedIn", true);
      }
      return SUCCESS;
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
