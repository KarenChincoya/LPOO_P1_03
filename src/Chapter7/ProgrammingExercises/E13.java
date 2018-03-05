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
import ejerciciosTodos.TaxReturn;
import java.util.Scanner;
public class E13 {
    //pregutna por los datos
    public static void main(String[] args){
        String socialSecurity ="";
        String lastName;
        String firstName;
        String streetAddress;
        String city;
        String state;
        Integer zipCode;
        Double annualIncome;
        Integer maritalStatus; //1. single, 2. married
        Scanner input = new Scanner(System.in);
        String mStatus;
        boolean indicador=false;
        
        System.out.println("Input the data asked ");
        while(indicador == false){
            System.out.println("Social Security number: ");
            socialSecurity = input.nextLine();
            String delims = "-";
            String[] tokens = socialSecurity.split(delims);
            boolean[] verificar = new boolean[3];
                if(Integer.parseInt(tokens[0])>=0 && Integer.parseInt(tokens[0])<=999)
                    verificar[0]=true;
                if(Integer.parseInt(tokens[1])>=0 && Integer.parseInt(tokens[1])<=99)
                    verificar[1]=true;
                if(Integer.parseInt(tokens[2])>=0 && Integer.parseInt(tokens[2])<=9999)
                    verificar[2]=true;
            if(verificar[0] && verificar[1] && verificar[2])
                indicador = true;
//verificar que los elementos sean los correctos
        }
        System.out.println("Last name: ");
        lastName = input.next();
        System.out.println("First name: ");
        firstName = input.next();
        System.out.println("Street address: ");
        streetAddress = input.next();
        System.out.println("City: ");
        city = input.next();
        System.out.println("State: ");
        state = input.next();
        
        do{
            System.out.println("Zip code: ");
            zipCode = input.nextInt();
        }while(!(zipCode.toString().length()==5)); //cuando no sea cierto que es igual a 5
        
        do{
            System.out.println("Annual incomes: ");
            annualIncome = input.nextDouble();
        }while(annualIncome<0);
        
        do{
            System.out.println("Marital status: ");
            mStatus = input.next();
        //check that this have to be M, m, S, s
        }while(!(mStatus.startsWith("M") || mStatus.startsWith("m") || mStatus.startsWith("S") || mStatus.startsWith("s")));
        //condiciones
        if(mStatus.startsWith("S") || mStatus.startsWith("s"))
            maritalStatus = 1;
        else
            maritalStatus = 2;
        
        TaxReturn tr = new TaxReturn(socialSecurity, lastName, firstName, streetAddress, city, state, zipCode, annualIncome, maritalStatus);
    }
}
