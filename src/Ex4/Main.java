package Ex4;

import java.util.Scanner;

public class Main {

    private String inverterOrdem(String texto) {
        StringBuilder builder = new StringBuilder(texto);
        return builder.reverse().toString();
    }

    private String corrigirDoisTextosEmbaralhados(String ptUm, String ptDois) {
        String ParteUm = inverterOrdem(ptUm);
        String ParteDois = inverterOrdem(ptDois);
        return ParteUm + ParteDois;
    }

    public static void main(String[] args) {

        Main ex = new Main();

        Scanner sc = new Scanner(System.in);

        int tamanho = sc.nextInt();
        String[] lista = new String[tamanho];

        sc.nextLine();

        for (int i = 0; i < tamanho; i++) {
            lista[i] = sc.nextLine();
        }

        sc.close();

        String parteUm;
        String parteDois;

        for (String texto : lista) {
            int metade = texto.length() / 2;
            parteUm = texto.substring(0, metade);
            parteDois = texto.substring(metade);
            System.out.println(ex.corrigirDoisTextosEmbaralhados(parteUm, parteDois));
        }

    }

}
