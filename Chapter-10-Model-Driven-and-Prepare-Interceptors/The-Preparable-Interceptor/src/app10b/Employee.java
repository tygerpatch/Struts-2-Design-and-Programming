package app10b;

public class Employee {

   public Employee() {
   }

   public Employee(int id, String firstName, String lastName) {
      this.id = id;
      this.firstName = firstName;
      this.lastName = lastName;
   }

   // *** id property
   private int id;

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
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
}
