package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        if (this.listaLivros.isEmpty()){
            throw new RuntimeException("A lista esta vazia");
        }
        List<Livro> livrosPorAutor = new ArrayList<>();
        for (Livro livro : listaLivros){
            if(livro.getAutor().equalsIgnoreCase(autor)){
                livrosPorAutor.add(livro);
            }
        }
        return livrosPorAutor;
    }

    private List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        if (this.listaLivros.isEmpty()){
            throw new RuntimeException("A lista esta vazia");
        }

        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        for (Livro livro : listaLivros){
            if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                livrosPorIntervaloAnos.add(livro);
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        if (this.listaLivros.isEmpty()){
            throw new RuntimeException("A lista esta vazia");
        }
        for (Livro livro : listaLivros){
            if (livro.getTitulo().equalsIgnoreCase(titulo)){
                return livro;
            }
        }
        return null;
    }
}
