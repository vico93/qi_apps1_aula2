/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E1;

import java.util.Scanner;

/**
 *
 * @author Vico
 */
public class Principal
{
    
    public static void main(String[] args)
    {
        // Entrada
        Scanner entrada = new Scanner(System.in);
        
        // Variáveis
        int opcao;
        
        // Menu
        System.out.println("Escolha a opção: ");
        System.out.println("1 - Média Aritimética");
        System.out.println("2 - Circunferência");
        System.out.println("3 - Variável Real");
        
        // Ler opção
        opcao = entrada.nextInt();
        
        switch (opcao)
        {
            case 1:
                // Instancia a classe do primeiro item
                LetraA media = new LetraA();
                
                // Lê atributos
                System.out.print("Digite o NOME do aluno: ");
                media.nome = entrada.next();
                
                System.out.print("Digite a PRIMEIRA nota do aluno: ");
                media.nota1 = entrada.nextDouble();
                System.out.print("Digite a SEGUNDA nota do aluno: ");
                media.nota2 = entrada.nextDouble();
                System.out.print("Digite a TERCEIRA nota do aluno: ");
                media.nota3 = entrada.nextDouble();
                
                // Resultado
                System.out.println("A média do aluno " + media.nome + " é " + media.calcularMedia());
                break;
            case 2:
                // Instancia a classe do primeiro item
                LetraB circunferencia = new LetraB();
                
                // Lê atributos
                System.out.print("Digite o RAIO da circunferência: ");
                circunferencia.raio = entrada.nextDouble();

                // Resultado
                System.out.println("Diãmetro da circunferência: " + circunferencia.calcularDiametro());
                System.out.println("Quadrante da circunferência: " + circunferencia.calcularQuadrante());
                break;
            case 3:
                // Instancia a classe do primeiro item
                LetraC valorreal = new LetraC();
                
                // Lê atributos
                System.out.print("Digite o valor de A: ");
                valorreal.A = entrada.nextDouble();
                
                // Resultado (via toString)
                System.out.println(valorreal);
                break;
            default:
                // 
                System.out.println("Opção INVÁLIDA!");
        }
        
        System.out.println("\nFIM!\n");
        
    }
    
}
