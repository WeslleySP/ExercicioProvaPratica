package Exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Paulista paulista = new Paulista();
        Mineiro mineiro = new Mineiro();
        Carioca carioca = new Carioca();
        String leitura = sc.next();
        String[] pessoas = new String[6];


        for (int i = 0; i <= 6; i++){
            pessoas[i] = sc.next();
            System.out.println(pessoas[i]);

        }


    }
}
