
/**
 * Write a description of class MiHashSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashSet
{

    private int[] numeros;

    /**
     * Constructor for objects of class MiHashSet
     */
    public MiHashSet()
    {
        // initialise instance variables
        numeros = new int[0];
    }

    /**
     *  añade el elemento al conjunto si no estaba. Devuelve verdadero en caso de que el elemento no 
     *  estuviera presente en el conjunto y falso en caso contrario.
     */
    public boolean add(int valor)
    {
        boolean encontrado = false;
        int index =0;
        while ( !encontrado && index < numeros.length)
        {
            if (numeros[index] == valor)
            {
                encontrado= true;
            }
            else
            {
                numeros[index]=valor;
            }

            index++;
        }
        return encontrado;
    }
    /**
     *  vacía el conjunto
     */
    public void clear()
    {
        numeros = new int[0];
    }

     
}
