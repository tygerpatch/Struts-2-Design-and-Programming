package app14a;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.servlet.ServletContext;

import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

public class FileDownloadAction extends ActionSupport implements ServletContextAware {
   private ServletContext servletContext;

   public InputStream getInputStream() throws Exception {
      // I used the following resources:

      // "Sample Struts2 application for downloading files" posted on codejava.net
      // http://www.codejava.net/frameworks/struts/sample-struts2-application-for-downloading-files

      // "Struts 2 download file example" posted by mkyong on June 16, 2010
      // http://www.mkyong.com/struts2/struts-2-download-file-example/
      return new FileInputStream(new File(filePath)); // added by Todd G

      //return servletContext.getResourceAsStream(filePath); // <- throws NullPointerException
   }

   // *** (write-only) filePath property
   private String filePath;

   public void setFilePath(String filePath) {
      this.filePath = servletContext.getRealPath(filePath); // added by Todd G
   }

   // *** ServletContextAware interface
   @Override
   public void setServletContext(ServletContext servletContext) {
      this.servletContext = servletContext;
   }
}
