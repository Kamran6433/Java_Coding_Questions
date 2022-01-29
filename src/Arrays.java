import java.sql.Array;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] numbers = new int[10];
        numbers[0] = (int) (Math.random()*101);
        numbers[1] = (int) (Math.random()*101);
        numbers[2] = (int) (Math.random()*101);
        numbers[3] = (int) (Math.random()*101);
        numbers[4] = (int) (Math.random()*101);
        numbers[5] = (int) (Math.random()*101);
        numbers[6] = (int) (Math.random()*101);
        numbers[7] = (int) (Math.random()*101);
        numbers[8] = (int) (Math.random()*101);
        numbers[9] = (int) (Math.random()*101);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" [" + numbers[i] + "] ");
        }
        sortArray(numbers);
    }
    public static void sortArray(int [] array) {
        Arrays.sortArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(" [" + array[i] + "] ");
        }
    }
}
//    static void changeNumber(int[] numbers) {
//        numbers[0] = 56;
//        numbers[1] = 7;
//        numbers[2] = 90;
//    }
//    static void printArray(int[] numbers){
//        for (int number : numbers) {
//            System.out.println(number + " ");
//        }
//    }
//    static void sortTheArray(int[] numbers) {
//        Arrays.sortTheArray(numbers);
//        for (int number : numbers) {
//            System.out.println(number + " ");
//        }
//    }
//}
