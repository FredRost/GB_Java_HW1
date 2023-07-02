package HW_Java1;

import java.util.Scanner;

public class program {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Укажите номер задачи");
        System.out.println("1 - Задача 1");
        System.out.println("2 - Задача 2");
        System.out.println("3 - Задача 3");
        System.out.println("0 - Завершение работы");       

    int num = Integer.parseInt(scanner.nextLine());

        switch(num)
        {
            case 1:
                task01();
                break;
            case 2:
                task02();
                break;
            case 3:
                task03();
                break;
            case 0:
                System.out.print("Завершение работы приложения");
                break;
            default:
                System.out.printf("Неккоректный номер задачи,\n повторите попытку ввода.");
                break;
        }
    }

    static void task01() 
    {       
        System.out.println("Введите число ");
        int number = Integer.parseInt(scanner.nextLine());
        int result = sumNumbers(number);
        System.out.println("Сумма чисел от 0 до " + number + " = " + result);
        System.out.println();
    }

    static void task02() 
    {
        System.out.println("Список простых чисел от 0 до 1000: ");
        for (int i = 2; i <= 1000; i++) {
            if (primeTest(i)) 
            {
                System.out.print(" " + i);
            }
        }
        System.out.println();
    }

    static void task03() 
    {
        System.out.println("Введите первое число");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите арифметическую операцию +,-,*,/");
        String action = scanner.nextLine();
        System.out.println("Введите второе число");
        int num2 = Integer.parseInt(scanner.nextLine());
        int result = calculator(num1, num2, action);
        System.out.println("Результат " + result);
        System.out.println();
    }

    static void task04() 
    {
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.printf("Привет, %s!", name);
    }

    private static int sumNumbers(int number)
    {
        int result = 0;
        for (int i = result; i < number; i++) 
        {
            result += i;
        }
        return result;
    }

    private static boolean primeTest(int number) 
    {
        boolean result = true;
        for (int i = 2; i < 1000; i++) {
            if (number >= i && number % i == 0)
            {
                if (i != number) 
                {
                    result = false;
                    break;
                }

            }
        }
        return result;
    }

    private static int calculator(int num1, int num2, String action) 
    {
        int result = 0;
        switch (action) 
        {
            case ("+"):
                result = num1 + num2;
                break;
            case ("-"):
                result = num1 - num2;
                break;
            case ("*"):
                result = num1 * num2;
                break;
            case ("/"):
                result = num1 / num2;
                break;
            default:
                result = 0;
        }
        return result;
    }
}
    
