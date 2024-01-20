public class Main {

  public static void main(String[] args) {
    testEmployee();
    testDayCare();
  }

  public static void testEmployee() {
    record TestInput(Child child, boolean canTeach){};
    Employee emp = new Employee("Example Person", "AB123", 2, 5);
    TestInput[] inputs = {
      new TestInput(new Child(1, "Baby"), false),
      new TestInput(new Child(3, "Toddler"), true),
      new TestInput(new Child(5, "Preschool"), true),
      new TestInput(new Child(12, "Teen"), false),
    };

    int childCount = 0;
    for (TestInput input: inputs) {
      assert input.canTeach == emp.canTeach(input.child.getAge());
      if (input.canTeach) {
        childCount++;
        emp.assignChild(input.child);
      }
    }
    assert emp.childrenAssigned() == childCount;
    System.out.println(emp);
  }

  public static void testDayCare() {
    DayCare d = new DayCare(3);
    d.addEmployee(new Employee("Person 1", "ID001", 1, 4));
    d.addEmployee(new Employee("Person 2", "ID002", 3, 6));

    assert !d.addChild(new Child(12, "Teen"));
    for (int i=0; i<3; i++) {
      assert d.addChild(new Child(1, String.format("Baby %d", i)));
    }
    for (int i=0; i<3; i++) {
      assert d.addChild(new Child(4, String.format("Toddler %d", i)));
    }
    assert !d.addChild(new Child(1, "Final Baby"));
    assert !d.addChild(new Child(4, "Final Toddler"));

    assert d.numberOfChildren() == 6;
  }
}
