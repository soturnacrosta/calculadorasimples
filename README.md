# Desafio para treinamento: Calculadora das quatro operações matemáticas básicas.

## Objetivo:

Este documento tem como objetivo servir de orientação técnica para futuros interessados em conhecer o aplicativo.
É importante frisar que uma boa documentação é sempre uma boa prática, visando futuras melhorias e uma boa manutenção do software.

## Tecnologias utilizadas

### Back-end:

- **JAVA 21**: Linguagem de programação base para lógica da aplicação.

## Funcionalidades:

- **Menu interativo**: Roda um menu simples e interativo em 'loop' para o usuário transitar entre as diferentes operações matemáticas sem precisar interromper o fluxo.
- **Operações de soma**: Possibilita a soma de N algarismos.
- **Operações de subtração**: Possibilita a subtração de N algarismos.
- **Operações de multiplicação**: Possibilita a multiplicação de N algarismos.
- **Operações de divisão**: Possibilita a divisão de N algarismos, evitando divisões por zero.
- **Clear/limpar cálculos**: Possui função de limpar os cálculos, recomeçando-nas.

## Como rodar o projeto:

1. **Pré-requisitos**

Java 21 ou superior.

2. **Clonando o repositório**

Use o seguinte comando para clonar:

```
git clone https://github.com/soturnacrosta/calculadorasimples/
cd calculadorasimples
```

3. **Limpe e compile os arquivos Maven**

Já na pasta raiz, insira no terminal:

```
mvn clean install
```

4. **Execute a aplicação**

Execute o arquivo que contém a classe principal:

```
java -cp target/classes com.calculadora.complexa.Main
```

## Testando a aplicação

1. **No menu interativo, escolha a operação desejada.**
2. **Digite os algarismos para calcular e pressione '=' para obter o resultado.**
3. **Navegue entre as diferentes operações matemáticas utilizando o mesmo cálculo.**
4. **Quando necessário, utilize a função 'C/Clear' para reiniciar os valores.**

## Observações

Ao reiniciar os valores, eles voltam para 0 (zero), mas esse zero não é considerado para multiplicações, divisões e soma. O zero do 'Clear' é considerado apenas na subtração
afim de evitar problemas de lógica na aplicação.
