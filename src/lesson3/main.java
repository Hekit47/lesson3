package lesson3;

import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main (String[] args) //создаем главный метод
    {
        guessTheNumber ();
    }

    public static void guessTheNumber ()
    {
        System.out.println("Угадайте число от 0 до 9.");
        System.out.println("У вас 3 попытки.");
        Random rand = new Random();
        int x = rand.nextInt(10);
        Scanner scanner = new Scanner(System.in);

        int a = 3;
        while (a > 0)
        {
            int y = scanner.nextInt();
            if (x == y)
            {
                System.out.println("Вы угадали!");
                break;
            }
            else if (y > x)
            {
                a = a - 1;
                System.out.println("Загаданное число меньше.");
                //System.out.println("Попробуйте еще раз.");
                System.out.println("Количество оставшихся попыток: " + a);
            }
            else if (y < x)
            {
                a = a - 1;
                System.out.println("Загаданное число больше.");
                // System.out.println("Попробуйте еще раз.");
                System.out.println("Количество оставшихся попыток: " + a);
            }

        }
        System.out.println("Повторим?");
        System.out.println("1 - ДА, 0 - НЕТ");
        Scanner scanner1 = new Scanner(System.in);
        int b = scanner1.nextInt();
        if (b == 1)
        {
            guessTheNumber();
        }
        else if (b == 0)
        {
            System.out.println("Хорошего дня!");
        }
    }
}

