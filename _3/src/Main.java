public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Jorge");
        String nombre = persona.getNombre();
        System.out.println(nombre);
        persona.edad = 27;
        persona.teléfono = 272708197;


    }
}

class Persona {
    String nombre;
    int edad;
    int teléfono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
