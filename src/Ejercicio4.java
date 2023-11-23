import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int numero;
        System.out.println("escriba un numero");
        numero= sc.nextInt();
        switch (numero) {
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("numero invalido");
        }
    }
}
