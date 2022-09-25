import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numeroWhile;
        System.out.println("Introduce un número");
        numeroWhile = in.nextInt();
        do {System.out.println(numeroWhile);
            ++numeroWhile;
        } while(numeroWhile<numeroWhile);
    }
}

//Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.