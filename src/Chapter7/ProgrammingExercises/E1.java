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
public class E1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] name = new String[3];
        for(int i=0;i<3;i++){
            System.out.println("Input the name: ");
            name[i] = input.next();
        }
        for(int i=0;i<2;i++){
            for(int j=i+1;j<3;j++){
                System.out.println(name[i]+" "+name[j]);
            }
        }
    }
}
