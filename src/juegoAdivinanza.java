import java.util.Scanner;

public class juegoAdivinanza {
    public static void main(String[] args) {
        int numeroAleatorio;
        int numeroUsuario;
        int intentos = 0;
        final int MAX_INTENTOS = 5;

        numeroAleatorio = (int) (Math.random() * 10) + 1;
        Scanner teclado = new Scanner(System.in);

        System.out.println("""
                ¡Bienvenido al juego de adivinanzas!
                He pensado en un número secreto entre 1 y 10.
                Tienes 5 intentos para adivinar cuál es.
                
                Después de cada intento, te diré si el número que ingresaste es mayor o menor que el número secreto.
                
                Si adivinas el número antes de agotar los intentos, ¡ganas!
                Si no lo logras, te revelaré el número al final.
                ¡Buena suerte! 🍀
                """);

        while (intentos < MAX_INTENTOS) {
            System.out.println("intento #" + (intentos + 1));
            System.out.println("ingresa un numero: ");
            numeroUsuario = teclado.nextInt();

            if (numeroUsuario == numeroAleatorio) {
                System.out.println("GANASTE!!");
                break;
            } else if (numeroUsuario > numeroAleatorio) {
                    System.out.println("intenta con un numero menor!");
                } else {
                    System.out.println("intenta con un numero mayor!");
                }
            intentos++;
        }
        teclado.close();
    }
}