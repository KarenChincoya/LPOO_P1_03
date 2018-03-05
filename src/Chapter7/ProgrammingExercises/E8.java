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
public class E8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input an string: ");
        String s = input.nextLine();
        String delims = " ";
        String[] tokens = s.split(delims);
        String acronym = "";
        for(int i=0;i<3;i++){
            acronym += tokens[i].substring(0, 1);
        }
        System.out.println(acronym);
    }    
}
