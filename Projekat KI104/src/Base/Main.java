package Base;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Zaposleni jovan = new Programeri("Jovan", "Tončić", "1234567891111", 5, 1000, HijerarhijaProgramera.JUNIOR);
        Zaposleni petar = new Programeri("Petar", "Milic", "1233217891111", 3, 2000, HijerarhijaProgramera.INTERMEDIATE);
        Zaposleni milica = new Programeri("Milica", "Milic", "1235617891111", 7, 3000, HijerarhijaProgramera.SENIOR);

        Zaposleni ana = new Menadzeri("Ana", "Mitic", "1234567891234", 10, 5000, HijerarhijaMenadzera.PROJECTMANAGER);
        Zaposleni marija = new Menadzeri("Marija", "Petrovic", "1234123451234", 8, 5000, HijerarhijaMenadzera.HRMANAGER);

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(Firma.fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(jovan.getIme() + " " + jovan.getPrezime() + " " + jovan.getPlata());
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
