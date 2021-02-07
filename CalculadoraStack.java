/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorastack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 *
 * @author Jonathan Espinoza
 * @version 4-2-2021
 */
public class CalculadoraStack {
    public static calculadora cal;
    private static JFileChooser file = new JFileChooser();
    private static String path = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean keep = true;
        while (keep == true){
            System.out.print("\n-----------------Menu-----------------"
                        +"\n 1.Abrir Archivo. "+
                        "\n 2. Calcular resultado"+
                        "\n 3. Salir "+
                        "\n----------------------------------------");
        String ingreso = JOptionPane.showInputDialog("Ingrese la opcion del menu que desee vizualizar: ");
        if(path == null && !("1").equals(ingreso)){
            if(ingreso.equals("3")){
                System.exit(0);
            }
            else{
               JOptionPane.showMessageDialog(null, "Debes escoger un archivo antes de realizar un calculo");
            }
        }
        else{
            switch(ingreso){
                case "1":
                    int r = file.showOpenDialog(null);
                    
                    if (r == JFileChooser.APPROVE_OPTION) {
                        File archivo = file.getSelectedFile();
                        path = archivo.getAbsolutePath();
                        System.out.println("\nArchivo seleccionado: " + archivo.getAbsolutePath());
                    }
                    break;
                    
                case "2":
                    cal = new ProtCalculadora();
                    String resultadoString = cal.decode(path);
                    System.out.println("\n" + resultadoString);
                    break;
                    
                case "3":
                    System.exit(0);
                    
                    
            }
        }
        
        
       
        
    }
   
    }
   
}
