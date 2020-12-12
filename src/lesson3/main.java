package lesson3;

import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) //создаем главный метод
    {
        //guessTheNumber ();
        guessTheFruit();
    }

    public static void guessTheNumber() {
        System.out.println("Угадайте число от 0 до 9.");
        System.out.println("У вас 3 попытки.");
        Random rand = new Random();
        int x = rand.nextInt(10);
        Scanner scanner = new Scanner(System.in);
        int a = 3;
        while (a > 0) {
            int y = scanner.nextInt();
            if (x == y) {
                System.out.println("Вы угадали!");
                break;
            } else if (y > x) {
                a = a - 1;
                System.out.println("Загаданное число меньше.");
                //System.out.println("Попробуйте еще раз.");
                System.out.println("Количество оставшихся попыток: " + a);
            } else if (y < x) {
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
        if (b == 1) {
            guessTheNumber();
        } else if (b == 0) {
            System.out.println("Хорошего дня!");
        }
    }


    public static void guessTheFruit() {
        // создаем массив из слов
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        // загадываем слово путем рандомного выбора по номер слова в массиве
        Random rand = new Random();
        String a = words[rand.nextInt(words.length)];
        //char c = a.charAt(1); // возвращает букву из слова под номеро в скобках
        //System.out.println(c); // печатает букву
        //System.out.println(a.length()); //печатает кол-во символов загаданного слова
        //System.out.println("Угадайте слово.");
        Scanner scanner = new Scanner(System.in); //вводим в игру оператор ввода
        while (true)
        {
            String word = scanner.next(); // вводим слово
            int x = 0; //счетчик угаданных букв
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == word.charAt(i)) {
                    x = x + 1; //каждая угаданая буква увеличивает счетчик на 1
                    System.out.print(a.charAt(i));
                } else System.out.print("#"); //если буква не угадана, то ставится символ
            }
            // проверка на совпадение кол-ва символов загаданного слова с количеством угаданных букв
            if (x == a.length()) {
                System.out.println();
                // если true, то поздравление и завершение программы
                System.out.println("Вы угадали!");
                break;
            } else // если false, то дописываем символ # так, чтобы в строке было 15 символов и пользовательне смог узнать длинну слова
                for (int b = 0; b < 15 - a.length();b++)
                {
                    System.out.print("#");
                }
            System.out.println();
                System.out.println("Вы не угадали! Пробуйте еще!");
        }


    }
}