/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6.CaseProblems;

import ejerciciosTodos.EventCh5;
import ejerciciosTodos.Rental;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Karen Velasco
 */
public class E2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList <Rental> rentas = new ArrayList<Rental>();
        Rental aux = new Rental();

        System.out.println("Input the values for each Rental: ");        
        
        Integer minutes=60;
        Integer cont = 0;
        while(minutes>=60 && minutes<=7200){
            System.out.println("Event "+(cont+1));
            System.out.print("Input the number of minutes: ");
            minutes = input.nextInt();
            aux.setHoursAndMinutes(minutes);
            rentas.add(aux);
            cont++;
        }
        aux = rentas.get(2);
        for(int i=0;i<aux.getNumberOfHours();i++){
            System.out.println("Coupon good for 10 percent off next rental");
        }
    
    }
}
