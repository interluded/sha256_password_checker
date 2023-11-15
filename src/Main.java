import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean authenticated = false;

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter The Password: ");
            String password_unencrypted = scan.nextLine();
            String c5e80ac8d1e88db988a45af63d10fc1855193794f399efd4a0e592e35ed9e21c = ("0b14d501a594442a01c6859541bcb3e8164d183d32937b851835442f69d5c94e");
            String sha256hex = org.apache.commons.codec.digest.DigestUtils.sha256Hex(password_unencrypted);
            if (c5e80ac8d1e88db988a45af63d10fc1855193794f399efd4a0e592e35ed9e21c.equals(sha256hex)) {
                System.out.println("Password Correct");
            authenticated = true;
            } else {
                System.out.println("Incorrect,");
            }
        }
    }
