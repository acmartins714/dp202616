package br.edu.uniesp.testedeselecao1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        /*
        Leia 4 valores inteiros A, B, C e D.
        A seguir,
        se B for maior do que C e
        se D for maior do que A, e
        a soma de C com D for maior que a soma de A e B e
        se C e D, ambos, forem positivos e
        se a variável A for par
        escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".
        */

        Scanner entrada = new Scanner(System.in);
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int C = entrada.nextInt();
        int D = entrada.nextInt();

        String saida = "Valores não aceitos";

        if (B > C) {
            if (D > A) {
                if ((C + D) > (A + B)) {
                    if (C > 0 && D > 0) {
                        if (A%2 == 0) {
                          saida = "Valores aceitos";
                        }
                    }
                }
            }
        }

        System.out.println(saida);
    }
}
