package com.calculadora.complexa;

public class Soma implements Operacoes {

    private ControleCalculo controleCalculo;

    public Soma(ControleCalculo controleCalculo) {
        this.controleCalculo = controleCalculo;
    }

    @Override
    public double calcular() {
        
        controleCalculo.setResultado(0); //reseta o resultado para 0 ao fim do calculo

        for (double n : controleCalculo.getLista()){ //aqui ele não precisa encontrar a primeira posição na lista, pois a ordem dos fatores não altera o resultado

            controleCalculo.setResultado(controleCalculo.getResultado() + n);

        }

        System.out.println("O resultado é: " + controleCalculo.getResultado()); //a depuração fica aqui
        controleCalculo.setCondicao(true);

        return controleCalculo.getResultado();

    }

}