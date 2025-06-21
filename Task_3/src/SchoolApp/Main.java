package SchoolApp;

public class Main {
    public static void main(String[] args) {
        // Создаём объекты
        Student student = new Student("Томми", true);
        Teacher teacher = new Teacher("Лёха", 50000);
        Staff staff = new Staff("Петрович");

        // Тестируем SchoolAccess
        student.goToSchool();
        student.leaveSchool(); // Уйдёт, т.к. haveAccess = true

        teacher.goToSchool();
        teacher.leaveSchool();

        staff.goToSchool();
        staff.leaveSchool();

        // Тестируем Payable (для учителя)
        teacher.pay();                     // Зпка
        teacher.pay(3);                     // + 3 дня овер
        teacher.pay(3, 0.25);              // + овер + бонус 25%

        // Проверяем стаж работы учителя
        teacher.printWorkDuration();        // Выведет, сколько дней работает
    }
}
