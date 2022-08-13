public class EjemploCondicionales2 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int edad = 21;
        int cantidadPersonas = 2;
        boolean esPareja = cantidadPersonas > 1;
        System.out.println(esPareja);

        if (edad >= 18 && esPareja) {
            System.out.println("Puede ingresar");
        } else {
            System.out.println("Usted no está permitido a" +
                    " entrar");
        }
        System.out.println("Bienvenido");
    }
}
