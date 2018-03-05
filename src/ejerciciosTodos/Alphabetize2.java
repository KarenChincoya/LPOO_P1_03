/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosTodos;

import java.util.Scanner;

/**
 *
 * @author Karen Velasco
 */
public class Alphabetize2 {
    public void main(){
        Scanner input = new Scanner(System.in);
        //input 2 strings
        System.out.println("Input one string: ");
        String word1 = input.nextLine();
      //  input.nextLine();
        System.out.println("Input one string: ");
        String word2 = input.nextLine();
        System.out.println("\nSentences in alphabetical ordered: \n");
        if(word1.compareTo(word2)>0){
            System.out.println(word2);
            System.out.println(word1);
        }else{
            System.out.println(word1);
            System.out.println(word2);
        }
    }
}
