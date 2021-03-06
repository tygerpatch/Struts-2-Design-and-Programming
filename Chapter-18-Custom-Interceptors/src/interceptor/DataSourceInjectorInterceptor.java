package interceptor;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class DataSourceInjectorInterceptor extends AbstractInterceptor {

    private static DataSource dataSource;

    public void init() {
        // init() is called AFTER properties are set
        if (dataSource == null) {
            System.out.println("Interceptor. init DS" );
            try {
                Context context = new InitialContext();
                dataSource = (DataSource) context.lookup(dataSourceName);
            } catch (NamingException namingException) {
               System.out.println("There was a problem looking up the data source with the given name.");
               namingException.printStackTrace();
            }
        }
    }

    private String dataSourceName;

    public void setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }

   // *** AbstractInterceptor abstract class
   @Override
   public String intercept(ActionInvocation invocation) throws Exception {
      Object action = invocation.getAction();
      if (action instanceof DataSourceAware) {
         ((DataSourceAware) action).setDataSource(dataSource);
      }
      return invocation.invoke();
   }
}
