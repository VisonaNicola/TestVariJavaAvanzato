import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        /*
        //test localdate
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        String newld = ld.format(formatter);
        System.out.println(newld);

        //mini test anagrafica
        Anagrafica a = new Anagrafica("Pino","Daniele","Molfetta","23/02/1953");
        System.out.println(a.toString());*/

        //crea un timer di 5 secondi usando solo la libreria time
        Instant i = Instant.now();
        i  = i.plusSeconds(5);
        Instant newi = Instant.now();
        do {
            newi = Instant.now();
        }while(i.compareTo(newi)>0);
        System.out.println("Sono passati 5 secondi");
    }
}