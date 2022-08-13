public class EjercicioMatriz {
    public static void main(String[] args) {
        for (int fila = 0; fila <= 10; fila++) {
            for (int columna = 0; columna < fila; columna++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int contador = 0; contador <= 100; contador++) {
            if (contador % 3 == 0) {
                System.out.println(contador);
            }
        }
    }
}
