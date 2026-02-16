package com.calculadora.complexa;
import java.util.Scanner;

public class Controle {

    Scanner input = new Scanner (System.in);
    String escolher; 
    ControleCalculo controleCalculo = new ControleCalculo();

    void PainelControle () {

        System.out.println("XXXXXXX Digite o tipo de operação desejada: XXXXXXX");
        System.out.println("1. MULTIPLICAÇÃO;");
        System.out.println("2. DIVISÃO;");
        System.out.println("3. SOMA;");
        System.out.println("4. SUBTRAÇÃO;");
        System.out.println("0. SAIR;");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            escolher = input.nextLine();

        
        switch (escolher) {

            case "1": //aspas duplas para reconhecer como string e nao int
                
                controleCalculo.calcularMultiplicacao(3); // chama o método de calculo das classes
                break;

            case "2":
                // a classe de controle calculo ja foi instanciada la em cima, basta chamar os métodos dela que chama os metodos das classes de calculo
                controleCalculo.calcularDivisao(3);
                break;

            case "3":

                Soma somar = new Soma ();
                somar.calcular();
                break;

            case "4":

                Subtracao subtrair = new Subtracao();
                subtrair.calcular();
                break;

            case "0":

                System.out.println("Saindo...");
                break;

            default:

                System.out.println("Dígito inválido!");
                break;

        }

    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public String getEscolher() {
        return escolher;
    }

    public void setEscolher(String escolher) {
        this.escolher = escolher;
    }

    public ControleCalculo getControleCalculo() {
        return controleCalculo;
    }

    public void setControleCalculo(ControleCalculo controleCalculo) {
        this.controleCalculo = controleCalculo;
    }
    
}
