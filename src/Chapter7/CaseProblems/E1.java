/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7.CaseProblems;

import ejerciciosTodos.EventCh5;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Karen Velasco
 */
public class E1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList <EventCh5> eventos = new ArrayList<EventCh5>();
        EventCh5 aux = new EventCh5();

        System.out.println("Input the values for each Event: ");        
        
        Integer guests=5;
        Integer cont = 0;
        while(guests>=5 && guests<=100){
            System.out.println("Event "+(cont+1));
            System.out.print("Input the number of guests: ");
            guests = input.nextInt();
            if(guests>=5 && guests<=100){
                aux.setGuests(guests);
                eventos.add(aux);
            }
            cont++;
        }
        
        aux = eventos.get(3);
        
        for(int i=0;i< aux.getGuests() ;i++){
            System.out.println("Please come to my event!");
        }
    }
}
