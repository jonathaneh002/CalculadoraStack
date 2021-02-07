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
    
    protected Vector<E> v1;
    /**
     * 
     */
    public MyStack(){
    
        //Crea un vector tamaÃ±o 10 y cuando alcance el maximo le suma 2 
        v1 = new Vector<>(10,2);
    
    }
    /**
     * 
     * @param item 
     */
    @Override
    public void push(E item) {
        v1.addElement(item);
    }
    /**
     * 
     * @return 
     */
    @Override
    public E pop() {
        
       return v1.remove(v1.size()-1);
    }
    /**
     * 
     * @return 
     */
    @Override
    public E peek() {
        
        return v1.get(v1.size()-1);
    }
    /**
     * 
     * @return 
     */
    @Override
    public boolean empty() {
        
        return size() == 0;
    }
    /**
     * 
     * @return 
     */
    @Override
    public int size() {
        
        return v1.size();
    }
    
}
