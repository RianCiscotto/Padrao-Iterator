package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcervoTest {

    @Test
    void deveContarLivrosDisponiveisBiblioteca() {
        Biblioteca biblioteca = new Biblioteca(
                new Livro("Dom Casmurro", true),
                new Livro("O Cortico", true),
                new Livro("Iracema", false),
                new Livro("Capitaes da Areia", true)
        );
        assertEquals(3, Acervo.contarLivrosDisponiveisBiblioteca(biblioteca));
    }

    @Test
    void deveContarTotalLivrosBiblioteca() {
        Biblioteca biblioteca = new Biblioteca(
                new Livro("Dom Casmurro", true),
                new Livro("O Cortico", true),
                new Livro("Iracema", false),
                new Livro("Capitaes da Areia", true)
        );
        assertEquals(4, Acervo.contarTotalLivrosBiblioteca(biblioteca));
    }

}