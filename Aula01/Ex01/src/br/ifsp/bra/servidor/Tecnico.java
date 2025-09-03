package br.ifsp.bra.servidor;

public class Tecnico {
    private String nome;
    private String area;

    public Tecnico() {
        this.nome = "Sem nome";
        this.area = "Indefinida";
    }

    public Tecnico(String nome, String area) {
        this.nome = nome;
        this.area = area;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getArea() { return area; }
    public void setArea(String area) { this.area = area; }
}