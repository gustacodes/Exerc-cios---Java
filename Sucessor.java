import java.util.Scanner;

/*
Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
antecessor e seu sucessor.
*/

public class Sucessor {
    public static void main(String[] args) {

        System.out.println("Insira um número:");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

            System.out.printf("Antecessor: %d\n" , numero-1);
            System.out.printf("Sucessor: %d\n", numero+1);
        
    }
    
}
