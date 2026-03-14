package br.edu.uniesp.lanche;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] valor = {4.00, 4.50, 5.00, 2.00, 1.50};
        Scanner entrada = new Scanner(System.in);
        int codigo = entrada.nextInt();
        int quant = entrada.nextInt();
        if ((codigo >= 1 && codigo <= 5) && (quant != 0)) {
            System.out.printf("Total: R$ %.2f\n", (valor[codigo - 1] * quant));
        } else {
            System.out.printf("Total: R$ %.2f\n", 0.0);
        }
    }
}
