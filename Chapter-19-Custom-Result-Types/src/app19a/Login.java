package app19a;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import com.brainysoftware.captcha.CaptchaUtil;
import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport implements ServletRequestAware {


   public String execute() {
      Cookie[] cookies = httpServletRequest.getCookies();
      boolean user_is_don, password_is_secret, is_valid_captcha;

      for (Cookie cookie : cookies) {
         if (cookie.getName().equals(hashCookieName)) {

            user_is_don = userName.equals("don");
            password_is_secret = password.equals("secret");
            is_valid_captcha = CaptchaUtil.validate(word, cookie.getValue());

            if (user_is_don && password_is_secret && is_valid_captcha) {
               return SUCCESS;
            }

            addActionError("Login failed.");
            return INPUT;
         }
      }

      addActionError("Login failed.");
      return INPUT;
   }

   // *** ServletRequestAware interface
   private HttpServletRequest httpServletRequest;

   public void setServletRequest(HttpServletRequest httpServletRequest) {
      this.httpServletRequest = httpServletRequest;
   }

   // *** userName property
   private String userName;

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   // *** password property
   private String password;

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   // *** word property
   private String word;

   public String getWord() {
      return word;
   }

   public void setWord(String word) {
      this.word = word;
   }

   // *** hashCookieName property
   private String hashCookieName = "hash";

   public String getHashCookieName() {
      return hashCookieName;
   }

   public void setHashCookieName(String hashCookieName) {
      this.hashCookieName = hashCookieName;
   }
}
