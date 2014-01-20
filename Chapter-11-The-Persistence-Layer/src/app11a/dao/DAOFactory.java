package app11a.dao;

import javax.servlet.ServletContext;
import org.apache.struts2.ServletActionContext;

public class DAOFactory {
   public static EmployeeDAO getEmployeeDAO() {
      ServletContext servletContext = ServletActionContext.getServletContext();
      String databaseType = servletContext.getInitParameter("dbType");

      if ("mysql".equalsIgnoreCase(databaseType)) {
         return new EmployeeDAOMySQLImpl();
      }
      else if ("oracle".equalsIgnoreCase(databaseType)) {
         // return new EmployeeDAOOracleImpl();
      }
      else if ("mssql".equalsIgnoreCase(databaseType)) {
         // return new EmployeeDAOMsSQLImpl();
      }
      return null;
   }
}
