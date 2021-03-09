import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//zadanie 1
        int[] tab =new int[10];
        Random random  = new Random();
        int intRandom;
        try {
            for (int i = 0; i < 11; i++) {
                intRandom = random.nextInt(99);
                tab[i] = intRandom;
                System.out.println(tab[i]);
            }
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("tablica jest już pełna");
        }

//zadanie 2 do domu
        int [] tab2 = new int[4];

        try {
            for (int i = 0; i < 5; i++) {
                Scanner skanner = new Scanner(System.in);
                int g = i+1;
                System.out.println("Podaj zmienną typu integer " + g);
                int a = skanner.nextInt();
                tab2[i] = a;

            }
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Nie można dalej wpisać");

        }catch ( InputMismatchException exception ){
            System.out.println("Podano zły typ danych");
        }


            for (int i = 0; i < 4; i++) {
                System.out.println("El [" + i + "] = " + tab2[i]);
            }

    }
}
