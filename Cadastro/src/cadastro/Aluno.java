package cadastro;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    String nome, cpf, situacao = "reprovado";
    float total = 0;
    
    List<Float> notaDeAluno = new ArrayList();
    
    
    public Aluno(){
        
    }

    public List<Float> getNotaDeAluno() {
        return notaDeAluno;
    }

    public void setNotaDeAluno(List<Float> notaDeAluno) {
        this.notaDeAluno = notaDeAluno;
    }
    
    
    
    
    public Aluno(String nome, String cpf){
        setNome(nome);
        setCpf(cpf);
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    
    void adicionarNota(Float nota){
        notaDeAluno.add(nota);
    }
    
    void imprimirAluno(){
        System.out.println("----imprimir------");
        System.out.println("\nNome" + this.nome);
        System.out.println("\nCpf" + this.cpf);
        
        for(int i = 0; i < notaDeAluno.size(); i++){
            System.out.println("nota"+(i+1)+ this.notaDeAluno.get(i));
        }
    }

void situacao(){
    System.out.println("\nNome" + this.nome);
    System.out.println("\nTotal" + this.total);
    System.out.println("\nSituacao" + this.situacao);
}

void calcularNota(){
    for(float n: notaDeAluno){
        total += n;
    }  if( total >= 70){
        this.situacao = "aprovado";
    } else {
        this.situacao = "reprovado";
    }
}
    
}
