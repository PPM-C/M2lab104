public class task2 {
    public static void findTwoSmallest(int[] nums) {
        if (nums == null || nums.length < 2) {
            System.out.println("El arreglo debe tener al menos dos elementos.");
            return;
        }

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num < min) {
                secondMin = min;  // el actual mínimo pasa a ser el segundo
                min = num;        // encontramos un nuevo mínimo
            } else if (num < secondMin && num != min) {
                secondMin = num;  // actualizamos segundo mínimo si es menor y distinto del mínimo
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("No hay un segundo menor diferente. Todos los elementos son iguales.");
        } else {
            System.out.println("Menor: " + min);
            System.out.println("Segundo menor: " + secondMin);
        }
    }

    public static void main(String[] args) {
        int[] example = {4, 5, 7, 1, 9, 3};
        findTwoSmallest(example);
    }
}
