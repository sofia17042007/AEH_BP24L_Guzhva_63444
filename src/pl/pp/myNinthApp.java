public class myNinthApp {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        person.introduce();

        Circle circle = new Circle(5.0);
        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Circle area: " + circle.calculateArea());
    }
}
