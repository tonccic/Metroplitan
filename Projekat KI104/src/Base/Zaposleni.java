package Base;

public class Zaposleni {
    private String ime;

    private String prezime;

    private String jmbg;
    //  if ( jmbg.length() != 13 || !jmbg.chars().allMatch(Character::isDigit))

    private int godineStaza;
    //  if (godineStaza < 0){

    private int plata;
    // if (plata <= 0){


    public Zaposleni(String ime, String prezime, String jmbg, int godineStaza, int plata){
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.godineStaza = godineStaza;
        this.plata = plata;
    }

    public String getIme(){
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) throws JmbgException {
        if ( jmbg.length() != 13 || !jmbg.chars().allMatch(Character::isDigit)){
            throw new JmbgException("JMBG nije Validan");
        }else {
            this.jmbg = jmbg;
        }
    }

    public int getGodineStaza() {
        return godineStaza;
    }

    public void setGodineStaza(int godineStaza) throws GodStazaException{
        if (godineStaza < 0){
            throw new GodStazaException("Godine Staza Nisu Validne");
        } else{
            this.godineStaza = godineStaza;
        }
    }

    public int getPlata() {
        return plata;
    }

    public void setPlata(int plata) throws PlataException{
        if (plata <= 0){
            throw new PlataException("Plata Nije Validna");
        } else {
        this.plata = plata;
        }
    }


    @Override
    public String toString() {
        return "Zaposleni{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", jmbg='" + jmbg + '\'' +
                ", godineStaza=" + godineStaza +
                ", plata=" + plata +
                '}';
    }
}


