package stuff;

public class Magazine {
   public Magazine(String code, String name) {
      this.code = code;
      this.name = name;
   }

   // *** (read-only) code property
   private String code;

   public String getCode() {
      return code;
   }

   // *** (read-only) name property
   private String name;

   public String getName() {
      return name;
   }
}
