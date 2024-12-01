/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetor2;

import java.util.Scanner;

public class GerenciadorDeNumeros {

    public void executar() {
        Scanner scanner = new Scanner(System.in);

        // Declaração do vetor
        int[] num = new int[15];

        // Entrada de dados
        for (int L = 0; L < 15; L++) {
            System.out.print("\nDigite o " + (L + 1) + "º número: ");
            num[L] = scanner.nextInt();
        }

        // Saída de dados
        System.out.println("\nRELACAO DOS NUMEROS");
        for (int L = 0; L < 15; L++) {
            System.out.print("\n" + (L + 1) + "- " + num[L]);
            if (num[L] % 2 == 0) {
                System.out.println(" é PAR");
            } else {
                System.out.println(" é ÍMPAR");
            }
        }
    }
}
