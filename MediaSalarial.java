/*
Criar um programa que calcule a média de salários de uma empresa, pedindo ao usuário a grade de funcionários e os salários,
e devolvendo a média salarial.
*/

public class MediaSalarial {
    public static void main(String[] args) {
        double s1, s2, s3, s4, media;

        s1 = 3453.21;
        s2 = 3498.43;
        s3 = 7902.09;
        s4 = 12932.00;

        media = (s1 + s2 +s3 + s4) / 4;

        System.out.print("A média salarial da empresa é de: " + Math.ceil(media) + "\n");
    }
}
