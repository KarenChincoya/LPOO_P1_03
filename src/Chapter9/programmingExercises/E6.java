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
public class E6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //course name and meeting days
        String[] courseName = new String[4];
        String[] schedule = new String[4];
        //input the data
        for(int i=0;i<4;i++){
            System.out.println("Couse name: ");
            courseName[i] =input. nextLine();
            System.out.println("Meeting days: ");
            schedule[i] = input.nextLine();
        }
        //show data
        for(int i=0;i<4;i++){
            System.out.println(courseName[i]+"  "+schedule[i]);
        }
    }
}
