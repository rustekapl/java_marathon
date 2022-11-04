package day8;

public class Task1 {
    public static void main(String[] args) {
        long startString = System.currentTimeMillis();
        String str = null;
        for (int i = 0; i <= 20000; i++) {
            str = str + " " + i;
        }
        System.out.print(str);
        long stopString = System.currentTimeMillis();


        System.out.println("\n ===============================================================");

        long startSb = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }
        System.out.print(sb);
        long stopSb = System.currentTimeMillis();

        System.out.println("\n===============================================================");

        System.out.println("Длительность работы String, в мс.: " + (stopString - startString));
        System.out.println("Длительность работы StringBuilder, в мс.: " + (stopSb - startSb));

    }
}
