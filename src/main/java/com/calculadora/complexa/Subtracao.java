package com.calculadora.complexa;
import java.util.List;

public class Subtracao implements Operacoes {

    private ControleCalculo controleCalculo;

    public Subtracao(ControleCalculo controleCalculo) {
        this.controleCalculo = controleCalculo;
    }

    @Override
    public float calcular() {
        
        List<Float> lista = controleCalculo.getLista(); //a getList() retorna todos os indices da lista. 
        
        if (controleCalculo.getLista().size() > 0) { //Sempre verifique o tamanho da lista antes de pedir o get(0). Se a lista estiver vazia e você
        //tentar acessar a posição 0, o Java vai lançar um erro chamado IndexOutOfBoundsException.

            float res = lista.get(0);

                for (int i = 1; i < lista.size(); i++){

                    float n = lista.get(i);

                    res -= n; //atentar na operação corretamente

                }

                System.out.println("O resultado é: " + res);
                controleCalculo.setCondicao(true); //finalizar o laço while
                return res;

        }

        else {

            System.out.println("Lista vazia!"); //depuração de lista vazia 

            return 0; //retorna nada

        }

    }

}
