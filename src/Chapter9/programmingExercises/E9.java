/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9.programmingExercises;

import ejerciciosTodos.Mayors;
import java.util.Scanner;

/**
 *
 * @author Karen Velasco
 */
public class E9 {
    public static void main(String[] args){
        //display the enumeration for the user
        Scanner input = new Scanner(System.in);
        System.out.println("Mayors");
        System.out.println("\t1."+Mayors.ACC);
        System.out.println("\t2."+Mayors.CHEM);
        System.out.println("\t3."+Mayors.CIS);
        System.out.println("\t4."+Mayors.ENG);
        System.out.println("\t5."+Mayors.HIS);
        System.out.println("\t6."+Mayors.PHYS);
        System.out.println("Choose a mayor: ");
        Integer option = input.nextInt();
        switch(option){
            case 1:System.out.println("Bussines Division.");break;
            case 2: System.out.println("Science Division.");break;
            case 3: System.out.println("Bussines Division.");break;
            case 4: System.out.println("Humanities Division.");break;
            case 5: System.out.println("Humanities Division.");break;
            case 6: System.out.println("Science Division.");break;
        }
    }
}
