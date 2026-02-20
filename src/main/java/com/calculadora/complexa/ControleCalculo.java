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
    
    void prepararCalculo () { // para calcular acumulo de numeros em diferentes operações
 
        // 1. Pegamos o último resultado calculado
        double resultadoAnterior = this.resultado;
        // 2. Limpamos a lista de números antigos
        this.lista.clear();
        // 3. Se já existia um resultado, ele vira o ponto de partida da nova conta
        if (resultadoAnterior != 0){
            this.lista.add(resultadoAnterior);

        }
        //System.out.println("DEBUG: Lista atual: " + lista);
        // 4. Resetamos a condição para permitir novas entradas
        this.condicao = false;

    }

    void clear () { // limpar calculo

        this.lista.clear(); // limpa os números anteriores 
        resultado = 0; // reseta o resultado para zero
        
    }

    double calcularMultiplicacao (double resultado){

        this.condicao = false; // limpa a condição de encerramento antes de iniciar          
        prepararCalculo();

            while (condicao == false) {

                System.out.println("Digite um número para multiplicar. Digite '=' para resultado:");
                entrada = input.nextLine();

                if (entrada.equalsIgnoreCase("=")) { // não precisa separar o finalizar do resultado, faça tudo de uma vez!

                    this.multiplicacao = new Multiplicacao (this); // precisa instanciar senão dá erro de NULL POINT
                    multiplicacao.calcular();

                    break;

                }

                else {

                    num = Double.parseDouble(entrada);
                    lista.add(num); // adiciona a lista

                }

            }

        return this.getResultado(); // nao esquecer de retornar no fim do bloco

    }

    double calcularDivisao (double resultado) {

        this.condicao = false; // limpa a condição de encerramento antes de iniciar
        prepararCalculo();

        while (condicao == false) {

            System.out.println("Digite um número para dividir. Digite '=' para resultado:");
            entrada = input.nextLine();

            if (entrada.equalsIgnoreCase("=")) {
                // this.divisao se refere a Divisao divisao chamado fora do método
                this.divisao = new Divisao (this);
                //(this) se refere a propria classe ControleCalculo, mas chamando a classe Divisão
                divisao.calcular();

                break;

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

        return this.getResultado(); // antes de criar o método na classe divisao, ele não estará retornando nada, pois o retorno ainda não existe
        //PRESTAR BASTANTE ATENÇÃO ONDE COLOCA O RETURN!!!

    }

    double calcularSoma (double resultado) {

        this.condicao = false; // limpa a condição de encerramento antes de iniciar
        prepararCalculo();

        while (condicao == false) {

            System.out.println("Digite um número para somar. Digite '=' para resultado:");
            entrada = input.nextLine();
            
            if (entrada.equalsIgnoreCase("=")) {

                this.soma = new Soma(this);
                soma.calcular();

                break;

            }

            else {

                num = Double.parseDouble(entrada);
                lista.add(num);

            }       
    
        }

        return this.getResultado(); //prestar atenção onde fica o return!!!

    }

    double calcularSubtracao (double resultado) {

        this.condicao = false; // limpa a condição de encerramento antes de iniciar
        prepararCalculo();

        while (condicao == false) {

            System.out.println("Digite um número para subtrair. Digite '=' para resultado:");
            entrada = input.nextLine();

            if (entrada.equalsIgnoreCase("=")) {

                this.subtracao = new Subtracao(this);
                subtracao.calcular();

                break;

            }

            else {

                num = Double.parseDouble (entrada);
                lista.add(num);

            }

        }

        return this.getResultado(); // Pegamos o valor que a classe Subtracao gravou no controle

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
