/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5.CaseProblems;

import ejerciciosTodos.EventCh5;
import java.util.Scanner;

/**
 *
 * @author Karen Velasco
 */
public class E1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        EventCh5 e1 = new EventCh5();
        EventCh5 e2 = new EventCh5();
        EventCh5 e3 = new EventCh5();
        Integer guests;

        System.out.println("Input the values for each Event: ");

        System.out.println("Event 1");
        System.out.print("Input the number of guests: ");
        guests = input.nextInt();
        e1.setGuests(guests);

        System.out.println("Event 2");
        System.out.print("Input the number of guests: ");
        guests = input.nextInt();
        e2.setGuests(guests);

        System.out.println("Event 3");
        System.out.print("Input the number of guests: ");
        guests = input.nextInt();
        e3.setGuests(guests);
        
        e1.largerEvent(e1, e2);
        e2.largerEvent(e1, e3);
        e3.largerEvent(e2, e3);
    }
}
