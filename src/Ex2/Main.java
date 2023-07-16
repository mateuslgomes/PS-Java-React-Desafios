package Ex2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double[] notas = {100.0, 50.0, 20.0, 10.0, 5.0, 2.0};
        double[] moedas = {1.0, 0.5, 0.25, 0.10, 0.05, 0.01};

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double valor = sc.nextDouble();
        sc.close();

        int reias = (int) valor;
        int centavos = (int) ((valor - reias) * 100);


        System.out.println("NOTAS:");
        for (double nota : notas) {
            int unidades = reias / (int) nota;
            System.out.println(unidades + " nota(s) de R$ " + nota);
            reias %= (int) nota;
        }

        if (reias == 1) {
            centavos = centavos + 100;
        }

        System.out.println("MOEDAS:");
        for (double moeda : moedas) {
            int unidades = centavos / (int) (moeda * 100);
            System.out.println(unidades + " moeda(s) de R$ " + moeda);
            centavos %= (int) (moeda * 100);
        }

    }
}
