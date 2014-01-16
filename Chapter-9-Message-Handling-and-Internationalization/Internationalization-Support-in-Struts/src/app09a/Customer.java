package app09a;

import com.opensymphony.xwork2.ActionSupport;

public class Customer extends ActionSupport implements Dummy {
   // *** name property
   private String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   // *** contact property
   private String contact;

   public String getContact() {
      return contact;
   }

   public void setContact(String contact) {
      this.contact = contact;
   }

   // *** address property
   private String address;

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   // *** city property
   private String city;

   public String getCity() {
      return city;
   }

   public void setCity(String city) {
      this.city = city;
   }

   // *** state property
   private String state;

   public String getState() {
      return state;
   }

   public void setState(String state) {
      this.state = state;
   }

   // *** zipCode property
   private String zipCode;

   public String getZipCode() {
      return zipCode;
   }

   public void setZipCode(String zipCode) {
      this.zipCode = zipCode;
   }
}
