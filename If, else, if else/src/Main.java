import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int numeroIf;
        System.out.println("Introduce un número");
        numeroIf = var.nextInt();
        if (numeroIf > 0) {
            System.out.println("positivo");
        } else if (numeroIf == 0) {
            System.out.println(0);
        } else {
            System.out.println("negativo");

        }
    }
}