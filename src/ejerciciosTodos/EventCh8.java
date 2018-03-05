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
public class EventCh8 {
    Double price;
    Double pricePerGuest;
    Integer guests;
    Integer eventType;
    final String[] typeOfEvent = {"wedding","baptism","birthday","corporate","other"};
    
    final static Double pricePGLow = 32.0;
    final static Double pricePGHigh = 35.0;
    
    public void setEventType(Integer eventType){
        if(eventType>3)
            this.eventType = 4;
        else
            this.eventType = eventType;
    }
    public String getEventType(){
        return typeOfEvent[eventType];
    }
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
    
    public void largerEvent(EventCh8 e1, EventCh8 e2){
        if(e1.getGuests()==e2.getGuests())
            System.out.println("The guests are equals.");
        else if(e1.getGuests()>e2.getGuests()){
            System.out.println("The larger is the one with "+e1.getGuests()+" guests.");
        }else{
            System.out.println("The larger is the one with "+e2.getGuests()+" guests.");            
        } 
    }
}
