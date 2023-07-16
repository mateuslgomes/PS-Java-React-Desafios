package Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k;

        int[] arr = new int[2];

        for (int i = 0; i < 2; i++) {
            arr[i] = sc.nextInt();
        }

        int[] n = new int[arr[0]];
        k = arr[1];

        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }

        sc.close();

        int pares = 0;

        for (int i : n) {
            for (int j : n) {
                if (i - j == k) {
                    pares++;
                }
            }
        }

        System.out.println(pares);

    }
}

// EX DE ENTRADA LINHA 1 --> 5 2
// EX DE ENTRADA LINHA 2 --> 1 5 3 4 2