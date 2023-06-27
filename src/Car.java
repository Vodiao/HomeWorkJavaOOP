public class Car {
    private String engine;
    private String transmission;
    private int wheels;
    private boolean gas;

    public Car(String engine, String transmission, int wheels, boolean gas) {
        this.engine = engine;
        this.transmission = transmission;
        this.wheels = wheels;
        this.gas = gas;
    }

    public String getEngine() {
        return engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public int getWheel() {
        return wheels;
    }

    public boolean getGas() {
        return gas;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setGas(boolean gas) {
        this.gas = gas;
    }

    @Override
    public String toString() {
        return "Car {" +
                " engine='" + engine + '\'' +
                ", transmission='" + transmission + '\'' +
                ", brake='" + wheels + '\'' +
                ", gas='" + gas + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return transmission.equals(car.transmission);
    }
}
