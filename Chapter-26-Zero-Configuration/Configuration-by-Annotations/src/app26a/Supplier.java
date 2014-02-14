package app26a;

//namepace: /
//url: supplier

//import org.apache.struts2.config.Result;
//import org.apache.struts2.config.Results;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.dispatcher.ServletDispatcherResult;

import com.opensymphony.xwork2.ActionSupport;

// @Result(name = "success", location = "/jsp/Customer.jsp")

@Results({
   // @Result(name = "success", value = "/jsp/Customer.jsp", type = ServletDispatcherResult.class),
      @Result(name = "success", location = "/jsp/Customer.jsp"),

   // @Result(name = "error", value = "/jsp/Error.jsp", type = ServletDispatcherResult.class)
      @Result(name = "error", location = "/jsp/Error.jsp")
})
public class Supplier extends ActionSupport {
   public String execute() {
      System.out.println("Help I'm being executed...");
      if (name == null || name.length() < 4) {
         return ERROR;
      }
      else {
         return SUCCESS;
      }
   }

   // *** name property
   private String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
