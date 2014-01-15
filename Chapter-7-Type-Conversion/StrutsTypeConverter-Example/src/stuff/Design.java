package stuff;

import com.opensymphony.xwork2.ActionSupport;

public class Design extends ActionSupport {
   // *** designName property
   private String designName;

   public String getDesignName() {
      return designName;
   }

   public void setDesignName(String designName) {
      this.designName = designName;
   }

   // *** color property
   private Color color;

   public Color getColor() {
      return color;
   }

   public void setColor(Color color) {
      this.color = color;
   }
}
