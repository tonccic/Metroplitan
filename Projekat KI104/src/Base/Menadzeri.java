package Base;


public class Menadzeri extends Zaposleni  {

    private HijerarhijaMenadzera pozicija;
    public Menadzeri(String ime, String prezime, String jmbg, int godineStaza, int plata, HijerarhijaMenadzera pozicija){
        super(ime, prezime, jmbg, godineStaza, plata);
        this.pozicija = pozicija;
    }

    public HijerarhijaMenadzera getPozicija() {
        return pozicija;
    }

    public void setPozicija(HijerarhijaMenadzera pozicija) {
        this.pozicija = pozicija;
    }

}
