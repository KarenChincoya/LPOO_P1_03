/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6.Programming_Exercises;

import ejerciciosTodos.BabysittingJob;
import java.util.Scanner;

/**
 *
 * @author Karen Velasco
 */
public class E15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        BabysittingJob b = new BabysittingJob();
        
        System.out.println("Input the data required: ");
        
        System.out.print("Year: ");
        Integer year = input.nextInt();
        input.nextLine();
        
        System.out.print("Job number for the year: ");
        Integer jobNumber = input.nextInt();
        
        System.out.print("Babysitter code: ");
        Integer bsCode = input.nextInt();
        
        System.out.print("Number of children for the job: ");
        Integer children = input.nextInt();
        
        b.setJobNumber(year, jobNumber);
        b.setChildren(children);
        b.displayData();
    }
}
