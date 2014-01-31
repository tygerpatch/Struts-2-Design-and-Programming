package app14b;

import java.io.Serializable;

public class Product implements Serializable {
   // *** constructors
   public Product() {
   }

   public Product(int id, String name) {
      this.id = id;
      this.name = name;
   }

   // *** id property
   private int id;

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   // *** name property
   private String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
