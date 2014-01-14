package stuff;

import com.opensymphony.xwork2.ActionSupport;

public class DoubleSelectTestAction extends ActionSupport {
   // *** country property
   private String country;

   public String getCountry() {
      return country;
   }

   public void setCountry(String country) {
      this.country = country;
   }

   // *** city property
   private String city;

   public String getCity() {
      return city;
   }

   public void setCity(String city) {
      this.city = city;
   }
}
