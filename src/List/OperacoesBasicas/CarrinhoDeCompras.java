package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item item : listaItens){
            if (item.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(item);
            }
        }
        listaItens.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double precoTotal = 0;
        for (Item item : listaItens){
            precoTotal += item.getPreco() * item.getQuantidade();
        }
        return precoTotal;
    }

    public void exibirItens(){
        System.out.println(listaItens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Teclado", 99.9, 2);
        carrinhoDeCompras.adicionarItem("mouse", 100, 1);
        carrinhoDeCompras.removerItem("mouse");
        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularValorTotal());
    }
}
