package aula07_codigos;

public class Lutador implements Lutador_Interface {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Método Construtor
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private float getAltura() {
        return altura;
    }

    private void setAltura(float altura) {
        this.altura = altura;
    }

    protected float getPeso() {
        return peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    protected String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso >= 56.7f && this.peso < 61.2f) {
            this.categoria = "Peso Mosca";
        } else if (this.getPeso() >= 61.2f && this.getPeso() < 65.8f) {
            this.categoria = "Peso Galo";
        } else if (this.getPeso() >= 65.8 && this.getPeso() < 70.3f) {
            this.categoria = "Peso Leve";
        } else if (this.getPeso() >= 70.3 && this.getPeso() < 77.1f) {
            this.categoria = "Peso Meio-Medio";
        } else if (this.getPeso() >= 77.1 && this.getPeso() < 83.9f) {
            this.categoria = "Peso Medio";
        } else if (this.getPeso() >= 83.9f && this.getPeso() < 92.9f) {
            this.categoria = "Peso Meio-Pesado";
        } else if (this.getPeso() >= 92.9 && this.getPeso() <= 120.2) {
            this.categoria = "Peso Pesado";
        } else {
            this.categoria = "Invalida";
        }

    }

    private int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    private int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    private int getEmpates() {
        return empates;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }

    @Override
    public void apresentar() {
        System.out.println("---Apresentação---");
        System.out.println("Nome: " + this.getNome() + ".");
        System.out.println("Nacionalidade: " + this.getNacionalidade() + ".");
        System.out.println("Idade: " + this.getIdade() + " anos.");
        System.out.println("Altura: " + this.getAltura() + "m.");
        System.out.println("Peso: " + this.getPeso() + "KG.");
        if (this.getCategoria() == null) {
            System.out.println("Categoria: Não Definida.");
        } else {
            System.out.println("Categoria: " + this.getCategoria() + ".");
        }
        System.out.println("Vitórias: " + this.getVitorias() + ".");
        System.out.println("Derrotas: " + this.getDerrotas() + ".");
        System.out.println("Empates: " + this.getEmpates() + ".");
        System.out.println("--------");
    }

    @Override
    public void status() {
        System.out.println("---Status---");
        System.out.println("Nome: " + this.getNome() + ".");
        System.out.println("É um peso " + this.getCategoria() + ".");
        if (this.getVitorias() == 1) {
            System.out.println("Com " + this.getVitorias() + " vitória.");
        } else {
            System.out.println("Com " + this.getVitorias() + " vitórias.");
        }

        if (this.getDerrotas() == 1) {
            System.out.println("E com " + this.getDerrotas() + " derrota.");
        } else {
            System.out.println("E com " + this.getDerrotas() + " derrotas.");
        }
        if (this.getEmpates() == 1) {
            System.out.println("Total de: " + this.getEmpates() + " empate.");
        } else {
            System.out.println("Total de: " + this.getEmpates() + " empates.");
        }
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);

    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);

    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);

    }

}
