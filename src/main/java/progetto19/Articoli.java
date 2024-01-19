package progetto19;

import java.time.LocalDate;


abstract class Articoli {

        private long ISBN;
        private String Titolo;
        private LocalDate AnnoPubblicazione;
        private int NumeroPagine;

    public Articoli(long ISBN, String titolo, LocalDate annoPubblicazione, int numeroPagine) {
        this.ISBN = ISBN;
        Titolo = titolo;
        AnnoPubblicazione = annoPubblicazione;
        NumeroPagine = numeroPagine;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitolo() {
        return Titolo;
    }

    public void setTitolo(String titolo) {
        Titolo = titolo;
    }

    public LocalDate getAnnoPubblicazione() {
        return AnnoPubblicazione;
    }

    public void setAnnoPubblicazione(LocalDate annoPubblicazione) {
        AnnoPubblicazione = annoPubblicazione;
    }

    public int getNumeroPagine() {
        return NumeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        NumeroPagine = numeroPagine;




    }

    @Override
    public String toString() {
        return "catalogo{" +
                "ISBN=" + ISBN +
                ", Titolo='" + Titolo + '\'' +
                ", AnnoPubblicazione=" + AnnoPubblicazione +
                ", NumeroPagine=" + NumeroPagine +
                '}'+"\n";
    }
}
