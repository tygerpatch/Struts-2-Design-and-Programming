package stuff;

import com.opensymphony.xwork2.ActionSupport;

public class SelectTestAction extends ActionSupport {
   // *** city property
   private int city;

   public int getCity() {
      return city;
   }

   public void setCity(int city) {
      this.city = city;
   }

   // *** country property
   private int country;

   public int getCountry() {
      return country;
   }

   public void setCountry(int country) {
      this.country = country;
   }

   // *** (read-only) cities property
   public City[] getCities() {
      City[] cities = null;
      if (country == 1) {
         cities = new City[3];
         cities[0] = new City(1, "Atlanta");
         cities[1] = new City(2, "Chicago");
         cities[2] = new City(3, "Detroit");
      }
      else if (country == 2) {
         cities = new City[3];
         cities[0] = new City(4, "Vancouver");
         cities[1] = new City(5, "Toronto");
         cities[2] = new City(6, "Montreal");

      }
      else if (country == 3) {
         cities = new City[2];
         cities[0] = new City(7, "Mexico City");
         cities[1] = new City(8, "Tijuana");
      }
      else {
         cities = new City[0];
      }
      return cities;
   }
}
