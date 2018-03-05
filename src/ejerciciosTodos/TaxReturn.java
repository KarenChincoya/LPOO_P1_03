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
public class TaxReturn {
    String socialSecurity;
    String lastName;
    String firstName;
    String streetAddress;
    String city;
    String state;
    Integer zipCode;
    Double annualIncome;
    Integer maritalStatus; //1. single, 2. married
    Double taxLiability;
    public TaxReturn(String socialSecurity, String lastName, String firstName, String streetAddress, String city, String state, Integer zipCode, Double annualIncome, Integer maritalStatus){
        this.socialSecurity = socialSecurity;
        this.lastName = lastName;
        this.firstName = firstName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.annualIncome = annualIncome;
        this.maritalStatus = maritalStatus;
        //construit taxLiabitlity 
        if(annualIncome>=0 && annualIncome<=20000){
            if(maritalStatus==1)
                taxLiability = 0.15 * annualIncome;
            else 
                taxLiability = 0.14 * annualIncome;
        }
        if(annualIncome>=20001 && annualIncome<=50000){
            if(maritalStatus==1)
                taxLiability = 0.22 * annualIncome;
            else 
                taxLiability = 0.20 * annualIncome;
        }
        if(annualIncome>=50001){
            if(maritalStatus==1)
                taxLiability = 0.30 * annualIncome;
            else 
                taxLiability = 0.28 * annualIncome;
        }
    }
    
    public void displayData(){
        System.out.println("Data: ");
        System.out.println(socialSecurity);
        System.out.println(lastName);
        System.out.println(firstName);
        System.out.println(streetAddress);
        System.out.println(city);
        System.out.println(state);
        System.out.println(zipCode);
        System.out.println(annualIncome);
        System.out.println(maritalStatus);
        System.out.println(taxLiability);
    }
    
}
