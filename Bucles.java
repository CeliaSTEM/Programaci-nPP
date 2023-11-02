import java.util.Scanner;

public class Bucles{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad = 0;

        while(edad >= 0 ){
            System.out.println("Indica la edad de la siguiente persona [-1 para salir]: ");
            edad = sc.nextInt();
            if (edad < 18){
                System.out.println("Es menor de edad!");
            }else{
                System.out.println("Es mayor de edad!");
            }
        }

        // ---------------------------------------------------------

        int contador = 0;
        while (contador < 100){
            System.out.println(contador);
            contador++;
        }

        // ---------------------------------------------------------

        for (int cont = 0; cont < 100 ; cont++){
            System.out.println(cont);
        }
        
    }
}
