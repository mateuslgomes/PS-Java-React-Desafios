package Ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();

        for (int i = 0; i < 11; i++) {
            int numero = sc.nextInt();
            if (numero % 2 == 0) {
                numerosPares.add(numero);
                continue;
            }
            numerosImpares.add(numero);
        }

        sc.close();

        Collections.sort(numerosPares);
        numerosImpares.sort(Collections.reverseOrder());

        System.out.println();

        for (int numeroPar : numerosPares) {
            System.out.println(numeroPar);
        }

        for (int numeroImpar : numerosImpares) {
            System.out.println(numeroImpar);
        }

    }
}
