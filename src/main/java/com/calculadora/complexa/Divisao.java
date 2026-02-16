package com.calculadora.complexa;
import java.util.List;

public class Divisao implements Operacoes {

    private ControleCalculo controleCalculo; // para acessar getters e setters

    public Divisao(ControleCalculo controleCalculo) {
        this.controleCalculo = controleCalculo;
    }

    @Override
    public float calcular() {
        
        List<Float> lista = controleCalculo.getLista(); //cria uma variavel lista do tipo Lista para acessar a posição da lista. ele deve ficar dentro do método!!!

        float res = lista.get(0); //instancie o método, não a classe!
        // precisa pegar a posição do índice

        for (int i = 1; i < lista.size(); i++) {

            float n = lista.get(i);

            if (n == 0) {
                
                System.out.println("Erro: Divisão por zero!");
                // Trate o erro conforme sua lógica (ex: setar erro no controle)
                return 0;

            }
        
        res /= n;

        }
            System.out.println("O resultado é: " + res);
            controleCalculo.setCondicao(true); //finalizar o laço while

            return res;

    }

}
