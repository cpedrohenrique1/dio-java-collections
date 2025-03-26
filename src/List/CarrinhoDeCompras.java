package List;

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
        for (Item item : listaItens){
            if (item.getNome().equalsIgnoreCase(nome)){
                listaItens.remove(item);
            }
        }
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
        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularValorTotal());
    }
}
