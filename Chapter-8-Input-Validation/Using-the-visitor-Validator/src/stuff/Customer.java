package stuff;

import com.opensymphony.xwork2.ActionSupport;

public class Customer extends ActionSupport {
   // *** firstName property
   private String firstName;

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   // *** lastName property
   private String lastName;

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   // *** address property
   private Address address;

   public Address getAddress() {
      return address;
   }

   public void setAddress(Address address) {
      this.address = address;
   }
}
