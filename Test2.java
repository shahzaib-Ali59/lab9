public interface flyable {

    abstract void fly ();
    
}

public interface swimable {

    abstract void Swim();
    
}

class Duck implements flyable , swimable {
    @Override
    public void fly() {
        System.out.println("im a skydiyer");
    }

    @Override
    public void Swim() {
        System.out.println("im a full swimmer");
    }
}
public class Test2{
    public static void main(String[] args) {
       Duck duck = new Duck();
       
       duck.Swim();
       duck.fly();
    }
}