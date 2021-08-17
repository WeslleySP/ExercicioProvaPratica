package Exercicio01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        int ate14 = 0;
        int idadeFaixa1 = 0;
        int idadeFaixa2 = 0;
        int idadeFaixa3 = 0;
        int idadeAcima60 = 0;
        int totalPessoas = 0;
        double porcentagem;
        double porcentagemAcima60;




        for (int i =1; i <= 10; i++){
            System.out.print("Digite a idade: ");
            idade = sc.nextInt();
            if (idade <= 14){
                ate14 += 1;
            }

            if (idade >= 15 && idade <= 29){
                idadeFaixa1 += 1;
            }

            if (idade >= 30 && idade <= 44){
                idadeFaixa2 += 1;
            }

            if (idade >= 45 && idade <= 59){
                idadeFaixa3 += 1;
            }

            if( idade >= 60){
                idadeAcima60 += 1;
            }


        }

        totalPessoas = ate14 + idadeFaixa1 + idadeFaixa2 + idadeFaixa3 + idadeAcima60;
        porcentagem = (double) ate14 / totalPessoas * 100;

        porcentagemAcima60 = (double) idadeAcima60 / totalPessoas * 100;

        System.out.println();
        System.out.println("Até 14 anos: " + ate14);
        System.out.println("De 15 a 29 anos " + idadeFaixa1);
        System.out.println("De 30 a 44 anos " + idadeFaixa2);
        System.out.println("De 45 a 59 anos " + idadeFaixa3);
        System.out.println("Acima de 60 anos " + idadeAcima60);
        System.out.println("Total de pessoas " + totalPessoas);
        System.out.printf("Porcentagem de pessoas até 14 anos =  %.2f%n ",  porcentagem);
        System.out.printf("Porcentagem de pessoas acima de 60 = %.2f%n ",  porcentagemAcima60);

    }
}
