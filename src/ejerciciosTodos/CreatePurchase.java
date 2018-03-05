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
import java.util.Scanner;
public class CreatePurchase {
    public void main(){
        Scanner input = new Scanner(System.in);
        Purchase p = new Purchase();
        System.out.println("Input purchase details ");
        Integer invoice=0;
        while(! (invoice>=1000 && invoice<=8000) ){
            System.out.println("Input the invoice: ");
            invoice = input.nextInt();
        }
        p.setInvoice(invoice);
        Double saleAmount=-1.0;
        while(!(saleAmount>0)){
            System.out.println("Input the sale amount: ");
            saleAmount = input.nextDouble();
        }
        p.setSaleAmount(saleAmount);
        p.displayDetails();
    }
}
