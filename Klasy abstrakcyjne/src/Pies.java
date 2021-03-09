public class Pies extends Zwierze implements ZwierzeDomowe{

    @Override
    public int wiek() {
        return 2;
    }

    @Override
    public void sprawdzCzyZyje()
    {
        System.out.println("Żyje i ma się dobrze");

    }

    @Override
    public void Wydajedzwiek() {
        System.out.println("Wof Wof");
    }

    @Override
    public void badzMalutki() {
        System.out.println("Jest malutki");
    }

    @Override
    public void bawSie() {
        System.out.println("Bawi się");

    }
}
