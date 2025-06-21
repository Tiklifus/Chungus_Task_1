package TeachersTasks;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    protected String name;
    protected TeacherType type;
    protected static List<Teacher> allTeachers = new ArrayList<>(); // Список всех учителей

    // Конструктор
    public Teacher(String name, TeacherType type) {
        this.name = name;
        this.type = type;
        allTeachers.add(this);   // Добавляем этого учителя в общий список
    }

    // Вывода инфы о учителях
    public static void listAllTeachers() {
        System.out.println("Все учителя:");
        for (Teacher teacher : allTeachers) {
            System.out.println(" --- " + teacher.name + ", " + teacher.type + ".");
        }
    }

    // Методы для детей
    public void describe() {
        System.out.println("Я учитель без специальности");
    }

    public void teach() {
        System.out.println("Я пока не могу ничему научить");
    }
}