package pl.pp;

public class Person {
    private final String name;
    private int age;
    private final String address;
    private final int yearOfBirth;

    public Person(String name, int age, String address, int yearOfBirth) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.yearOfBirth = yearOfBirth;
    }

    public void sayHello() {
        System.out.println("Hello! My name is " + name + ".");
    }

    public void growOld(int years) {
        if (years > 0) {
            this.age += years;
        }
    }

    public void beYounger() {
        if (age > 0) {
            this.age -= 1;
        }
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}