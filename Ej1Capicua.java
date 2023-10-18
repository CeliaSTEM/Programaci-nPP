//package capicua; // El paquete siempre tiene que llamarse como la carpeta en la que nos encontramos.

import java.util.Scanner; // Para poder solicitar datos por pantalla.

public class Ej1Capicua { // La clase siempre tiene que llamarse como el archivo.
	public static void main(String[] args) { // La función main, que es lo que busca el cógido cuando va a ejecutarse.
		boolean esCapicua = false; // Los booleanos son variables que pueden ser true o false. Al inicializarlo a false, asumimos que nuestro número no va a ser capicua.
		Scanner sc = new Scanner(System.in);
		int unidades; // Int significa número entero -> Número sin decimales.
		int decenas;
		int centenas;
		int unidadesMillar;

		System.out.println("Escriba un número:"); // Escribir por pantalla.
		int num = sc.nextInt(); // Utilizando el scanner leemos lo que se introduzca desde teclado. Coje un entero y lo guarda en la variabel num.
		
		// Un número capicúa es igual del derecho que del revés. 3443
		// En este código se asume que el número llega como mucho a cuatro cifras.

		unidades = num % 10; // % se queda con el resto de la división. Si divides 3443/10 = 344 y de resto 3.
		// num = num/10 es lo mismo que: 
		num /= 10; // Siguendo con el ejemplo: En la variable num se guardaría 344
		decenas = num % 10; // Si divides 344/10 = 34 y de resto 4. En decenas se guarda el 4.
		num /= 10; // Siguendo con el ejemplo: En la variable num se guardaría 34
		centenas = num % 10;
		num /= 10;
		unidadesMillar = num;
		
		// Caso 1: Tenemos un número de 4 dígitos. 3443 -> Las unidades de millar y las unidades tiene que ser iguales. 3 == 3
		//												   Las decenas y las centenas tiene que ser iguales. 4 == 4
		if (unidades == unidadesMillar && decenas==centenas) {
			esCapicua = true;
		// Caso 2: Tenemos 3 dígitos. 343 -> Las unidades y las centenas tiene que ser iguales.
		// 									 Las decenas nos dan igual.
		//									 Las unidades de millar tiene que ser cero.
		} else if (unidades == centenas && unidadesMillar == 0) {
			esCapicua = true;
		// Caso 3: Tenemos 2 dígitos. 33 -> Las unidades y las decenas tienen que ser iguales.
		// 								    Las centenas y las unidades de millar tienen que ser cero.
		} else if (decenas == unidades && centenas == 0 && unidadesMillar == 0) {
			esCapicua = true;
		// Caso 4: Tenemos 1 dígito. 3 -> Todo tiene que ser cero menos las unidades.
		} else if (decenas == 0 && centenas == 0 && unidadesMillar == 0) {
			esCapicua = true;
		}
		
		if (esCapicua) {
			System.out.println("El número es capicua");
		} else {
			System.out.println("No es capicua");
		}
	}
}