package stuff;

import com.opensymphony.xwork2.ActionSupport;

public class Author extends ActionSupport {
   public String add() {
      System.out.println("Author.add");
      return SUCCESS;
   }

   public String edit() {
      System.out.println("Author.edit");
      return SUCCESS;
   }

   public String delete() {
      System.out.println("Author.delete");
      return SUCCESS;
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
