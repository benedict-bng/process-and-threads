class Dog {
    void bark() {
        System.out.println("Dog makes a sound - barking");
    }
}

class Puppy extends Dog {
    @Override
    void bark() {
        System.out.println("Puppy barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Puppy(); 
        myDog.bark();            
    }
}
