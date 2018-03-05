/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9.CaseProblems;

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
            prestamos[i] = new RentalCh8();
            System.out.println("Input the minutes: ");
            minutes = input.nextInt();
            prestamos[i].setHoursAndMinutes(minutes);
            System.out.println("Input the type of equipments: ");
            et = input.nextInt();
            prestamos[i].setEquiptmentType(et);
        }
   
        //ordered by price
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                //compare
                RentalCh8 aux = new RentalCh8();
                aux = prestamos[i];
                if(prestamos[i].getPrice() < prestamos[j].getPrice()){
                    prestamos[i] = prestamos[j];
                    prestamos[j] = aux;
                }
            }
        }
        System.out.println("Rentals ordered by price");
        for(int i=0;i<3;i++){
            System.out.println(prestamos[i].getPrice());
        }
    }
}
