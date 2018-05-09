
/**
 * Write a description of class Cliente here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cliente
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String dni;
    /**
     * Constructor for objects of class Cliente
     */
    public Cliente(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre(){
        return nombre;
    }
    
    public String getDNI(){
        return dni;
    }
    
    @Override
    public String toString(){
        String aDevolver="";
        aDevolver += "CLIENTE : " + nombre + "\r";
        aDevolver += "DNI :" + dni;
        return aDevolver;
    }
}
