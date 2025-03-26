package List;

public class Tarefa {
    private String description;

    public Tarefa(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

    @Override
    public String toString(){
        return this.getDescription();
    }
}
