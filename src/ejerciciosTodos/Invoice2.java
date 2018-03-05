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
public class Invoice2 {
    Integer invoice;
    Double balanceDue;
    Integer month;
    Integer day;
    Integer year;
    
    public Invoice2(Integer invoice, Double balanceDue, Integer month, Integer day, Integer year){
        if(invoice<1000)
            this.invoice = 0;
        else
            this.invoice = invoice;
        
        this.balanceDue = balanceDue;
        
        if(month<1 || month>12)
            month = 0;
        else 
            this.month = month;
        if(day<1 || day>diasDelMes())
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
    
    private Integer diasDelMes(){
        Integer result;
	if(month==2) {
		if((year%4) == 0)
			result = 29; //si es bisiesto tiene 29 dias 
			else
				result = 28;
		}else if(month==4 || month==6 || month==9 || month==11) {
			result = 30;
		}else result=31;
		return result; //dias limite
    }
    
}
