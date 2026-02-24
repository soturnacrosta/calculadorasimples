# Calculadora Complexa 
Autor: Mailton Olinto de Oliveira Lemos

# Visão Geral:

Este projeto tem como objetivo o desenvolvimento de uma calculadora das quatro operações matemáticas básicas: soma, subtração, multiplicação e divisão. Os cálculos são encadeados, assim não reiniciam ao obter os resultados.
Para fornecer uma experiência agradável ao usuário, há uma função de limpar os cálculos e um menu interativo em 'loop' para alternar entre as operações matemáticas.
O software desenvolvido serve de estudo, treinamento e portfólio do autor.

# Arquitetura do Sistema

O projeto foi feito no padrão Maven em Java 21 puro, utilizando o paradigma da Orientação a Objetos, heranças e interface.
As classes foram cuidadosamente separadas em suas funções para evitar acúmulo de responsabilidades em uma única classe.

![Diagrama Classes](Assets/Diagrama_Classe_Calculadora_Simples.png)

Diagrama de classes feito em Astah.

# Descrição dos Componentes (Classes)

## Controle

É o menu interativo do sistema. Nele o usuário navega entre as diferentes operações matemáticas.

1. **Possui um loop em boolean que mantém o usuário no sistema até ele escolher o próprio encerramento (sair == true).**
2. **Possui um switch case com sete opções, sendo quatro de operações matemáticas, uma de clear, uma de sair e uma de erro de digitação.**
3. **Os case 1, 2, 3, 4 e 'C' levam para a classe ControleCalculo.**

## Interface Operacoes

Define o contrato 'calcular()' que está presente em todas as classes que operam cálculo. É do tipo double para aceitar números quebrados e grandes.

## ControleCalculo 

O cérebro do sistema. Ele chama cada lógica de cálculo, trata exceções, implementa a função 'Clear' e encadeia os números calculados.

### O método prepararCalculo() funciona assim:

1. **Pega o último resultado calculado**
2. **Limpa a lista antiga (mantendo o resultado).**
3. **Torna o resultado como o novo ponto de partida.**

Ele encadeia os números das diferentes operações.

### O método de cálculo básico funciona assim:

1. **Chama primeiro o método prepararCalculo().**
2. **Se inicia um loop com um boolean.**
3. **Ao usuário inserir um dígito válido, os dígitos String são convertidos para double.**
4. **Os números são salvos numa ArrayList do tipo Double (lista).**
5. **Ao digitar '=' o sistema instancia a classe da operação pertencida e inicia o método de cálculo.**

Receber a entrada do usuário em String e depois converter para double permite que o usuário digite '=' para receber os resultados dos cálculos.

### O método de 'Clear()' funciona assim:

1. **Limpa os números anteriores através do lista.clear()**.
2. **Reinicia o resultado anterior para zero**.
3. **Adiciona o valor zero à lista de double**.

## Soma, Subtracao, Multiplicacao, Divisao

São as classes responsáveis por fazerem os cálculos propriamente dito. Elas são chamadas pelo 'ControleCalculo' de acordo com a operação matemática escolhida.

1. **Possuem um construtor de ControleCalculo cada para acessarem os atributos e métodos dele.**
2. **Há uma variável double local que se inicia com 0 e 1 em Soma e Multiplicacao, a somaLocal e multiplicacaoLocal respectivamente, que é o ponto neutro da soma e multiplicação e permitem cálculos coerentes.**
3. **A lógica de cálculo das classes são baseadas em um laço 'for' que busca os números da lista inseridos pelo usuário em ControleCalculo através de Getters e Setters.**
4. **Termina o loop iniciado no método de cálculo em ControleCalculo e retorna double com um 'print'.**

# Fluxo de Execução

Há uma certa peculiaridade no método calcularSubtracao(): ele, após prepararCalculo(), verifica se a lista está vazia e caso esteja, adiciona o número 0 à lista double. Isso permite calcular valores negativos.

# Tratamento de Erros e Exceções

Há, basicamente, três pontos essenciais que evitam o sistema de quebrar:

## Entradas do usuário

Caso o usuário não dê entrada de teclado com uma String válida, é lançada uma Exception do tipo NumberFormatException com mensagem amigável. Você encontra em ControleCalculo. 

## Tamanho de listas e listas vazias

Listas vazias ou com tamanhos divergentes (ou seja, sem números para calcular) são tratadas com 'if' e 'else' dentro das classes de operações matemáticas com mensagens amigáveis.

## Divisão por zero

Divisões por zero são tratadas por 'if' e 'else'.

# Guia de Extensibilidade

## Para adicionar novas operações matemáticas, siga:

### ControleCalculo

1. **Em ControleCalculo, se atente ao loop booleano de 'condicao', utilize o prepararCalculo e receba a entrada do usuário com 'entrada'.**
2. **A entrada é do tipo String mas os cálculos são do tipo double, então há a conversão de String para double com o método parseDouble.**
3. **Adicione o número que o usuário inseriu à lista 'lista' após a conversão.**
4. **Instancie e chame a classe da operação matemática correspondente para o cálculo propriamente dito ao usuário digitar '='**.
5. **Adicione um 'try-catch' para tratar erros de entrada de usuário do tipo 'NumberFormatException'.**

### Em Controle

1. **Em Controle, adicione a opção no menu interativo instanciando o método desejado em ControleCalculo.**

### Nas classes de operações matemáticas

1. **Se atente a instanciar um construtor de ControleCalculo para acessar Getters e Setters dele**.
2. **Implementar a interface Operacoes**.
3. **No método implementado calcular(), utilize de 'if' e 'else' para verificar tamanho de listas de números inseridos pelo usuários.**s
4. **Utilize laço 'for' para calcular número por número**.
5. **Utilizando Getters e Setters, acesse e mude os valores em ControleCalulo.**
6. **Trate erros e exceções com 'if' e 'else' ou 'exceptions'.**
