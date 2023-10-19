import java.util.Scanner;

public class Ej4NumeroALetra{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int numero;
        String numeroEnLetra = "";
        int unidades;
        int decenas;


        System.out.print("Introduce un número entre 1 y 99: ");
        numero = sc.nextInt();
        
        unidades = numero%10;
        decenas = numero/10;

        if (numero >= 10 && numero <= 15){                          // IF -> SI (condición)
            switch (numero){
                case 10: numeroEnLetra = "diez";
                break;
                case 11: numeroEnLetra = "once";
                break;
                case 12: numeroEnLetra = "doce";
                break;
                case 13: numeroEnLetra = "trece";
                break;
                case 14: numeroEnLetra = "catorce";
                break;
                case 15: numeroEnLetra = "quince";
                break;
            }
        }                                                           // ELSE IF -> EN CASO CONTRARIO SI (condicion)
        else if (numero == 20 || numero == 30 || numero == 40 || numero == 50 || numero == 60 || numero == 70 || numero == 80 || numero == 90){
            switch (numero){
                case 20: numeroEnLetra = "veinte";
                break;
                case 30: numeroEnLetra = "treinta";
                break;
                case 40: numeroEnLetra = "cuarenta";
                break;
                case 50: numeroEnLetra = "cincuenta";
                break;
                case 60: numeroEnLetra = "sesenta";
                break;
                case 70: numeroEnLetra = "setenta";
                break;
                case 80: numeroEnLetra = "ochenta";
                break;
                case 90: numeroEnLetra = "noventa";
                break;
            }
        }
        else{                                                       // ELSE -> EN CASO CONTRARIO ...
            switch (decenas){
                case 1: numeroEnLetra = "dieci";
                break;
                case 2: numeroEnLetra = "veinti";
                break;
                case 3: numeroEnLetra = "treinta y ";
                break;
                case 4: numeroEnLetra = "cuarenta y ";
                break;
                case 5: numeroEnLetra = "cincuenta y ";
                break;
                case 6: numeroEnLetra = "sesenta y ";
                break;
                case 7: numeroEnLetra = "setenta y ";
                break;
                case 8: numeroEnLetra = "ochenta y ";
                break;
                case 9: numeroEnLetra = "noventa y ";
                break;
            }
            switch (unidades){
                case 1: numeroEnLetra += "uno";
                break;
                case 2: numeroEnLetra += "dos";
                break;
                case 3: numeroEnLetra += "tres";
                break;
                case 4: numeroEnLetra += "cuatro";
                break;
                case 5: numeroEnLetra += "cinco";
                break;
                case 6: numeroEnLetra += "seis";
                break;
                case 7: numeroEnLetra += "siete";
                break;
                case 8: numeroEnLetra += "ocho";
                break;
                case 9: numeroEnLetra += "nueve";
                break;
            }
        }
        System.out.print("El número " + numero + " en letra es:\n" + numeroEnLetra);
    }
}