package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Bugatti", "red", 2022);

        System.out.println("Motorbike:");
        System.out.println("Model: "+motorbike.getModel());
        System.out.println("Color: "+motorbike.getColor());
        System.out.println("Year: "+motorbike.getYear());

    }
}
