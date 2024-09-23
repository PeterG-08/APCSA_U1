import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your bill: $");
        double bill = scanner.nextDouble();

        System.out.print("Tip percent: %");
        double tipPercent = scanner.nextDouble();

        System.out.print("Number of people: ");
        int numOfPeople = scanner.nextInt();

        double tip = (tipPercent / 100) * bill;
        double totalBill = bill + tip;
        double tipPerPerson = tip / numOfPeople;
        double totalBillPerPerson = totalBill / numOfPeople;

        printLine("Total tip: $" + tip);
    }

    public static void printLine(String out) {
        // TODO: make this work properly
        System.out.println("------------------------------");
        System.out.print("| ");
        System.out.print(out);
        System.out.println(" |");
    }
}
