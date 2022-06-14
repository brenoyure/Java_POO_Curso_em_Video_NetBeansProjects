package codigos;

public class Main {
    
    public static void main(String[] args) {
        
        Celular cel1 = new Celular();
        
        cel1.marca = "Motorola";
        cel1.modelo = "motox4";
        cel1.ano_de_Lancamento = 2017;
        cel1.versao_Android = 9;
        cel1.numero_de_serie = "mtx4-001";
        cel1.carga = 41;
        
        Celular cel2 = new Celular();
        
        cel2.marca = "Samsung";
        cel2.modelo = "A52s 5G";
        cel2.ano_de_Lancamento = 2021;
        cel2.versao_Android = 10;
        cel2.numero_de_serie = "smsng-01";
        cel2.carga = 39;
        
        
        

        cel2.status();
        System.out.println("-------------");
        cel2.ligar();
        cel2.carregar();
        cel2.atualizar();
        System.out.println("-------------");
        cel2.status();
    }
    
    
}
