package app16a;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.profiling.UtilTimerStack;

public class Profiling extends ActionSupport {

   public String execute() {
      System.out.println("xxxx");

      // TODO: do more research on the following
      // UtilTimerStack.setActive(true); // turn profiling on
      // System.setProperty(UtilTimerStack.ACTIVATE_PROPERTY, "true"); // turn timer on

      String activityName = "database access";
      UtilTimerStack.push(activityName);
      try {
         // do some code
      }
      finally {
         UtilTimerStack.pop(activityName);
      }

      return SUCCESS;
   }

   // *** accountId property
   private String accountId;

   public String getAccountId() {
      return accountId;
   }

   public void setAccountId(String accountId) {
      this.accountId = accountId;
   }

   // *** transactionDate property
   private Date transactionDate;

   public Date getTransactionDate() {
      return transactionDate;
   }

   public void setTransactionDate(Date transactionDate) {
      this.transactionDate = transactionDate;
   }

   // *** amount property
   private double amount;

   public double getAmount() {
      return amount;
   }

   public void setAmount(double amount) {
      this.amount = amount;
   }

   // **** transactionType property
   private int transactionType;

   public int getTransactionType() {
      return transactionType;
   }

   public void setTransactionType(int transactionType) {
      this.transactionType = transactionType;
   }
}
