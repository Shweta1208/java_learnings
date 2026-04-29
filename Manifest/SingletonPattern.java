package Manifest;

public class SingletonPattern {
    Singleton a = Singleton.getInstance();
//    Singleton b = Singleton();
}

class Singleton{
    static Singleton a = new Singleton();
    private Singleton(){

    }
    public static Singleton getInstance(){
        return a;
    }
}
