package stuff;

import java.util.Date;

public class Employee {
   public String toString() {
      return firstName + " " + lastName;
   }

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

   // *** birthDate property
   private Date birthDate;

   public Date getBirthDate() {
      return this.birthDate;
   }

   public void setBirthDate(Date birthDate) {
      this.birthDate = birthDate;
   }
}
