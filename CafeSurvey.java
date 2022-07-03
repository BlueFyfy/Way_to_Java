import java.util.Scanner;

public class CafeSurvey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to our cafe!");
        int counter = 0;

        System.out.println("\nHow much do you spend on a cup of coffee?");
        double coffeePrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow many tims do you buy coffee every week?");
        int timesOfCoffee = scan.nextInt();
        counter++;

        System.out.println("\nHow much do you spend on a your food?");
        double foodPrice = scan.nextDouble();   
        counter++;

        System.out.println("\nHow many tims do you buy food every week?");
        int timesOfFood = scan.nextInt();
        counter++;

        scan.close();

        System.out.println("\nThank you for answering all " + counter + " questions.");
        System.out.println("\nThe cost of coffee is " + coffeePrice * timesOfCoffee + " weekly.");
        System.out.println("\nThe cost of food is " + foodPrice * timesOfFood + " weekly.");
        // System.out.println();
        // System.out.println();
    }
    
}
