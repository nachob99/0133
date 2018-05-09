

/**
 * Write a description of class Puerto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Puerto
{
    // instance variables - replace the example below with your own
    private Alquiler[] alquileres;
    
    public Puerto(){
        alquileres = new Alquiler[4];
        for(Alquiler a : alquileres){
            a = null;
        }
    }
    
    public double liquidarAlquilerAmarre(int numAmarre){
        double aDevolver = -1;
        if (alquileres[numAmarre] != null){
            aDevolver = alquileres[numAmarre].getPrecio();
            alquileres[numAmarre] = null;            
        }
        return aDevolver;
    } 
    
    public double alquilarAmarre(int nDias, Barco barco){
        double aDevolver = -1;
        boolean continuar = true;
        int i = 0;
        while(continuar && i < alquileres.length){
            i++;
            if(alquileres[i] == null){
                continuar = false;
                alquileres[i] = new Alquiler(nDias , barco);
                aDevolver = alquileres[i].getPrecio(); 
            }
        }
        return aDevolver;
    }
}
