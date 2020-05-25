package Base;

public class Firma {
    public static String fileName = "Zaposleni.txt";
    private String naziv;
    private int pib;

    public int getPib() {
        return pib;
    }

    public void setPib(int pib) {
        this.pib = pib;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return "Firma{" +
                "naziv='" + naziv + '\'' +
                ", pib=" + pib +
                '}';
    }
}
