import java.util.Scanner;

public class Ej4PrimosInferiores{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Escribe un número: ");
        num = sc.nextInt();

        // Voy recorriendo todos los números desde 2 hasta el número introducido por consola.
        for (int i = 2 ; i < num ; i++){ 
            // Los muestro por pantalla.
            System.out.println(i);
            // Asumo que todos los números son primos hasta que se demuestre lo contrario.
            boolean esPrimo = true;
                // ¿Cómo demuestro lo contrario?
                // Recorro todos los números que hay desde el número por el que voy hasta 2 y 
                //      si alguna de las divisiones da exacta, no es primo.
                for (int j = i-1; esPrimo && j > 1; j--){
                    if(i%j == 0){
                        esPrimo = false;
                    }
                }
            // En caso de que después de probar todas las divisiones no haya ninguna que dé de 
            //      resto 0, entonces es que ese número si que es primo.
            if (esPrimo){
                System.out.println("Este número es primo: " + i);
            }
        }
    }
}