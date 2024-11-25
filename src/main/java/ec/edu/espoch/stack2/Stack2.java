/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.stack2;

import java.util.Stack;

/**
 *
 * @author ACER
 */
public class Stack2 {

    public static void main(String[] args) {
        //crear una pila de enteros
        Stack<Integer>pila=new Stack<>();
        //Agregar elementos a la clase (push)
        pila.push(10);
        pila.push(20);
        pila.push(30);
        
        System.out.println("los elementos de la pila son: "+pila);
        System.out.println("Elementos en la parte superior: "+pila.peek());
        System.out.println("la pila esta vacía: "+pila.isEmpty());
        System.out.println("Eliminar el elemnto de la pila: "+pila.pop());
        
        
        
    }
}
