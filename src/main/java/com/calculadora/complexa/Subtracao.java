package com.calculadora.complexa;
import java.util.List;

public class Subtracao implements Operacoes {

    private ControleCalculo controleCalculo;

    public Subtracao(ControleCalculo controleCalculo) {
        this.controleCalculo = controleCalculo;
    }

    @Override
    public double calcular() {
        
        List<Double> lista = controleCalculo.getLista(); //a getList() retorna todos os indices da lista. 

        if (controleCalculo.getLista().size() > 0) { //Sempre verifique o tamanho da lista antes de pedir o get(0). Se a lista estiver vazia e você
        //tentar acessar a posição 0, o Java vai lançar um erro chamado IndexOutOfBoundsException.
        
            double res = lista.get(0);
 
                for (int i = 1; i < lista.size(); i++){ //inicia do 1 para nao calcular por ele mesmo

                    double n = lista.get(i);

                    res -= n; //atentar na operação corretamente

                }

                System.out.println("O resultado é: " + res);
                System.out.println();
                
                controleCalculo.setCondicao(true); //finalizar o laço while
                controleCalculo.setResultado(res); // Salva no global!
                return res;

        }

        else {

            System.out.println("Erro! Sem números para calcular."); //depuração de lista vazia 
            System.out.println();

            return 0; //retorna nada

        }

    }

}
