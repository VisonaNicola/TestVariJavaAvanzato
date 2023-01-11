import java.util.Random;

public class Dado extends Lancio{
    @Override
    public void lancio() {
        Random r = new Random();
        risultato = r.nextInt(6)+1;
    }

    @Override
    public void stampa() {
        System.out.println(risultato);
    }
}
