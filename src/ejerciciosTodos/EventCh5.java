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
public class EventCh5 {
    Double price;
    Double pricePerGuest;
    Integer guests;
    final static Double pricePGLow = 32.0;
    final static Double pricePGHigh = 35.0;
    public Double getPrice(){
        return price;
    }
    public Double getPricePerGuest(){
        return pricePerGuest;
    }
    public boolean isLargeEvent(){
        if(guests>=50)
            return true;
        else
        return false;
    }
    public void setGuests(Integer guests){
        this.guests = guests;
        if(isLargeEvent()){
            pricePerGuest = pricePGLow;
        }else{
            pricePerGuest = pricePGHigh;
        }
        price = pricePerGuest * guests;
    }
    public Integer getGuests(){
        return guests;
    }
    
    public void largerEvent(EventCh5 e1, EventCh5 e2){
        if(e1.getGuests()==e2.getGuests())
            System.out.println("The guests are equals.");
        else if(e1.getGuests()>e2.getGuests()){
            System.out.println("The larger is the one with "+e1.getGuests()+" guests.");
        }else{
            System.out.println("The larger is the one with "+e2.getGuests()+" guests.");            
        } 
    }
    
}
