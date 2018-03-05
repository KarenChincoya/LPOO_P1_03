/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5.Programming_Exercises;

/**
 *
 * @author Karen Velasco
 */
import java.util.Scanner;
public class E6 {
    public void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input your skill level: ");
        Integer level = input.nextInt();
        System.out.println("Input your hours worked: ");
        Integer hours = input.nextInt();
        Double total=0.0;
        Double payRate=0.0;
        switch(level){
            case 1: payRate = 17.0; break;
            case 2: payRate = 20.0; break;
            case 3: payRate = 22.0; break;
        }
        if(hours<=40){
            total = payRate * hours;
        }else{
            total = payRate*40 + (payRate*1.5)*(hours-40);
        }
        Double deductions=0.0;
        switch(level){
            case 2:
            case 3:
                System.out.println("Choose an insurance option: ");
                System.out.println("(1) Medical insurance                $32.0");
                System.out.println("(2) Dental insurance                 $20.0");
                System.out.println("(3) Long-term disability insurance   $10.0");
                System.out.println("Option: ");
                Integer insurance = input.nextInt();
                switch(insurance){
                    case 1: deductions = 32.0;
                    case 2: deductions = 20.0;
                    case 3: deductions = 10.0;
                }
        }
        if(level == 3){
            System.out.println("Do you want to participate in the retirement plan? ");
            System.out.println("(1) Yes");
            System.out.println("(2) No");
            Integer option = input.nextInt();
            if(option == 1){
                deductions = deductions + (total*0.03);//3 %
            }
        }
        System.out.println("Hours worked: "+hours);
        System.out.println("Hourly pay rate: "+payRate);
        System.out.println("Regurlar pay for 40 hours: "+ payRate*40);
        System.out.println("The overtime pay: "+(hours-40)*(payRate*1.5));
        System.out.println("Total of regular and overtime pay: "+total);
        System.out.println("Total itemized deductions: "+deductions);
        if(total-deductions>0){
            System.out.println("Final total(minus the deductions): "+ (total-deductions));
        }else{
            System.out.println("You can't pay the deductions.");
        }
    }//fin main 
}
