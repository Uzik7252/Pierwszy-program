import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //przyklad 5

        int[] numbers = {223,-123,456,765,345,55,-56};



        int max = 0;
        int min = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) max = numbers[i];
            if (numbers[i] < min) min = numbers[i];
            System.out.println("El [" + i + "] = " + numbers[i]);
        }
        System.out.println("\nZmiana miejsc\n");
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] == max) {
                numbers[j] = min;
            } else if (numbers[j] == min) numbers[j] = max;
            System.out.println("El [" + j + "] = " + numbers[j]);
        }

        //przykład 6

        System.out.println("\nNormalna tablica\n");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("El [" + i + "] = " + numbers[i]);
        }

        System.out.println("\nOdwróconia tablica\n");
        int numA;
        int numB;
        for(int i = 0; i < numbers.length/2;i++){
            numA = numbers[i]; // 0
            numB = numbers[numbers.length - 1 - i];/// 9 - 1 - 0 = 8
            numbers[i] = numB;
            numbers[numbers.length - 1 - i] = numA;
        }
        for(int i = 0; i < numbers.length; i++){
            System.out.println("El [" + i + "] = " + numbers[i]);
        }
        // Przykład 7

        Random random = new Random();
        double[] A = {23.45, -2.22, 45.90, 67.45, -56, 234.11,-34.8, 90.4, -77};
       for (int i = 0; i < 3; i++ ) {
           int los = random.nextInt(9);
           int los2 = random.nextInt(9);
           if (A[los] > A[los2]) {
               System.out.println("\nLiczba " + A[los] + " jest większa od liczby " + A[los2]);
           }
           if (A[los] < A[los2]) {
               System.out.println("\nLiczba " + A[los] + " jest mniejsza od liczby " + A[los2]);
           }
           if (A[los] == A[los2]) {
               System.out.println("\nLiczba " + A[los] + " jest równa liczbie " + A[los2]);
           }
       }
       //Przykład 8

        Scanner scanner = new Scanner(System.in);
        String[] person = new String[4];// 0 - 3

        System.out.println("Podaj Imię:");
        person[0] = scanner.next();
        System.out.println("Wybierz Rasę:");
        person[1] = scanner.next();
        System.out.println("Wybierz Klasę:");
        person[2] = scanner.next();
        System.out.println("Wybierz broń:");
        person[3] = scanner.next();
     for (int i =0; i< person.length; i++){
         System.out.println(person[i]);

     }
    }
}

