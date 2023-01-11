public class Main {
    public static void main(String[] args) {
        Guida<Auto> g = new Guida<>(new Auto("Toyota", "Prius",180));
        g.avviaVeicolo();
        g.accelera();
    }
}