/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8.CaseProblems;

import ejerciciosTodos.EventCh8;
import java.util.Scanner;

/**
 *
 * @author Karen Velasco
 */
public class E1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        EventCh8[] eventos = new EventCh8[3];
        Integer guests;
        Integer eventType;
        for(int i=0;i<3;i++){
            System.out.println("Input the number of guests: ");
            guests = input.nextInt();
            eventos[i].setGuests(guests);
            System.out.println("Input the event type: ");
            eventType = input.nextInt();
            eventos[i].setEventType(eventType);
        }
   
        for(int i=0;i< eventos[1].getGuests() ;i++){
            System.out.println("Please come to my event!");
        }
    }
}
