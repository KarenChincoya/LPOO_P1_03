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
public class Service {
    String serviceDescription;
    Double price;
    Integer minutes;

    public Service(String serviceDescription, Double price, Integer minutes){
      this.serviceDescription = serviceDescription;
      this.price = price;
      this.minutes = minutes;
    }
    public String getServiceDescription(){
      return serviceDescription;
    }
    public void setServiceDescription(String serviceDescription){
        this.serviceDescription = serviceDescription;
    }
    public Double getPrice(){
      return price;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public Integer getMinutes(){
      return minutes;
    }
    public void setMinutes(Integer minutes){
        this.minutes = minutes;
    }
}
