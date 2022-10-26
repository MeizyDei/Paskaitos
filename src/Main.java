import java.util.Random;
import java.util.Scanner;

public class Main {
    static Integer[] integeriuMasyvas = new Integer[5];
   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i <= 4; i++) {
            Integer x = random.nextInt(11);
            integeriuMasyvas[i] = x;
        }
        try{
            checkForTheWin();
        }catch(BadInputException e){
            e.printStackTrace();
        }
        String arrayElement = scanner.nextLine();
        Integer elementContents = null;
    }
    public static void checkForTheWin () throws BadInputException {
        int userInput = 0;
        try {
            System.out.println("kelinta is masyvo elementu norite pasirinkti? ");
            userInput = scanner.nextInt();
            System.out.println(integeriuMasyvas[userInput]);
        } catch (Exception e) {
            System.out.println("Klaida!");
        } finally {
            if (integeriuMasyvas[userInput] == 10) {
                System.out.println("Sveikinam");
            }
        }
    }
}
