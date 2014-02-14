package app26a.admin.action;

// namepace: /admin/action
// url: edit-customer

//import org.apache.struts2.config.Namespace;
//import org.apache.struts2.config.Result;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.dispatcher.ServletDispatcherResult;

import com.opensymphony.xwork2.ActionSupport;

//@Result(name = "success", value = "/jsp/Customer.jsp", type = ServletDispatcherResult.class)
//@Namespace(value = "/")

@Result(name = "success", location = "/jsp/Customer.jsp")
@Namespace(value = "/")
public class EditCustomer extends ActionSupport {

}
