public class task3 {

    // Este método hace toda la operación matemática
    public static double calculateExpression(double x, double y) {

        // Paso 1: x al cuadrado
        double part1 = Math.pow(x, 2);

        // Paso 2: (4 * y / 5 - x) al cuadrado
        double part2 = Math.pow((4 * y / 5 - x), 2);

        // Paso 3: Sumar las dos cosas
        return part1 + part2;
    }

    public static void main(String[] args) {

        // Aquí ponemos los valores de x y y
        double x = 2;
        double y = 10;

        // Llamamos al método y guardamos el resultado
        double result = calculateExpression(x, y);

        // Imprimimos el resultado en pantalla
        System.out.println("Resultado: " + result);
    }
}
