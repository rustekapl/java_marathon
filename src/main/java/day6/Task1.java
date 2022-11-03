package day6;


public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Toyota");
        car.setColor("white");
        car.setYear(2020);
        Motorbike motorbike = new Motorbike("Bugatti", "red", 2022);

        car.info();
        car.yearDifference(2000);
        motorbike.info();
        motorbike.yearDifference(2050);
    }
}
