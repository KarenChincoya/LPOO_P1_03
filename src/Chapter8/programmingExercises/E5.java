/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8.programmingExercises;

/**
 *
 * @author Karen Velasco
 */
import java.util.Scanner;
public class E5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] shortStrings = new String[20];
        String[] longStrings = new String[20];
        System.out.println("Input a number up to 20: ");
        Integer n = input.nextInt();
        String aux;
        int s=0, l=0;
        for(int i=0;i<n;i++){
            System.out.println("Input the string: ");
            aux = input.next();
            if(aux.length()<=5){
                shortStrings[s] = aux;
                s++;
            }else{
                longStrings[l] = aux;
                l++;
            }
        }
        System.out.println("What strings do you want to see? ");
        System.out.println("\t1. Short");
        System.out.println("\t2. Long");
        Integer option = input.nextInt();
        
        switch(option){
            case 1: //short 
                aux = shortStrings[0];
                s = 0;
                while(aux!=null){
                    System.out.println(shortStrings[s]);
                    s++;
                }
                break;
            case 2:
                aux = longStrings[0];
                l = 0;
                while(aux!=null){
                    System.out.println(longStrings[l]);
                    l++;
                }
        }
        
    }
}
