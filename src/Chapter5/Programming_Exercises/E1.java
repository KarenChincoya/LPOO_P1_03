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
import java.util.Scanner;//he didn't pay me |-|

public class E1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        Integer n = input.nextInt();
        if((n%2) == 0 ){
            System.out.println(n+" is an even number.");
        }else{
            System.out.println(n+" is an odd number.");
        }
    }
}
