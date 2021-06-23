
public class Banquero extends Persona
{
    public int cantidadDinero;
    public Banquero(String nombre,int edad,String carnet,int dinero){
        super(nombre,edad,carnet);
        this.cantidadDinero = dinero;
    }
    public String MostrarDinero(){
        return "Tengo un total de "+cantidadDinero+" dolares";
    }
}
