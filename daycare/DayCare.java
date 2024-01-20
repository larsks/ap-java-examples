import java.util.*;

public class DayCare {

  private ArrayList<Employee> employees;
  private ArrayList<Child> children;
  private int maxRatio;

  public DayCare(int maxRatio) {
    employees = new ArrayList<Employee>();
    children = new ArrayList<Child>();
    this.maxRatio = maxRatio;
  }

  public boolean findEmployeeForChild(Child c) {
    /* To be completed in part (a) */
    for (Employee emp: employees) {
      System.out.println(emp);
      if (emp.canTeach(c.getAge()) && emp.childrenAssigned() < maxRatio) {
        emp.assignChild(c);
        return true;
      }
    }
    return false;
  }

  public boolean runDayCare() {
    /* To be completed in part (b) */
    for (Child c: children) {
      if (! findEmployeeForChild(c)) {
        return false;
      }
    }
    return true;
  }

  public int numberOfChildren() {
    return children.size();
  }

  public boolean addChild(Child c) {
    /* To be completed in part (c) */
    if (findEmployeeForChild(c)) {
      children.add(c);
      return true;
    }
    return false;
  }

  public void addEmployee(Employee e) {
    employees.add(e);
  }

  public int numberOfEmployees() {
    return employees.size();
  }
}
