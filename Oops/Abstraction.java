package Oops;

public abstract class Abstraction {

    public interface Animal{
        void eat();
        void sleep();
    }

    public interface Dog extends Animal{
        void bark();
        void play();
    }

    public class Cat implements Animal{

        @Override
        public void eat(){
            System.out.println("Cat is eating");
        }

        @Override
        public void sleep(){
            System.out.println("Cat is sleeping");
        }

    }

}

