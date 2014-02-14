package app26a;

//namepace: /
// url: customer

//import org.apache.struts2.config.Result;
//import org.apache.struts2.convention.annotation.Namespace;
//import org.apache.struts2.convention.annotation.Result;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

// @Result(name = "success", value = "/jsp/Customer.jsp", type = ServletDispatcherResult.class) // Struts 2.0.x
@Result(name = "success", location = "/jsp/Customer.jsp")
public class Customer extends ActionSupport {
   public String execute() {
      System.out.println("Help I'm being executed...");
      return SUCCESS;
   }
}
