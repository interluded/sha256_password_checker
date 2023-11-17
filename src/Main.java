import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tries = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Password: ");
        String password_unencrypted = scan.nextLine();
        String encrypted_still = ("9fe93cfaab2c64f30c037620abc1bc0ac69da0464b22900086d4a77982772c30");
        String encrypted_dynamic = org.apache.commons.codec.digest.DigestUtils.sha256Hex(password_unencrypted);
        if (encrypted_dynamic.equals("9fe93cfaab2c64f30c037620abc1bc0ac69da0464b22900086d4a77982772c30")){
            System.out.println("Password Correct");
        }
        tries++;


        while (!encrypted_still.equals(encrypted_dynamic)){
            System.out.println("Incorrect,");
            System.out.println("Enter The Password: ");
            password_unencrypted = scan.nextLine();
            encrypted_still = ("9fe93cfaab2c64f30c037620abc1bc0ac69da0464b22900086d4a77982772c30");
            encrypted_dynamic = org.apache.commons.codec.digest.DigestUtils.sha256Hex(password_unencrypted);
            tries++;
            if (encrypted_dynamic.equals("9fe93cfaab2c64f30c037620abc1bc0ac69da0464b22900086d4a77982772c30")){
                System.out.println("Password Correct");
            }
            if (tries > 3){
                System.out.println("You have been locked out");
                System.exit(0);
            }

        }


    }
}
