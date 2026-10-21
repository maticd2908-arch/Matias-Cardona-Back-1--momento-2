public class Estudiante extends Persona {

    public Estudiante() {
    }

    // Constructor con datos
    public Estudiante(String nombre, int edad) {
        super(nombre, edad);
    }

    public void mostrarEstudiante() {
        mostrarDatos();
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
    }
}


    