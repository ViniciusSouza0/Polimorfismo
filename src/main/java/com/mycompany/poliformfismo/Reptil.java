package com.mycompany.poliformfismo;

class Reptil extends Animal {
    protected String corPele;

    public Reptil(String nome, int idade, String sexo, String locomocao, double peso, int numMembros, String corPele, String alimentacao) {
        super(nome, idade, sexo, locomocao, peso, numMembros, alimentacao);
        this.corPele = corPele;
    }
}

   