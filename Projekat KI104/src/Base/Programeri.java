package Base;


public class Programeri extends Zaposleni {

    private HijerarhijaProgramera pozicija;
    public Programeri(String ime, String prezime, String jmbg, int godineStaza, int plata, HijerarhijaProgramera pozicija){
        super(ime, prezime, jmbg, godineStaza, plata);
        this.pozicija = pozicija;
    }

    public void setPozicija(HijerarhijaProgramera pozicija) {
        this.pozicija = pozicija;
    }

    public HijerarhijaProgramera getPozicija() {
        return pozicija;
    }
}

