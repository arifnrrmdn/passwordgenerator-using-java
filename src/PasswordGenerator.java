import java.util.*;

public class PasswordGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========== PROGRAM PASSWORD GENERATOR ===========");
        while (true) {
            System.out.println("1. buat password random");
            System.out.println("2. exit");
            System.out.print("Input: ");
            int input = scanner.nextInt();

            if (input == 1) {
                System.out.print("Masukan panjang karakter: ");
                int panjang = scanner.nextInt();
                System.out.println(buat_Password(panjang));
            } else if (input == 2) {
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti!");
            }
        }

    }

    static char[] buat_Password(int len) {
        System.out.print("Password: ");
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefgijklmnopqrstuvwxyz";
        String numbers = "01234556789";
        String symbols = "!@#$%^&*()_+<>?/~`";
        String values = Capital_chars + Small_chars + numbers + symbols;

        Random rndm_method = new Random();
        char[] password = new char[len];
        for (int i = 0; i < len; i++) {
            password[i] = values.charAt(rndm_method.nextInt(values.length()));
        }
        return password;
    }
}
