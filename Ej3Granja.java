/*
En una granja se compra diariamente una cantidad (comidantaria) de comida para los animales. 
El número de animales que alimentar (todos de la misma especie) es numanimales, y sabemos que
cada animal come una medía de kilosporAnimal.
Diseña un programa que solicite al usuario los valores anteriores y determine si disponemos de 
alimento suficiente para cada animal. 
En caso negativo, ha de calcular cuál es la ración que corresponde a cada uno de los animales.
Nota: Evitar que la aplicación realice divisiones por cero.
 */
import java.util.Scanner;

public class Ej3Granja{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        double comidantaria; // Comida que se compra.
        int numanimales; // Numero de animales de la misma especie.
        double kilosporAnimal; // El número de kilos que come cada animal.

        double totalComidaComen;
        double totalComidaAlRepartir; 

        System.out.print("Illo, ¿cuánta comida compras? ");
        comidantaria = sc.nextDouble();
        System.out.print("¿Cuántos cerditos tienes? ");
        numanimales = sc.nextInt();
        System.out.print("Solo me falta que me digas cuantos kilos come cada cerdito: ");
        kilosporAnimal = sc.nextDouble();

        totalComidaComen = kilosporAnimal*numanimales;

        if (numanimales == 0){
            System.out.print("Vas a tener que tirar la comida...");
        }else{
            if (comidantaria >= totalComidaComen){
                System.out.print("Tieneh suficiente, maquina!");
            } else{
                System.out.println("Quillo, la'emoh liao! Van a pasar hambre, pero a ver si aguantan con menos comida.");
                totalComidaAlRepartir = comidantaria/numanimales;
                System.out.print("Les tocaría a " + totalComidaAlRepartir + " a cada cerdito.");
            }
        }

    }
}
