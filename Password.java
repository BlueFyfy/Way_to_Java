import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        System.out.println("Please enter your password: ");
        Scanner scan = new Scanner(System.in);
        String password = "  ";
        while (!password.equals("Java")) {
            password = scan.nextLine();
        }
        System.out.println("Correct");
        
        scan.close();
    }
}
