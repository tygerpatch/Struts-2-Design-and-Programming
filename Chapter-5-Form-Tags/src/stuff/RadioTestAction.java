package stuff;

import java.util.SortedMap;
import java.util.TreeMap;

import com.opensymphony.xwork2.ActionSupport;

public class RadioTestAction extends ActionSupport {
   // *** userType property
   private int userType;

   public int getUserType() {
      return userType;
   }

   public void setUserType(int userType) {
      this.userType = userType;
   }

   // *** incomeLevel property
   private int incomeLevel;

   public int getIncomeLevel() {
      return incomeLevel;
   }

   public void setIncomeLevel(int incomeLevel) {
      this.incomeLevel = incomeLevel;
   }

   // *** (read-only) incomeLevels property
   private static SortedMap<Integer, String> incomeLevels;

   static {
      incomeLevels = new TreeMap<Integer, String>();
      incomeLevels.put(1, "0 - $10,000");
      incomeLevels.put(2, "$10,001 - $30,000");
      incomeLevels.put(3, "$30,001 - $50,000");
      incomeLevels.put(4, "Over $50,000");
   }

   public SortedMap<Integer, String> getIncomeLevels() {
      return incomeLevels;
   }
}
