package stuff;

public class Interest {

   public Interest(int id, String description) {
      this.id = id;
      this.description = description;
   }

   // *** id property
   private int id;

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   // *** description property
   private String description;

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }
}
