import java.util.Scanner;

public class Saldo {
    public static void main(String[] args) {
        System.out.println("Informe o saldo:");

        Scanner sc = new Scanner(System.in);
        float saldo = sc.nextFloat();

        saldo = saldo + (saldo * 1 / 100);

        System.out.println(saldo);

    }
}
