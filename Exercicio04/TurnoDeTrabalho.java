package Exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class TurnoDeTrabalho {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        char turno;

        System.out.print("Qual turno você trabalha? M-manhã ou T-tarde ou N-noite?");
        turno = leitura.next().toUpperCase().charAt(0);

        switch (turno) {
            case 'M':
                System.out.println("Bom dia!");
                break;
            case 'T':
                System.out.println("Boa tarde!");
                break;
            case 'N':
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Valor inválido");

        }
    }
}
