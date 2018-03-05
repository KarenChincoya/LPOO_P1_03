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
public class Invoice {
    Integer invoice;
    Double balanceDue;
    Integer month;
    Integer day;
    Integer year;
    
    public Invoice(Integer invoice, Double balanceDue, Integer month, Integer day, Integer year){
        
        if(invoice<1000)
            this.invoice = 0;
        else
            this.invoice = invoice;
        
        this.balanceDue = balanceDue;
        
        if(month<1 || month>12)
            month = 1;
        else 
            this.month = month;
        
        if(day<1 || day>31)
            day = 0;
        else
            this.day = day;
        
        if(year<2011 || year>2017)
                year = 0;
        else
            this.year = year;
    }
     
    public void displayFields(){
        System.out.println(this.invoice);
        System.out.println(this.balanceDue);
        System.out.println(this.day);
        System.out.println(this.month);
        System.out.println(this.year);
    }
    
}
