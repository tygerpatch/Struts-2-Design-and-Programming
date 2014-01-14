package stuff;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

public class User implements SessionAware, ServletRequestAware, ServletResponseAware, ServletContextAware {

   public String login() {
      String referrer = servletRequest.getHeader("referer");
      System.out.println(referrer);

      if (referrer != null && userName.length() > 0 && password.length() > 0) {
         int onlineUserCount = 0;
         synchronized (servletContext) {
            try {
               onlineUserCount = (Integer) servletContext.getAttribute("onlineUserCount");
            }
            catch (Exception e) {
            }
            servletContext.setAttribute("onlineUserCount", onlineUserCount + 1);
         }
         return "success";
      }
      else {
         return "input";
      }
   }

  /*
   * The onlineUserCount is accurate only if we also
   * write a javax.servlet.http.HttpSessionListener
   * implementation and decrement the
   * onlineUserCount attribute value in its
   * sessionDestroyed method, which is called by the
   * container when a user session is inactive for
   * a certain period of time.
   */
  public String logout() {
      if (sessionMap instanceof SessionMap) {
          ((SessionMap) sessionMap).invalidate();
      }

      int onlineUserCount = 0;
      synchronized (servletContext) {
          try {
              onlineUserCount = (Integer) servletContext.getAttribute("onlineUserCount");
          } catch (Exception e) {
          }

          servletContext.setAttribute("onlineUserCount", onlineUserCount - 1);
      }

      return "success";
  }


   // *** SessionAware interface
   private Map sessionMap;

   @Override
   public void setSession(Map map) {
      this.sessionMap = map;
  }

   // *** ServletResponseAware interface
   private HttpServletResponse servletResponse;

   @Override
   public void setServletResponse(HttpServletResponse servletResponse) {
      this.servletResponse = servletResponse;
  }

   // *** ServletRequestAware interface
   private HttpServletRequest servletRequest;

   @Override
   public void setServletRequest(HttpServletRequest servletRequest) {
      this.servletRequest = servletRequest;
  }

   // *** ServletContextAware
   private ServletContext servletContext;

   @Override
   public void setServletContext(ServletContext servletContext) {
      this.servletContext = servletContext;
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
}
