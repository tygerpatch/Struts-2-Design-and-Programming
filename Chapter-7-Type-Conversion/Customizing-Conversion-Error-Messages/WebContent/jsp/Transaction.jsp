<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
   <head>
      <title>Transaction Details</title>
      <style type="text/css">
      @import url(css/main.css);

      .errorMessage {
         color: red;
      }
      </style>
   </head>
   <body>
      <div id="global" style="width: 350px">
         <h4>Transaction Details</h4>
         <s:form action="Transaction2">
            <s:textfield name="accountId" label="Account ID" />
            <s:textfield name="transactionDate" label="Transaction Date" />
            <s:textfield name="transactionType" label="Transaction Type" />
            <s:textfield name="amount" label="Amount" />
            <s:submit />
         </s:form>
      </div>
      <%-- The following debug tag was throwing a NullPointerException in GlassFish 4.0 --%>
      <%-- <s:debug /> --%>
   </body>
</html>
