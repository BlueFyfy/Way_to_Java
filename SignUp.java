import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to JavaGram! Let's sign you up.");
        
        //Task 1 - Using Scanner, ask the user questions

        System.out.println("\nWhat is your last name?");
        String lastName = scan.nextLine();
        //Ask for their last name.
        
        System.out.println("\nWhat is your first name?");
        String firstName = scan.nextLine();
        // Ask for their first name.

        System.out.println("\nHow old are you?");
        int age = scan.nextInt();
        //Ask: how old are you?

        String yourName = scan.nextLine();
        System.out.println("\nPlease enter your username.");
        String userName = scan.nextLine();
        
        System.out.println("\nWhich city do you live?");
        String city = scan.nextLine();
        //Ask what city they live in.

        System.out.println("\nWhich country do you come from?");
        String country = scan.nextLine();
        //Ask what country that's from.


        //Task 2 - Print their information. 

        System.out.println("Thank you for joining JavaGram!");

        //Print their information like so:
        System.out.println("\nYour information:\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nAge: " + age + "\nUsername: " + userName + "\nCity: " + city + "\nCountry: " + country);

        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        //

        scan.close();
        //close scanner. It's good practice :D ! 
    }

    private static int nextInt() {
        return 0;
    }

    private static String nextLine() {
        return null;
    }
}
