/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitor.projeto.individual.vitor.xavier;

/**
 *
 * @author vitor
 */
public class FigurasGeometricas {

    void exibirQuadradoTrianguloRetangulo() {
        System.out.println(String.format("\n              - Figuras Geométricas - \n \n \n"
                + "+--------------+          /\\          +----------------------+      \n"
                + "|              |         /  \\         |                      |      \n"
                + "|              |        /    \\        |                      |      \n"
                + "|              |       /      \\       |                      |      \n"
                + "|              |      /        \\      |                      |      \n"
                + "|              |     /          \\     |                      |      \n"
                + "|              |    /            \\    |                      |      \n"
                + "+--------------+    --------------    +----------------------+      \n"
        )
        );
    }

    void exibirQuadrado() {
        System.out.println(String.format(
                "  +------------+\n"
                + "  |            |\n"
                + "  |            |\n"
                + "l |            |\n"
                + "  |            |\n"
                + "  |            |\n"
                + "  +------------+\n"
        )
        );
    }

    void exibirTrianguloRetangulo() {
        System.out.println(String.format(
                "   |\\\n"
                + "   | \\\n"
                + "   |  \\\n"
                + "   |   \\\n"
                + " a |    \\  c\n"
                + "   |     \\\n"
                + "   |      \\\n "
                + "  |       \\\n"
                + "   +--------\n"
                + "      b   "
        )
        );
    }

    void exibirRetangulo() {
        System.out.println(String.format(
                "  +---------------------------------+\n"
                + "  |                                 |\n"
                + "  |                                 |\n"
                + "a |                                 |\n"
                + "  |                                 |\n"
                + "  |                                 |\n"
                + "  |                                 |\n"
                + "  +---------------------------------+\n"
                + "               b"
        )
        );
    }

    void separar() {
        System.out.println("\n\n---------------------------------------------------------------------------------");
    }

    void separarFinal() {
        System.out.println("---------------------------------------------------------------------------------\n\n");
    }

    Double calcularPerimetroQuadrado(Double medidaLadoQuadrado) {
        return medidaLadoQuadrado * 4;
    }

    Double calcularAreaQuadrado(Double medidaLadoQuadrado) {
        return medidaLadoQuadrado * medidaLadoQuadrado;
    }

    Double calcularPerimetroTriangulo(Double ladoA, Double ladoB, Double ladoC) {
        return ladoA + ladoB + ladoC;
    }

    Double calcularAreaTriangulo(Double base, Double altura) {
        return base * altura / 2;
    }

    Double calcularPerimetroRetangulo(Double altura, Double base) {
        return 2 * (altura + base);
    }

    Double calcularAreaRetangulo(Double altura, Double base) {
        return altura * base;
    }

    void ExibirQuadradoSeria() {
        System.out.println(String.format(
                "+------------+\n"
                + "|            |\n"
                + "|            |\n"
                + "|            |\n"
                + "|            |\n"
                + "|            |\n"  
                + "+------------+\n"
        )
        );
    }

    void exibirTrianguloSeria() {
        System.out.println(String.format(
                "      /\\         \n"
                + "     /  \\        \n"
                + "    /    \\       \n"
                + "   /      \\      \n"
                + "  /        \\     \n"
                + " /          \\    \n"
                + "/            \\   \n"
                + "--------------    \n"
        )
        );
    }

    void exibirRetanguloSeria() {
        System.out.println(String.format(
                "+---------------------------------+\n"
                + "|                                 |\n"
                + "|                                 |\n"
                + "|                                 |\n"
                + "|                                 |\n"
                + "|                                 |\n"
                + "|                                 |\n"
                + "+---------------------------------+\n"
               
        )
        );
    }

    void exibirOctogonoSeria() {
        System.out.println(String.format(
                "   +----------+\n"
                + "  /            \\\n"
                + " /              \\\n"
                + "+                +\n"
                + "|                |\n"
                + "+                +\n"
                + " \\              /\n"
                + "  \\            /\n"
                + "   +----------+\n"
        ));

    }
    
    
}
