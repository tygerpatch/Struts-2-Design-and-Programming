package app18a;

import interceptor.DataSourceAware;
import java.util.List;
import javax.sql.DataSource;
import com.opensymphony.xwork2.ActionSupport;

public class ListProductAction extends ActionSupport implements DataSourceAware {

   public String execute() {
      ProductDAO productDAO = new ProductDAO();
      productDAO.setDataSource(dataSource);
      products = productDAO.getAllProducts();
      return SUCCESS;
   }

   // *** DataSourceAware interface
   private DataSource dataSource;

   public void setDataSource(DataSource dataSource) {
      this.dataSource = dataSource;
   }

   // *** products property
   private List<Product> products;

   public List<Product> getProducts() {
      return products;
   }

   public void setProducts(List<Product> products) {
      this.products = products;
   }
}
