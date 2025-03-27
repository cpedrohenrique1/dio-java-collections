package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoa() {
        this.listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        this.listaPessoas.add(new Pessoa(idade, altura, nome));
    }

    public List<Pessoa> ordenarPorIdade() {
        if (this.listaPessoas.isEmpty()){
            throw new RuntimeException("Lista esta vazia");
        }
        List<Pessoa> listaPessoasPorIdade = new ArrayList<>(this.listaPessoas);
        Collections.sort(listaPessoasPorIdade);
        return listaPessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        if (this.listaPessoas.isEmpty()){
            throw new RuntimeException("Lista esta vazia");
        }
        List<Pessoa> listaPessoasPorAltura = new ArrayList<>(this.listaPessoas);
        listaPessoasPorAltura.sort(new ComparatorPorAltura());
        return listaPessoasPorAltura;
    }
}