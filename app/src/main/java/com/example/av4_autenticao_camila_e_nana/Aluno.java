package com.example.av4_autenticao_camila_e_nana;

public class Aluno {

    private String nome;
    private double nota1;
    private double nota2;
    public Aluno(String n, double n1, double n2) {
        nome = n; nota1 = n1; nota2 = n2;
    }
    public Aluno() {}
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

}
