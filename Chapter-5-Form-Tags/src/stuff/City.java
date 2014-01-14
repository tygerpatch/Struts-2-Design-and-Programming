package stuff;

public class City {
   public City(int id, String name) {
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
