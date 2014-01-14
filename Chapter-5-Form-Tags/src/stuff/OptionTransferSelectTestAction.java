package stuff;

import com.opensymphony.xwork2.ActionSupport;

public class OptionTransferSelectTestAction extends ActionSupport {
   // *** selectedLanguages property
   private String[] selectedLanguages;

   public String[] getSelectedLanguages() {
      return selectedLanguages;
   }

   public void setSelectedLanguages(String[] selectedLanguages) {
      for (String language : selectedLanguages) {
         System.out.println("Language:" + language);
      }

      this.selectedLanguages = selectedLanguages;
   }
}
