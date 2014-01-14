package stuff;

import java.util.ArrayList;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;

public class MergeTestAction extends ActionSupport {
   // *** (read-only) americanCars property
   private static List<String> americanCars;

   public List<String> getAmericanCars() {
      return americanCars;
   }

   // *** (read-only) europeanCars property
   private static List<String> europeanCars;

   public List<String> getEuropeanCars() {
      return europeanCars;
   }

   // ***  (read-only) japaneseCars property
   private static List<String> japaneseCars;

   public List<String> getJapaneseCars() {
      return japaneseCars;
   }

   static {
      americanCars = new ArrayList<String>();

      americanCars.add("Ford");
      americanCars.add("GMC");
      americanCars.add("Lincoln");

      europeanCars = new ArrayList<String>();

      europeanCars.add("Audi");
      europeanCars.add("BMW");
      europeanCars.add("VW");

      japaneseCars = new ArrayList<String>();

      japaneseCars.add("Honda");
      japaneseCars.add("Nissan");
      japaneseCars.add("Toyota");
   }
}
