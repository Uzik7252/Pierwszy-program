import java.util.Scanner;

public class Main
{

    // zadanie 3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean programIsRunning = true;

        while (programIsRunning) {
            System.out.print("Podaj numer drzwi: ");
            String userInput = sc.next();

            switch (userInput) {
                case "1": {
                    System.out.println("To nie te drzwi ");
                    break;
                }
                case "2": {
                    System.out.println("To nie te dzrwi ");
                    break;
                }
                case "3": {
                    programIsRunning = false;
                    break;
                }
                case "4": {
                    System.out.println("To nie te dzrwi ");
                    break;
                }
                case "5": {
                    System.out.println("To nie te drzwi ");
                    break;
                }
                default: {
                    System.out.println("Podałeś złe dane! ");
                }
            }
        }

        System.out.println("Brawo skończyłeś lochy!");


        //Zadanie 5


        int wysokoscTrojkata = 5;


        for (int i = 0; i < wysokoscTrojkata; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }




    }
}