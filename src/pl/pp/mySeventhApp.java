package pl.pp;
public class mySeventhApp {
    public static void main(String[] args) {

        Person person = new Person("John", 25, "New York", 1999);


        person.sayHello();


        System.out.println("Current age: " + person.getAge());


        person.growOld(10);
        System.out.println("After growOld(10): " + person.getAge());


        person.beYounger();
        System.out.println("After beYounger(): " + person.getAge());


        System.out.println("Address: " + person.getAddress());
        System.out.println("Year of birth: " + person.getYearOfBirth());
    }
}

