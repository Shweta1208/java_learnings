package Oops;

public class Encapsulation {

    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age >= 0) { // Basic validation
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
}
