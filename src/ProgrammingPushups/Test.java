package ProgrammingPushups;

public class Test {
    public static void main(String[] args) {
        GreatGrandparent family1 = new GreatGrandparent("Great Grandparent");
        System.out.println(family1.myName());
        GreatGrandparent family2 = new Grandparent("Grandparent");
        System.out.println(family2.myName());
        GreatGrandparent family3 = new Parent("Parent");
        System.out.println(family3.myName());
        GreatGrandparent family4 = new Parent("Child");
        System.out.println(family4.myName());
    }
}
