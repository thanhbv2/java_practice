package comparable;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NatualObjectOrdering {

  public static void main(String[] args) throws ParseException {

    List<Integer> lsInt = Arrays.asList(1, 99, 11, 78, 12);
    System.out.println("Before: " + lsInt);
    Collections.sort(lsInt);
    System.out.println("Sorted: " + lsInt);

    System.out.println("=======================");
    List<String> lsString = Arrays.asList("test", "acf", "fdshf", "hhhh");
    System.out.println("Before: " + lsString);
    Collections.sort(lsString);
    System.out.println("Sorted: " + lsString);

    System.out.println("=====================");
    DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD");

    List<Date> dates = new ArrayList<Date>();
    dates.add(dateFormat.parse("1999-01-12"));
    dates.add(dateFormat.parse("1920-01-12"));
    dates.add(dateFormat.parse("2019-01-12"));
    dates.add(dateFormat.parse("2020-01-12"));

    System.out.println("Before:" + dates);
    Collections.sort(dates);

    System.out.println("Sorted: " + dates);

    List<Employee> employees = new ArrayList<Employee>();
    Employee employee1 = new Employee("Tom", "Eagar", dateFormat.parse("1999-01-12"));
    Employee employee2 = new Employee("Tom", "Smith", dateFormat.parse("2009-01-12"));
    Employee employee3 = new Employee("Bill", "Joy", dateFormat.parse("1949-01-12"));
    Employee employee4 = new Employee("Bill", "Gates", dateFormat.parse("1969-01-12"));
    Employee employee5 = new Employee("Alice", "Wooden", dateFormat.parse("1929-01-12"));
    employees.add(employee1);
    employees.add(employee2);
    employees.add(employee3);
    employees.add(employee4);
    employees.add(employee5);
    System.out.println("Before: " + employees);
//    Collections.sort(employees);
//    Collections.sort(employees, new EmployeeComparator());
    System.out.println("Sorted: " + employees);
//    Collections.sort(employees, (e1, e2) -> e1.getJoinDate().compareTo(e2.getJoinDate()));
    System.out.println("Lamda Sorted: " + employees);
    Set<String> test = new HashSet<>();

  }
}
