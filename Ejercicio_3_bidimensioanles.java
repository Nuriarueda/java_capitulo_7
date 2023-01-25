/*Ejercicio 3 bidimensionales*/

public class Ejercicio_3_bidimensioanles {
    public static void main(String[] args) {
        int[][] num = new int[4][5]; // array de 4 filas por 5 columnas
        int fila;
        int columna;
        for(fila = 0; fila < 4; fila++){
            for(columna = 0; columna < 5; columna++){
                num[fila][columna] = (int)(Math.random() * 900) + 100;
                int sumaFila;
                for(fila = 0; fila < 4; fila++) {
                    sumaFila = 0;
                    for(columna = 0; columna < 5; columna++) {
                        System.out.printf("%7d ", num[fila][columna]);
                        sumaFila += num[fila][columna];
                    }
                    System.out.printf("|%7d\n", sumaFila);
                }
                for(columna = 0; columna < 5; columna++) {
                    System.out.print("----------");
                }
                System.out.println("-----------");
                int sumaColumna;
                int sumaTotal = 0;
                for(columna = 0; columna < 5; columna++) {
                    sumaColumna = 0;
                    for(fila = 0; fila < 4; fila++) {
                        sumaColumna += num[fila][columna];
                    }
                    sumaTotal += sumaColumna;
                    System.out.printf("%7d ", sumaColumna);
                }
                System.out.printf("|%7d ", sumaTotal);
            }
        }

    }
}
