package TeachersTasks;

public class Main {
    public static void main(String[] args) {
        // Создаем учителей
        ITTeacher itTeacher = new ITTeacher("Сэм");
        GeographyTeacher geoTeacher = new GeographyTeacher("Танюха");
        ChemistryTeacher chemTeacher = new ChemistryTeacher("Витёк");
        MathTeacher mathTeacher = new MathTeacher("Иринка");
        UndefinedTeacher newTeacher = new UndefinedTeacher("Анна");

        // Тестируем их методы
        System.out.println("--- Учитель информатики ---");
        itTeacher.describe();
        itTeacher.teach();

        System.out.println("\n--- Учитель географии ---");
        geoTeacher.describe();
        geoTeacher.teach();

        System.out.println("\n--- Учитель химии ---");
        chemTeacher.describe();
        chemTeacher.teach();

        System.out.println("\n--- Учитель математики ---");
        mathTeacher.describe();
        mathTeacher.teach();

        System.out.println("\n--- Учитель без специальности ---");
        newTeacher.describe();
    }
}
}
