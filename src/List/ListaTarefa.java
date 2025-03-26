package List;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) throws RuntimeException{
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        if (this.tarefaList.isEmpty()){
            throw new RuntimeException("A lista esta vazia");
        }
        for (Tarefa t : this.tarefaList){
            if (t.getDescription().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int getNumeroTotalTarefas(){
        return this.tarefaList.size();
    }

    public void obterDescricoesTarefas() throws RuntimeException{
        if (this.tarefaList.isEmpty()){
            throw new RuntimeException("A lista esta vazia");
        }
        System.out.println(this.tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.obterDescricoesTarefas();
    }
}
