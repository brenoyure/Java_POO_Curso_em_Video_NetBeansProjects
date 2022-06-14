package aula04_exercicio;

public class Main {

    public static void main(String[] args) {                            
        
        ContaBanco p1 = new ContaBanco();        
        p1.setNumConta(001);
        p1.setDono("Breno");
        p1.abrirConta("CC");        
        p1.estadoAtual();

        
        ContaBanco p2 = new ContaBanco();                
        p2.setNumConta(002);
        p2.setDono("Yuri");
        p2.abrirConta("CP");
        p2.estadoAtual();
        p2.pagarMensal();
        
        
    }
   
}
