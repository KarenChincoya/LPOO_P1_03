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
public class CollegeCost {
    public void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the child's current age: ");
        Integer age = input.nextInt();
        System.out.println("Input the estimated college costs for the child at age 18: ");
        Integer cost  = input.nextInt();
        System.out.println("You have to save "+(cost/(18-age))+" per year.");
    }
}
