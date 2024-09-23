import java.util.Objects;
import java.util.Scanner;

public class L6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input money amount: $");

        int inputCents = (int) (scanner.nextDouble() * 100);

        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;

        quarters = inputCents / 25;
        inputCents %= 25;

        dimes = inputCents / 10;
        inputCents %= 10;

        nickels = inputCents / 5;
        inputCents %= 5;

        pennies = inputCents;

        int coinAmount = quarters + dimes + nickels + pennies;

        System.out.println("Minimum number of coins is " + coinAmount + ": ");
        System.out.println(quarters + singularOrPlural(" Quarter", quarters));
        System.out.println(dimes + singularOrPlural(" Dime", dimes));
        System.out.println(nickels + singularOrPlural(" Nickel", nickels));
        System.out.println(pennies + singularOrPlural(" Penny", pennies));
    }

    // return singular or plural for coins specifically for this proj
    public static String singularOrPlural(String base, int count) {
        if (count == 1) {
            return base;
        }

        // special case for pennies
        if (base == " Penny") {
            base = " Pennie";
        }

        return base + "s";
    }
}
