package pl.sda.deposit;

public class Demo {

    public static void main(String[] args) {

        BankDeposit bankDeposit = new BankDeposit(20_000_000, 3, 30 );

        double income = bankDeposit.calculate();

        System.out.printf("Zysk wynosi dokładnie : %.3f\n", income);

        double calculateIncome = bankDeposit.calculate(12);
        System.out.printf("Zysk z kapitalizacja miesieczna: %.3f\n", calculateIncome);

    }
}
