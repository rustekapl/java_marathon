package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boing", 2020, 50, 100);

        airplane.setYear(2021);
        airplane.setLength(60);
        airplane.fillUp(1000);
        airplane.fillUp(5000);
        airplane.info();


    }
}
