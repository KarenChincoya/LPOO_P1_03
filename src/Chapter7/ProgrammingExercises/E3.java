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
public class E3 {
   public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean status=false;
        while(status==false){
            System.out.println("Input a sentence: ");
            String sentence = input.next();
            sentence = sentence.toUpperCase(); //65
            char[] cadenita = sentence.toCharArray();//hasta el 90
            Integer aux;
            Integer contNum =0;
            Integer contLet =0;
            for(int i=0;i<cadenita.length;i++){
                aux = (int) cadenita[i];
                if(aux>=0 || aux<10)
                    contNum++;
                if(aux>=65 && aux<=91)
                    contLet++;
            }
            if(contNum>=5 && contLet>=5){
                System.out.println("Good job!");
                status = true;
            }else{
                System.out.println("There have to be at least 5 letters and 5 numbers.");
            }
                
        }
        //cuenta los numeros y las legras
   } 
}
