/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion22;

/**
 *
 * @author sergio
 */
public class CopiarMatriz {

    public static void main(String[] args) {
        int[][] datos = {{24, 32, 19}, {11, 45, 78}, {36, 11, 90}};
        int[][] copia = new int[3][3];

        System.arraycopy(datos, 0, copia, 0, datos.length);
        
        for (int i = 0; i < copia.length; i++) {
            for (int j = 0; j < copia[0].length; j++) {
                System.out.printf("%-3d",copia[i][j]);
            }
            System.out.println();
        }
    }

}
