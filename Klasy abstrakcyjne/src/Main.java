public class Main {
    public static void main(String[] args) {

        System.out.println("Zad 1");
        Pies pies = new Pies();
        pies.wiek();
        pies.sprawdzCzyZyje();
        pies.sen();
        pies.Wydajedzwiek();
        System.out.println();

        System.out.println("Zad 2");
        Samochod samochod = new Samochod();
        System.out.println(samochod.awaria());
        samochod.jedz();
        samochod.SkretWLewo();
        samochod.SkretWPrawo();
        samochod.stop();

        System.out.println();
        System.out.println("Zad 3");
        Piekarnia podajrocznikwina = new Piekarnia();
        podajrocznikwina.pachnie();
        podajrocznikwina.smakuje();
        podajrocznikwina.nazwaPiekarni();
        podajrocznikwina.krojenie();
        podajrocznikwina.jesc();

        System.out.println();
        System.out.println("Zad 4");
        pies.badzMalutki();
        pies.bawSie();

        System.out.println();
        System.out.println("Zad 5");
        Kwadrat kwadrat = new Kwadrat(9);
        System.out.println("Obwód = " + kwadrat.obliczObwod()+"\n" +"Pole = " + kwadrat.obliczPole());
    }
}
