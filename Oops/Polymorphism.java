package Oops;

public class Polymorphism {

    // Method Overloading
    public int add(int a, int b){
        return a + b;
    }

    public double add(double a, double b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    // Method Overriding
    static class Animal{
        void sound(){
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal{
        @Override
        void sound(){
            System.out.println("Dog barks");
        }
    }

    public static void main(String[] args) {
        Polymorphism poly = new Polymorphism();

        // Method Overloading
        System.out.println("Sum of 2 and 3: " + poly.add(2, 3));
        System.out.println("Sum of 2.5 and 3.5: " + poly.add(2.5, 3.5));
        System.out.println("Sum of 1, 2 and 3: " + poly.add(1, 2, 3));

        // Method Overriding
        Animal myAnimal = new Animal();
        myAnimal.sound();

        Dog myDog = new Dog();
        myDog.sound();

        Animal myPet = new Dog(); // Upcasting
        myPet.sound();
    }
}
