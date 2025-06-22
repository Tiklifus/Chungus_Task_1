package school_app;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Teacher extends Person implements AccessableToSchool, Payable {
    private LocalDate hireDate;
    private double salaryPerDay;
    private static final double OVERWORK_KOEFICIENT = 1.5;

    public Teacher(String name, double salary) {
        super(name);
        this.salaryPerDay = salary;
        this.hireDate = LocalDate.now();
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(double salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
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
        System.out.println(name + " получил зарплату: " + salaryPerDay);
    }

    @Override
    public void pay(int overworkDays) {
        double total = salaryPerDay + (overworkDays * salaryPerDay * OVERWORK_KOEFICIENT);
        System.out.println(name + " получил зарплату с переработкой: " + total);
    }

    @Override
    public void pay(int overworkDays, double customBonus) {
        double total = salaryPerDay + (overworkDays * salaryPerDay * OVERWORK_KOEFICIENT) + (salaryPerDay * customBonus);
        System.out.println(name + " получил зарплату с переработкой и бонусом: " + total);
    }

    public void printWorkDuration() {
        LocalDate now = LocalDate.now();
        long days = ChronoUnit.DAYS.between(hireDate, now);
        long hours = days * 8;
        System.out.println(name + " работает уже " + days + " дней (" + hours + " часов).");
    }
}
