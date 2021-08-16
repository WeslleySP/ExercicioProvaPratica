package Exercicio02;

import java.util.Scanner;

public class CalcularReajuste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario;
        double reajuste;
        double novoSalario;

        System.out.print("Digite seu salário: ");
        salario = sc.nextDouble();

        if (salario < 1600){
            reajuste = salario * 0.25;
            novoSalario = salario + reajuste;

            System.out.printf("Salario antes do reajuste: %.2f%n ", salario);
            System.out.printf("Percentual de aumento aplicado foi de 25 por cento:  %.2f %n ",   reajuste);
            System.out.printf("Salario com reajuste:  %.2f%n ", novoSalario);
        }

        if (salario >= 1600 && salario < 3000){
            reajuste = salario * 0.20;
            novoSalario = salario + reajuste;

            System.out.printf("Salario antes do reajuste: %.2f%n ", salario);
            System.out.printf("Percentual de aumento aplicado foi de 20 por cento:  %.2f %n ",   reajuste);
            System.out.printf("Salario com reajuste:  %.2f%n ", novoSalario);
        }

        if(salario >= 3000 && salario < 5000){
            reajuste = salario * 0.15;
            novoSalario = salario + reajuste;

            System.out.printf("Salario antes do reajuste: %.2f%n ", salario);
            System.out.printf("Percentual de aumento aplicado foi de 15 por cento:  %.2f %n ",   reajuste);
            System.out.printf("Salario com reajuste:  %.2f%n ", novoSalario);
        }

        if(salario >= 5000){
            reajuste = salario * 0.10;
            novoSalario = salario + reajuste;

            System.out.printf("Salario antes do reajuste: %.2f%n ", salario);
            System.out.printf("Percentual de aumento aplicado foi de 10 por cento:  %.2f %n ",   reajuste);
            System.out.printf("Salario com reajuste:  %.2f%n ", novoSalario);
        }
    }
}
