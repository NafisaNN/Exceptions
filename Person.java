public class Person {
    private int age;

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(-5);  // This will throw an IllegalArgumentException
    }
}