package progetto19;

import java.time.LocalDate;

public class Riviste extends Articoli {

   Enum Periodicita;

    public Riviste(long ISBN, String titolo, LocalDate annoPubblicazione, int numeroPagine, Enum Periodicita) {
        super(ISBN, titolo, annoPubblicazione, numeroPagine);
        this.Periodicita=Periodicita;
       ;
    }}

