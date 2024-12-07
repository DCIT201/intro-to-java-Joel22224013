import java.util.*;
public class TemperatureConverter {
    //creating functions to help with my conversions
    public static double celciusTofahrenheit(double celsius){
        double celsiusconverter=(celsius*(9.0/5))+32;
        return celsiusconverter;
    }
    public static double fahrenheitTocelsius(double fahrenheit){
        double fahrenheitConverter=(fahrenheit-32)*(5.0/9);
        return fahrenheitConverter;
    }
    public static void main(String[] args) {
//creating an object for the Scanner class to allow for inputs
        Scanner scanner= new Scanner(System.in);

        System.out.println("What do you want to do:\n" +"1. Convert a temperature from celsius to Fahrenheit.\n" + "2. Convert a temperature from fahrenheit to celsius.\n");
        System.out.println("Choose between 1 and 2 by inputting their respective digit representation.");

        int choice;
        do {
            System.out.println("What do you want to do:\n" +
                            "1. Convert a temperature from Celsius to Fahrenheit.\n" +
                            "2. Convert a temperature from Fahrenheit to Celsius.\n" +
                            "3. Exit.\n" );
            System.out.println("Choose an option (1, 2, or 3): ");

            choice = scanner.nextInt(); // Ask the user for input

            switch (choice) {
                case 1:
                    System.out.println("You want to convert a temperature from Celsius to Fahrenheit.");
                    System.out.print("Input your temperature in Celsius: ");
                    double temperature1 = scanner.nextDouble();
                    if (temperature1 > -100 && temperature1 < 100) {
                        System.out.println("Your temperature in Fahrenheit is " + celciusTofahrenheit(temperature1) + "°F");
                    } else {
                        System.out.println("Invalid input! Please enter a temperature between -100 and 100.");
                    }
                    System.out.println("--------------------------------------------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("You want to convert a temperature from Fahrenheit to Celsius.");
                    System.out.print("Input your temperature in Fahrenheit: ");
                    double temperature2 = scanner.nextDouble();
                    if (temperature2 > -273 && temperature2 < 32) {
                        System.out.println("Your temperature in Celsius is " + fahrenheitTocelsius(temperature2) + "°C");
                    } else {
                        System.out.println("Invalid input! Please enter a temperature between -273 and 32.");
                    }
                    System.out.println("--------------------------------------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Exiting the program....");
                    break;
                default:
                    System.out.println("Invalid choice! Please select 1, 2, or 3.");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    break;
            }
        } while (choice != 3);
        // Continue until the user chooses to exit

        scanner.close();
    }
}
