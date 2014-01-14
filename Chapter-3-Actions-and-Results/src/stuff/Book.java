package stuff;

import com.opensymphony.xwork2.ActionSupport;

public class Book extends ActionSupport {
   public String execute() {
      System.out.println("Book.execute");
      return SUCCESS;
   }

   public String add() {
      System.out.println("Book.add");
      return SUCCESS;
   }

   public String edit() {
      System.out.println("Book.edit");
      return SUCCESS;
   }

   public String delete() {
      System.out.println("Book.delete");
      return SUCCESS;
   }

   // *** isbn property
   private String isbn;

   public String getIsbn() {
      return isbn;
   }

   public void setIsbn(String isbn) {
      this.isbn = isbn;
   }

   // *** title property
   private String title;

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   // *** author property
   private String author;

   public String getAuthor() {
      return author;
   }

   public void setAuthor(String author) {
      this.author = author;
   }
}
