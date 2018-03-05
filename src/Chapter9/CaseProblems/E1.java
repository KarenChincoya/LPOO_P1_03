package Chapter9.CaseProblems;

import java.util.Scanner;
import ejerciciosTodos.EventCh8;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karen Velasco
 */
public class E1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        EventCh8[] eventos = new EventCh8[8];
        // number of guests, or event type
        Integer guests;
        Integer eventType;
        for(int i=0;i<8;i++){
            System.out.println("Input the number of guests: ");
            guests = input.nextInt();
            eventos[i] = new EventCh8();
            eventos[i].setGuests(guests);
            System.out.println("Input the event type: ");
            eventType = input.nextInt();
            eventos[i].setEventType(eventType);
        }
   
        //order by number of guests
        for(int i=0;i<7;i++){
            for(int j=0;j<8;j++){
                //compare
                EventCh8 aux = new EventCh8();
                aux = eventos[i];
                if(eventos[i].getPrice()<eventos[j].getPrice()){
                    eventos[i] = eventos[j];
                    eventos[j] = aux;
                }
            }
        }
        System.out.println("Events ordered by price: ");
        for(int i=0;i<8;i++){
            System.out.println(eventos[i].getPrice());
        }
    }
}
