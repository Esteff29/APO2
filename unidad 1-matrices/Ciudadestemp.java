import java.util.Random;

public class Ciudadestemp {
    public static void main(String[] args) {
        // Número de filas y columnas
        int filas = 100;
        int columnas = 6;

        // Crear una matriz para almacenar las temperaturas
        double[][] temperaturas = new double[filas][columnas];

        // Nombres de las ciudades
        String[] ciudades = {"Bogotá", "Cali", "Medellín", "Pasto", "Barranquilla", "Manizales"};

        // Inicializar el generador de números aleatorios
        Random random = new Random();

        // Rango de temperaturas para cada ciudad
        double[] minTemp = {10, 15, 10, 10, 20, 10}; // Temperatura mínima
        double[] maxTemp = {35, 40, 35, 29, 40, 40}; // Temperatura máxima

        // Llenar la matriz con temperaturas aleatorias dentro de los rangos especificados
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                temperaturas[i][j] = minTemp[j] + random.nextDouble() * (maxTemp[j] - minTemp[j]);
            }
        }

        // Mostrar la tabla de temperaturas con un formato más alineado
        System.out.println("Tabla de Temperaturas en Grados Celsius");

        // Encabezados de las ciudades
        System.out.printf("%-12s", "Fila");
        for (String ciudad : ciudades) {
            System.out.printf("%-15s", ciudad);
        }
        System.out.println();

        // Filas de temperaturas
        for (int i = 0; i < filas; i++) {
            System.out.printf("%-12d", i + 1);
            for (int j = 0; j < columnas; j++) {
                System.out.printf("%-15.2f", temperaturas[i][j]);
            }
            System.out.println();
        }
    }
}