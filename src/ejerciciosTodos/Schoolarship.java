/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosTodos;

import java.util.Scanner;

/**
 *
 * @author Karen Velasco
 */
public class Schoolarship {
        public void main(){ //cambia todos a void main,
        Scanner input = new Scanner(System.in);
        System.out.println("Input the data: ");
        System.out.println("Numeric high school point average: ");
        Double points = input.nextDouble();
        System.out.println("Number of extracurricular activities: ");
        Integer extra = input.nextInt();
        System.out.println("Number of services activities: ");
        Integer service = input.nextInt();
        if((points>=3.8 && extra>=1) && service>=1){
            System.out.print("Scholarship candidate");
            return;
        }
        if((points<3.8 && points>=3.4) && (extra+service)>=3){
            System.out.print("Scholarship candidate");
            return;
        }
        if((points<3.4 && points>=3.0) && extra>=2 && service>=3){
            System.out.print("Scholarship candidate");
            return;
        }
        System.out.println("Not a candidate.");
    }
}
