public class EjemploCondicionales {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int edad = 17;
        int cantidad = 2;

        if (edad >= 18) {
            System.out.println("Puede ingresar");
        } else {
            if(cantidad >= 2) {
                System.out.println("Usted es menor de edad " +
                        "pero está permidito su ingreso");
            } else {
                System.out.println("Usted no está permitido a" +
                        " entrar");
            }
        }

        System.out.println("Bienvenido");
    }
}
