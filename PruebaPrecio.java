/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejm2;

/**
 *
 * @author Administrador
 */
public class PruebaPrecio {
    public static void main(String[] args) {
        Precio p;
        p = new Precio();
        p.poner(56.8);
        System.out.println("Valor = " + p.da());
        
        Precio q = new Precio();
        q.euros = 75.6;
        System.out.println("Valor = " + q.euros);
    }
}
