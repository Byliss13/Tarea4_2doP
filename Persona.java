
public class Persona
{
    private String nombre;
    private int edad;
    private String carnedIdentidad;
    public Persona(String nombre,int edad,String carnet){
        this.nombre = nombre;
        this.edad  = edad;
        this.carnedIdentidad = carnet;
    }
    public String saludar(){
        return "Hola mi nombre es "+nombre;
    }
    public void cambiarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public String mostrarEdad(){
        return "Hola mi edad es "+edad+" años";
    }
}
