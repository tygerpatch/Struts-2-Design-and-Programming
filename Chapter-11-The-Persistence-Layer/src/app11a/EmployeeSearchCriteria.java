package app11a;

import java.io.Serializable;

public class EmployeeSearchCriteria implements Serializable {
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
}
