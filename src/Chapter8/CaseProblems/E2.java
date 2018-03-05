/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8.CaseProblems;

import ejerciciosTodos.RentalCh8;
import java.util.Scanner;

/**
 *
 * @author Karen Velasco
 */
public class E2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        RentalCh8[] prestamos = new RentalCh8[3];
        Integer et;
        Integer minutes;
        for(int i=0;i<3;i++){
            System.out.println("Input the minutes: ");
            minutes = input.nextInt();
            prestamos[i].setHoursAndMinutes(minutes);
            System.out.println("Input the type of equipments: ");
            et = input.nextInt();
            prestamos[i].setEquiptmentType(et);
        }
   
        for(int i=0;i< prestamos[1].getNumberOfHours() ;i++){
            System.out.println("Coupon good for 10 percent off next rental");
        }
    }
}
