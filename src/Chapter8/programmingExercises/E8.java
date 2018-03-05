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
public class E8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the date: ");
        String date = input.next();
        String delims = "/";
        String[] tokens = date.split(delims);
        Integer n = Integer.parseInt(tokens[0]);
        String k ="";
        switch(n){
            case 1: k = "January"; break;
            case 2: k = "February";break;
            case 3: k = "March";break;
            case 4: k = "April";break;
            case 5: k = "May";break;
            case 6: k = "June";break;
            case 7: k = "July";break;
            case 8: k = "August";break;
            case 9: k = "September";break;
            case 10: k = "October";break;
            case 11: k = "November";break;
            case 12: k = "December";break;
        }
        System.out.println(k +" "+ tokens[1] +", "+tokens[2]);
        
    }
    
}
