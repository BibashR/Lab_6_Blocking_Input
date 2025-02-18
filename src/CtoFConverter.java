import java.util.Scanner;

public class CtoFConverter{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        boolean done = false;

        do {
            System.out.print("Enter the temperature in Celsius");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                done = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                in.nextLine();
            }
        } while (!done);
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("The temperate in Fahrenheit is: " + fahrenheit);
    }
}