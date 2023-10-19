import java.util.Scanner;
/*
    Escribe una aplicación que solicite por consola dos números reales que corresponden a la base y la altura 
    de un triángulo. Deberá mostrarse su área, comprobando que los números introducidos por el usuario no son
    negativos, algo que no tendría sentido.
*/
public class Ej5AreaTriangulo{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        double base;
        double altura;
        double area;

        System.out.print("Dime un número real para la base de un triángulo: ");
        base = sc.nextDouble();
        System.out.print("Dime un número real para la altura de un triángulo: ");
        altura = sc.nextDouble();

        if (base <= 0 || altura <= 0){
            System.out.print("No podmeos calcular el area con esos valores...");
        }else{
            area = base*altura/2;
            System.out.print("El area del triángulo es " + area + ".");
        }

    }
}