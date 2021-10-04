package lesson5.car;

/**
 * Клас для опису доступів в java
 */

public class Car {
    private static int number;
    private final String model;
    private int speed;

    static {
        number = 0;
        System.out.println("Static init");
    }

    {
        System.out.println("Initialization");
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Car.number = number;
    }

    public Car(String model, int speed){
        this.model = model;
        setSpeed(speed);
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    /**
     * Виконує присвоювання speed
     * @param speed - швидкість автомобіля
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
