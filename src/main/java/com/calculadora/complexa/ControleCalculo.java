package com.calculadora.complexa;
import java.util.ArrayList;
import java.util.Scanner;

public class ControleCalculo {

    Scanner input = new Scanner (System.in);
    Multiplicacao multiplicacao;
    Divisao divisao;
    Soma soma;
    Subtracao subtracao;

    private double num;
    private String entrada;
    private double resultado;
    private ArrayList<Double> lista = new ArrayList <>();
    private boolean condicao = false; 

    double calcularMultiplicacao (double resultado){
            
            while (condicao == false) {

                System.out.println("Digite um número para multiplicar. Digite '=' para resultado:");
                entrada = input.nextLine();

                if (entrada.equalsIgnoreCase("=")) { // não precisa separar o finalizar do resultado, faça tudo de uma vez!

                    this.multiplicacao = new Multiplicacao (this); // precisa instanciar senão dá erro de NULL POINT
                    multiplicacao.calcular();

                }

                else {

                    num = Double.parseDouble(entrada);
                    lista.add(num); // adiciona a lista

                }

            }

            return resultado; // nao esquecer de retornar no fim do bloco

    }

    double calcularDivisao (double resultado) {

        while (condicao == false) {

            System.out.println("Digite um número para dividir. Digite '=' para resultado:");
            entrada = input.nextLine();

            if (entrada.equalsIgnoreCase("=")) {
                // this.divisao se refere a Divisao divisao chamado fora do método
                this.divisao = new Divisao (this);
                //(this) se refere a propria classe ControleCalculo, mas chamando a classe Divisão
                divisao.calcular();
            }

            else {

                num = Double.parseDouble(entrada);

                if (num == 0){ //prevenção de erro, precisa limpar lá na classe
                
                    System.out.println("Valor inválido! Não é possível dividir por zero.");

                }

                else { //preste atenção nos else! tem que ter!!!

                    lista.add(num); // adiciona a lista de numeros calculados

                }

            }

        }

        return resultado; // antes de criar o método na classe divisao, ele não estará retornando nada, pois o retorno ainda não existe
        //PRESTAR BASTANTE ATENÇÃO ONDE COLOCA O RETURN!!!

    }

    double calcularSoma (double resultado) {

        while (condicao == false) {

            System.out.println("Digite um número para somar. Digite '=' para resultado:");
            entrada = input.nextLine();
            
            if (entrada.equalsIgnoreCase("=")) {

                this.soma = new Soma(this);
                soma.calcular();

            }

            else {

                num = Double.parseDouble(entrada);
                lista.add(num);

            }

        }

        return resultado; //prestar atenção onde fica o return!!!

    }

    double calcularSubtracao (double resultado) {

        while (condicao == false) {

            System.out.println("Digite um número para subtrair. Digite '=' para resultado:");
            entrada = input.nextLine();

            if (entrada.equalsIgnoreCase("=")) {

                this.subtracao = new Subtracao(this);
                subtracao.calcular();

            }

            else {

                num = Double.parseDouble (entrada);
                lista.add(num);

            }

        }

        return resultado;

    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public ArrayList<Double> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Double> lista) {
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
