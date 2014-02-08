package com.brainysoftware.captcha;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.dispatcher.StrutsResultSupport;
import com.opensymphony.xwork2.ActionInvocation;

public class CaptchaResult extends StrutsResultSupport {

   // *** StrutsResultSupport
   @Override
   protected void doExecute(String finalLocation, ActionInvocation invocation) throws Exception {
      String word = CaptchaUtil.getRandomWord(wordLength);
      String hash = CaptchaUtil.getHash(word);
      Cookie hashCookie = new Cookie(hashCookieName, hash);

      HttpServletResponse response = (HttpServletResponse) invocation.getInvocationContext().get(HTTP_RESPONSE);
      response.setContentType("image/jpg");
      response.addCookie(hashCookie);

      BufferedImage image = CaptchaUtil.getCaptchaImage(word, imageWidth, imageHeight, 0);
      ImageIO.write(image, "jpg", response.getOutputStream());
   }

   // *** hashCookieName property
   private String hashCookieName = "hash";

   public String getHashCookieName() {
      return hashCookieName;
   }

   public void setHashCookieName(String hashCookieName) {
      this.hashCookieName = hashCookieName;
   }

   // *** wordLength property
   private int wordLength = 6;

   public int getWordLength() {
      return wordLength;
   }

   public void setWordLength(int wordLength) {
      this.wordLength = wordLength;
   }

   // *** imageHeight property
   private int imageHeight = 70;

   public int getImageHeight() {
      return imageHeight;
   }

   public void setImageHeight(int imageHeight) {
      this.imageHeight = imageHeight;
   }

   // *** iamgeWidth property
   private int imageWidth = 200;

   public int getImageWidth() {
      return imageWidth;
   }

   public void setImageWidth(int imageWidth) {
      this.imageWidth = imageWidth;
   }
}
