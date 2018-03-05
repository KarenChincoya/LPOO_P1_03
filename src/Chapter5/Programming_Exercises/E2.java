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
public class E2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Double high, low;
        System.out.println("Input the day's high and low temperatures: ");
        System.out.println("High temperature: ");
        high = input.nextDouble();
        System.out.println("Low temperatures: ");
        low = input.nextDouble();
        
        if(high>=90){
            System.out.println("Heat warning.");
        }else if(low<32){
            System.out.println("Freeze warning.");
        }else if(high-low >40 ){
            System.out.println("Large temperature swing");
        }
    }
}