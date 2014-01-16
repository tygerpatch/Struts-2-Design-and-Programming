package stuff;

import com.opensymphony.xwork2.ActionSupport;

public class FieldExpressionTestAction extends ActionSupport {
   // *** min property
   private int min;

   public int getMin() {
      return min;
   }

   public void setMin(int min) {
      this.min = min;
   }

   // *** max property
   private int max;

   public int getMax() {
      return max;
   }

   public void setMax(int max) {
      this.max = max;
   }
}
