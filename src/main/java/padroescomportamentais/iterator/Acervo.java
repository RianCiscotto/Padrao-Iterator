package padroescomportamentais.iterator;

import java.util.Iterator;

public class Acervo {

    public static Integer contarLivrosDisponiveisBiblioteca(Biblioteca biblioteca) {
        int quantidade = 0;
        for (Livro livro : biblioteca) {
            if (livro.isDisponivel()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalLivrosBiblioteca(Biblioteca biblioteca) {
        int quantidade = 0;
        for (Iterator l = biblioteca.iterator(); l.hasNext(); ) {
            quantidade++;
            l.next();
        }
        return quantidade;
    }

}
