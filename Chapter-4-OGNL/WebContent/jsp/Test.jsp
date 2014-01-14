<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
   <head>
      <title>Testing OGNL</title>
      <style>
         table {
            border-collapse: collapse; /* Collapse borders together */
            margin: 10px;
         }
   
         table,td,th {
            border: 1px solid black;
         }
      </style>
   </head>
   <body>
       <%@ include file="/WEB-INF/jspf/request-attributes.jspf"%>
      <%@ include file="/WEB-INF/jspf/value-stack.jspf"%>
   </body>
</html>
