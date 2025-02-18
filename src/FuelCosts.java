import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0, mpg = 25, pricePerGallon = 0;
        boolean done = false;

        do {
            System.out.println("Enter the number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                done = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                in.nextLine();
            }
        } while (!done);
        done = false;
        do {
            System.out.println("Enter the price per gallon of gas: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                done = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                in.nextLine();
            }
        } while (!done);

        double costToDrive100Miles = 100 / mpg * pricePerGallon;
        double maxDistance = gallons * mpg;
        System.out.println("The cost to dive 100 miles: $" + costToDrive100Miles);
        System.out.println("You are able to drive " + maxDistance + " miles with a full tank.");
            }
        }
