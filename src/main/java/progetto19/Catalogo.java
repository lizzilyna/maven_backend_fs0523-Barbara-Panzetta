package progetto19;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Catalogo {
    private List<Articoli> archivio =new ArrayList<>();

    public Catalogo(List<Articoli> archivio) {
        this.archivio = archivio;
    }

    public Catalogo() {

    }

    public List<Articoli> getArchivio() {
        return archivio;
    }

    public void setArchivio(List<Articoli> archivio) {
        this.archivio = archivio;
    }

    public void aggiungiElemento (Articoli elemento) {
        archivio.add(elemento);
    }

    public void rimuoviElementoPerISBN(long isbn) {
        archivio.removeIf(e -> e.getISBN() == isbn);
    }

    public String toString() {
        StringBuilder result = new StringBuilder("Catalogo{\n");
        for (Articoli articolo : archivio) {
            result.append(" - ").append(articolo.toString()).append("\n");
        }
        result.append("}");
        return result.toString();
    }
    }

