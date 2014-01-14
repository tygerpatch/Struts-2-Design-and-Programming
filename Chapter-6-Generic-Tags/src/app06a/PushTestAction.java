package app06a;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class PushTestAction extends ActionSupport implements SessionAware {

   public String execute() {
      Employee employee = new Employee();

      employee.setId(1);
      employee.setFirstName("Karl");
      employee.setLastName("Popper");

      sessionMap.put("employee", employee);

      return SUCCESS;
   }

   // *** SessionAware interface
   private Map sessionMap;

   @Override
   public void setSession(Map sessionMap) {
      this.sessionMap = sessionMap;
   }
}
