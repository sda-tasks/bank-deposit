package pl.sda.deposit;

public class BankDeposit {

    public static final double BELKA_TAX = 0.81;
    private double totalAmount;
    private double percentage;
    private int duration;

    public BankDeposit(double totalAmount, double percentage, int duration) {
        this.totalAmount = totalAmount;
        this.percentage = percentage;
        this.duration = duration;
    }

    public double calculate() {
        return BELKA_TAX * totalAmount * percentage / 100.0 * (double) duration / 365;
    }

    public double calculate(int periods) {
        double calculatedAmount = totalAmount;

        for (int i = 0; i < periods; ++i) {
            double increasedValue = BELKA_TAX * calculatedAmount * percentage / 100.0 / 12.0;
            calculatedAmount += increasedValue;
        }
        return calculatedAmount - totalAmount;
    }
}
