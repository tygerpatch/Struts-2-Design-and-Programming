package stuff;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.opensymphony.xwork2.conversion.TypeConversionException;

//import com.opensymphony.xwork2.util.TypeConversionException;

public class MyColorConverter extends StrutsTypeConverter {

   private int parseColor(String code) {
      try {
         int result = Integer.parseInt(code.trim());

         if ((result < 0) || (result >= 256)) {
            throw new TypeConversionException("Invalid color codes");
         }

         return result;
      }
      catch (NumberFormatException e) {
         throw new TypeConversionException("Invalid color codes");
      }
   }

   @Override
   public Object convertFromString(Map context, String[] values, Class toClass) {
      String[] rgb = values[0].split(",");

      if ((rgb == null) || (rgb.length != 3)) {
         throw new TypeConversionException("Invalid color codes");
      }

      Color color = new Color();

      color.setRed(parseColor(rgb[0]));
      color.setGreen(parseColor(rgb[1]));
      color.setBlue(parseColor(rgb[2]));

      return color;
   }

   @Override
   public String convertToString(Map context, Object obj) {
      Color color = (Color) obj;
      return color.getRed() + "," + color.getGreen() + "," + color.getBlue();
   }
}
