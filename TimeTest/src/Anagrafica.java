import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Anagrafica {
    String nome,cognome, citta;
    LocalDate nascita;

    public Anagrafica(String nome, String cognome, String citta, String nascita){
        this.nome= nome;
        this.cognome = cognome;
        this.citta = citta;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //String data = "03/06/2021";
        this.nascita = LocalDate.parse(nascita, formatter);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        return nome + " " + cognome + " " + citta + " " + nascita.format(formatter);
    }
}
