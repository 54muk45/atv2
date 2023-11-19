/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pessoa;

/**
 *
 * @author Natan
 */
public class Pessoa {
    // Atributos da classe
    private String nome;
    private int idade;

    // Construtor da classe
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para realizar aniversário
    public void fazAniversario() {
        idade++;
    }

    // Métodos para obter nome e idade
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public static void main(String[] args) {
        // Criando uma pessoa
        Pessoa pessoa = new Pessoa("Exemplo", 25);

        // Imprimindo informações iniciais
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        // Fazendo alguns aniversários
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();

        // Imprimindo informações após alguns aniversários
        System.out.println("\nDepois de alguns aniversários:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }   
}