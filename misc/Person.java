public class Person {

  private String fullName;

  private int age;

  public Person(String s, int a) {
    fullName = s;

    age = a;
  }

  // Accessors for name and age

  public String getName() {
    return fullName;
  }

  public int getAge() {
    return age;
  }
}
