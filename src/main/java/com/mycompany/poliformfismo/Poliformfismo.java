package com.mycompany.poliformfismo;
import java.util.Scanner;
public class Poliformfismo {
public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
   
    System.out.println("Informe os dados da Ave:");
    System.out.print("Nome: ");
    String nomeAve = scanner.nextLine();
    System.out.print("Idade: ");
    int idadeAve = scanner.nextInt();
    System.out.print("Sexo: ");
    String sexoAve = scanner.next();
    System.out.print("Locomoção: ");
    String locomocaoAve = scanner.next();
    System.out.print("Peso: ");
    double pesoAve = scanner.nextDouble();
    System.out.print("Quantidade de membros: ");
    int membrosAve = scanner.nextInt();
    System.out.print("Cor das penas: ");
    String corPenasAve = scanner.next();
    System.out.print("Alimentação: ");
    String alimentacaoAve = scanner.next();

    Animal ave = new Ave(nomeAve, idadeAve, sexoAve, locomocaoAve, pesoAve, membrosAve, corPenasAve, alimentacaoAve);

    System.out.println("Informe os dados do Mamífero:");
    scanner.nextLine(); // Limpa o buffer
    System.out.print("Nome: ");
    String nomeMamifero = scanner.nextLine();
    System.out.print("Idade: ");
    int idadeMamifero = scanner.nextInt();
    System.out.print("Sexo: ");
    String sexoMamifero = scanner.next();
    System.out.print("Locomoção: ");
    String locomocaoMamifero = scanner.next();
    System.out.print("Peso: ");
    double pesoMamifero = scanner.nextDouble();
    System.out.print("Quantidade de membros: ");
    int membrosMamifero = scanner.nextInt();
    System.out.print("Cor do pelo: ");
    String corPeloMamifero = scanner.next();
    System.out.print("Alimentação: ");
    String alimentacaoMamifero = scanner.next();

    Animal mamifero = new Mamifero(nomeMamifero, idadeMamifero, sexoMamifero, locomocaoMamifero, pesoMamifero, membrosMamifero, corPeloMamifero, alimentacaoMamifero);

    System.out.println("Informe os dados do Réptil:");
    scanner.nextLine(); // Limpa o buffer
    System.out.print("Nome: ");
    String nomeReptil = scanner.nextLine();
    System.out.print("Idade: ");
    int idadeReptil = scanner.nextInt();
    System.out.print("Sexo: ");
    String sexoReptil = scanner.next();
    System.out.print("Locomoção: ");
    String locomocaoReptil = scanner.next();
    System.out.print("Peso: ");
    double pesoReptil = scanner.nextDouble();
    System.out.print("Quantidade de membros: ");
    int membrosReptil = scanner.nextInt();
    System.out.print("Cor da pele: ");
    String corPeleReptil = scanner.next();
    System.out.print("Alimentação: ");
    String alimentacaoReptil = scanner.next();

    Animal reptil = new Reptil(nomeReptil, idadeReptil, sexoReptil, locomocaoReptil, pesoReptil, membrosReptil, corPeleReptil, alimentacaoReptil);

    System.out.println("Informe os dados do Peixe:");
    scanner.nextLine(); // Limpa o buffer
    System.out.print("Nome: ");
    String nomePeixe = scanner.nextLine();
    System.out.print("Idade: ");
    int idadePeixe = scanner.nextInt();
    System.out.print("Sexo: ");
    String sexoPeixe = scanner.next();
    System.out.print("Locomoção: ");
    String locomocaoPeixe = scanner.next();
    System.out.print("Peso: ");
    double pesoPeixe = scanner.nextDouble();
    System.out.print("Quantidade de membros: ");
    int membrosPeixe = scanner.nextInt();
    System.out.print("Cor das escamas: ");
    String corEscamasPeixe = scanner.next();
    System.out.print("Alimentação: ");
    String alimentacaoPeixe = scanner.next();

    Animal peixe = new Peixe(nomePeixe, idadePeixe, sexoPeixe, locomocaoPeixe, pesoPeixe, membrosPeixe, corEscamasPeixe, alimentacaoPeixe);

    System.out.println("Informe os dados do Leão:");
    scanner.nextLine();
    System.out.print("Nome: ");
    String nomeLeao = scanner.nextLine();
    System.out.print("Idade: ");
    int idadeLeao = scanner.nextInt();
    System.out.print("Sexo: ");
    String sexoLeao = scanner.next();
    System.out.print("Locomoção: ");
    String locomocaoLeao = scanner.next();
    System.out.print("Peso: ");
    double pesoLeao = scanner.nextDouble();
    System.out.print("Quantidade de membros: ");
    int membrosLeao = scanner.nextInt();
    System.out.print("Cor do pelo: ");
    String corPeloLeao = scanner.next();
    System.out.print("Alimentação: ");
    String alimentacaoLeao = scanner.next();

    Animal leao = new Leao(nomeLeao, idadeLeao, sexoLeao, locomocaoLeao, pesoLeao, membrosLeao, corPeloLeao, alimentacaoLeao);
    
    exibirInfoAnimal(ave);
    exibirInfoAnimal(mamifero);
    exibirInfoAnimal(reptil);
    exibirInfoAnimal(peixe);
    exibirInfoAnimal(leao);
    scanner.close();

    
}

    public static void exibirInfoAnimal(Animal animal) {
    System.out.println("\n" + animal.getClass().getSimpleName() + ":");
    System.out.println("Nome: " + animal.nome);
    System.out.println("Idade: " + animal.idade);
    System.out.println("Sexo: " + animal.sexo);
    System.out.println("Locomoção: " + animal.locomocao);
    System.out.println("Peso: " + animal.peso);
    System.out.println("Quantidade de membros: " + animal.numMembros);
    if (animal instanceof Mamifero) {
        Mamifero mamifero = (Mamifero) animal;
        System.out.println("Cor do pelo: " + mamifero.corPelo);
    }
    System.out.println("Alimentação: " + animal.alimentacao);
        
        
        if (animal instanceof Ave) {
            System.out.println("Cor das penas: " + ((Ave) animal).corPenas);
        } else if (animal instanceof Mamifero) {
            System.out.println("Cor do pelo: " + ((Mamifero) animal).corPelo);
        } else if (animal instanceof Reptil) {
            System.out.println("Cor da pele: " + ((Reptil) animal).corPele);
        } else if (animal instanceof Peixe) {
            System.out.println("Cor das escamas: " + ((Peixe) animal).corEscamas);
        }
        System.out.println("Alimentação: " + animal.alimentacao);
    }
}
  


