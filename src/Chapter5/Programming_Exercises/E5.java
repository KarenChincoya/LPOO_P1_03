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
public class E5 {
   public static void main(String[] args){
       //Strings
       Scanner input = new Scanner(System.in);
       String american = "(1)American";
       String espresso = "(2)Espresso";
       String latte = "(3)Latte";
       boolean indicador = true;
       Integer option;
       Double costo=0.0;
       do{
           System.out.println("MENU");
           System.out.println("(0) Quit.");
           System.out.printf("%-15s" + "1.99\n", american);
           System.out.printf("%-15s" + "2.50\n", espresso);
           System.out.printf("%-15s" + "2.15\n", latte);
           System.out.print("Input your option: ");
           option = input.nextInt();
           switch(option){
               case 0: indicador = false;   break;
               case 1: costo+=1.99;         break;
               case 2: costo+=2.50;         break;
               case 3: costo+=2.15;         break;
               default: System.out.println("The input data is incorrect.");
           }
           //de acuerdo a las opciones, supar
       }while(indicador == true);
       System.out.println("Total: $"+costo);
   } 
}
