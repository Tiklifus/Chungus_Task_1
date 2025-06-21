package TeachersTasks;

import java.util.Scanner;

public class ITTeacher extends Teacher {
    public ITTeacher(String name) {
        // Вызываем конструктор родительского класса
        super(name, TeacherType.IT);
    }

    @Override
    public void describe() {
        System.out.println("Я учитель информатики, меня зовут " + name);
    }

    @Override
    public void teach() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какое число Фибоначчи вычислить?");

        // Получаем число
        int number = scanner.nextInt();

        // Вычисляем и выводим
        System.out.println("Число Фибоначчи под номером " + number + " = " + fibonacci(number));
    }

    // Метод для вычисления числа Фибоначчи (рекурсивный)
    private int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
