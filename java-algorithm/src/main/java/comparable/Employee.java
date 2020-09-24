package comparable;

import java.util.Date;

public class Employee implements Comparable<Employee> {
  private String firstName;
  private String lastName;
  private Date joinDate;

  public Employee(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public int compareTo(Employee o) {
    return 0;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Employee(String firstName, String lastName, Date joinDate) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.joinDate = joinDate;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Date getJoinDate() {
    return joinDate;
  }

  public void setJoinDate(Date joinDate) {
    this.joinDate = joinDate;
  }
//  public int compareTo(Employee another) {
//    int compareValue = this.firstName.compareTo(another.firstName);
//    if (compareValue == 0) {
//      return this.lastName.compareTo(another.lastName);
//    }
//    return compareValue;
//  }


  @Override
  public String toString() {
    return "Employee{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", joinDate=" + joinDate +
        '}';
  }
}
