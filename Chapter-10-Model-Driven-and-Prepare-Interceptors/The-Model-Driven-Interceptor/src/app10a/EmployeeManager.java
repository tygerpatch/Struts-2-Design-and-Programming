package app10a;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
   public static int id;

   public static void create(Employee employee) {
      employee.setId(++id);
      employees.add(employee);
   }

   // *** (read-only) employees property
   private static List<Employee> employees;

   static {
      employees = new ArrayList<Employee>();
      employees.add(new Employee(++id, "Rachel", "Greene"));
      employees.add(new Employee(++id, "Monica", "Geller"));
      employees.add(new Employee(++id, "Phoebe", "Buffay"));
      employees.add(new Employee(++id, "Joey", "Tribbiani"));
      employees.add(new Employee(++id, "Chandler", "Bing"));
      employees.add(new Employee(++id, "Ross", "Geller"));
   }

   public static List<Employee> getEmployees() {
      return employees;
   }
}
