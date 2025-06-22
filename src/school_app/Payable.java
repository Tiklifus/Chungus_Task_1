package school_app;

public interface Payable {
    void pay();
    void pay(int overworkDays);
    void pay(int overworkDays, double customBonus);
}
