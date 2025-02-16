package pl.coderslab.JavaExercisesDayTwoObjectOrientPrograming.Methods;
public class Main02 {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person();
        person.setName("John");
        person.setSurname("Doe");
        person.setAge(30);
        person.setGender("Male");

        System.out.println("Full Name: " + person.getFullName());
        person.increaseAge();
        System.out.println("New Age: " + person.age); // Note: This assumes age is directly accessible; consider adding a getter.

        // Create a Car object
        Car car = new Car();
        car.setBrand("Toyota");
        car.setModel("Corolla");
        car.setPrice(20000);
        System.out.println(car.toString());
    }
}
