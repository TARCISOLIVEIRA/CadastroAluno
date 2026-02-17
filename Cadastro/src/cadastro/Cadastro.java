
package cadastro;

import java.util.Scanner;


public class Cadastro {

    public static void main(String[] args) {
        int opc, qtdNota;
        String nome, cpf; 
        float nota = 0;
        Scanner en = new Scanner(System.in);
         
        do{
            System.out.println("----menu-----");
            System.out.println("1 - inserir");
            System.out.println("2 - listar");
            System.out.println("3 - situação");
            System.out.println("4 - sair");
            
            
            System.out.println("Digite um codigo....");
            opc = en.nextInt();
            
            switch(opc){
                case 1:
                    
                    System.out.println("nome....:");
                    nome = en.nextLine();
                    System.out.println("cpf");
                    cpf = en. nextLine();
                    
                    
                    System.out.println("digite a quantidade");
                    qtdNota = en.nextInt();
                    
                    for(int i = 0; i< qtdNota; i++){
                        System.out.println("Digite a +(i+1)+ ");
                        nota = en.nextFloat();
                    }
                    
                    break; 
                    
                case 2:
                    
                    break;
            }
                 
            
        }while(opc!=0);
        
        
    }
    
}
