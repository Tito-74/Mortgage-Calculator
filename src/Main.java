import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
         final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);
        long principal = 0;
        double annualRate = 0;
        double monthlyInterest = 0;
        int numberOfPayments =0;

        while(true){
                System.out.print("Principal ($1k - $1M):");
                principal = scanner.nextLong();
                if (principal >= 1000 && principal <= 1_000_000)
                     break;
                System.out.println("Enter value greater than 1K and less than 1M");

        }

        while(true){
            System.out.print("Annual Interest Rate :");
            annualRate = scanner.nextDouble();
            if (annualRate >= 1 &&  annualRate<=30){
                monthlyInterest = annualRate/(PERCENT * MONTHS_IN_YEAR);
                break;

            }

            System.out.println("Enter value greater than 1 and less or equals to 30");

        }




        while(true){
            System.out.print("Period (Years):");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30){
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter value greater than 1 and less than 30");



        }


 
        double mortgage = principal *  Math.pow((1+monthlyInterest), numberOfPayments)*monthlyInterest / ((Math.pow((1+monthlyInterest), numberOfPayments)) - 1);
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.println("Mortgage : " + currency.format(mortgage));


    }
}