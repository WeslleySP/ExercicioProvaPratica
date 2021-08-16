package Exercicio01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        int soma = 0;
        int ate14 = 0;
        int idadeFaixa1 = 0;
        int idadeFaixa2 = 0;
        int idadeFaixa3 = 0;
        int idadeAcima60 = 0;



        for (int i =0; i <= 10; i++){
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
        System.out.println("Até 14 anos: " + ate14);
        System.out.println("De 15 a 29 anos " + idadeFaixa1);
        System.out.println("De 30 a 44 anos " + idadeFaixa2);
        System.out.println("De 45 a 59 anos " + idadeFaixa3);
        System.out.println("Acima de 60 anos " + idadeAcima60);

    }
}
