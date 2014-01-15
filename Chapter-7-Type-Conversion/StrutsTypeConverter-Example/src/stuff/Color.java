package stuff;

import com.opensymphony.xwork2.ActionSupport;

public class Color extends ActionSupport {

   public String getHexCode() {
      return getHexCode(red) + getHexCode(green) + getHexCode(blue);
   }

   private String getHexCode(int color) {
      if (color < 16) {
         return "0" + Integer.toHexString(color);
      }

      return Integer.toHexString(color);
   }

   // *** red property
   private int red;

   public int getRed() {
      return red;
   }

   public void setRed(int red) {
      this.red = red;
   }

   // *** green property
   private int green;

   public int getGreen() {
      return green;
   }

   public void setGreen(int green) {
      this.green = green;
   }

   // *** blue property
   private int blue;

   public int getBlue() {
      return blue;
   }

   public void setBlue(int blue) {
      this.blue = blue;
   }
}
