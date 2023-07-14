package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class CountPairs {
    public static int countPairsWithDifference(int[] arr, int k) {
        Arrays.sort(arr);

        int count = 0;
        int i = 0;
        int j = 1;

        while (j < arr.length) {
            int diff = arr[j] - arr[i];

            if (diff == k) {
                count++;
                i++;
                j++;
            } else if (diff > k) {
                i++;
            } else {
                j++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.print("Digite os elementos do array separados por espaço: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Digite o valor alvo: ");
        int k = scanner.nextInt();

        scanner.close();

        int count = countPairsWithDifference(arr, k);
        System.out.println("Número de pares que satisfazem o critério: " + count);
    }
}
