public class EjemploScope {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int edad = 21;
        int cantidadPersonas = 2;
        boolean esPareja = cantidadPersonas > 1;
        System.out.println(esPareja);

        boolean puedeEntrar = edad >= 18 && esPareja;

        if (puedeEntrar) {
            System.out.println("Sea bienvenido");
        } else {
            System.out.println("Usted no está permitido a" +
                    " entrar");
        }
        System.out.println("Bienvenido");


    }
}
