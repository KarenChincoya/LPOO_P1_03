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
public class TwelveDays {
    public void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        Integer n = input.nextInt();
        switch(n){
            case 1: System.out.println("A Partridge in a Pear Tree");
            case 2: System.out.println("2 Turtle Doves");
            case 3: System.out.println("3 French Hens");
            case 4: System.out.println("4 Calling Birds");
            case 5: System.out.println("5 Golden Rings");
            case 6: System.out.println("6 Geese a Laying");
            case 7: System.out.println("7 Swans a Swimming");
            case 8: System.out.println("8 Maids a Milking");
            case 9: System.out.println("9 Ladies Dancing");
            case 10: System.out.println("10 Lords a Leaping");
            case 11: System.out.println("11 Pipers Piping");
            case 12: System.out.println("12 Drummers Drumming");            
        }
    }
}
