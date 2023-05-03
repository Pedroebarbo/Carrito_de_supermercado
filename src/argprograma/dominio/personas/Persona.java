package argprograma.dominio.personas;

public class Persona {

    // aqui solo modelaremos ATRIBUTOS
    private String nombre; // atributo nombre NO a la variable
    private String apellido;

// metodog constructor
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}//<--Corchete de cierre


