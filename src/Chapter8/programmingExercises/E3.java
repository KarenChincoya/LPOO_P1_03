/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8.programmingExercises;

/**
 *
 * @author Karen Velasco
 */
import java.util.Scanner;
public class E3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Available items: ");
        System.out.println("\tTable");
        System.out.println("\tDesk");
        System.out.println("\tDresser");
        System.out.println("\tEntertainment center");
        System.out.print("Write an option: ");
        String option = input.next();
        option = option.trim();
        option = option.toLowerCase();
        Integer price = 0;
        if(option=="table")
            price = 250;
        if(option=="desk")
            price = 250;
        if(option=="dresser")
            price = 250;
        if(option=="entertainment center")
            price = 250;
        
        if(price!=0)
            System.out.println("Price: $"+price);
        else
            System.out.println("Your option was incorrect.");
        
        
        System.out.println("\n**************************************************\n");
        System.out.println("Available items: ");
        System.out.println("\tTable");
        System.out.println("\tDesk");
        System.out.println("\tDresser");
        System.out.println("\tEntertainment center");
        String option2 = input.next();
        option2 = option2.trim();
        option2 = option2.toLowerCase();
        Integer price2 = 0;
        if(option2.startsWith("tab"))
            price2 = 250;
        if(option2.startsWith("des"))
            price2 = 250;
        if(option2.startsWith("dre"))
            price2 = 250;
        if(option2.startsWith("ent"))
            price2 = 250;
        
        if(price2!=0)
            System.out.println("Price: $"+price2);
        else
            System.out.println("Your option was incorrect.");
    }
}
