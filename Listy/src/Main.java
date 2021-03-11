import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //zadanie 1
        Scanner scan =new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        for (int i =0; i<10; i++){

            System.out.println("Podaj element który chcesz wpisać do tablicy");
            lista.add(scan.next());
        }
        for(int i = 0; i < lista.size(); i++){
            System.out.println("Lista["+i+"] = "+lista.get(i));
        }
        //Zadanie 2
        try {
            for(int j=0;j<5;j++){
                System.out.println("Podaj indeks który chcesz usunąć");
                lista.remove(scan.nextInt());
            }
        }catch (java.util.InputMismatchException InputMismatchException){
            System.out.println("Zły typ danych");

            }
        for(int i = 0; i < lista.size(); i++){
            System.out.println("Lista["+i+"] = "+lista.get(i));
        }
        //Zadnie 3

        for(int h=0;h<2;h++){
            System.out.println("Podaj idenks elemntu który chcesz podmienić");
            int x1=scan.nextInt();
            scan.nextLine();
            System.out.println("na co chesz podmienić el "+lista.get(x1));
            String y1=scan.nextLine();
            lista.set(x1,y1);
        }
        for(int i = 0; i < lista.size(); i++){
            System.out.println("Array["+i+"] = "+lista.get(i));
        }
    }

}
