# Quarto Desafio

Este repositório contém a solução para o "Quarto Desafio" proposto pela Supera. O desafio consiste em decifrar strings que foram impressas de forma incorreta por uma impressora infectada por um vírus.

## Como executar o código

1. Certifique-se de ter Java Development Kit (JDK 11+) instalado na sua máquina.
2. Clone este repositório para o seu computador.
3. Navegue para o diretório onde os arquivos foram salvos.
4. Compile o programa Java executando o seguinte comando no terminal ou IDE favorita:

```plaintext
java Main.java
```

Entrada
A entrada contém vários casos de teste. A primeira linha de entrada contém um inteiro "N" que indica a quantidade de casos de teste. Seguem "N" linhas, cada uma com uma frase contendo no mínimo 2 e no máximo 100 caracteres de letras maiúsculas e espaços, que deverão ser decifradas à partir da forma impressa para a sua forma original.

Exemplo de Entrada:

```plaintext
5
I ENIL SIHTHSIREBBIG S
LEVELKAYAK
H YPPAHSYADILO
ABCDEFGHIJKLMNOPQRSTUVWXYZ
VOD OWT SNEH HCNERF EGDIRTRAP A DNA SE
```


## Saída
Para cada linha de entrada, deverá ser impressa uma linha de saída com a frase decifrada para a sua forma original, conforme especificação do desafio.

Exemplo de Saída:

```plaintext
THIS LINE IS GIBBERISH
LEVELKAYAK
HAPPY HOLIDAYS
MLKJIHGFEDCBAZYXWVUTSRQPON
FRENCH HENS TWO DOVES AND A PARTRIDGE
```