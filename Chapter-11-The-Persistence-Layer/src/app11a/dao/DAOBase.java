package app11a.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.sql.DataSource;

import org.apache.struts2.ServletActionContext;

public class DAOBase implements DAO {
   public Connection getConnection() throws SQLException {
      ServletContext servletContext = ServletActionContext.getServletContext();
      DataSource dataSource = (DataSource) servletContext.getAttribute("dataSource");
      // The dataSource attribute is set in AppListener's contextInitialized method
      Connection connection = null;
      if (dataSource != null) {
         connection = dataSource.getConnection();
         String databaseName = servletContext.getInitParameter("databaseName");
         connection.setCatalog(databaseName);
      }
      return connection;
   }
}
