/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7.ProgrammingExercises;

import java.util.Scanner;

/**
 *
 * @author Karen Velasco
 */

public class E5 {   
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input a sentence: ");
        String sentence = input.nextLine();
        sentence = sentence.trim();
        String delims = "[ .,?;!]";
        String[] tokens = sentence.split(delims);
        Integer k = tokens.length;
        System.out.println("Words: "+ k);
    }   
}
