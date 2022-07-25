import java.util.Random;
import java.util.Arrays;

public class Main {

    public static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");
    }

    public static void task2() {
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minimum + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maximum + " рублей");
    }

    public static void task3() {
        double avg = 0;
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        avg = (double) total / 30;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n", avg);
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}