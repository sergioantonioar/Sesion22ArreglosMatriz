/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion22;

import java.util.Arrays;

/**
 *
 * @author sergio
 */
public class OrdenamientoMatriz {

    public static void main(String[] args) {
        int[][] matriz = {{5, 4, 7}, {1, 3, 8}, {2, 9, 6}};
        int[] vector = new int[9];
        int indice = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                vector[indice++] = matriz[i][j];
                System.out.printf("%-3d", matriz[i][j]);
            }
            System.out.println();
        }

        Arrays.sort(vector);
        System.out.println("");

        indice = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = vector[indice++];
                System.out.printf("%-3d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
