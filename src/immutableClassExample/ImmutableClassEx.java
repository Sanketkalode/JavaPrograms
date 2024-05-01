package immutableClassExample;

import java.util.Vector;

/**
 * @author SanketKalode
 * @date 27-04-2024
 */
class Engine{
    private String model;
    public Engine(String model){
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return STR."Engine{model='\{model}\{'\''}\{'}'}";
    }
}

final class Car {
    private final String name;
    private final Engine engine;

    public Car(String name, Engine engine) {
        this.name = name;
        // This is a shallow copy of the engine object which makes it mutable and not a final object.
//        this.engine = engine;

        // This will make a deep copy of the engine object which make engine varible of car object truly final and immutable
        this.engine = new Engine(engine.getModel());
    }

    public String getName() {
        return name;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return STR."Car{name='\{name}\{'\''}, engine=\{engine}\{'}'}";
    }
}

public class ImmutableClassEx {
    public static void main(String[] args) {
        Engine e = new Engine("V9");
        Car car = new Car("BMW", e);

        System.out.println(car);
        e.setModel("V10");
        System.out.println(car);
    }
}
