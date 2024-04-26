package com.mycompany.poliformfismo;

class Ave extends Animal {
    protected String corPenas;

    public Ave(String nome, int idade, String sexo, String locomocao, double peso, int numMembros, String corPenas, String alimentacao) {
        super(nome, idade, sexo, locomocao, peso, numMembros, alimentacao);
        this.corPenas = corPenas;
    }

    public void emitirSom() {
        System.out.println("Ave emitindo som...");
    }
}