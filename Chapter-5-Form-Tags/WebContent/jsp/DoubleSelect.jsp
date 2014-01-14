<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
   <head>
      <title>DoubleSelect Tag Example</title>
      <style type="text/css">
         @import url(css/main.css);
         select {
            width: 170px;
         }
      </style>
   </head>
   <body>
      <div id="global" style="width: 300px">
         <s:form>
         <%--
         WARNING: Caught an exception while evaluating expression 'top == 'US' ? {'Atlanta', 'Chicago', 'Detroit'} : (top == 'Canada' ? {'Vancouver', 'Toronto', 'Montreal'} : {'Mexico City', 'Tijuana'})' against value stack
         java.lang.IllegalArgumentException: invalid comparison: stuff.DoubleSelectTestAction and java.lang.String
         --%>
            <s:doubleselect label="Select Location" name="country"
               list="{'US', 'Canada', 'Mexico'}" doubleName="city"
               doubleList="top == 'US' ? {'Atlanta', 'Chicago', 'Detroit'} : (top == 'Canada' ? {'Vancouver', 'Toronto', 'Montreal'} : {'Mexico City', 'Tijuana'})" />
            <s:submit />
         </s:form>

      </div>
   </body>
</html>
