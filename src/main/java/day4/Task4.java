package day4;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];

        int max = Integer.MIN_VALUE;
        int index=0;


        for (int i = 0; i < 100; i++) {
            array[i] = (int) (Math.random() * 10000);
        }

        for (int i = 2; i < array.length; i++) {
            int sum = array[i - 2] + array[i - 1] + array[i];
            if(sum >max){
                max= sum;
                index=i-2;
            }
        }
        System.out.println(max);
        System.out.println(index);

    }
}
