package app12b;

import java.io.File;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

// TODO: How does this work? How is the attachmentFileName and attachment properties set?
public class MultipleFileUploadAction extends ActionSupport {

   public String upload() throws Exception {
      ServletContext servletContext = ServletActionContext.getServletContext();
      // String dataDir = servletContext.getRealPath("/WEB-INF");

      for (int i = 0; i < attachment.length; i++) {
         System.out.println("file's path = " + attachment[i].getPath());
         System.out.println("file's name = " + attachmentFileName[i]);
         System.out.println("file's size = " + attachment[i].getTotalSpace());

         // According to the Java Docs, how the renameTo behaves is platform-dependent.
         // File savedFile = new File(dataDir, attachmentFileName[i]);
         // renameTo = attachment[i].renameTo(savedFile);
      }
      return SUCCESS;
   }

   // *** attachment property
   private File[] attachment;

   public File[] getAttachment() {
      return attachment;
   }

   public void setAttachment(File[] attachment) {
      this.attachment = attachment;
   }

   // *** attachmentFileName property
   private String[] attachmentFileName;

   public String[] getAttachmentFileName() {
      return attachmentFileName;
   }

   public void setAttachmentFileName(String[] attachmentFileName) {
      this.attachmentFileName = attachmentFileName;
   }

   // *** attachmentContentType property
   private String[] attachmentContentType;

   public String[] getAttachmentContentType() {
      return attachmentContentType;
   }

   public void setAttachmentContentType(String[] attachmentContentType) {
      this.attachmentContentType = attachmentContentType;
   }
}
