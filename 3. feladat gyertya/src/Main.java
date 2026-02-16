import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- 3. Feladat: Születésnapi torta ---");

        int kor;
        do {
            System.out.print("Hány éves vagy? (1-20 között): ");
            kor = scanner.nextInt();
            if (kor < 1 || kor > 20) {
                System.out.println("Hibás adat! Az életkornak 1 és 20 között kell lennie.");
            }
        } while (kor < 1 || kor > 20);
        System.out.println("\nÍme a torta:");
        for (int i = 0; i < kor; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < kor; i++) {
            System.out.print("| ");
        }
        System.out.println();

        for (int i = 0; i < kor; i++) {
            System.out.print("--");
        }
        System.out.println();

        scanner.close();
    }
}