/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorastack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Jonathan Espinoza
 * @version 4-2-2021
 */
public class ProtCalculadora implements calculadora {
    int resultado;
    /**
     * 
     * @param x
     * @param y
     * @return 
     */
    @Override
    public int suma(int x, int y) {
        resultado = x + y;
        return resultado;
    }
/**
 * 
 * @param x
 * @param y
 * @return 
 */
    @Override
    public int resta(int x, int y) {
        resultado = y - x;
        return resultado;
    }
    /**
     * 
     * @param x
     * @param y
     * @return 
     */
    @Override
    public int multiplicacion(int x, int y) {
        resultado = x * y;
        return resultado;
    }
    /**
     * 
     * @param x
     * @param y
     * @return 
     */
    @Override
    public int division(int x, int y) {
        resultado = y/x;
        return resultado;
    }
    /**
     * 
     * @param x
     * @return 
     */
    @Override
    public int operar(stack x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * 
     * @param a
     * @return 
     */
    @Override
    public String decode(String a) {
        calculadora cal;
        MyStack<Integer> Stack;
        
        cal = new ProtCalculadora();
        Stack = new MyStack<>();
    
        String res = null;
        String pros = " ";
        
        FileReader lector;
        BufferedReader lector1;
        String datos;
        
        try{
           
            lector = new FileReader(a);
            lector1 = new BufferedReader(lector);
            
            datos = lector1.readLine();
            
            while (datos!=null){
               
               String partes[] = datos.split(" ");
               
               for (int i=0; i < partes.length; i++){
                   
                   if ((partes[i].equals("+"))){
                       int resultado;
                       int x = Stack.pop();
                       int y = Stack.pop();
                       resultado = cal.suma(x, y);
                       Stack.push(resultado); 
                       pros = pros + ("\n" + partes[i] +"\tSumar: pop, pop y push del resultado " + "\t" + resultado);
                    }
                   else if((partes[i].equals("-"))){
                       int resultado;
                       int x = Stack.pop();
                       int y = Stack.pop();
                       resultado = cal.resta(x, y);
                       Stack.push(resultado);  
                       pros = pros + ("\n" + partes[i] + "\tResta: pop, pop y push del resultado " + "\t" + resultado);
                   }
                   else if((partes[i].equals("*"))){
                       int resultado;
                       int x = Stack.pop();
                       int y = Stack.pop();
                       resultado = cal.multiplicacion(x, y);
                       Stack.push(resultado); 
                       pros = pros + ( "\n" +  partes[i] + "\tMultiplicar: pop, pop y push del resultado "  + "\t" + resultado);
                   }
                   else if((partes[i].equals("/"))){
                       int resultado;
                       int x = Stack.pop();
                       int y = Stack.pop();
                       resultado = cal.division(x, y);
                       Stack.push(resultado); 
                       pros = pros + ("\n" + partes[i] + "\tDividir: pop, pop y push del resultado " + "\t" + resultado);
                   }
                  
                   else{
                       
                       if(Stack.size() < 1){
                        pros = pros + ("\n" + partes[i] + "\tPush operando" + "\t" + partes[i] );
                       }
                       else if(Stack.size() >= 1){
                        pros = pros + ("\n" + partes[i] + "\tPush operando" + "\t" + Stack.peek() + ", " + partes[i] );
                       }
                       
                       Stack.push(Integer.parseInt(partes[i]));
                       
                       
                  }
               }
               //muestra el resultado de la linea de texto 
               res = ("RESULTADO: " + Stack.peek() + "\n" + "ENTRADA" + "\t OPERACION" + "\t\t PILA");
               res = res + "\n "+ pros;
               //lee otra linea
               datos = lector1.readLine();
               
            }
        }
         catch(ArithmeticException | IOException | NumberFormatException e){
            res = e.toString();
        }
        return res;
    }
    
}
