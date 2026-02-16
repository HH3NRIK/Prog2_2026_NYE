import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- 2. Feladat: Villámlás távolsága ---");

        int masodperc;
        do {
            System.out.print("Hány másodperccel a villámlás után hallottad a dörgést? ");
            masodperc = scanner.nextInt();
            if (masodperc < 0) {
                System.out.println("Hibás adat! Az idő nem lehet negatív. Kérlek add meg újra!");
            }
        } while (masodperc < 0);
        int tavolsag = masodperc * 300;
        System.out.println("A villámlás " + tavolsag + " méterre történt tőled.");

        scanner.close();
    }
}