package aula03;

public class Caneta {
    
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status (){
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
    
    public void rabiscar (){
        if (this.tampada == true) {
            System.out.println("Caneta " + this.modelo + " nao pode rabiscar, pois esta tampada");
        }else{
            System.out.println("Caneta " + this.modelo + " esta rabiscando");
        }
        
    }
    
    public void tampar (){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
}
