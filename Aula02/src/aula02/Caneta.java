package aula02;

public class Caneta {
    
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status (){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        
        if (tampada == true) {
            System.out.println("A caneta esta tampada");
        }else{
            System.out.println("A caneta esta destampada");
        }
        
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga: " + this.carga);
        
    }
    
    void rabiscar (){
        if (this.tampada == true) {
            System.out.println("Caneta " + this.modelo + " nao pode rabiscar, pois esta tampada");
        }else{
            System.out.println("Caneta " + this.modelo + " esta rabiscando");
        }
        
    }
    void tampar (){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
