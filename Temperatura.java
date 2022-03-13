import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

        double c = 2.43;
        double f;
        double k;
        double re;
        double ra;

        System.out.println("Escolha uma opção:\n");
        System.out.println("1- Fahrenheit\n2- Kelvin\n3- Réaumur\n4- Rankine");

        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

            switch(temp){

                case 1:
                System.out.println(f = (c * 1.8 ) + 32);
                break;

                case 2:
                System.out.println(c + 273.15);
                break;

                case 3:
                System.out.println(re = c *0.8);
                break;

                case 4:
                System.out.println((c * 1.8) + 32 + 459.67);
                break;
            }
    }
}
