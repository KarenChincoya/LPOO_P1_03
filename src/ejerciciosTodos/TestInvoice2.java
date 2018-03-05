/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosTodos;

import ejerciciosTodos.Invoice;

/**
 *
 * @author Karen Velasco
 */
public class TestInvoice2 {
    public void main(){
        Invoice i1 = new Invoice(253, 205.20, 16,9,2015);
        Invoice i2 = new Invoice(253, 205.20, 16,9,2017);
        Invoice i3 = new Invoice(253, 205.20, 16,9,1989);
        
        i1.displayFields();
        System.out.println("\n***************************************************\n");
        i2.displayFields();
        System.out.println("\n***************************************************\n");
        i3.displayFields();
    }
}
