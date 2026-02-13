package com.calculadora.complexa;
import java.util.ArrayList;
import java.util.Scanner;

public class ControleCalculo {

    Scanner input = new Scanner (System.in);
    Multiplicacao multiplicacao;

    private float num;
    private float resultado;
    private ArrayList<Float> lista = new ArrayList <>();
    boolean condicao = false; 

    float calcularMultiplicacao (float resultado){
            
            while (condicao == false) {

                System.out.println("Digite um número para multiplicar. Digite 1 para finalizar:");
                num = input.nextFloat();

                lista.add(num); // adiciona a lista

                if (num == 1) { // se pedir o resultado apertando 1
                    
                    this.multiplicacao = new Multiplicacao (this); // precisa instanciar senão dá erro de NULL POINT
                    multiplicacao.calcular();

                }

            }

            return resultado; // nao esquecer de retornar no fim do bloco

    }

    public float getNum() {
        return num;
    }

    public void setNum(float num) {
        this.num = num;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public ArrayList<Float> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Float> lista) {
        this.lista = lista;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public boolean isCondicao() {
        return condicao;
    }

    public void setCondicao(boolean condicao) {
        this.condicao = condicao;
    }
    
}
