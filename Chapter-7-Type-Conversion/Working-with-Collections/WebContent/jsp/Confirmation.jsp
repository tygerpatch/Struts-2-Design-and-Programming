<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
   <head>
      <title>Confirmation</title>
      <style type="text/css">
         @import url(css/main.css);
      </style>
   </head>
   <body>
      <div id="global" style="width: 350px">
         <h4>Employee Created:</h4>
         <table>
            <s:iterator value="employees">
               <tr>
                  <td>
                     <s:property value="firstName" />
                     <s:property value="lastName" />
                     (<s:date name="birthDate" format="MM dd, yyyy" />)
                  </td>
               </tr>
            </s:iterator>
         </table>
      </div>
      <%-- The following debug tag was causing problems. --%>
      <%-- <s:debug /> --%>
   </body>
</html>
