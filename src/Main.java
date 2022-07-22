public class Main {
    public static void main(String[] args) {

        Persona personas = new Persona();
        personas.setEdad(15);
        personas.setNombre("Bruce");
        personas.setTelefono(941606903);
        System.out.println(personas.getEdad()+ " " +personas.getNombre()+ " " + personas.getTelefono());
    }

}


class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }
}