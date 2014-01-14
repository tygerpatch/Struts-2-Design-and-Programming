package stuff;

import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class SetTestAction extends ActionSupport {
   public String execute() {
      Map sessionMap = ServletActionContext.getContext().getSession();

      Customer customer = new Customer();

      customer.setContact("John Conroy");
      customer.setEmail("info@example.com");

      sessionMap.put("customer", customer);

      return SUCCESS;
   }
}
