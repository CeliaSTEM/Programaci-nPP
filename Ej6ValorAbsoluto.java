/*
 * Utiliza el operador ternario o el condicional para calcular el valor absoluto de un número que se solicita 
 * al usuario por teclado.Si el valor es positivo mostrará el número tal cual y si es negativo que muestre el
 * valor absoluto.
 */

import java.util.Scanner;
public class Ej6ValorAbsoluto{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Escribe un número: ");
        num = sc.nextInt();

        if (num >= 0){
            System.out.println("El número es: " + num + ".");
        } else {
            System.out.println("El número es: " + -num + ".");
        }

        // Mas chiquito:
        // if (num >= 0) System.out.print(num);
        // else System.out.println(-num);

        // Todavía más chiquito -> Operador terciario.
        // num = (num >= 0) ? num : -num; // (opcion) ? siSeCumple : siNoSeCumple
        // System.out.println(num);
    }
}