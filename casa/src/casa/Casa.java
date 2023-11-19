/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casa;

/**
 *
 * @author Natan
 */
public class Casa {
    private String cor;
    private boolean porta1;
    private boolean porta2;

    public Casa(String cor) {
        this.cor = cor;
        this.porta1 = false;
        this.porta2 = false;
    }

    public void pintar(String c) {
        this.cor = c;
    }

    public void abrirPorta1() {
        this.porta1 = true;
    }

    public void fecharPorta1() {
        this.porta1 = false;
    }

    public void abrirPorta2() {
        this.porta2 = true;
    }

    public void fecharPorta2() {
        this.porta2 = false;
    }

    public int quantPortasAbertas() {
        int quantPortasAbertas = 0;
        if (porta1) {
            quantPortasAbertas++;
        }
        if (porta2) {
            quantPortasAbertas++;
        }
        return quantPortasAbertas;
    }

    public static void main(String[] args) {
        Casa minhaCasa = new Casa("Branca");

        System.out.println("Cor da casa: " + minhaCasa.cor);

        minhaCasa.pintar("Azul");
        System.out.println("Cor da casa após pintura: " + minhaCasa.cor);

        minhaCasa.abrirPorta1();
        minhaCasa.abrirPorta2();
        System.out.println("Número de portas abertas: " + minhaCasa.quantPortasAbertas());

        minhaCasa.fecharPorta1();
        System.out.println("Número de portas abertas após fechar a porta 1: " + minhaCasa.quantPortasAbertas());
    }
}