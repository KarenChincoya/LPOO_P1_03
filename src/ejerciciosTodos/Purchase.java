/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosTodos;

/**
 *
 * @author Karen Velasco
 */
public class Purchase {
    Integer invoice;
    Double saleAmount;
    Double taxAmount;
    
    public void setInvoice(Integer invoice){
        this.invoice = invoice;
    }
    public void setSaleAmount(Double saleAmount){
        this.saleAmount = saleAmount;
        this.taxAmount = saleAmount * 0.05;
    }
    public void displayDetails(){
        System.out.println(invoice);
        System.out.println(saleAmount);
        System.out.println(taxAmount);
    }
}
