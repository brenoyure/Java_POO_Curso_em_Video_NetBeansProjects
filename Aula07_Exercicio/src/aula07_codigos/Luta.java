package aula07_codigos;

import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Métodos Públicos    
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.setAprovada(true);
            this.setDesafiante(l1);
            this.setDesafiado(l2);
            System.out.println("Luta aprovada.");

        } else if (l1 == l2) {
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
            System.out.println("Desafiante e Desafiado são o mesmo lutador, luta inválida");
        } else if (!l1.equals(l2.getCategoria())) {
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
            System.out.println("Luta inválida, Categorias de Pesos diferentes.");
        }
    }

    public void lutar() {
        if (this.getAprovada() == true) {
            System.out.println("### Desafiado ###");
            this.getDesafiado().apresentar();
            System.out.println("### Desafiante ###");
            this.getDesafiante().apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2

            switch (vencedor) {
                case 0:
                    System.out.println("Empatou !");
                    this.getDesafiante().empatarLuta();
                    this.getDesafiado().empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitória de: " + this.getDesafiante().getNome() + ".");
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;
                case 2:
                    System.out.println("Vitória de: " + this.getDesafiado().getNome() + ".");
                    this.getDesafiante().perderLuta();
                    this.getDesafiado().ganharLuta();
                    break;
            }

        } else {
            System.out.println("Luta não aprovada");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
