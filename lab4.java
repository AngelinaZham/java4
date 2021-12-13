import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        int n = 7;
        int changingElem = 0;
        int lastIn = 0;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите элементы массива: ");

        int[] myArr = new int[n];
        for (int i = 0; i < myArr.length; i++) {
            if (sc.hasNextInt()) {
                myArr[i] = sc.nextInt();
                if (i == 6) {
                    System.out.println("quit");
                }
            } else {
                System.out.println("Ошибка, введите число");
            }
        }
        System.out.println("Введите индекс элемента,который нужно заменить: ");
        if (sc.hasNextInt()) {
            changingElem = sc.nextInt();
            if (changingElem < n) {
            } else {
                System.out.println("Индекс не должен превышать количество элементов в массиве: ");
            }
        } else {
            System.out.println("Нужно ввести число");
        }

        System.out.println("Введите индекс последнего из элементов,средне арифметическое значение которых заменит один из элементов массива: ");
        if (sc.hasNextInt()) {
            lastIn = sc.nextInt();
            if (lastIn < n) {
            } else {
                System.out.println("Индекс не должен превышать количество элементов в массиве: ");
            }
        } else {
            System.out.println("Нужно ввести число");
        }
        sc.close();

        for (int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i] + " ");
        }
        int newElem = 0;
        for (int i = 0; i <= lastIn; ++i)
            sum += myArr[i];
            newElem = sum / (lastIn +1);
        for (int i = 0; i < myArr.length; i++) {
            myArr[changingElem] = newElem;
            System.out.println(myArr[i] + " ");
        }
    }
}
