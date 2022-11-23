package Task3ClassesAndInterfaces;

public class Car {
    private String make;
    private String type;
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car:" +
                "\n DaciaLogan =" + make +
                "\n Saloon =" + type +
                "\n engine =" + engine;
    }

    class Engine {
        private String engineType;

        public void setEngineType(String carType) {
            switch (carType) {
                case "economy":
                    engineType = "diesel";
                    break;
                case "luxury":
                    engineType = "electric";
                    break;
                default: engineType = "petrol";
            }
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "engineType='" + engineType + '\'' +
                    '}';
        }
    }
}
