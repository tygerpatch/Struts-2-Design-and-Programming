package stuff;

import java.util.ArrayList;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;

public class IteratorTestAction extends ActionSupport {

   // *** interests property
   private int[] interests;

   public int[] getInterests() {
      return interests;
   }

   public void setInterests(int[] interests) {
      this.interests = interests;
   }

   // *** (read-only) interestOptions property
   private static List<Interest> interestOptions = new ArrayList<Interest>();

   static {
      interestOptions.add(new Interest(1, "Automotive"));
      interestOptions.add(new Interest(2, "Games"));
      interestOptions.add(new Interest(3, "Sports"));
   }

   public List<Interest> getInterestOptions() {
      return interestOptions;
   }

}
