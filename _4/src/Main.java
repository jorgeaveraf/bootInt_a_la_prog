public class Main {
    public static void main(String[] args) {
        cliente nuevo = new cliente();
        nuevo.nombre = "Jorge";
        nuevo.edad = 27;
        nuevo.teléfono = 272;
        nuevo.crédito = 1750;
        System.out.println(nuevo.nombre+" "+nuevo.edad+" "+nuevo.teléfono+" "+nuevo.crédito);
    }
}

    class persona {
        int edad;
        String nombre;
        int teléfono;
    }
    class cliente extends persona {
        int crédito;
    }
class trabajador extends persona{
    int salario;
}
