import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
         final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal:");

        long principal = scanner.nextLong();
        System.out.print("Annual Interest Rate :");
//        Scanner annualInterestRate = new Scanner(System.in);
        double annualRate = scanner.nextDouble();

        double monthlyInterest = annualRate/(PERCENT * MONTHS_IN_YEAR);
//        Scanner periodYears = new Scanner(System.in);
        System.out.print("Period (Years):");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal *  Math.pow((1+monthlyInterest), numberOfPayments)*monthlyInterest / ((Math.pow((1+monthlyInterest), numberOfPayments)) - 1);
//        DecimalFormat deci = new DecimalFormat("#.00");
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.println("Mortgage : " + currency.format(mortgage));


    }
}