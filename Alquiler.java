
/**
 * Write a description of class Alquiler here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Alquiler
{
    private static final int MULTIPLICADOR_ESLORA = 10;
    private static final int PRECIO_BASE = 300;

    private int numeroDias;
    private Barco barco;

    public Alquiler(int numeroDias, Barco barco){
        this.numeroDias = numeroDias;
        this.barco = barco; 
    }

    public double getPrecio(){
        double aDevolver = 0;
        aDevolver = numeroDias + (MULTIPLICADOR_ESLORA * barco.getEslora());
        aDevolver += PRECIO_BASE * barco.getBernua(); 
        return aDevolver;
    }

    @Override
    public String toString(){
        String aDevolver = "";
        aDevolver = barco + "\rNumero de Dias: " + numeroDias;
        aDevolver += "\rImporte: " + getPrecio();
        return aDevolver;
    }
}
