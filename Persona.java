public abstract class Persona {

    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        if (nombre.length() > 0) {
            this.nombre = nombre;
        }
        if (edad >= 1) {
            this.edad = edad;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        if (nombre.length() > 0) {
            this.nombre = nombre;
        }
    }

    public void setEdad(int edad) {
        if (edad >= 1) {
            this.edad = edad;
        }
    }

    public abstract void mostrarDatos();
}