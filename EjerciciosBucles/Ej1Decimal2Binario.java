import java.util.Scanner;
public class Ej1Decimal2Binario{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int numDecimal;
        int resto;
        String numBinario = "";

        System.out.println("Escribe un número en decimal, para pasarlo a binario: ");
        numDecimal = sc.nextInt();

        while (numDecimal > 0){
            resto = numDecimal % 2;
            numBinario = resto + numBinario;
            numDecimal = numDecimal / 2;
        }

        System.out.println(numBinario);

    }
}