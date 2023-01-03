package OOP_Programs.Strategy;

public interface PaymentSystem {
    boolean makePayment(int amount);
    void printReceipt(int amount);
}
