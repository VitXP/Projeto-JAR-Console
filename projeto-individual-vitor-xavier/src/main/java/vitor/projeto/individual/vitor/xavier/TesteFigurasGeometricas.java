/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitor.projeto.individual.vitor.xavier;

import java.util.Scanner;

/**
 *
 * @author vitor
 */
public class TesteFigurasGeometricas {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Integer operacaoSelecionada = 0;
        System.out.println(String.format("\n              - Figuras Geométricas - \n \n \n"
                + "+------------+          /\\          +----------------------+      \n"
                + "|            |         /  \\         |                      |      \n"
                + "|            |        /    \\        |                      |      \n"
                + "|            |       /      \\       |                      |      \n"
                + "|            |      /        \\      |                      |      \n"
                + "|            |     /          \\     |                      |      \n"
                + "|            |    /            \\    |                      |      \n"
                + "+------------+    --------------    +----------------------+      \n"
        )
        );

        do {
            System.out.println(String.format(" \n"
                    + "1 - Cálculo (Área e Perímetro)           \n"
                    + "2 - Gerador De Figuras Geométricas       \n"
                    + "3 - Qual Figura Geométricas  você seria?   \n"
                    + "4 - Quiz (Figuras Geométricas)           \n"
                    + "0 – Sair"));

            operacaoSelecionada = leitor.nextInt();

            switch (operacaoSelecionada) {

                //Cálculo
                case 1:

                    break;

                //Gerador
                case 2:

                    break;

                //Figura
                case 3:

                    break;

                //Quiz
                case 4:

                    break;

                //Sair
                case 0:
                    System.out.println("Até logo! :)");
                    break;

                //Default
                default:
                    System.out.println("Opção inválida, tente novamente");

            }
        } while (operacaoSelecionada != 0);

    }

}
