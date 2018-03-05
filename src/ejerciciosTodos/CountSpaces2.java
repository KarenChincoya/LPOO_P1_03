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
public class CountSpaces2 {
    public void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input a sentence: ");
        String sentence = input.nextLine();
        String delims = " ";
        String[] tokens = sentence.split(delims);
        Integer k = (tokens.length) - 1;
        System.out.println("Spaces: "+k);
    }   
}
