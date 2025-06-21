package SchoolApp;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Teacher extends Person implements SchoolAccess, Payable {
    private LocalDate hireDate;
    private double salary;

    public Teacher(String name, double salary) {
        super(name);
        this.salary = salary;
        this.hireDate = LocalDate.now(); // Дата приёма на работу = сейчас
    }

    // Методы SchoolAccess
    @Override
    public void goToSchool() {
        System.out.println(name + " (учитель) пришёл в школу.");
    }

    @Override
    public void leaveSchool() {
        System.out.println(name + " (учитель) покинул школу.");
    }

    // Методы Payable
    @Override
    public void pay() {
        System.out.println(name + " получил зарплату: " + salary);
    }

    @Override
    public void pay(int overworkDays) {
        double total = salary + (overworkDays * salary * 1.5);
        System.out.println(name + " получил зарплату с переработкой: " + total);
    }

    @Override
    public void pay(int overworkDays, double customBonus) {
        double total = salary + (overworkDays * salary * 1.5) + (salary * customBonus);
        System.out.println(name + " получил зарплату с переработкой и бонусом: " + total);
    }

    // Метод для получения стажа работы
    public void printWorkDuration() {
        LocalDate now = LocalDate.now();
        long days = ChronoUnit.DAYS.between(hireDate, now);
        long hours = days * 8; // Предположим, 8 часов в день
        System.out.println(name + " работает уже " + days + " дней (" + hours + " часов).");
    }
}
