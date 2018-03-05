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
public class BabysittingJob {
    String jobNumber = "";
    Integer employeeAssigned;
    String name;
    Integer children;
    Integer hours;
    Integer fee;
    
    public void setJobNumber(Integer year, Integer secuentialNumber){
       jobNumber += (Integer.toString(year)).substring(1,3);
       jobNumber += Integer.toString(secuentialNumber);
    }
    public void setChildren(Integer children){
        this.children = children;
    }
    public void displayData(){
        System.out.println("Job number: "+jobNumber);
        System.out.println("Number of children: "+children);
    }
}
