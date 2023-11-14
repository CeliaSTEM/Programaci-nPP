/*
 * Una frase es palíndromo cuando se lee igual de derecha 
 * a izquierda que de izquierda a derecha. Implementa un 
 * programa que dada una cadena de texto, el usuario la 
 * introdue por teclado, te muestre por pantalla dicha  
 * frase y su palíndromo. 
 * 
 * Ejemplos: 
 *      Isaac no ronca así.
 *      Sé verlas al revés.
 *      Amo la paloma. 
 *      Anita lava la tina.
 */

 import java.util.Scanner;
 
 public class ex1{
    public static void main (String args[]){
        // --------------------------------------------------------------------
        // EJERCICIO 1
        // --------------------------------------------------------------------
        
        /*
        * Una frase es palíndromo cuando se lee igual de derecha 
        * a izquierda que de izquierda a derecha. Implementa un 
        * programa que dada una cadena de texto, el usuario la 
        * introdue por teclado, te muestre por pantalla dicha  
        * frase y su palíndromo. 
        * 
        * Ejemplos: 
        *      Isaac no ronca así.
        *      Sé verlas al revés.
        *      Amo la paloma. 
        *      Anita lava la tina.
        */

        System.out.println("\n\nEjercicio 1: ");
        Scanner sc = new Scanner (System.in);
        String palabra;

        System.out.println("Introduce una frase para construir su palindromo: ");
        palabra = sc.nextLine();

        System.out.println("\nLa frase: ");
        for (int i = 0 ; i < palabra.length() ; i++){
            // [H|O|L|A] 
            // palabra[0] -> H
            // palabra[1] -> O
            // palabra.charAt(0) -> H
            System.out.print(palabra.charAt(i));
        }
        System.out.println();
        System.out.println("\nSu palindromo: ");
        for (int i = palabra.length()-1 ; i >= 0 ; i--){
            System.out.print(palabra.charAt(i));
        }
        System.out.println();

        // --------------------------------------------------------------------
        // EJERCICIO 2
        // --------------------------------------------------------------------
        
        /*
         * Implementa la serie de Fibonacci de los 20 primeros números. La serie de Fibonacci es una secuencia infinita de números naturales cuyos dos primeros términos son 1 y 1, cualquier otro término se obtiene sumando los dos inmediantamente anteriores.
         * Ejemplo: 1 1 2 3 5 8 12 21 33 54 87 ...
         * Se debe mostrar por pantalla el resultado en una única línea.
         */

        System.out.println("\n\nEjercicio 2: \nEstas son los 20 primeros números de Fibonacci: ");

        int primerNum = 1;
        int segundNum = 1;
        int sigNum;

        System.out.print(primerNum + " ");
        System.out.print(segundNum + " ");

        for  (int i = 2 ; i < 20 ; i++){
            sigNum = primerNum + segundNum;
            System.out.print(sigNum + " ");
            primerNum = segundNum;
            segundNum = sigNum;
        }

        // --------------------------------------------------------------------
        // EJERCICIO 3
        // --------------------------------------------------------------------
        
        /*
         * Se debe implementar un programa que simula la compra de un supermercado
         * por internet.
         * El programa mostrará un menú con al menos 10 productos que el usuario
         * puede comprar.
         * Los productos tienen que estar relacionados con conservas, lacteos y
         * productos de limpieza.
         * Cada producto tiene un precio asociado.
         * Por cada elección el programa te preguntará la contidad de dicho pruducto
         * y volverá a mostrar el menú hasta que se pulse la opción 0 "Salir"
         * En la sección de productos de limpieza hay oferte, si de un producto se 
         * compran 2 o más unidades se descontará el precio de ese producto un 20%.
         */

        System.out.println("\n\nEjercicio 3:");

        String producto;
        int numProductos = 0;
        double descuento = 0.20;
        double suma = 0;
        double precioProducto = 0;
        boolean quieroSalir = false;

        

        while (!quieroSalir){
            System.out.println("Los productos a comprar son: lentejas, atun, judias, esparragos, yogures, leche, queso, toallitas, legia, escoba.");
            System.out.print("Elije uno de los productos o escribe SALIR: ");
            producto = sc.nextLine();

            if (producto.equals("SALIR")){
                System.out.print("¿Cuánto de " + producto + " quieres comprar? ");
                numProductos = sc.nextInt();
                sc.nextLine();
            }

            if (producto.equals("lentejas")){
                precioProducto = 1.15;
                suma += precioProducto*numProductos;
            }
            else if (producto.equals("atun")){
                precioProducto = 3.79;
                suma += precioProducto*numProductos;
            }
            else if (producto.equals("judias")){
                precioProducto = 1.30;
                suma += precioProducto*numProductos;
            }
            // Cambiar los precios ->
            else if (producto.equals("esparragos")){
                precioProducto = 3.79;
                suma += precioProducto*numProductos;
            }
            else if (producto.equals("yogures")){
                precioProducto = 1.30;
                suma += precioProducto*numProductos;
            }
            else if (producto.equals("leche")){
                precioProducto = 3.79;
                suma += precioProducto*numProductos;
            }
            else if (producto.equals("queso")){
                precioProducto = 1.30;
                suma += precioProducto*numProductos;
            }
            else if (producto.equals("toallitas")){
                precioProducto = 3.79;
                double precioADescontar = precioProducto*descuento;
                suma += precioProducto*numProductos - precioADescontar;
            }
            else if (producto.equals("legia")){
                precioProducto = 1.30;
                double precioADescontar = precioProducto*descuento;
                suma += precioProducto*numProductos - precioADescontar;
            }
            else if (producto.equals("escoba")){
                precioProducto = 1.30;
                double precioADescontar = precioProducto*descuento;
                suma += precioProducto*numProductos - precioADescontar;
            }
            else if (producto.equals("SALIR")){
                quieroSalir = true;
            }
            else{
                System.out.println("Ese producto no lo tenemos.");
            }
        }

        System.out.println(suma);
    }
 }