package app18a;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

public class ProductDAO {
   private DataSource dataSource;

   public void setDataSource(DataSource dataSource) {
      this.dataSource = dataSource;
   }

   public List<Product> getAllProducts() {
      Connection connection = null;

      try {
         connection = dataSource.getConnection();
      }
      catch(SQLException sqlException) {
         System.out.println("There was a problem getting the connection from the data source.");
         sqlException.printStackTrace();
         return null;
      }

      PreparedStatement preparedStatement;

      try {
         preparedStatement = connection.prepareStatement("SELECT productId, name, description, price FROM Products");
      }
      catch(SQLException sqlException) {
         System.out.println("There was a problem creating the PreparedStatement.");
         sqlException.printStackTrace();
         return null;
      }

      ResultSet resultSet;

      try {
         resultSet = preparedStatement.executeQuery();
      }
      catch (SQLException sqlException) {
         System.out.println("There was a problem executing the prepared statement's query.");
         sqlException.printStackTrace();
         return null;
      }

      List<Product> products = new ArrayList<Product>();

      try {
         Product product;
   
         while (resultSet.next()) {
            // instantiate new Product object
            product = new Product();
   
            // populate Product's properties
            product.setProductId(resultSet.getInt("productId"));
            product.setName(resultSet.getString("name"));
            product.setDescription(resultSet.getString("description"));
            product.setPrice(resultSet.getDouble("price"));
   
            // add Product to list
            products.add(product);
         }
      }
      catch (SQLException sqlException) {
         System.out.println("There was a problem iterating through the results of the query.");
         sqlException.printStackTrace();
         return null;
      }

      try {
         connection.close();
      }
      catch(SQLException sqlException) {
         System.out.println("There was a problem closing the connection.");
         sqlException.printStackTrace();
      }

      return products;
   }
}
