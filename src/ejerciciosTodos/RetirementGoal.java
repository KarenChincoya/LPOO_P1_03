/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosTodos;

/**
 *
 * @author Karen Velasco
 */
import java.util.Scanner;
public class RetirementGoal {
    public void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number of years you have until retirement: ");
        Integer years = input.nextInt();
        System.out.println("Input the amount of money you can save annually: ");
        Integer money = input.nextInt();
        System.out.println("Amount of money you'll have at retirement: $"+(years*money));
          
    }
}
