package teachers_tasks;

import java.io.File;
import java.util.Scanner;

public class GeographyTeacher extends Teacher {
    public GeographyTeacher(String name) {
        super(name, TeacherType.GEOGRAPHY);
    }

    @Override
    public void describe() {
        System.out.println("Я учитель географии, меня зовут " + name);
    }

    @Override
    public void teach() {
        try {
            // Открываем файл с данными
            File file = new File("C:\\Users\\tikli\\Desktop\\ChungusTask\\Task_3\\src\\teachers_tasks\\CountryCapital");
            Scanner fileScanner = new Scanner(file);
            Scanner userScanner = new Scanner(System.in);

            System.out.println("Введите название страны:");
            String country = userScanner.nextLine();

            boolean found = false;

            // Читаем файл построчно
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(" - "); // Разделяем строку на страну и столицу

                if (parts[0].equalsIgnoreCase(country)) {
                    System.out.println("Столица " + parts[0] + " - " + parts[1]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Такой страны нет в моей базе");
            }

            fileScanner.close();
        } catch (Exception e) {
            System.out.println("Ошибка при чтении файла");
        }
    }
}
