package progetto19;

import java.time.LocalDate;
import java.util.Date;

public class Libri extends Articoli {

    String Autore;
    String Genere;


    public Libri(long ISBN, String titolo, LocalDate annoPubblicazione, int numeroPagine, String autore, String genere) {
        super(ISBN, titolo, annoPubblicazione, numeroPagine);
        Autore = autore;
        Genere = genere;
    }

    public String getAutore() {
        return Autore;
    }

    public void setAutore(String autore) {
        Autore = autore;
    }

    public String getGenere() {
        return Genere;
    }

    public void setGenere(String genere) {
        Genere = genere;
    }

    @Override
    public String toString() {
        return super.toString() +"Libri{" +
                "Autore='" + Autore + '\'' +
                ", Genere='" + Genere + '\'' +
                '}';
    }
}
