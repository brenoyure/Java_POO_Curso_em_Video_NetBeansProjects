package codigos;

public class Celular {
    
    String marca;
    String modelo;
    String numero_de_serie;
    int ano_de_Lancamento;
    int versao_Android;
    int versao_Atual = 12;
    boolean ligado;
    int carga;
        
    
    void ligar (){
        if (this.ligado == true){
            System.out.println("ERRO! - Telefone ja esta ligado.");
        }else {
            this.ligado = true;
            System.out.println("1. Android is now booting....");
            System.out.println("2. Telefone iniciado e pronto para uso.");
        }
    }
    
    void carregar(){
        if (this.ligado == true && this.carga == 100){
            System.out.println("AVISO! - Smartphone ja esta carregado.");
        }else if(this.ligado == false){
            System.out.println("ERRO! - Smartphone desligado.");
        }else if (this.ligado == true && this.carga < 100){
            this.carga = 100;
            System.out.println("3. Carregando..." + "\n" + "4. Carga concluida.");
        }   
}
    
    void atualizar(){
        /*
        Para atualizar o Android, serão verificados os atributos:
    1.  Se o telefone está ligado;
    2.  Carga > 40;
    3.  Ano de lançamento >= 2018;
    4.  Se Versão Android >= Versão Atual;

    ------- Atualização -------
        Define a versão do Android para a versão atual
        
        */
                
        if (this.ligado == true && this.carga < 40){
            System.out.println("ERRO! - Apenas " + this.carga + "% de carga. Carregue o telefone para atualizar.");
        }else if (this.ligado == false){
            System.out.println("ERRO! - Telefone desligado.");
        }else if (this.ligado == true && this.ano_de_Lancamento < 2018) {
            System.out.println("ERRO! - Apenas modelos lancados a partir de 2018 serão atualizados.");
        }else if (this.ligado == true && this.versao_Android >= this.versao_Atual) {
            System.out.println("AVISO! - Celular ja esta rodando a versao " + this.versao_Atual + " do Android.");
        }else if (this.ligado == true && this.carga >= 40 && this.ano_de_Lancamento >= 2018 && this.versao_Android < this.versao_Atual){
            System.out.println("5. Smartphone sera atualizado para a versao " + this.versao_Atual + " do Android." );
            System.out.println("6. Atualizando...");
            this.versao_Android = this.versao_Atual;
            System.out.println("7. Android atualizado para a versao " + this.versao_Atual + " com sucesso.");
        }
    }
    
    void desligar (){
        if (this.ligado == true) {
            System.out.println("8. Shutting Down...");
            this.ligado = false;
        }else {
            System.out.println("ERRO! - Smartphone is already powered off.");
        }                
    }
    
    
    void status (){        
        /*
        Método para exibir o Status do Smartphone, retornará os atributos:
        - Marca: 
        - Modelo: 
        - Versão do Android:
        - Status ON/OFF:         
        - Nível de Carga:
        */        
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Versao do Android: " + this.versao_Android);
        if(this.ligado == true){
            System.out.println(this.marca + " " + this.modelo + " está ligado.");
        }else{
            System.out.println(this.marca + " " + this.modelo + " está desligado.");
        }        
        System.out.println("Carga: " + this.carga);
        
    }
    
}

