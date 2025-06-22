package teachers_tasks;

import java.util.Scanner;

public class MathTeacher extends Teacher {
    public MathTeacher(String name) {
        super(name, TeacherType.MATH);
    }

    @Override
    public void describe() {
        System.out.println("Я учитель математики, меня зовут " + name);
    }

    @Override
    public void teach() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double num1 = scanner.nextDouble();

        System.out.println("Введите операцию (+, -, *, /):");
        String op = scanner.next();

        System.out.println("Введите второе число:");
        double num2 = scanner.nextDouble();

        // Выполняем вычисления
        switch (op) {
            case "+":
                System.out.println("Результат: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Результат: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Результат: " + (num1 * num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("Результат: " + (num1 / num2));
                } else {
                    System.out.println("Ошибка: деление на ноль!");
                }
                break;
            default:
                System.out.println("Неизвестная операция");
        }
    }
}
