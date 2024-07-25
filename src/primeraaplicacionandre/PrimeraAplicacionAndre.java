/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeraaplicacionandre;

/**
 *
 * @author Estudiante
 */
public class PrimeraAplicacionAndre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //variable
        String grupo = "1A";
        
        int edadMia = 17;
        
        double altura = 1.70;
        
        
        //el 2 es el num1 y el num2 es el 8
        sumar(2,8);
        
       System.out.print("El resultado de sumar es: "+ sumar(2,5));
        
        
        
    }
    
    //mètodos y funciones; los mètodos van adentro de una clase, y las funciones afuera de las clases
    //como ahora mismo estamos en una clase, estamos  haciendo un mètodo.
    
    //Ejemplo:
    //
    
    
    
    public static void saludar(){
        System.out.println("Hola, mi nombre es Seraphine, y tú eres hermoso!");    
    }
    
    //mètodos que retornan valores
    public static String despedir(){
        
        String despedida = "Adiós, mundo...";
        return despedida;
        
        
        
    }
    
    //métodos con argumentos
    //los mètodos con argumentos son los que pido
    //los parámetros son los que obtengo
    
    public static int sumar(int num1, int num2){
        
        int resultado = (num1 + num2);
        return resultado;
        
    }
    
    
    
    
    
    }
    
}


