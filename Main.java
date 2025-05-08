abstract class Animal {
    abstract void makeSound();

     void  eat (){
        System.out.println("Animal is eating...");
     }
}

class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println(" bow bow bow...");
        
    }
}

class Cat extends Animal{
   @Override
   void makeSound() {
       System.out.println("meow meow meow...");
   }
}

public class Main {
    public static void main(String[] args) {
        Dog tommy = new Dog();
        Cat mano = new Cat();

        //System.out.println(tommy.makeSound());
        //System.out.println(mano.makeSound());

        tommy.makeSound();
        mano.makeSound();

        tommy.eat();
        mano.eat();
        
    }    
}
