package com.mycompany.poliformfismo;

class Peixe extends Animal {
    protected String corEscamas;

    public Peixe(String nome, int idade, String sexo, String locomocao, double peso, int numMembros, String corEscamas, String alimentacao) {
        super(nome, idade, sexo, locomocao, peso, numMembros, alimentacao);
        this.corEscamas = corEscamas;
    }

    public void emitirSom() {
        System.out.println("Peixe emitindo som...");
    }
}
