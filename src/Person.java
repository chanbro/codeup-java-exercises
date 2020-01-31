public class Person {

    private String name;

    public static void main(String[] args) {
//         Exercise 1
        Person world = new Person("World");
        world.sayHello();

////         Exercise 2
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); // true
//        System.out.println(person1 == person2); // false, objects have same content but reside in different locations
//
//        Person person1 = new Person("John");
//        Person person2 = person1; // redundant
//        System.out.println(person1 == person2); // true, objects have same value and location
//
//        Person person1 = new Person("John");
//        Person person2 = person1; // now the same value and location
//        System.out.println(person1.getName()); // John
//        System.out.println(person2.getName()); // John
//        person2.setName("Jane");
//        System.out.println(person1.getName()); // Jane
//        System.out.println(person2.getName()); // Jane
    }

    public Person(String name) {
        this.name = name;
    }

    // returns the person's name
    public String getName() {
        return this.name;
    }

    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    }

    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.println("Hello, " + getName());
    }




}
