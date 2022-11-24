/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;
//Omarsito
import java.util.Stack;

public class Pilas {
    /** push agregar dato
     * pop extraer pila
     *  peek ver ultimo dato de la pila
     * empty saber si tiene o  no tiene datos la pila
     */
    
    public static void main(String[] args) {
        Stack pila = new Stack();
        pila.push("Paco");
        pila.push(50);
        pila.push("Cadena");
        pila.push(49);
        pila.push(51);
        pila.pop();
        pila.pop();
        pila.push(100.5);
        System.out.println("El ultimo de la pila es: " + pila.peek());
        while(pila.empty()==false)
        {
            System.out.println(pila.pop());
        }
    }
    
}
