package com.calculadora.complexa;

public class Multiplicacao implements Operacoes {

    private ControleCalculo controleCalculo;
    
    public Multiplicacao(ControleCalculo controleCalculo) {
        this.controleCalculo = controleCalculo;
    }

    @Override
    public float calcular() {
        
        controleCalculo.setResultado(1);

        for (float n : controleCalculo.getLista()){

            controleCalculo.setResultado(controleCalculo.getResultado()*n);
            // não põe o return aqui
        }

            System.out.println("O resultado é: " + controleCalculo.getResultado()); //a depuração fica aqui
            controleCalculo.setCondicao(true);

            return controleCalculo.getResultado(); //retorna o numero do resultado

    }

}
