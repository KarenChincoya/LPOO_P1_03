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
public class E10 {//palindromes
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input a sentence");
        String s = input.nextLine();
        s = s.trim();
        //tokens, concatenar
        String delims = " ";
        String[] tokens = s.split(delims);
        String sinEspacios = "";
        for(int i=0;i<tokens.length;i++){
            sinEspacios += tokens[i];
        }
        //ya que esta concatenado
        char[] cadenita = sinEspacios.toCharArray();
        int j = cadenita.length - 1;
        boolean status = true;
        for(int i=0; i<((cadenita.length)/2)+1;i++){
            if(cadenita[i]!=cadenita[j]){
                status = false;
            }
            j--;
        }
        if(status==true)
            System.out.println("It's a palindrome");
        else
            System.out.println("It isn't a palindrome");
        
    }
}
