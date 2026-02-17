package cadastro;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    List<Aluno> listaDealuno;
    
    
    public Sala(){
        this.listaDealuno = new ArrayList();
    }

    public List<Aluno> getListaDealuno() {
        return listaDealuno;
    }

    public void setListaDealuno(List<Aluno> listaDealuno) {
        this.listaDealuno = listaDealuno;
    }

    void adicionarAluno(Aluno novoAluno){
        novoAluno.calcularNota();
        listaDealuno.add(novoAluno);
    }
    
    void listarSituacoes(){
        System.out.println("\nSituqações");
        
        for(Aluno alunoNotas : listaDealuno){
            alunoNotas.imprimirAluno();
        }
    }
}
