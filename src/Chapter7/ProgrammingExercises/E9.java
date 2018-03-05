/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7.ProgrammingExercises;

/**
 *
 * @author Karen Velasco
 */
import java.util.Scanner;
public class E9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input an string of numbers separated by spaces: ");
        String s = input.nextLine();
        String delims = " ";
        String[] tokens = s.split(delims);
        Integer aux;
        Integer suma=0;
        String letra;
        for(int i=0; i<tokens.length;i++){//unir las 
            letra = tokens[i];
            aux = Integer.parseInt(letra);
            suma+=aux;
        }
        System.out.println("The sum of the numbers is: " + suma);
    }
}
