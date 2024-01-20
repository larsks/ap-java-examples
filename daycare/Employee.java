import java.util.*;

public class Employee {

  private String name;
  private String id;
  private int min;
  private int max;
  private Set<Child> children;

  public Employee(String name, String id, int min, int max) {
    this.name = name;
    this.id = id;
    this.min = min;
    this.max = max;
    this.children = new HashSet<Child>();
  }

  // Return the number of children currently assigned to this Employee
  public int childrenAssigned() {
    return children.size();
  }

  // Assign a new child to this Employee
  public void assignChild(Child c) {
    children.add(c);
  }

  // Determine whether this Employee can teach a Child based on the child’s age
  public boolean canTeach(int age) {
    return age >= min && age <= max;
  }

  public String toString() {
    return String.format("<Employee name=%s id=%s min=%d max=%d children=%d>", name, id, min, max, children.size());
  }
}
