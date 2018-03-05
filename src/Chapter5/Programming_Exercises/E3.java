/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5.Programming_Exercises;

/**
 *
 * @author Karen Velasco
 */
import java.util.Scanner;
public class E3 {
    public static void main(String[] args){
        //This program determine the price of a condominium
        Integer option;
        Scanner input = new Scanner(System.in);
        System.out.println("Choose an option: ");
        System.out.println("1. Park view.");
        System.out.println("2. Golf course view.");
        System.out.println("3. Lake view.");
        option = input.nextInt();

//imprimir condo y precio
        switch(option){
            case 1: System.out.println("Colon with Park view condons: $150,000.");break;
            case 2: System.out.println("Colon with Golf course views: $170,000.");break;
            case 3: System.out.println("Colon with lake views: $210,000.");break;
            default: System.out.println("No valid option: $0.0");
        }
    }
}