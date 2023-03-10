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

        FigurasGeometricas fig = new FigurasGeometricas();

        Scanner leitor = new Scanner(System.in);
        Integer operacaoSelecionada = 0;
        fig.exibirQuadradoTrianguloRetangulo();
        Integer pontuacaoQuiz = 0;
       
        
        do {
            System.out.println(String.format(" \n"
                    + "1 - Cálculo (Área e Perímetro)           \n"
                    + "2 - Qual Figura Geométricas  você seria?   \n"
                    + "3 - Gerador De Figuras Geométricas       \n"
                    + "4 - Quiz (Figuras Geométricas)           \n"
                    + "0 – Sair"));

            operacaoSelecionada = leitor.nextInt();

            switch (operacaoSelecionada) {

                //Cálculo
                case 1:
                    fig.separar();
                    System.out.println(String.format("Digite o número da Figura Geométrica, no qual deseja realizar o cálculo:"));
                    System.out.println(String.format(
                            "1 - Quadrado\n"
                            + "2 - Triangulo Retângulo\n"
                            + "3 - Retangulo\n"
                            + "4 - Voltar ao Menu"
                    ));

                    Integer numeroMenu = leitor.nextInt();

                    switch (numeroMenu) {
                        case 1:
                            fig.exibirQuadrado();
                            System.out.println(String.format("Digite a medida do Lado (L) do quadrado em centímetros"));
                            Double medidaLadoQuadradoDigitada = leitor.nextDouble();

                            Double perimetroQuadrado = fig.calcularPerimetroQuadrado(medidaLadoQuadradoDigitada);
                            Double areaQuadrado = fig.calcularAreaQuadrado(medidaLadoQuadradoDigitada);

                            System.out.println(String.format("A área do quadrado é de %.2fcm², e o seu perímetro equivale à %.2fcm.", areaQuadrado, perimetroQuadrado));
                            fig.separarFinal();

                            break;

                        case 2:
                            fig.exibirTrianguloRetangulo();
                            System.out.println(String.format("Digite a medida do Lado A (Altura) do triangulo em centímetros"));
                            Double medidaLadoATrianguloDigitada = leitor.nextDouble();

                            System.out.println(String.format("Digite a medida do Lado B (Base) do triangulo em centímetros"));
                            Double medidaLadoBTrianguloDigitada = leitor.nextDouble();

                            System.out.println(String.format("Digite a medida do Lado C (Hipotenusa) do triangulo em centímetros"));
                            Double medidaLadoCTrianguloDigitada = leitor.nextDouble();

                            Double perimetroTriangulo = fig.calcularPerimetroTriangulo(medidaLadoATrianguloDigitada, medidaLadoBTrianguloDigitada, medidaLadoCTrianguloDigitada);
                            Double areaTriangulo = fig.calcularAreaTriangulo(medidaLadoBTrianguloDigitada, medidaLadoATrianguloDigitada);

                            System.out.println(String.format("A área do triangulo é de %.2fcm², e o seu perímetro equivale à %.2fcm.", areaTriangulo, perimetroTriangulo));
                            fig.separarFinal();
                            break;

                        case 3:
                            fig.exibirRetangulo();
                            System.out.println(String.format("Digite a medida do Lado A (Altura) do retângulo em centímetros"));
                            Double medidaLadoARetanguloDigitada = leitor.nextDouble();

                            System.out.println(String.format("Digite a medida do Lado B (Base) do retângulo em centímetros"));
                            Double medidaLadoBRetanguloDigitada = leitor.nextDouble();

                            Double perimetroRetangulo = fig.calcularPerimetroRetangulo(medidaLadoARetanguloDigitada, medidaLadoBRetanguloDigitada);
                            Double areaRetangulo = fig.calcularAreaRetangulo(medidaLadoARetanguloDigitada, medidaLadoBRetanguloDigitada);

                            System.out.println(String.format("A área do retângulo é de %.2fcm², e o seu perímetro equivale à %.2fcm.", areaRetangulo, perimetroRetangulo));
                            fig.separarFinal();
                            break;

                        case 4:
                            fig.separarFinal();

                            break;

                        default:
                            System.out.println(String.format("Opção inválida!"));
                            fig.separarFinal();
                    }

                    break;

                    
                    
                //FiguravcSeria
                case 2:
                    
                    Integer pontuacaoQuadrado = 0;
                    Integer pontuacaoretangulo = 0;
                    Integer pontuacaoTriangulo = 0;
                    Integer pontuacaoOctogono = 0;
                    
                    break;

                    
                    
                    
                //Gerador
                case 3:
                    // exp
                    System.out.println("Digite o seu nome");
                    System.out.println("Olá xxx, você seria um quadrado: FIGURA");
                    break;

                    
                    
                    
                //Quiz
                case 4:

                    break;

                    
                    
                    
                //Sair
                case 0:
                    System.out.println(String.format("Até logo! :)"));
                    break;

                //Default
                default:
                    System.out.println(String.format("Opção inválida, tente novamente"));

            }
        } while (operacaoSelecionada != 0);

    }

}
