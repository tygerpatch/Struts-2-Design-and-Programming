package stuff;

import com.opensymphony.xwork2.ActionSupport;

public class TextAreaTestAction extends ActionSupport {
   // *** description property
   private String description;

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }
}
