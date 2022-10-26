import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        Integer[] integeriuMasyvas = new Integer[5];

        for (int i = 0; i <= 4; i++) {
            Integer x = random.nextInt(11);
            integeriuMasyvas[i] = x;
        }

        System.out.println("kelinta is masyvo elementu norite pasirinkti? ");
        String arrayElement = scanner.nextLine();
        Integer elementContents = null;
        try {
            Integer elementNumber = Integer.parseInt(arrayElement);
            elementContents = integeriuMasyvas[elementNumber];
            System.out.println(elementContents);
        } catch (Exception e) {
            System.out.println("Klaida!");
        } finally {
            if (elementContents == 10) {
                System.out.println("Sveikinam");
            }
        }
    }
}