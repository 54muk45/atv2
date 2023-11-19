/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package porta;

/**
 *
 * @author Natan
 */
public class Porta {
    private boolean aberta;
    private String cor;
    private double altura;
    private double comprimento;

    // Constructor
    public Porta() {
        aberta = false;
        cor = "branca";
        altura = 2.0;
        comprimento = 0.8;
    }

    public void abrir() {
        aberta = true;
        System.out.println("A porta foi aberta.");
    }

    public void fechar() {
        aberta = false;
        System.out.println("A porta foi fechada.");
    }

    public void pintar(String novaCor) {
        cor = novaCor;
        System.out.println("A porta foi pintada de " + novaCor + ".");
    }

    public boolean estaAberta() {
        return aberta;
    }

    // Main method
    public static void main(String[] args) {
        Porta minhaPorta = new Porta();

        minhaPorta.abrir();
        System.out.println("Está aberta? " + minhaPorta.estaAberta());

        minhaPorta.fechar();
        System.out.println("Está aberta? " + minhaPorta.estaAberta());

        minhaPorta.pintar("azul");
        System.out.println("Cor da porta: " + minhaPorta.cor);

        minhaPorta.altura = 2.5;
        minhaPorta.comprimento = 1.0;
        System.out.println("Dimensões da porta - Altura: " + minhaPorta.altura +
                           " Comprimento: " + minhaPorta.comprimento);
    }
}
