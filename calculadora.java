package calculadorastack;
/**
 *
 * @author Jonathan Espinoza
 * @version 4-2-2021
 */
public interface calculadora
{
    /**
     * 
     * @param x
     * @param y
     * @return 
     */
    public int suma(int x, int y);
    /**
     * 
     * @param x
     * @param y
     * @return 
     */
    public int resta(int x, int y);
    /**
     * 
     * @param x
     * @param y
     * @return 
     */
    public int multiplicacion(int x, int y);
    /**
     * 
     * @param x
     * @param y
     * @return 
     */
    public int division(int x, int y);
    /**
     * 
     * @param x
     * @return 
     */

    public int operar(stack x);//operar recibe un stack en formato postfix, y lo opera para devolver un entero que es igual al valor total de la operación
    /**
     * 
     * @param a
     * @return 
     */
    public String decode(String a);//función que se encarga de leer el archivo y decodificar cada línea para realizar las operaciones de cada una
}