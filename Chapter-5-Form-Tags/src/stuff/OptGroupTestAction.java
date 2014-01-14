package stuff;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class OptGroupTestAction extends ActionSupport {

   // *** city property
   private int city;

   public int getCity() {
      return city;
   }

   public void setCity(int city) {
      this.city = city;
   }

   // *** (read-only) usCities property
   private static Map<Integer, String> usCities = new HashMap<Integer, String>();

   public Map<Integer, String> getUsCities() {
      return usCities;
   }

   // *** (read-only) canadaCities property
   private static Map<Integer, String> canadaCities = new HashMap<Integer, String>();

   public Map<Integer, String> getCanadaCities() {
      return canadaCities;
   }

   // *** (read-only) mexicoCities property
   private static Map<Integer, String> mexicoCities = new HashMap<Integer, String>();

   public Map<Integer, String> getMexicoCities() {
      return mexicoCities;
   }

   static {
      usCities.put(1, "Atlanta");
      usCities.put(2, "Chicago");
      usCities.put(3, "Detroit");
      canadaCities.put(4, "Vancouver");
      canadaCities.put(5, "Toronto");
      canadaCities.put(6, "Montreal");
      mexicoCities.put(7, "Mexico City");
      mexicoCities.put(8, "Tijuana");
   }
}
