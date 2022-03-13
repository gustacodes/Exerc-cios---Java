import java.util.Scanner;

import javax.swing.JOptionPane;

public class ContandoDias {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int resultadoAno, resultadoMeses, resultadoDias;

        System.out.println("Anos ");
        int anos = sc.nextInt();

        System.out.println("Meses");
        int meses = sc.nextInt();

        System.out.println("Dias: ");
        int dias = sc.nextInt();

        resultadoAno = anos * 365;
        resultadoMeses = meses * 30;
        resultadoDias = dias;

        JOptionPane.showMessageDialog(null, resultadoAno + resultadoMeses + resultadoDias);

    }
}
