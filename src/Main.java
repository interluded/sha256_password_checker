import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Password: ");
        String password_unencrypted = scan.nextLine();
        String encrypted_still = ("0b14d501a594442a01c6859541bcb3e8164d183d32937b851835442f69d5c94e");
        String encrypted_dynamic = org.apache.commons.codec.digest.DigestUtils.sha256Hex(password_unencrypted);

        while (!encrypted_still.equals(encrypted_dynamic)) {
            System.out.println("Incorrect,");
            System.out.println("Enter The Password: ");
            password_unencrypted = scan.nextLine();
            encrypted_still = ("0b14d501a594442a01c6859541bcb3e8164d183d32937b851835442f69d5c94e");
            encrypted_dynamic = org.apache.commons.codec.digest.DigestUtils.sha256Hex(password_unencrypted);
        }

        System.out.println("Password Correct");
    }
}
