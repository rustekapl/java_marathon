package day5;

public class Task1 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setModel("Toyota");
        car1.setColor("white");
        car1.setYear(2020);

        System.out.println("Car1: ");
        System.out.println("Model: "+car1.getModel());
        System.out.println("Color: "+car1.getColor());
        System.out.println("Year: "+car1.getYear());

    }
}

