package com.calculadora.complexa;

public class Soma implements Operacoes {

    private ControleCalculo controleCalculo;

    public Soma(ControleCalculo controleCalculo) {
        this.controleCalculo = controleCalculo;
    }

    @Override
    public double calcular() {
        
        double somaLocal = 0;

        for (double n : controleCalculo.getLista()){ //aqui ele não precisa encontrar a primeira posição na lista, pois a ordem dos fatores não altera o resultado

            somaLocal += n;

        }

        controleCalculo.setResultado(somaLocal);

        System.out.println("O resultado é: " + controleCalculo.getResultado()); //a depuração fica aqui
        controleCalculo.setCondicao(true);

        return somaLocal;

    }

}