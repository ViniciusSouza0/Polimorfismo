package com.mycompany.poliformfismo;

 class Mamifero extends Animal {
    protected String corPelo;

    public Mamifero(String nome, int idade, String sexo, String locomocao, double peso, int numMembros, String corPelo, String alimentacao) {
        super(nome, idade, sexo, locomocao, peso, numMembros, alimentacao);
        this.corPelo = corPelo;
    }

    public void emitirSom() {
        System.out.println("Mamífero emitindo som...");
    }
}