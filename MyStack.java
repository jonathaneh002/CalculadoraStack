/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorastack;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Jonathan Espinoza
 * @version 4-2-2021
 */
public class MyStack<E> implements Stack<E>{
    //Pila para almacenar los datos
    protected Vector<E> v1;
    /**
     * 
     */
    public MyStack(){
    
        //Crea un vector tamano 10 y cuando alcance el maximo le suma 2 
        v1 = new Vector<>(10,2);
    
    }
    /**
     * 
     * @param item 
     */
    @Override
    public void push(E item) {
        //Agregar elementos a la pila
        v1.addElement(item);
    }
    /**
     * 
     * @return 
     */
    @Override
    public E pop() {
        //Eliminar el utlimo valor dentro de la pila
       return v1.remove(v1.size()-1);
    }
    /**
     * 
     * @return 
     */
    @Override
    public E peek() {
        //Devolver el ultima valor dentro de la pila
        return v1.get(v1.size()-1);
    }
    /**
     * 
     * @return 
     */
    @Override
    public boolean empty() {
        //Devolver TRUE si el vector esta vacio, false si no esta vacio
        return size() == 0;
    }
    /**
     * 
     * @return 
     */
    @Override
    public int size() {
        //Devuelve el tamano del vector
        return v1.size();
    }
    
}
