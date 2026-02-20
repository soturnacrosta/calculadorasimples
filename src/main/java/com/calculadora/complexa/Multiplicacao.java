package com.calculadora.complexa;

public class Multiplicacao implements Operacoes {

    private ControleCalculo controleCalculo;
    
    public Multiplicacao(ControleCalculo controleCalculo) {
        this.controleCalculo = controleCalculo;
    }

    @Override
    public double calcular() {
        
        double multiplicacaoLocal = 1;

        if (controleCalculo.getLista().size() > 0) {

            for (double n : controleCalculo.getLista()){

                        multiplicacaoLocal *= n;
                        // não põe o return aqui
                    }

                        controleCalculo.setResultado(multiplicacaoLocal);

                        System.out.println("O resultado é: " + controleCalculo.getResultado()); //a depuração fica aqui
                        System.out.println("");

                        controleCalculo.setCondicao(true);

             }

        else {

            System.out.println("Erro! Sem números para calcular.");
            System.out.println();

        }

        return multiplicacaoLocal; //retorna o numero do resultado

    }

}
