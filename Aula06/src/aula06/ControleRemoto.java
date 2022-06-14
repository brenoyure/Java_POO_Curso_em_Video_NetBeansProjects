package aula06;

public class ControleRemoto implements Controlador {

//	---- Atributos da Classe -----
    private int volume;
    private boolean ligado;
    private boolean mudo;
    private boolean tocando;

//	---- Método Construtor -----
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

//	---- Métodos Getters & Setters -----
    private void setVolume(int v) {
        this.volume = v;
    }

    private int getVolume() {
        return this.volume;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }

    private boolean getLigado() {
        return this.ligado;
    }

    private void setMudo(boolean m) {
        this.mudo = m;
    }

    private boolean getMudo() {
        return this.mudo;
    }

    private void setTocando(boolean t) {
        this.tocando = t;
    }

    private boolean getTocando() {
        return this.tocando;
    }

//	---- Métodos Abstratos -----		
    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("Android TV iniciando...");
        System.out.println("TV ligada");
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("Desligando..." + "\n" + "off.");
    }

    @Override
    public void abrirMenu() {

        if (this.getLigado() == true) {
            System.out.println("--- MENU ---");
            System.out.println("Está ligado? " + this.getLigado());
            System.out.println("Está tocando? " + this.getTocando());
            System.out.print("Volume: " + this.getVolume() + " ");
            for (int i = 0; i < this.getVolume(); i += 10) {
                System.out.print("o");
            }

        } else {
            System.out.println("TV Desligada, impossível abrir menu.");
        }
    }

    @Override
    public void fecharMenu() {

        if (this.getLigado() == true) {
            System.out.println("Fechando Menu...");
        } else {
            System.out.println("TV Desligada, impossível fechar menu.");
        }

    }

    @Override
    public void aumentarVolume() {
        if (this.getLigado() == true) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("TV Desligada, impossível aumentar volume");
        }

    }

    @Override
    public void diminuirVolume() {
        if (this.getLigado() == true) {
            if (this.getVolume() == 0) {
                System.out.println("TV já está sem som.");
            } else {
                this.setVolume(this.getVolume() - 5);
            }
        } else {
            System.out.println("TV Desligada, impossível diminuir volume.");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() == true) {
            if (this.getVolume() == 0) {
                System.out.println("Mudo já está ligado");
            } else if (this.getVolume() > 0) {

            }
        } else {
            System.out.println("TV Desligada, impossível ativar mudo.");
        }

    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() == true) {
            if (this.getVolume() == 0) {
                this.setVolume(50);
            }
        } else {
            System.out.println("TV Desligada, impossível desativar mudo.");
        }

    }

    @Override
    public void play() {
        if (this.getLigado() == true) {
            if (this.getTocando() == true) {
                this.setTocando(false);
                System.out.println("Botão Play pressionado com a mídia já tocando...");
                System.out.println("Mídia Pausada.");
            } else {
                this.setTocando(true);
                System.out.println("Botão Play pressionado, tocando mídia.");
            }

        } else {
            System.out.println("TV Desligada, impossível dar play.");
        }

    }

    @Override
    public void pause() {
        if (this.getLigado() == true) {
            if (this.getTocando() == true) {
                this.setTocando(false);
                System.out.println("Botão Pause pressionado...");
                System.out.println("Mídia Pausada.");
            } else {
                this.setTocando(true);
                System.out.println("Mídia já pausada, retomando reprodução...");
            }
        } else {
            System.out.println("TV Desligada, impossível dar pause.");
        }

    }
}
