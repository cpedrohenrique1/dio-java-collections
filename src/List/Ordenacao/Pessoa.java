package List.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    private int idade;
    private double altura;
    private String nome;

    public Pessoa(int idade, double altura, String nome) {
        this.idade = idade;
        this.altura = altura;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(this.getIdade(), p.getIdade());
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "idade=" + idade +
                ", altura=" + altura +
                ", nome='" + nome + '\'' +
                '}';
    }
}

class ComparatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}