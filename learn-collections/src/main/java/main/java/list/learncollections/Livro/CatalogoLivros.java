package main.java.list.learncollections.Livro;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CatalogoLivros {
    private List<Livro> livrosList;

    public CatalogoLivros() { this.livrosList = new ArrayList<>(); }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {

    }
}
