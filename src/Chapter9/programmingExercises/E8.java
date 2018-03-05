/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9.programmingExercises;

/**
 *
 * @author Karen Velasco
 */
import java.util.Scanner;
public class E8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] daysOfWeek = {"MONDAY","TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};
        System.out.println("Days of the week: ");
        for(int i=0;i<7;i++){
            System.out.println("\t"+(i+1)+". "+daysOfWeek[i]);
        }
        System.out.print("Choose an option: ");
        Integer option = input.nextInt();
        System.out.println("\nBusiness hours: ");
        switch(option){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: System.out.println("\t9 AM to 9 PM");break;
            case 6: System.out.println("\t10 AM to 6 PM");break;
            case 7: System.out.println("\t11 AM to 5 PM");break;
        }
    }
}
