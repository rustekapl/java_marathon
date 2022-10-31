package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int numBiggerThanEight = 0;
        int numEqOne = 0;
        int evenNum = 0;
        int oddNum = 0;
        int sum = 0;

        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }


        for (int i : array) {
            sum+=i;
            if(i>8){
                numBiggerThanEight++;
            }
            if(i==1){
                numEqOne++;
            }
            if(i%2==0){
                evenNum++;
            }
            else {
                oddNum++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: "+array.length);
        System.out.println("Количество чисел больше 8: "+numBiggerThanEight);
        System.out.println("Количество чисел равных 1: "+numEqOne);
        System.out.println("Количестве четных чисел: "+evenNum);
        System.out.println("Количестве нечетных чисел: "+oddNum);
        System.out.println("Сумма всех элементов массива: "+sum);



    }
}
