public class Main {
    public static void main(String[] args) {
        Moneta m = new Moneta();
        Dado d = new Dado();
        m.lancio();
        d.lancio();
        m.stampa();
        d.stampa();
    }
}