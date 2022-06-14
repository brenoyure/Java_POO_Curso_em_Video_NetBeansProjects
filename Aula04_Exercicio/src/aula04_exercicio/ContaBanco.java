package aula04_exercicio;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Método Construtor para a classe
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void estadoAtual() {
        System.out.println("------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());

        if (this.getStatus() == true) {
            System.out.println("Status: Conta Aberta.");
        } else {
            System.out.println("Status: Conta Fechada.");
        }

    }

    //Métodos
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }

    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta possui dinheiro, não é possível fechar");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta possui um débito, não é possível fecha-la");
        } else {
            this.setStatus(false);
            System.out.println("Fechamento de Conta realizado com sucesso.");
        }
    }

    public void depositar(float valor_deposito) {
        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + valor_deposito);
        } else {
            System.out.println("Impossível depositar, conta fechada.");
        }

    }

    public void sacar(float valor_saque) {

        if (this.getStatus() == true) {

            if (this.getSaldo() < valor_saque) {
                System.out.println("Saldo Insuficiente para Saque.");
            } else if (this.getSaldo() >= valor_saque) {
                this.setSaldo(this.getSaldo() - valor_saque);
                System.out.println("Saque no valor de R$" + valor_saque + " realizado com sucesso.");
            }
        } else {
            System.out.println("Conta Fechada, saque impossível.");
        }

    }

    public void pagarMensal() {

        float valorMensalidade = 0;

        if (this.getTipo() == "CC") {
            valorMensalidade = 12;
        } else if (this.getTipo() == "CP") {
            valorMensalidade = 20;
        }
        if (this.getStatus() == true) {
            if (this.getSaldo() >= valorMensalidade) {
                this.setSaldo(this.getSaldo() - valorMensalidade);
            } else {
                System.out.println("Saldo insuficiente para pagamento de mensalidade");
            }
        } else {
            System.out.println("Impossível pagar mensalidade, Conta Fechada.");
        }
    }

//Métodos Get & Set para os atributos     
    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;

    }

}
