
public class Pescador extends Persona
{
    public int cantidadPeces;
    public Pescador(String nombre,int edad,String carnet,int peces){
        super(nombre,edad,carnet);
        this.cantidadPeces = peces;
    }
    public String MostrarPesca(){
        return "Pesqué un total de "+cantidadPeces+" peces";
    }
}
