package com.calculadora.complexa;
import java.util.ArrayList;
import java.util.Scanner;

public class ControleCalculo {

    Scanner input = new Scanner (System.in);
    Multiplicacao multiplicacao;
    Divisao divisao;

    private float num;
    private float resultado;
    private ArrayList<Float> lista = new ArrayList <>();
    private boolean condicao = false; 

    float calcularMultiplicacao (float resultado){
            
            while (condicao == false) {

                System.out.println("Digite um número para multiplicar. Digite 1 para finalizar:");
                num = input.nextFloat();

                lista.add(num); // adiciona a lista

                if (num == 1) { // se pedir o resultado apertando 0
                    
                    this.multiplicacao = new Multiplicacao (this); // precisa instanciar senão dá erro de NULL POINT
                    multiplicacao.calcular();

                }

            }

            return resultado; // nao esquecer de retornar no fim do bloco

    }

    float calcularDivisao (float resultado) {

        while (condicao == false) {

            System.out.println("Digite um número para dividir. Digite 1 para finalizar:");
            num = input.nextFloat();

            if (num == 0){ //prevenção de erro, precisa limpar lá na classe
                
                System.out.println("Valor inválido! Não é possível dividir por zero.");

            }

            else {

            lista.add(num); // adiciona a lista de numeros calculados

            }

            if (num == 1) {
                // this.divisao se refere a Divisao divisao chamado fora do método
                this.divisao = new Divisao (this);
                //(this) se refere a propria classe ControleCalculo, mas chamando a classe Divisão
                divisao.calcular();
            }

        }

        return resultado; // antes de criar o método na classe divisao, ele não estará retornando nada, pois o retorno ainda não existe
        //PRESTAR BASTANTE ATENÇÃO ONDE COLOCA O RETURN!!!

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
