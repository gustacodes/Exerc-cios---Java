/*
Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM=R$788,00)
*/

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {

        System.out.println("Informe seu salário:");
        Scanner sc = new Scanner(System.in);
        int salario = sc.nextInt();

        System.out.println(salario / 788);
            
    }
}
