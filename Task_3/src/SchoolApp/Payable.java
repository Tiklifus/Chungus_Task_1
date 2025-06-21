package SchoolApp;

public interface Payable {
    void pay();  // Зпка
    void pay(int overworkDays);  // Зпка + овер (коэф. 1.5)
    void pay(int overworkDays, double customBonus);  // Зпка + овет + кастом бонус (25%)
}
