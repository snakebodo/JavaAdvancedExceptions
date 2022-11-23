package Task3ClassesAndInterfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Dacia Logan");
        car.setType("luxury");
        Car.Engine engine = new Car().new Engine();
        engine.setEngineType(car.getType());
        car.setEngine(engine);
        System.out.println(car);


    }
}
