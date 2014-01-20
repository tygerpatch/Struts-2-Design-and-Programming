package app12a;

import java.io.File;
import javax.servlet.ServletContext;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.util.ServletContextAware;
import com.opensymphony.xwork2.ActionSupport;

public class SingleFileUploadAction extends ActionSupport implements ServletContextAware {

   public String upload() throws Exception {
      if (attachment != null) {
         // attachment will be null if there's an error,
         // such as if the uploaded file is too large
         String dataDir = servletContext.getRealPath("/WEB-INF/data");
         File savedFile = new File(dataDir, attachmentFileName);
         attachment.renameTo(savedFile);
         return SUCCESS;
      }
      else {
         return INPUT;
      }

   }

   // *** description property
   private String description;

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   // *** attachmentContentType property
   private String attachmentContentType;

   public String getAttachmentContentType() {
      return attachmentContentType;
   }

   public void setAttachmentContentType(String attachmentContentType) {
      this.attachmentContentType = attachmentContentType;
   }

   // *** attachmentFileName property
   private String attachmentFileName;

   public String getAttachmentFileName() {
      return attachmentFileName;
   }

   public void setAttachmentFileName(String attachmentFileName) {
      this.attachmentFileName = attachmentFileName;
   }

   // *** attachment property
   private File attachment;

   public File getAttachment() {
      return attachment;
   }

   public void setAttachment(File attachment) {
      this.attachment = attachment;
   }

   // *** ServletContextAware interface
   private ServletContext servletContext;

   @Override
   public void setServletContext(ServletContext servletContext) {
      this.servletContext = servletContext;
   }

}
