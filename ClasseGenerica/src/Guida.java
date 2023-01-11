public class Guida<T extends Veicolo> {
    T veicolo;
    public Guida(T veicolo) {
        this.veicolo = veicolo;
    }

    public void avviaVeicolo(){
        System.out.println("L'autista ha avviato il veicolo "+ veicolo.marca + " " + veicolo.modello);
    }
    public void accelera(){
        System.out.println("L'autista ha accelerato fino a "+ veicolo.velmax);
    }
}
