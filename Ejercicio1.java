/*
 * Click to change this license
 * Click to edit this template
 */
package sesion22;

/**
 *
 * @author sergio
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int[] edad = {25, 24, 25, 19, 22};
        int[] grado = {5, 5, 5, 5, 4};
        String[] nombre = {"ANA", "CARLOS", "GABRIELA ", "JUAN", "ROSA"};
        int[][] examen = new int[5][4];
        double[] prom = new double[5];
        
        
        for (int i = 0; i < examen.length; i++) {
            int suma = 0;
            for (int j = 0; j < examen[0].length; j++) {
                examen[i][j] = (int) (Math.random() * 20) + 1;
                suma += examen[i][j];
            }
            prom[i] = suma / 4.0;
        }

        System.out.printf("################### REPORTE DE NOTAS #################################%n");
        System.out.printf("%s%26s%6s%6s%6s%6s%6s%6s%n", "NOMBRE", "EDAD", "GRADO", "PC1", "PC2", "PC3", "EF", "PROM");
        System.out.printf("######################################################################%n");  
        double promTotal;
        double sumaPromTotal=0;
        for (int i = 0; i < examen.length; i++) {
            System.out.printf("%-9s%23d%5d", nombre[i], edad[i], grado[i]);
            for (int j = 0; j < examen[0].length; j++) {
                System.out.printf("%6d", examen[i][j]);
            }
            System.out.printf("%8.2f", prom[i]);
            sumaPromTotal+=prom[i];
            System.out.println("");
        }
        System.out.printf("######################################################################%n");
       promTotal=sumaPromTotal/examen.length;
        System.out.printf("%s%54.2f%n","PROMEDIO TOTAL:",promTotal);
        System.out.printf("######################################################################%n");
    }
}
