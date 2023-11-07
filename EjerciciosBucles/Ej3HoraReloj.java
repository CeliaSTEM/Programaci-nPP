import java.util.Scanner;
public class Ej3HoraReloj{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int hora, min, seg;
        int masSeg;
        int varAux;

        System.out.println("Introduce una hora de 00 a 23: ");
        hora = sc.nextInt();
        System.out.println("Introduce unos minutos del 00 al 59: ");
        min = sc.nextInt();
        System.out.println("Introduce unos segundos del 00 al 59: ");
        seg = sc.nextInt();

        System.out.println("Introduce cuántos segundos quieres añadir: ");
        masSeg = sc.nextInt();

        seg = seg + masSeg;
        if (seg >= 60){
            varAux = seg / 60; // En varAux hemos guardado los minutos que sobran.
            seg = seg % 60;
            min = min + varAux;
        }
        if (min >= 60){
            varAux = min / 60; // En varAux hemos guardado los horas que sobran.
            min = min % 60;
            hora = hora + varAux;
        }
        if (hora >= 24){
            hora = hora % 24;
        }

        String textoHora = "";

        if (hora < 10) {
            textoHora += "0";
        } 
        textoHora += hora + ":";
        if (min < 10) {
            textoHora += "0";
        }
        textoHora += min + ":";
        if (seg < 10){
            textoHora += "0";
        }
        textoHora += seg;

        // System.out.println(hora + ":" + min + ":" + seg);
        System.out.println(textoHora);

    }
}