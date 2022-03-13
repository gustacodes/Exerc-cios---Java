/*
Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres.
*/

import java.util.Scanner;

public class HomensMulheres {
    public static void main(String[] args) {

        int sexo = 0, qtdHomens = 0, qtdMulheres = 0;
        float altura = 0, soma = 0, mediaHomens = 0, maior = 0, menor = 10, somaH = 0;
        Scanner sc = new Scanner(System.in);

            for(int i = 0; i < 10; i++){
                System.out.println("1- Mulher\n2- Homem");
                sexo = sc.nextInt();

                System.out.println("Digite a altura:");
                altura = sc.nextFloat();

                    if(sexo == 1){
                        qtdMulheres++;
                        
                    } else if(sexo == 2){
                        qtdHomens++;
                        somaH = somaH + altura;
                    } else {
                        System.out.println("Opção inválida.");
                    }

                    if(altura > maior){
                        maior = altura;
                    } else if(altura < menor){
                        menor = altura;
                    }
            }

                    mediaHomens = somaH / qtdHomens;

                    System.out.println("A maior altura do grupo é de " + maior + "m, e a menor é de " + menor + "m");
                    System.out.println("A média de altura dos homens é: " + mediaHomens + " m");
                    System.out.println("O número de mulheres é: " + qtdMulheres);

                    sc.close();
    }
}
