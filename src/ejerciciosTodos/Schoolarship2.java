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
public class Schoolarship2 {
        public void main(){ //cambia todos a void main,
        Scanner input = new Scanner(System.in);
        System.out.println("Input the data: ");
        System.out.println("Numeric high school point average: ");
        Double points = input.nextDouble();
        if((points<0 || points>4.0)){ // || extra<0 || service<0 
            System.out.println("ERROR: The value of the points must be between [0,4]");
        }
        System.out.println("Number of extracurricular activities: ");
        Integer extra = input.nextInt();
        if(extra<0){ // ||  || service<0 
            System.out.println("ERROR: The value of extra activities must be positive or 0.");
        }        
        System.out.println("Number of services activities: ");
        Integer service = input.nextInt();
        if(service<0){ // ||  || service<0 
            System.out.println("ERROR: The value of service activities must be positive or 0.");
        }        
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
