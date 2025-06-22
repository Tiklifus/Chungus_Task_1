package teachers_tasks;

import java.io.File;
import java.util.Scanner;

public class ChemistryTeacher extends Teacher {
    public ChemistryTeacher(String name) {
        super(name, TeacherType.CHEMISTRY);
    }

    @Override
    public void describe() {
        System.out.println("Я учитель химии, меня зовут " + name);
    }

    @Override
    public void teach() {
        try {
            File file = new File("C:\\Users\\tikli\\Desktop\\ChungusTask\\Task_3\\src\\teachers_tasks\\AtomicNumElement");
            Scanner fileScanner = new Scanner(file);
            Scanner userScanner = new Scanner(System.in);

            System.out.println("Введите номер элемента или его название:");
            String input = userScanner.nextLine();

            boolean found = false;

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(" - ");

                // Проверяем и по номеру, и по названию
                if (parts[0].equals(input) || parts[1].equalsIgnoreCase(input)) {
                    System.out.println("Элемент: " + parts[1] + ", атомный номер: " + parts[0]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Я не знаю этот элемент. Хотите добавить его в базу? (да/нет)");
                String answer = userScanner.nextLine();
                if (answer.equalsIgnoreCase("да")) {
                    // Здесь можно добавить логику для сохранения нового элемента
                    System.out.println("К сожалению, в этой версии нельзя сохранять новые элементы");
                }
            }

            fileScanner.close();
        } catch (Exception e) {
            System.out.println("Ошибка при чтении файла");
        }
    }
}