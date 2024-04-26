package com.mycompany.poliformfismo;

public abstract class Animal {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected String locomocao;
    protected double peso;
    protected int numMembros;
    protected String alimentacao;

    public Animal(String nome, int idade, String sexo, String locomocao, double peso, int numMembros, String alimentacao) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.locomocao = locomocao;
        this.peso = peso;
        this.numMembros = numMembros;
        this.alimentacao = alimentacao;
    }
    }


