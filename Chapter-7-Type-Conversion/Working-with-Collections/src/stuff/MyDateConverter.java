package stuff;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import ognl.DefaultTypeConverter;

import com.opensymphony.xwork2.conversion.TypeConversionException;

//import com.opensymphony.xwork2.util.TypeConversionException;

public class MyDateConverter extends DefaultTypeConverter {

   public Object convertValue(Map context, Object value, Class toType) {
      System.out.println("MyDateConverter.convertValue. value:" + value);
      System.out.println("MyDateConverter.convertValue. To Type:" + toType);

      if (toType == Date.class) {
         String datePattern = "yyyy-MM-dd";
         DateFormat format = new SimpleDateFormat(datePattern);
         format.setLenient(false);
         try {
            String[] s = (String[]) value;
            System.out.println("length:" + s.length);
            System.out.println("length:" + s[0]);
            Date date = format.parse(s[0]);
            return date;
         }
         catch (ParseException e) {
            System.out.println("Error:" + e);
            throw new TypeConversionException("Wrong");
         }
      }
      return null;
   }

}
