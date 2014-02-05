package app15b;

import com.opensymphony.xwork2.ActionSupport;

public class Payment extends ActionSupport {
   public String execute() {
      System.out.println("------------------------EXECUTE");
      // simulate a long processing task
      try {
         Thread.sleep(4000);
      }
      catch (InterruptedException e) {
      }
      return SUCCESS;
   }

   // *** amount property
   private double amount;

   public double getAmount() {
      return amount;
   }

   public void setAmount(double amount) {
      this.amount = amount;
   }

   // *** creditCardType property
   private int creditCardType;

   public int getCreditCardType() {
      return creditCardType;
   }

   public void setCreditCardType(int creditCardType) {
      this.creditCardType = creditCardType;
   }

   // *** nameOnCard property
   private String nameOnCard;

   public String getNameOnCard() {
      return nameOnCard;
   }

   public void setNameOnCard(String nameOnCard) {
      this.nameOnCard = nameOnCard;
   }

   // *** number property
   private String number;

   public String getNumber() {
      return number;
   }

   public void setNumber(String number) {
      this.number = number;
   }

   // *** expiryDate property
   private String expiryDate;

   public String getExpiryDate() {
      return expiryDate;
   }

   public void setExpiryDate(String expiryDate) {
      this.expiryDate = expiryDate;
   }

}
