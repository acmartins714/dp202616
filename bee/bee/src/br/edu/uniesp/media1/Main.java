package br.edu.uniesp.media1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double nota1 = entrada.nextDouble();
        double nota2 = entrada.nextDouble();

        double peso1 = 3.5;
        double peso2 = 7.5;
        double somaPesos = peso1 + peso2;

        double mediaPonderada = ((nota1 * peso1) + (nota2 * peso2)) / somaPesos;
        System.out.printf("MEDIA = %.5f\n", mediaPonderada);

    }
}

