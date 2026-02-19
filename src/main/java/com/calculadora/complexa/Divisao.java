package com.calculadora.complexa;
import java.util.List;

public class Divisao implements Operacoes {

    private ControleCalculo controleCalculo; // para acessar getters e setters. evita null point exceptions

    public Divisao(ControleCalculo controleCalculo) {
        this.controleCalculo = controleCalculo;
    }

    @Override
    public double calcular() {
        
        List<Double> lista = controleCalculo.getLista(); //cria uma variavel lista do tipo Lista para acessar a posição da lista. ele deve ficar dentro do método!!!

        double res = lista.get(0); //instancie o método, não a classe!
        // precisa pegar a posição do índice

        for (int i = 1; i < lista.size(); i++) {

            double n = lista.get(i);

            if (n == 0) {
                
                System.out.println("Erro: Divisão por zero!");
                // tratar o erro após a prevenção
                lista.clear(); //limpa a lista suja
                controleCalculo.setResultado(0);
                controleCalculo.setCondicao(true); // Para o laço do painel se necessário
                
                return 0;

            }
        
            res /= n;

        }
        
            System.out.println("O resultado é: " + res);
            controleCalculo.setCondicao(true); //finalizar o laço while

            return res;

    }

}
