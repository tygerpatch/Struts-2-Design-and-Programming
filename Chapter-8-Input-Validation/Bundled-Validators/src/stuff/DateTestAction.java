package stuff;

import java.util.Date;
import com.opensymphony.xwork2.ActionSupport;

public class DateTestAction extends ActionSupport {
   // *** birthDate property
   private Date birthDate;

   public Date getBirthDate() {
      return birthDate;
   }

   public void setBirthDate(Date birthDate) {
      this.birthDate = birthDate;
   }
}
