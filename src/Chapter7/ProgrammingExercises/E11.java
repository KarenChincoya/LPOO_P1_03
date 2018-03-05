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
public class E11 {
//full name
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input your full name: ");
        String name = input.nextLine();
        System.out.println("Input the address: ");
        String address = input.nextLine();
        /*luego marca los primeros nombres del name para las iniciales
            El numero para append
        */
        String delims = " "; //las iniciales
        String[] tokens = name.split(delims);
        String iniciales = "";
        for(int i=0;i<tokens.length;i++){
            iniciales += tokens[i].substring(0, 1);
        }
        //ahora el numero
        String[] tokensAdd = address.split(delims);
        String num = tokensAdd[0];
        
        System.out.println(iniciales+num);
    }
}
