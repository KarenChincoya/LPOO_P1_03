/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5.CaseProblems;

import ejerciciosTodos.Rental;

/**
 *
 * @author Karen Velasco
 */
public class E2 {
    public static void main(String[] args){
        Rental r1 = new Rental();
        Rental r2 = new Rental();
        Rental r3 = new Rental();
        
        r1.setHoursAndMinutes(60);
        r2.setHoursAndMinutes(78);
        r3.setHoursAndMinutes(150);
        
        r1.longerRentalTime(r1,r2);
        r1.longerRentalTime(r1,r3);
        r2.longerRentalTime(r2,r3);
    }

}
