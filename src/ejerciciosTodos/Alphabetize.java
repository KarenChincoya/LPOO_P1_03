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
public class Alphabetize {
    public void main(){
        Scanner input = new Scanner(System.in);
        //input 2 strings
        System.out.println("Input one string: ");
        String word1 = input.nextLine();
      //  input.nextLine();
        System.out.println("Input one string: ");
        String word2 = input.nextLine();
        
        if(word1.compareTo(word2)>0){
            System.out.println("Not alfabetical ordered.");
        }else{
            System.out.println("Alfabetical ordered.");
        }
    }
}
