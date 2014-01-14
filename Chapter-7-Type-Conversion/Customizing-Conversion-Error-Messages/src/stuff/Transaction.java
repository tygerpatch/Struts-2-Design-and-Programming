package stuff;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class Transaction extends ActionSupport {
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

   // *** transactionType property
   private int transactionType;

   public int getTransactionType() {
      return transactionType;
   }

   public void setTransactionType(int transactionType) {
      this.transactionType = transactionType;
   }
}
