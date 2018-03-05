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
public class E4 {
    Integer[] k = new Integer[8];
    
    public void displayNumbers(){
        for(int i=0;i<k.length;i++){
            System.out.print(k[i]+"  ");
        }
    }
    public void displayNumberReverse(){
        for(int i=(k.length-1);i>=0;i--){
            System.out.print(k[i]+"  ");
        }
    }
    public Integer sum(){
        Integer suma = 0;
        for(int i=0;i<k.length;i++){
            suma+=k[i];
        }
        return suma;
    }
    
    //4
    public void displayNumbersLessThan5(){
        for(int i=0;i<k.length;i++){
            if(k[i]<5)
                System.out.print(k[i]+"  ");
        }
    }
    public void displayLowestValue(){
        int min = k[0];
        for(int i=0;i<k.length;i++){
            if(k[i] < min)
                min = k[i];
        }
        System.out.println("Lowest value: "+min);
    }
    //6 highgest values
    public void displayHighestValue(){
        int max = k[0];
        for(int i=0;i<k.length;i++){
            if(i==0)
                max = k[i];
            if(k[i] > max)
                max = k[i];
        }
        System.out.println("Highest value: "+max);
    }
    //7. calculate and display the average
    public Double average(){
        Double suma = 0.0;
        for(int i=0;i<k.length;i++){
            suma+=k[i];
        }
        return suma/8.0;
    }
    //8. display higher than the average
    public void displayNumbersLessThanAve(){
        Double ave = average();
        for(int i=0;i<k.length;i++){
            if(k[i]>ave)
                System.out.print(k[i]+"  ");
        }
    }
}
