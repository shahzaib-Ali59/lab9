interface Vehicle {
    void start();
    void stop();
}


class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting with a key ignition.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping using disc brakes.");
        System.out.println("                       ");
    }
}


class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting with a kick.");
        
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping using drum brakes.");
        
    }
}


public class Test {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start();
        car.stop();

        bike.start();
        bike.stop();
    }
}
