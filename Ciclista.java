
public class Ciclista extends Persona
{
    public int distanciaRecorrida;
    public Ciclista(String nombre,int edad,String carnet,int distancia){
        super(nombre,edad,carnet);
        this.distanciaRecorrida = distancia;
    }
    public String MostrarDistancia(){
        return "En total recorrí "+distanciaRecorrida+" kilometros";
    }
}
