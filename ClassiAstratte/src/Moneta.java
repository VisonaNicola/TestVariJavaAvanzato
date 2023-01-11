import java.util.Random;

public class Moneta extends Lancio{
    public Moneta(){}
    public enum TestaCroce{
        TESTA,
        CROCE

    };
    @Override
    public void lancio() {
        Random r = new Random();
        risultato = r.nextInt(2);
    }
    @Override
    public void stampa(){
        System.out.println(risultato==0?TestaCroce.TESTA :TestaCroce.CROCE);
    }
}
