package App;

public class App {
    public static void main(String[] args) throws Exception {
        Persona persona = new Persona();
        persona.setEdad(21);
        persona.setNombre("Mariana");
        persona.setTelefono(2654760);
        System.out.println(
                "El nombre de la persona es " + persona.getNombre() + ", tiene " + persona.getEdad()
                        + " años y su numero de telefono es " + persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getTelefono() {
        return this.telefono;
    }
}
