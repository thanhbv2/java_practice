package comparable;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

  public int compare(Employee emp1, Employee emp2) {
    return emp1.getJoinDate().compareTo(emp2.getJoinDate());
  }
}
