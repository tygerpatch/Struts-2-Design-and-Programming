package stuff;

import com.opensymphony.xwork2.ActionSupport;

public class CheckBoxTestAction extends ActionSupport {
   // *** daily property
   private boolean daily;

   public boolean isDaily() {
      return daily;
   }

   public void setDaily(boolean daily) {
      this.daily = daily;
   }

   // *** weekly property
   private boolean weekly;

   public boolean isWeekly() {
      return weekly;
   }

   public void setWeekly(boolean weekly) {
      this.weekly = weekly;
   }

   // *** monthly property
   private boolean monthly;

   public boolean isMonthly() {
      return monthly;
   }

   public void setMonthly(boolean monthly) {
      this.monthly = monthly;
   }
}
