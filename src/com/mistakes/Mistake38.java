package com.mistakes;

/**
 * здесь две ошибки
 */
public class Mistake38 {

    private static String Vasya;

    public static void main(String[] args) {
        Driver driver = new Driver(Vasya);
        Car car = new Car(driver);

        if (car.getDriver().getName().equals("Vasya")) {
            System.out.println("лови бонус");
        }
    }

    static class Car {
        private Driver driver;

        Car(Driver driver) {
            this.driver = driver;
        }

        Driver getDriver() {
            return driver;
        }
    }

    static class Driver {
        private String name;

        Driver(String name) {
            this.name = name;
        }

        String getName() {
            return null;
        }
    }
}
