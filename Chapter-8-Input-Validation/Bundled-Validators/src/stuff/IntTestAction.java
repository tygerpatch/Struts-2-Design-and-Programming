package stuff;

import com.opensymphony.xwork2.ActionSupport;

public class IntTestAction extends ActionSupport {
   // *** year property
   private int year;

   public int getYear() {
      return year;
   }

   public void setYear(int year) {
      this.year = year;
   }
}
