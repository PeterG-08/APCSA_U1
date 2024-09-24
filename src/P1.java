import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // inputs
        System.out.print("Enter your bill: $");
        double bill = scanner.nextDouble();

        System.out.print("Tip percent: %");
        double tipPercent = scanner.nextDouble();

        System.out.print("Number of people: ");
        int numOfPeople = scanner.nextInt();

        // calculate everything
        double tip = (tipPercent / 100) * bill;
        double totalBill = bill + tip;
        double tipPerPerson = tip / numOfPeople;
        double totalBillPerPerson = totalBill / numOfPeople;

        // print everything
        printLine("Total tip: $" + tip, false);
        printLine("Total bill cost: $" + totalBill, false);
        printLine("Tip per person: $" + tipPerPerson, false);
        printLine("Total bill per person: $" + totalBillPerPerson, true);
    }

    /**
     * Prints a line as needed for this project.
     *
     * @param out The string to print.
     * @param close Whether to close this printed line with a closing line or not.
     */
    public static void printLine(String out, boolean close) {
        String line = "-".repeat(out.length() + 4);

        System.out.println(line);
        System.out.print("| ");
        System.out.print(out);
        System.out.println(" |");

        if (close) {
            System.out.println(line);
        }
    }
}
