

package progetto19;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        Catalogo catalogo=new Catalogo();

       catalogo.aggiungiElemento(new Libri(243355454, "Le correzioni", LocalDate.of(1990, 01, 01), 416, "Jonathan Franzen", "Romanzo"));


        catalogo.aggiungiElemento(new Riviste(58679566,"Cosmopolitan", LocalDate.of(2020, 01, 01), 85, Periodicita.MENSILE));

        catalogo.aggiungiElemento(new Libri(123456789, "L'amica geniale", LocalDate.of(2010, 7, 29), 550, "Elena Ferrante", "Romanzo"));

        catalogo.aggiungiElemento(new Riviste(987654321, "Cose spiegate bene", LocalDate.of(2023, 12, 22), 150, Periodicita.SEMESTRALE));


        catalogo.rimuoviElementoPerISBN(58679566);

        catalogo.ricercaPerISBN(123456789);


        System.out.println(catalogo);

}

}