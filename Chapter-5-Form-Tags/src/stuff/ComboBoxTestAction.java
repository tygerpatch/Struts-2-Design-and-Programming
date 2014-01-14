package stuff;

import com.opensymphony.xwork2.ActionSupport;

public class ComboBoxTestAction extends ActionSupport {
   // *** make property
   private String make;

   public String getMake() {
      return make;
   }

   public void setMake(String make) {
      this.make = make;
   }
}
