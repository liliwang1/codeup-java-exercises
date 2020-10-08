public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name; // this.name?
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.printf("Hello from %s.%n", name); // this.name?
    }

    public static void main(String[] args) {
        Person person0 = new Person("Lucy");

        System.out.println(person0.getName());
        person0.sayHello();

        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName())); // true
        System.out.println(person1 == person2); // false
        System.out.println(person1.getName() == person2.getName()); // true ?????

        Person person3 = new Person("John");
        Person person4 = person3;
        System.out.println(person3 == person4); // true

        Person person5 = new Person("John");
        Person person6 = person5;
        System.out.println(person5.getName()); // John
        System.out.println(person6.getName()); // John
        person6.setName("Jane");
        System.out.println(person5.getName()); // Jane
        System.out.println(person6.getName()); // Jane
    }
}
